package net.vakror.thommas.block.entity.chest;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ChestTypes;

public class EmeraldChestEntity extends GenericChestEntity {
    public EmeraldChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.EMERALD, pos, state);
    }
}
