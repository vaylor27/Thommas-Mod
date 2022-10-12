package net.vakror.thommas.block.entity;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.item.custom.RedHotMetal;
import net.vakror.thommas.item.inventory.ImplementedInventory;
import net.vakror.thommas.screen.ShapingAnvilScreenHandler;

import java.util.Optional;

public class ShapingAnvilBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(2, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    static int tickNum;

    public static boolean shouldCraftAxeHead = false;
    public static boolean shouldCraftPickaxeAxeHead = false;
    public static boolean shouldCraftSwordBlade = false;
    public static boolean shouldCraftShovelHead = false;
    public static boolean shouldCraftHoeHead = false;

    public boolean shouldCraftSomething() {
        return !shouldCraftHoeHead && !shouldCraftShovelHead && !shouldCraftSwordBlade && !shouldCraftPickaxeAxeHead && !shouldCraftAxeHead;
    }

    public boolean getAxeHeadCraft() {
        return shouldCraftAxeHead;
    }

    public boolean getPickAxeHeadCraft() {
        return shouldCraftPickaxeAxeHead;
    }

    public boolean getSwordBladeCraft() {
        return shouldCraftSwordBlade;
    }

    public boolean getShovelHeadCraft() {
        return shouldCraftShovelHead;
    }

    public boolean getHoeHeadCraft() {
        return shouldCraftHoeHead;
    }

    public ShapingAnvilBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SHAPING_ANVIL_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Shaping Anvil");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ShapingAnvilScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
    }

    public void craftAxeHead() {
        if (inventory.get(0).getCount() >= 3 && inventory.get(1).isEmpty()) {
            if ((inventory.get(0).getItem()) instanceof RedHotMetal) {
                shouldCraftAxeHead = true;
                shouldCraftPickaxeAxeHead = false;
                shouldCraftSwordBlade = false;
                shouldCraftShovelHead = false;
                shouldCraftHoeHead = false;
            }
        }
    }

    public void craftPickAxeHead() {
        if (inventory.get(0).getCount() >= 3 && inventory.get(1).isEmpty()) {
            if ((inventory.get(0).getItem()) instanceof RedHotMetal) {
                shouldCraftAxeHead = false;
                shouldCraftPickaxeAxeHead = true;
                shouldCraftSwordBlade = false;
                shouldCraftShovelHead = false;
                shouldCraftHoeHead = false;
            }
        }
    }

    public void craftHoeHead() {
        if (inventory.get(0).getCount() >= 3 && inventory.get(1).isEmpty()) {
            if ((inventory.get(0).getItem()) instanceof RedHotMetal) {
                shouldCraftAxeHead = false;
                shouldCraftPickaxeAxeHead = false;
                shouldCraftSwordBlade = false;
                shouldCraftShovelHead = false;
                shouldCraftHoeHead = true;
            }
        }
    }

    public void craftSwordBlade() {
        if (inventory.get(0).getCount() >= 3 && inventory.get(1).isEmpty()) {
            if ((inventory.get(0).getItem()) instanceof RedHotMetal) {
                shouldCraftAxeHead = false;
                shouldCraftPickaxeAxeHead = false;
                shouldCraftSwordBlade = true;
                shouldCraftShovelHead = false;
                shouldCraftHoeHead = false;
            }
        }
    }

    public void craftShovelHead() {
        if (inventory.get(0).getCount() >= 3 && inventory.get(1).isEmpty()) {
            if ((inventory.get(0).getItem()) instanceof RedHotMetal) {
                shouldCraftAxeHead = false;
                shouldCraftPickaxeAxeHead = false;
                shouldCraftSwordBlade = false;
                shouldCraftShovelHead = true;
                shouldCraftHoeHead = false;
            }
        }
    }

    public static void tick(World world, BlockPos pos, BlockState state, ShapingAnvilBlockEntity entity) {

    }
}
