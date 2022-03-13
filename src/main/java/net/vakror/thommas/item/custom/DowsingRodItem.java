package net.vakror.thommas.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.util.InventoryUtil;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DowsingRodItem extends Item {
    public DowsingRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY(); i++) {
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    outputValuableCoordinates(positionClicked.down(i), player, blockBelow);
                    foundBlock = true;

                    if (InventoryUtil.hasPlayerStackInInventory(player, ModItems.DATA_TABLET)) {
                        addNbtToDataTablet(player, positionClicked.add(0, -1, 0), blockBelow);
                    }
                    break;
                }
            }

            if(!foundBlock) {
                player.sendMessage(new TranslatableText("item.thommas.dowsing_rod.no_valuables"), false);
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    private void addNbtToDataTablet(PlayerEntity player, BlockPos pos, Block blockBelow) {
        ItemStack dataTablet = player.getInventory().getStack(InventoryUtil.getFirstInventoryIndex(player, ModItems.DATA_TABLET));

        NbtCompound nbtData = new NbtCompound();
        nbtData.putString("thommas.last_ore", "Found" + blockBelow.asItem().getName().getString() + " at (" +
                pos.getX() + ", " + pos.getY() + ", " + pos.getZ() + ")");

        dataTablet.setNbt(nbtData);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.thommas.rod_of_finding.tooltip.shift"));
        }
        else {
            tooltip.add(new TranslatableText("item.thommas.rod_of_finding.tooltip"));
        }
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block blockBelow) {
        player.sendMessage(new LiteralText("Found  " + blockBelow.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + "," + blockPos.getZ() + ")"), false);
    }

    private boolean isValuableBlock(Block block) {
        return block == Blocks.COAL_ORE || block ==  Blocks.COPPER_ORE
                || block == Blocks.DIAMOND_ORE || block == Blocks.IRON_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE
                || block == Blocks.DEEPSLATE_COAL_ORE || block == Blocks.EMERALD_ORE
                || block == Blocks.DEEPSLATE_EMERALD_ORE || block == Blocks.DEEPSLATE_IRON_ORE || block == Blocks.GOLD_ORE
                || block == Blocks.DEEPSLATE_GOLD_ORE;
    }
}
