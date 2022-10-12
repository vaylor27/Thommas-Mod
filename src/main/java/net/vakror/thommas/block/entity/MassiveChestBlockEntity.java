
package net.vakror.thommas.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.item.inventory.ImplementedInventory;
import net.vakror.thommas.item.inventory.MassiveImplementedInventory;
import net.vakror.thommas.screen.GemInfusingScreenHandler;
import net.vakror.thommas.screen.MassiveChestScreenHandler;
import org.jetbrains.annotations.Nullable;

public class MassiveChestBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, MassiveImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(18, ItemStack.EMPTY);

    public MassiveChestBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MASSIVE_CHEST_BLOCK_ENTITY, pos, state);
    }

    @Override
    public int getMaxCountPerStack() {
        return 65536;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Massive Chest");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new MassiveChestScreenHandler(syncId, inv, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    public static void tick(World world, BlockPos blockPos, BlockState blockState, MassiveChestBlockEntity entity) {
        if (world.isClient) {
            return;
        }
        else {
            markDirty(world, blockPos, blockState);
        }

    }
}
