package net.vakror.thommas.blockitem.custom.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.blockitem.ModItems;

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
