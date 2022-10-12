package net.vakror.thommas.block.custom;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.block.entity.ModBlockEntities;
import net.vakror.thommas.block.entity.ShapingAnvilBlockEntity;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.item.custom.RedHotMetal;
import net.vakror.thommas.util.ModTags;
import org.jetbrains.annotations.Nullable;

public class ShapingAnvilBlock extends BlockWithEntity implements BlockEntityProvider {
    public ShapingAnvilBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = (ShapingAnvilBlockEntity) world.getBlockEntity(pos);
            ShapingAnvilBlockEntity entity = (ShapingAnvilBlockEntity) world.getBlockEntity(pos);

            if (entity != null) {
                if (!player.getStackInHand(hand).isIn(ModTags.Items.HAMMERS)) {
                    if (screenHandlerFactory != null) {
                        player.openHandledScreen(screenHandlerFactory);
                    }
                } else if (player.getStackInHand(hand).getItem().equals(ModItems.ADAMANTIUM_HAMMER)) {
                    if (entity.getAxeHeadCraft()) {
                        if (entity.shouldCraftAxeHead && entity.getStack(0).getItem() instanceof RedHotMetal metal) {
                            Item axeHead = metal.getAxeHeadItem();
                            entity.setStack(1, new ItemStack(axeHead));
                            entity.setStack(0, new ItemStack(entity.getStack(0).getItem(), entity.getStack(0).getCount() - 3));
                            entity.shouldCraftAxeHead = false;
                            System.out.println("The Axe Head item is: " + Text.translatable(axeHead.getTranslationKey()));
                            world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_USE, SoundCategory.BLOCKS, 1, 1);
                        }
                        if (entity.shouldCraftPickaxeAxeHead && entity.getStack(0).getItem() instanceof RedHotMetal metal) {
                            Item pickAxeHead = metal.getPickAxeHeadItem();
                            entity.setStack(1, new ItemStack(pickAxeHead));
                            entity.setStack(0, new ItemStack(entity.getStack(0).getItem(), entity.getStack(0).getCount() - 3));
                            entity.shouldCraftPickaxeAxeHead = false;
                            System.out.println("The Pickaxe Head item is: " + Text.translatable(pickAxeHead.getTranslationKey()));
                            world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_USE, SoundCategory.BLOCKS, 1, 1);
                        }
                        if (entity.shouldCraftSwordBlade && entity.getStack(0).getItem() instanceof RedHotMetal metal) {
                            Item swordBlade = metal.getSwordBladeItem();
                            entity.setStack(1, new ItemStack(swordBlade));
                            entity.setStack(0, new ItemStack(entity.getStack(0).getItem(), entity.getStack(0).getCount() - 3));
                            entity.shouldCraftSwordBlade = false;
                            System.out.println("The Sword Blade item is: " + Text.translatable(swordBlade.getTranslationKey()));
                            world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_USE, SoundCategory.BLOCKS, 1, 1);
                        }
                        if (entity.shouldCraftShovelHead && entity.getStack(0).getItem() instanceof RedHotMetal metal) {
                            Item shovelHead = metal.getShovelHeadItem();
                            entity.setStack(1, new ItemStack(shovelHead));
                            entity.setStack(0, new ItemStack(entity.getStack(0).getItem(), entity.getStack(0).getCount() - 3));
                            entity.shouldCraftShovelHead = false;
                            System.out.println("The Shovel Head item is: " + Text.translatable(shovelHead.getTranslationKey()));
                            world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_USE, SoundCategory.BLOCKS, 1, 1);
                        }
                        if (entity.shouldCraftHoeHead && entity.getStack(0).getItem() instanceof RedHotMetal metal) {
                            Item hoeHead = metal.getHoeHeadItem();
                            entity.setStack(1, new ItemStack(hoeHead));
                            entity.setStack(0, new ItemStack(entity.getStack(0).getItem(), entity.getStack(0).getCount() - 3));
                            entity.shouldCraftHoeHead = false;
                            System.out.println("The Hoe Head item is: " + Text.translatable(hoeHead.getTranslationKey()));
                            world.playSound(player, pos, SoundEvents.BLOCK_ANVIL_USE, SoundCategory.BLOCKS, 1, 1);
                        }
                    }
                }
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof ShapingAnvilBlockEntity) {
                ItemScatterer.spawn(world, pos, (ShapingAnvilBlockEntity)blockEntity);
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ShapingAnvilBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.SHAPING_ANVIL_BLOCK_ENTITY, ShapingAnvilBlockEntity::tick);
    }
}
