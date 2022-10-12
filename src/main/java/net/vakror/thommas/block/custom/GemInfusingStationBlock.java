package net.vakror.thommas.block.custom;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.block.entity.machine.GemInfusingBlockEntity;
import net.vakror.thommas.block.entity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

public class GemInfusingStationBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public GemInfusingStationBlock(Settings settings) {
        super(settings);
    }

    private static VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 10, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        if (blockEntity instanceof GemInfusingBlockEntity gemInfusingBlockEntity) {
        ItemStack dropStack = new ItemStack(this, 1);
        NbtCompound stackNbt = new NbtCompound();
        stackNbt.putLong("gem_infusing_station.energy", gemInfusingBlockEntity.energyStorage.amount);
        stackNbt.put("gem_infusing_station.variant", gemInfusingBlockEntity.fluidStorage.variant.toNbt());
        stackNbt.putLong("gem_infusing_station.fluid", gemInfusingBlockEntity.fluidStorage.amount);
        stack.setNbt(stackNbt);
        world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), dropStack));
    }

        player.incrementStat(Stats.MINED.getOrCreateStat(this));
        player.addExhaustion(0.005F);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


    /* BLOCK ENTITY */

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof GemInfusingBlockEntity gemInfusingBlockEntity) {
                ItemScatterer.spawn(world, pos, gemInfusingBlockEntity);
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockEntity entity = world.getBlockEntity(pos);
        if (entity instanceof GemInfusingBlockEntity gemInfusingBlockEntity) {
            if (itemStack.getNbt() != null) {
                if (!Objects.isNull(itemStack.getNbt().getLong("gem_infusing_station.energy"))) {
                    gemInfusingBlockEntity.setEnergyLevel(itemStack.getNbt().getLong("gem_infusing_station.energy"));
                }
                if (!FluidVariant.fromNbt((NbtCompound) itemStack.getNbt().get("gem_infusing_station.variant")).isBlank()) {
                    gemInfusingBlockEntity.setFluidLevel(FluidVariant.fromNbt((NbtCompound) itemStack.getNbt().get("gem_infusing_station.variant")), itemStack.getNbt().getLong("gem_infusing_station.fluid"));
                }
            }
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = ((GemInfusingBlockEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GemInfusingBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.GEM_INFUSING_STATION, GemInfusingBlockEntity::tick);
    }
}