package net.vakror.thommas.blockitem.custom.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.blockitem.ModItems;

public class Corn extends CropBlock {
    public Corn(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CORN_KERNEL;
    }
}
