package net.vakror.thommas.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.vakror.thommas.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class BetterBoneMealItem extends Item {
    public BetterBoneMealItem(Settings settings) {
        super(settings);
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        assert context.getWorld().getBlockState(context.getBlockPos()).getBlock().asItem() != null;
        if (new ItemStack(context.getWorld().getBlockState(context.getBlockPos()).getBlock().asItem()).isOf(ModBlocks.CORRUPTED_FLOWER.asItem())) {
            if (!context.getWorld().isClient) {Random randomGen = new Random();
                int random = randomGen.nextInt(5);
                if (random == 1) {
                    if (canRemoveCountFromStack(4, context.getStack())) {
                        context.getStack().decrement(4);
                    }
                    else {
                        context.getStack().setCount(0);
                    }
                }
                else {
                    Objects.requireNonNull(context.getPlayer()).dropItem(ModBlocks.CORRUPTED_FLOWER.asItem().getDefaultStack(), false, false);

                }
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return super.getMaxUseTime(stack);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.thommas.better_bonemeal.tooltip.shift"));
            tooltip.add(Text.translatable("item.thommas.better_bonemeal.tooltip1.shift"));
        }
        else {
            tooltip.add(Text.translatable("item.thommas.better_bonemeal.tooltip"));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    public static boolean canRemoveCountFromStack(int count, ItemStack stack) {
        return stack.getCount() >= count;
    }
}
