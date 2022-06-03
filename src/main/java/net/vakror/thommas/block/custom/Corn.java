package net.vakror.thommas.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.item.ModItems;

public class Corn extends CropBlock {
    public Corn(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CORN_KERNEL;
    }
}
