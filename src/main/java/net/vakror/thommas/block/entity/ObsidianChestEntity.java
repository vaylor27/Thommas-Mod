package net.vakror.thommas.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ChestTypes;

public class ObsidianChestEntity extends GenericChestEntity {
    public ObsidianChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.OBSIDIAN, pos, state);
    }
}
