package net.vakror.thommas.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class FakeOreBlock extends Block {
    public FakeOreBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient) {
            world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 8.0F, true,Explosion.DestructionType.DESTROY);
        }
        super.onBreak(world, pos, state, player);
    }
}
