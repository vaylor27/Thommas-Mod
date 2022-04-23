package net.vakror.thommas.blockitem.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.blockitem.item.ModItems;

public class PepperPlantBlock extends CropBlock {
    public PepperPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.PEPPER_SEEDS;
    }
}
