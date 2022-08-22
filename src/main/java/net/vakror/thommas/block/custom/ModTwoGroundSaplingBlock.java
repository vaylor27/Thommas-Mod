package net.vakror.thommas.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.function.Supplier;

@SuppressWarnings("all")
public class ModTwoGroundSaplingBlock extends SaplingBlock {
    private final Supplier<Block> ground;
    private final Supplier<Block> otherGround;

    public ModTwoGroundSaplingBlock(SaplingGenerator generator, Settings settings, Supplier<Block> ground, Supplier<Block> otherGround) {
        super(generator, settings);
        this.ground = ground;
        this.otherGround = otherGround;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ground.get()) || floor.isOf(otherGround.get());
    }
}
