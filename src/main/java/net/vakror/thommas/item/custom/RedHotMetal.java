package net.vakror.thommas.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RedHotMetal extends Item {
    int maxAge;
    int age;
    Item revertToItem;
    Item axeHeadItem;

    public RedHotMetal(Settings settings, int maxAge, Item revertToItem, Item axeHead) {
        super(settings);
        this.maxAge = maxAge * 20;
        this.revertToItem = revertToItem;
        this.axeHeadItem = axeHead;
    }

    public Item getItem() {
        return revertToItem;
    }

    public Item getAxeHeadItem() {
        return axeHeadItem;
    }

}
