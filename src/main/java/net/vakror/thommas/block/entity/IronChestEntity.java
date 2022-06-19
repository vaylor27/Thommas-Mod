package net.vakror.thommas.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ChestTypes;

public class IronChestEntity extends GenericChestEntity {
    public IronChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.IRON, pos, state);
    }
}