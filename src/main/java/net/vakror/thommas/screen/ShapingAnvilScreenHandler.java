package net.vakror.thommas.screen;

import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.vakror.thommas.item.custom.RedHotMetal;
import net.vakror.thommas.screen.slot.ModCorruptionSlot;
import net.vakror.thommas.screen.slot.ModFuelSlot;
import net.vakror.thommas.screen.slot.ModRedHotSlot;
import net.vakror.thommas.screen.slot.ModResultSlot;

public class ShapingAnvilScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;

    public ShapingAnvilScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(3), new ArrayPropertyDelegate(3));
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int id) {
        if (id == 0) {
            if (!player.world.isClient && inventory.getStack(1) != null){
                if (inventory.getStack(1).getCount() >= 3 && inventory.getStack(2).isEmpty()) {
                    RedHotMetal metal = (RedHotMetal) inventory.getStack(1).getItem();
                    inventory.setStack(2, new ItemStack(metal.getAxeHeadItem()));
                    inventory.getStack(1).decrement(3);
                    player.world.playSound(player, player.getBlockPos(), SoundEvents.BLOCK_ANVIL_USE, SoundCategory.BLOCKS, 10, 1);
                }
            }
        }
        return super.onButtonClick(player, id);
    }

    public ShapingAnvilScreenHandler(int syncId, PlayerInventory playerInventory,
                                     Inventory inventory, PropertyDelegate delegate) {
        super(ModScreenHandlers.SHAPING_ANVIL_SCREEN_HANDLER, syncId);
        checkSize(inventory, 3);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = delegate;

        //
        this.addSlot(new ModCorruptionSlot(inventory, 0, 7, 17));
        this.addSlot(new ModRedHotSlot(inventory, 1, 7, 45));
        this.addSlot(new ModResultSlot(inventory, 2, 56, 46));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(delegate);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 144));
        }
    }
}
