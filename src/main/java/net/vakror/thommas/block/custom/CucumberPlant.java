package net.vakror.thommas.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.item.ModItems;

public class CucumberPlant extends CropBlock {
    public CucumberPlant(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CUCUMBER;
    }

    @Override
    public int getMaxAge() {
        return 5;
    }
}
