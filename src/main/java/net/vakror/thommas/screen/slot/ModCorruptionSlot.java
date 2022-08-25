package net.vakror.thommas.screen.slot;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.vakror.thommas.block.ModBlocks;

public class ModCorruptionSlot extends Slot {
    public ModCorruptionSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.isOf(ModBlocks.CORRUPTED_FLOWER.asItem());
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return ModCorruptionSlot.isBucket(stack) ? 1 : super.getMaxItemCount(stack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.isOf(Items.BUCKET);
    }
}
