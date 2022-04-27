package net.vakror.thommas.blockitem.custom.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.blockitem.ModItems;

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
