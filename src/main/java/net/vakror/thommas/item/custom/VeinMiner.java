package net.vakror.thommas.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.util.VeinMiningUtil;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("all")
public class VeinMiner extends MiningToolItem {

    int radius;

    public VeinMiner(int attackDamage, int attackSpeed, ToolMaterial material, TagKey mineableBlocks, Settings settings, int radius) {
        super(attackDamage, attackSpeed, material, mineableBlocks, settings);
        this.radius = radius;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        Block block = state.getBlock();
        List<BlockPos> posList = VeinMiningUtil.getAllBlocksInRadius(pos, radius);
        for (BlockPos blockPos: posList) {
            if (world.getBlockState(blockPos).getBlock().equals(block) && !world.isClient) {
                world.breakBlock(blockPos, true);
                stack.damage(1, miner, (p) -> { p.sendToolBreakStatus(miner.getActiveHand()); });
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
}
