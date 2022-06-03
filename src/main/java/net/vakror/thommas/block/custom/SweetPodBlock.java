package net.vakror.thommas.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.item.ModItems;

public class SweetPodBlock extends CropBlock {
    public SweetPodBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.SWEETPOD;
    }

    @Override
    public int getMaxAge() {
        return 5;
    }
}
