package net.vakror.thommas.blockitem.custom.block;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.vakror.thommas.blockitem.ModItems;

public class Cotton extends CropBlock {
    public Cotton(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.COTTON_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 5;
    }
}
