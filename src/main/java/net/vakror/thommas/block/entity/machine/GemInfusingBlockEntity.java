package net.vakror.thommas.block.entity.machine;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.block.custom.GemInfusingStationBlock;
import net.vakror.thommas.block.entity.ModBlockEntities;
import net.vakror.thommas.fluid.ModFluids;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.item.inventory.ImplementedInventory;
import net.vakror.thommas.mixin.BucketItemAccessor;
import net.vakror.thommas.mixin.EnergyAccessor;
import net.vakror.thommas.networking.ModMessages;
import net.vakror.thommas.recipe.GemInfusingRecipe;
import net.vakror.thommas.screen.GemInfusingScreenHandler;
import net.vakror.thommas.util.EnergyAmountsUtil;
import net.vakror.thommas.util.FluidStack;
import org.jetbrains.annotations.Nullable;
import team.reborn.energy.api.base.SimpleEnergyStorage;

import java.util.Optional;

import static net.vakror.thommas.block.entity.machine.GemInfusingBlockEntity.FluidAmountMultipliers.*;

@SuppressWarnings("UnstableApiUsage")
public class GemInfusingBlockEntity extends ThommasMachineBlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(3, ItemStack.EMPTY);

    private long getMaxEnergyStorageFromBlock(Block block) {
        if (block.equals(ModBlocks.GEM_INFUSING_STATION)) {
            return 63841;
        }
        else if (block.equals(ModBlocks.BASIC_GEM_INFUSING_STATION)) {
            return 93894;
        }
        else if (block.equals(ModBlocks.ADVANCED_GEM_INFUSING_STATION)) {
            return 389542;
        }
        else if (block.equals(ModBlocks.EPIC_GEM_INFUSING_STATION)) {
            return 935624;
        }
        else if (block.equals(ModBlocks.OMEGA_GEM_INFUSING_STATION)) {
            return 2739175;
        }
        else if (block.equals(ModBlocks.ULTIMATE_GEM_INFUSING_STATION)) {
            return 17836295;
        }
        else {
            return 0;
        }
    }

    private long getMaxInsertOrExtractFromBlock(Block block) {
        if (block.equals(ModBlocks.GEM_INFUSING_STATION)) {
            return 32;
        }
        else if (block.equals(ModBlocks.BASIC_GEM_INFUSING_STATION)) {
            return 512;
        }
        else if (block.equals(ModBlocks.ADVANCED_GEM_INFUSING_STATION)) {
            return 1024;
        }
        else if (block.equals(ModBlocks.EPIC_GEM_INFUSING_STATION)) {
            return 2048;
        }
        else if (block.equals(ModBlocks.OMEGA_GEM_INFUSING_STATION)) {
            return 8192;
        }
        else if (block.equals(ModBlocks.ULTIMATE_GEM_INFUSING_STATION)) {
            return 32768;
        }
        else {
            return 0;
        }
    }

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 144;
    private BlockPos pos;
    public final SimpleEnergyStorage energyStorage = new SimpleEnergyStorage(1, 1, 1) {
        @Override
        protected void onFinalCommit() {
            markDirty();
            if (!world.isClient()) {
                sendEnergyPacket();
            }
        }

    };
    private void sendFluidPacket() {
        PacketByteBuf data = PacketByteBufs.create();
        fluidStorage.variant.toPacket(data);
        data.writeLong(fluidStorage.amount);
        data.writeBlockPos(getPos());

        for (ServerPlayerEntity player : PlayerLookup.tracking((ServerWorld) world, getPos())) {
            ServerPlayNetworking.send(player, ModMessages.FLUID_SYNC, data);
        }
    }
    public final SingleVariantStorage<FluidVariant> fluidStorage = new SingleVariantStorage<FluidVariant>() {
        @Override
        protected FluidVariant getBlankVariant() {
            return FluidVariant.blank();
        }

        @Override
        protected long getCapacity(FluidVariant variant) {
            return FluidStack.convertDropletsToMb(FluidConstants.BUCKET) * 50; // 50k mb
        }

        @Override
        protected void onFinalCommit() {
            markDirty();
            if (!world.isClient) {
                sendFluidPacket();
            }
        }
    };

    private void sendEnergyPacket() {
        PacketByteBuf data = PacketByteBufs.create();
        data.writeLong(energyStorage.amount);
        data.writeBlockPos(getPos());

        for(ServerPlayerEntity player : PlayerLookup.tracking((ServerWorld) world, getPos())) {
            ServerPlayNetworking.send(player, ModMessages.ENERGY_SYNC, data);
        }
    }


    public GemInfusingBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GEM_INFUSING_STATION, pos, state);
        this.pos = pos;
        ((EnergyAccessor) energyStorage).setMaxExtract(getMaxInsertOrExtractFromBlock(state.getBlock()));
        ((EnergyAccessor) energyStorage).setMaxInsert(getMaxInsertOrExtractFromBlock(state.getBlock()));
        ((EnergyAccessor) energyStorage).setCapacity(getMaxEnergyStorageFromBlock(state.getBlock()));
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                switch (index) {
                    case 0: return GemInfusingBlockEntity.this.progress;
                    case 1: return GemInfusingBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0: GemInfusingBlockEntity.this.progress = value; break;
                    case 1: GemInfusingBlockEntity.this.maxProgress = value; break;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public Text getDisplayName() {
        assert world != null;
        if (world.getBlockState(pos).getBlock().equals(ModBlocks.GEM_INFUSING_STATION)) {
            return Text.literal("Starter Gem Infusing Station");
        }
        if (world.getBlockState(pos).getBlock().equals(ModBlocks.BASIC_GEM_INFUSING_STATION)) {
            return Text.literal("Basic Gem Infusing Station");
        }
        if (world.getBlockState(pos).getBlock().equals(ModBlocks.ADVANCED_GEM_INFUSING_STATION)) {
            return Text.literal("Advance Gem Infusing Station");
        }
        if (world.getBlockState(pos).getBlock().equals(ModBlocks.EPIC_GEM_INFUSING_STATION)) {
            return Text.literal("Epic Gem Infusing Station");
        }
        if (world.getBlockState(pos).getBlock().equals(ModBlocks.OMEGA_GEM_INFUSING_STATION)) {
            return Text.literal("Omega Gem Infusing Station");
        }
        if (world.getBlockState(pos).getBlock().equals(ModBlocks.ULTIMATE_GEM_INFUSING_STATION)) {
            return Text.literal("Ultimate Gem Infusing Station");
        }
        else {
            return Text.literal("ERROR: Unknown Block Type");
        }
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        sendFluidPacket();
        sendEnergyPacket();
        return new GemInfusingScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public void setEnergyLevel(long energyLevel) {
        this.energyStorage.amount = energyLevel;
    }

    @Override
    public void setFluidLevel(FluidVariant fluidVariant, long fluidLevel) {
        this.fluidStorage.variant = fluidVariant;
        this.fluidStorage.amount = fluidLevel;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction side) {
        Direction localDir = this.getWorld().getBlockState(this.pos).get(GemInfusingStationBlock.FACING);

        if(side == Direction.UP || side == Direction.DOWN) {
            return false;
        }

        // Top insert 1
        // Right insert 1
        // Left insert 0
        return switch (localDir) {
            default ->
                    side.getOpposite() == Direction.NORTH && slot == 1 ||
                            side.getOpposite() == Direction.EAST && slot == 1 ||
                            side.getOpposite() == Direction.WEST && slot == 0;
            case EAST ->
                    side.rotateYClockwise() == Direction.NORTH && slot == 1 ||
                            side.rotateYClockwise() == Direction.EAST && slot == 1 ||
                            side.rotateYClockwise() == Direction.WEST && slot == 0;
            case SOUTH ->
                    side == Direction.NORTH && slot == 1 ||
                            side == Direction.EAST && slot == 1 ||
                            side == Direction.WEST && slot == 0;
            case WEST ->
                    side.rotateYCounterclockwise() == Direction.NORTH && slot == 1 ||
                            side.rotateYCounterclockwise() == Direction.EAST && slot == 1 ||
                            side.rotateYCounterclockwise() == Direction.WEST && slot == 0;
        };
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction side) {
        Direction localDir = this.getWorld().getBlockState(this.pos).get(GemInfusingStationBlock.FACING);

        if(side == Direction.UP) {
            return false;
        }

        // Down extract 2
        if(side == Direction.DOWN) {
            return slot == 2;
        }

        // bottom extract 2
        // right extract 2
        return switch (localDir) {
            default -> side.getOpposite() == Direction.SOUTH && slot == 2 ||
                    side.getOpposite() == Direction.EAST && slot == 2;
            case EAST -> side.rotateYClockwise() == Direction.SOUTH && slot == 2 ||
                    side.rotateYClockwise() == Direction.EAST && slot == 2;
            case SOUTH -> side == Direction.SOUTH && slot == 2 ||
                    side == Direction.EAST && slot == 2;
            case WEST -> side.rotateYCounterclockwise() == Direction.SOUTH && slot == 2 ||
                    side.rotateYCounterclockwise() == Direction.EAST && slot == 2;
        };
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("gem_infusing_station.progress", progress);
        nbt.putLong("gem_infusing_station.energy", energyStorage.amount);
        nbt.put("gem_infusing_station.variant", fluidStorage.variant.toNbt());
        nbt.putLong("gem_infusing_station.fluid", fluidStorage.amount);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("gem_infusing_station.progress");
        energyStorage.amount = nbt.getLong("gem_infusing_station.energy");
        fluidStorage.variant = FluidVariant.fromNbt((NbtCompound) nbt.get("gem_infusing_station.variant"));
        fluidStorage.amount = nbt.getLong("gem_infusing_station.fluid");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    public static void tick(World world, BlockPos blockPos, BlockState blockState, GemInfusingBlockEntity entity) {
        if (world.isClient) {
            return;
        }
        if (getAmountOfEnergyForItem(entity.getStack(0)) > 10) {
            try(Transaction transaction = Transaction.openOuter()) {
                if (!(entity.energyStorage.amount >= entity.energyStorage.capacity)) {
                    entity.energyStorage.insert(getAmountOfEnergyForItem(entity.getStack(0)), transaction);
                    entity.setStack(0, new ItemStack(entity.getStack(0).getItem(), entity.getStack(0).getCount() - 1));
                    transaction.commit();
                }
            }
        }

        if (hasRecipe(entity) && hasEnoughEnergy(entity) <= entity.energyStorage.amount && hasEnoughFluid(entity) && hasRightFluid(entity)) {
            SimpleInventory inventory = new SimpleInventory(entity.size());
            for (int i = 0; i < entity.size(); i++) {
                inventory.setStack(i, entity.getStack(i));
            }
                entity.progress++;
                extractEnergy(entity, hasEnoughEnergy(entity));
                markDirty(world, blockPos, blockState);
                if (entity.progress >= entity.maxProgress) {
                    craftItem(entity);
                    extractFluid(entity);
                }
        }
        else {
            entity.resetProgress();
            markDirty(world, blockPos, blockState);
        }

        if (hasFluidSourceInSlot(entity)) {
            transferFluidToFluidStorage(entity);
        }

    }

    private static boolean hasRightFluid(GemInfusingBlockEntity entity) {
        if (entity.fluidStorage.variant.getFluid().equals(ModFluids.HONEY_STILL) || entity.fluidStorage.variant.getFluid().equals(ModFluids.HONEY_FLOWING)) {
            return true;
        }
        return false;
    }

    private static void extractFluid(GemInfusingBlockEntity entity) {
        try (Transaction transaction = Transaction.openOuter()) {
            entity.fluidStorage.extract(FluidVariant.of(entity.fluidStorage.variant.getFluid()),
                    getMaxFluidAmountFromBlockAndItem(entity, entity.getStack(1).getItem()), transaction);
            transaction.commit();
        }
    }

    enum FluidAmountMultipliers {
        STARTER,
        BASIC,
        ADVANCED,
        EPIC,
        OMEGA,
        ULTIMATE;

        public long getFluidMultipliers() {
            return switch (this) {
                case STARTER -> 1;
                case BASIC -> 5;
                case ADVANCED -> 20;
                case EPIC -> 50;
                case OMEGA -> 100;
                case ULTIMATE -> 500;
            };
        }

    }

    public static FluidAmountMultipliers getEnumThingFromBlock(Block block) {
        if (block.equals(ModBlocks.GEM_INFUSING_STATION)) {
            return STARTER;
        }
        if (block.equals(ModBlocks.BASIC_GEM_INFUSING_STATION)) {
            return BASIC;
        }
        if (block.equals(ModBlocks.ADVANCED_GEM_INFUSING_STATION)) {
            return ADVANCED;
        }
        if (block.equals(ModBlocks.EPIC_GEM_INFUSING_STATION)) {
            return EPIC;
        }
        if (block.equals(ModBlocks.OMEGA_GEM_INFUSING_STATION)) {
            return OMEGA;
        }
        if (block.equals(ModBlocks.ULTIMATE_GEM_INFUSING_STATION)) {
            return ULTIMATE;
        }
        else {
            return STARTER;
        }
    }
    private static long getMaxFluidAmountFromBlockAndItem(GemInfusingBlockEntity entity, Item item) {
        long fluidMultiplier = getEnumThingFromBlock(entity.world.getBlockState(entity.pos).getBlock()).getFluidMultipliers();
        if (!item.equals(Items.AIR)) {
            return EnergyAmountsUtil.InfusingEnergyAmounts.getEnergyAmountFromItem(item) / fluidMultiplier;
        }
        return 100000000;
    }

    private static boolean hasFluidSourceInSlot(GemInfusingBlockEntity entity) {
        return entity.getStack(0).getItem() instanceof BucketItem;
    }

    private static boolean canInsertFluid(GemInfusingBlockEntity entity) {
        return FluidVariant.of(((BucketItemAccessor) ((BucketItem) entity.getStack(0).getItem())).getFluid()).equals(entity.fluidStorage.variant) || entity.fluidStorage.variant.isBlank();
    }

    private static void transferFluidToFluidStorage(GemInfusingBlockEntity entity) {
        try (Transaction transaction = Transaction.openOuter()) {
            if (!FluidVariant.of(((BucketItemAccessor) ((BucketItem) entity.getStack(0).getItem())).getFluid()).isBlank() && canInsertFluid(entity)) {
                if (entity.fluidStorage.amount >= FluidStack.convertDropletsToMb(FluidConstants.BUCKET) * 50) {
                    return;
                } else {
                    entity.fluidStorage.insert(FluidVariant.of(((BucketItemAccessor) ((BucketItem) entity.getStack(0).getItem())).getFluid()),
                            FluidStack.convertDropletsToMb(FluidConstants.BUCKET), transaction);
                    transaction.commit();
                    entity.setStack(0, new ItemStack(Items.BUCKET));
                }
            }
        }
    }

    private static boolean hasEnoughFluid(GemInfusingBlockEntity entity) {
        return entity.fluidStorage.amount >= getMaxFluidAmountFromBlockAndItem(entity, entity.inventory.get(1).getItem());
    }

    static int index;

    private static void extractEnergy(GemInfusingBlockEntity entity, long count) {
        if (index >= 200) {
            if (count == 0) {
                return;
            } else {
                try (Transaction transaction = Transaction.openOuter()) {
                    entity.energyStorage.extract(count, transaction);
                    if (entity.getStack(0).getCount() > 1) {
                        entity.setStack(0, new ItemStack(entity.getStack(0).getItem(), entity.getStack(0).getCount() - 1));
                    } else {
                        entity.setStack(0, ItemStack.EMPTY);
                    }
                    transaction.commit();
                }
            }
        }
        else {
            index++;
            return;
        }
    }

    private static long hasEnoughEnergy(GemInfusingBlockEntity entity) {
        return EnergyAmountsUtil.CrushingEnergyAmounts.getEnergyAmountFromItem(entity.getStack(1).getItem());
    }

    private static long getAmountOfEnergyForItem(ItemStack stack) {
        if (stack.getItem().equals(ModItems.MODERN_BATTERY_0)) {
            return 6461;
        }
        if (stack.getItem().equals(ModItems.MODERN_BATTERY_1)) {
            return 8782;
        }
        if (stack.getItem().equals(ModItems.MODERN_BATTERY_2)) {
            return 13263;
        }
        if (stack.getItem().equals(ModItems.MODERN_BATTERY_3)) {
            return 18688;
        }
        if (stack.getItem().equals(ModItems.MODERN_BATTERY_4)) {
            return 24128;
        }
        if (stack.getItem().equals(ModItems.LITHIUM_BATTERY)) {
            return 38672;
        }
        if (stack.getItem().equals(ModItems.RUSTY_OLD_BATTERY)) {
            return 793;
        }
        if (stack.getItem().equals(ModItems.GALVANIC_BATTERY)) {
            return 4739;
        }
        else {
            return 0;
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(GemInfusingBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<GemInfusingRecipe> recipe = entity.getWorld().getRecipeManager()
                .getFirstMatch(GemInfusingRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if (hasRecipe(entity)) {
            entity.removeStack(1, 1);

            entity.setStack(2, new ItemStack(recipe.get().getOutput().getItem(), entity.getStack(2).getCount()
                    + recipe.get().getOutput().getCount()));

            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(GemInfusingBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<GemInfusingRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(GemInfusingRecipe.Type.INSTANCE, inventory, entity.getWorld());

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory, match.get().getOutput().getCount())
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput().getItem());
    }

    private GemInfusingRecipe getRecipe(GemInfusingBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<GemInfusingRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(GemInfusingRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if (match.isPresent() && canInsertAmountIntoOutputSlot(inventory, match.get().getOutput().getCount())
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput().getItem())) {
            return match.get();
        }
        else {
            return null;
        }
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(2).getItem() == output || inventory.getStack(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory, int count) {
        return inventory.getStack(2).getMaxCount() >= inventory.getStack(2).getCount() + count;
    }
}
