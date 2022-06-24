package net.vakror.thommas.block.entity.chest;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ChestTypes;

public class CopperChestEntity extends GenericChestEntity {
    public CopperChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.COPPER, pos, state);
    }
}
