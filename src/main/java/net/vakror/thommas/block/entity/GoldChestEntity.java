package net.vakror.thommas.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ChestTypes;

public class GoldChestEntity extends GenericChestEntity {
    public GoldChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.GOLD, pos, state);
    }
}
