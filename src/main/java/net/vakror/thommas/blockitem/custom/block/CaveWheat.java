package net.vakror.thommas.blockitem.custom.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.blockitem.ModItems;

public class CaveWheat extends CropBlock {
    public CaveWheat(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CAVEWHEAT_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 5;
    }
}
