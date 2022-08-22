package net.vakror.thommas.block.entity.chest;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ChestTypes;

public class TreasureChestEntity extends GenericChestEntity {
    public TreasureChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.TREASURE, pos, state);
    }
}
