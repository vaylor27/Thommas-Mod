package net.vakror.thommas.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.vakror.thommas.item.ModItems;

public class PlumpHelmetBlock extends CropBlock {
    public PlumpHelmetBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected int getGrowthAmount(World world) {
        return world.isRaining() ? MathHelper.nextInt(world.random, 2, 5): 0;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.PLUMP_HELMET_SEEDS;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.PODZOL);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return world.isRaining();
    }

    @Override
    public boolean canMobSpawnInside() {
        return true;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(DamageSource.SWEET_BERRY_BUSH, 2.0F);
        super.onEntityCollision(state, world, pos, entity);
    }
}
