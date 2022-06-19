package net.vakror.thommas.item.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.vakror.thommas.block.custom.VakrorFurnaceBlock;

import java.util.List;

public class FurnaceItem extends BlockItem {

    private final VakrorFurnaceBlock block;

    public FurnaceItem(VakrorFurnaceBlock block, Settings settings) {
        super(block, settings);
        this.block = block;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        // add top label section
        list.add(Text.literal(""));
        list.add(Text.translatable("thommas.text.tooltiplabel").formatted(Formatting.GRAY));

        // add stats
        list.add(Text.translatable("thommas.text.speedlabel", block.getSpeedModifier()).formatted(Formatting.DARK_GREEN));
        list.add(Text.translatable("thommas.text.fuellabel", block.getFuelModifier()).formatted(Formatting.DARK_GREEN));

        if (block.getDuplicationChance() > 0) {
            list.add(Text.translatable("thommas.text.dupelabel", block.getDuplicationChance()).formatted(Formatting.DARK_GREEN).append(Text.literal("%").formatted(Formatting.DARK_GREEN)));
        }

        super.appendTooltip(stack, world, list, context);
    }
}
