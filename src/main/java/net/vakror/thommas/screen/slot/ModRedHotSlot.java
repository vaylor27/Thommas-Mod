package net.vakror.thommas.screen.slot;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.item.custom.RedHotMetal;

public class ModRedHotSlot extends Slot {
    public ModRedHotSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.getItem() instanceof RedHotMetal;
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return ModRedHotSlot.isBucket(stack) ? 1 : super.getMaxItemCount(stack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.isOf(Items.BUCKET);
    }
}
