package net.vakror.thommas.screen.slot;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.item.custom.BatteryItem;

public class ModChargingSlot extends Slot {
    public ModChargingSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return stack.getItem() instanceof BucketItem || stack.getItem() instanceof BatteryItem;
    }
}
