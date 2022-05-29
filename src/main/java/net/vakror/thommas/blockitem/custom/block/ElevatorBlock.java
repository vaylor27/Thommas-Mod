package net.vakror.thommas.blockitem.custom.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.vakror.thommas.Thommas;

import java.util.Random;

public class ElevatorBlock extends Block {

    public ElevatorBlock(Settings settings) {
        super(settings);
    }

    public static boolean isTeleportable(World world, BlockPos blockPos, Box entityBox) {
        VoxelShape shape = world.getBlockState(blockPos).getCollisionShape(world, blockPos.up(2));
        return shape.isEmpty() || !entityBox.intersects(shape.getBoundingBox());
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos blockPos, Random random) {
        if (!Thommas.CONFIG.displayParticles) {
            return;
        }

        for (int i = 0; i < 3; ++i) {
            double d = (double) blockPos.getX() + 0.5D + (0.5D - random.nextDouble());
            double e = (double) blockPos.getY() + 0.5D + random.nextDouble();
            double f = (double) blockPos.getZ() + 0.5D + (0.5D - random.nextDouble());
            double g = 0.0D;
            double h = random.nextDouble() * 0.0625D;
            double l = 0.0D;
            world.addParticle(ParticleTypes.PORTAL, d, e, f, g, h, l);
        }
    }
}