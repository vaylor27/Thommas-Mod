package net.vakror.thommas.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class LampBlock extends Block {

    public static final BooleanProperty CLICKED = BooleanProperty.of("clicked");

    public LampBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        super.onBreak(world, pos, state, player);
    }



    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient && hand == Hand.MAIN_HAND) {
            boolean currentState = state.get(CLICKED);
            world.setBlockState(pos, state.with(CLICKED, !currentState), Block.NOTIFY_ALL);
        }


        return ActionResult.SUCCESS;
    }

    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!world.isClient) {
            boolean isLit = state.get(CLICKED);
            if (isLit != world.isReceivingRedstonePower(pos)) {
                if (isLit) {
                    world.createAndScheduleBlockTick(pos, this, 0);
                } else {
                    world.setBlockState(pos, state.cycle(CLICKED), 2);
                }
            }

        }
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if ((Boolean) state.get(CLICKED) && !world.isReceivingRedstonePower(pos)) {
            world.setBlockState(pos, state.cycle(CLICKED), 2);
        }
    }


        @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CLICKED);
    }
}
