package net.vakror.thommas.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChemicalReaderItem extends Item {
    public ChemicalReaderItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        if (!world.isClient) {
            if (state.isIn(ModTags.Blocks.FAKE_ORES)) {
                assert player != null;
                player.sendSystemMessage(new TranslatableText("chem_read.ore_is_fake"), Util.NIL_UUID);
            } else {
                assert player != null;
                player.sendSystemMessage(new TranslatableText("chem_read.ore_is_real"), Util.NIL_UUID);
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("chem_read.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
