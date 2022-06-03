package net.vakror.thommas.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.item.ModItems;

public class BlightSpore extends CropBlock {
    public BlightSpore(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.BLIGHTSPORE_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 1;
    }
}
