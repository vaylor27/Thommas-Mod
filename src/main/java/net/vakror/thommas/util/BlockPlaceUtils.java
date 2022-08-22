package net.vakror.thommas.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class BlockPlaceUtils {
    public static boolean isBlockBelowOf(BlockPos pos, WorldView world, Block block) {
        BlockPos pos1 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        return world.getBlockState(pos).isAir() && world.getBlockState(pos1).isOf(block);
    }

    public static boolean isBlockBelowOf(BlockPos pos, WorldView world, Block block, Block block1) {
        BlockPos pos1 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        return isBlockBelowOf(pos, world, block) || isBlockBelowOf(pos, world, block1);
    }
}
