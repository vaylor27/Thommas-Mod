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
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.vakror.thommas.block.entity.machine.CrusherBlockEntity;
import net.vakror.thommas.block.entity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class CrusherBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public CrusherBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE = makeShape();

    public static VoxelShape makeShape(){
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0.0625, 0, 1, 0.375, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0, 0.75, 0, 1, 1.0625, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.4375, 0.625, 0.4375, 0.5625, 0.75, 0.5625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.375, 0.5625, 0.375, 0.625, 0.625, 0.625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.5, 0.3125, 0.6875, 0.5625, 0.6875));

        return shape;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        if (blockEntity instanceof CrusherBlockEntity crusherBlockEntity) {
            ItemStack dropStack = new ItemStack(this, 1);
            NbtCompound stackNbt = new NbtCompound();
            stackNbt.putLong("crusher.energy", crusherBlockEntity.energyStorage.amount);
            stackNbt.put("crusher.variant", crusherBlockEntity.fluidStorage.variant.toNbt());
            stackNbt.putLong("crusher.fluid", crusherBlockEntity.fluidStorage.amount);
            stack.setNbt(stackNbt);
            world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), dropStack));
        }

        player.incrementStat(Stats.MINED.getOrCreateStat(this));
        player.addExhaustion(0.005F);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockEntity entity = world.getBlockEntity(pos);
        if (entity instanceof CrusherBlockEntity crusherBlockEntity) {
            if (itemStack.getNbt() != null) {
                if (!Objects.isNull(itemStack.getNbt().getLong("crusher.energy"))) {
                    crusherBlockEntity.setEnergyLevel(itemStack.getNbt().getLong("crusher.energy"));
                }
                if (!FluidVariant.fromNbt((NbtCompound) itemStack.getNbt().get("crusher.variant")).isBlank()) {
                    crusherBlockEntity.setFluidLevel(FluidVariant.fromNbt((NbtCompound) itemStack.getNbt().get("crusher.variant")), itemStack.getNbt().getLong("crusher.fluid"));
                }
            }
        }
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
            if (blockEntity instanceof CrusherBlockEntity) {
                ItemScatterer.spawn(world, pos, (CrusherBlockEntity) blockEntity);
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = ((CrusherBlockEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CrusherBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.CRUSHER, CrusherBlockEntity::tick);
    }
}