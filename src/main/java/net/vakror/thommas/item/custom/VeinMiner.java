package net.vakror.thommas.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.util.VeinMiningUtil;
import org.jetbrains.annotations.Nullable;

import java.util.*;

@SuppressWarnings("all")
public class VeinMiner extends MiningToolItem {

    int radius;

    public VeinMiner(int attackDamage, int attackSpeed, ToolMaterial material, TagKey mineableBlocks, Settings settings, int radius) {
        super(attackDamage, attackSpeed, material, mineableBlocks, settings);
        this.radius = radius;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (Thommas.veinMine) {
            Block block = state.getBlock();
            List<BlockPos> posList = VeinMiningUtil.getAllBlocksInRadius(pos, radius);
            List<ItemStack> blockDrops = new LinkedList<>();
            List<BlockPos> minedBlockPosList = new ArrayList<>();
            for (BlockPos blockPos : posList) {
                if (world.getBlockState(blockPos).getBlock().equals(block) && !world.isClient && miner.isPlayer()) {
                    blockDrops.addAll(destroyBlockAs((ServerWorld) world, blockPos, (PlayerEntity) miner));
                    minedBlockPosList.add(blockPos);
                }
            }
            int i = 0;
            for (ItemStack itemStack : blockDrops) {
                Block.dropStack(world, minedBlockPosList.get(i), itemStack);
                i++;
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.thommas.veinminer.tooltip.shift", (String.valueOf(radius * 2 + 1)).formatted(Formatting.DARK_GREEN), (String.valueOf(radius * 2 + 1)).formatted(Formatting.DARK_GREEN), (String.valueOf(radius * 2 + 1)).formatted(Formatting.DARK_GREEN)));
        }
        else {
            tooltip.add(Text.translatable("item.thommas.veinminer.tooltip"));
        }
    }


    public static List<ItemStack> destroyBlockAs(ServerWorld world, BlockPos pos, PlayerEntity player) {
        ItemStack heldItem = player.getStackInHand(player.getActiveHand());

        if (heldItem.isDamageable()) {
            int usesLeft = heldItem.getMaxDamage() - heldItem.getDamage();
            if (usesLeft <= 1) {
                return Collections.emptyList();
            }
            heldItem.damage(1, player, playerEntity -> {});
        }

        List<ItemStack> drops = Block.getDroppedStacks(world.getBlockState(pos), world, pos,
                world.getBlockEntity(pos), player,
                heldItem);

        world.breakBlock(pos, false, player);

        return drops;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
