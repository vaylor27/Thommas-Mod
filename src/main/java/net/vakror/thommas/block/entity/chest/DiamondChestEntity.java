package net.vakror.thommas.block.entity.chest;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ChestTypes;

public class DiamondChestEntity extends GenericChestEntity {
    public DiamondChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.DIAMOND, pos, state);
    }
}