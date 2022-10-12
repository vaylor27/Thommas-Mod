/*
 * This class is distributed as part of the Botania Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 */
package net.vakror.thommas.compat.rei;

import me.shedaniel.math.FloatingPoint;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Slot;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipData;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.fluid.ModFluids;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.screen.renderer.EnergyInfoArea;
import net.vakror.thommas.screen.renderer.FluidStackRenderer;
import net.vakror.thommas.util.EnergyAmountsUtil;
import net.vakror.thommas.util.FluidStack;
import org.jetbrains.annotations.NotNull;
import team.reborn.energy.api.base.SimpleEnergyStorage;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Environment(EnvType.CLIENT)
public class CrushingREICategory implements DisplayCategory<CrushingREIDisplay> {
    private final EntryStack<ItemStack> block = EntryStacks.of(new ItemStack(ModBlocks.STARTER_CRUSHER));

    @Override
    public @NotNull CategoryIdentifier<CrushingREIDisplay> getCategoryIdentifier() {
        return ThommasREICategoryIdentifiers.CRUSHER;
    }

    FluidStackRenderer renderer = new FluidStackRenderer();
    private static final NumberFormat nf = NumberFormat.getIntegerInstance();

    private EnergyInfoArea area;
    public final SimpleEnergyStorage energyStorage = new SimpleEnergyStorage(100000, 0, 0) {
        @Override
        protected void onFinalCommit() {

        }
    };

    @Override
    public @NotNull Renderer getIcon() {
        return block;
    }

    @Override
    public Text getTitle() {
        return Text.literal("Crushing");
    }

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public @NotNull List<Widget> setupDisplay(CrushingREIDisplay display, Rectangle bounds) {
        List<Widget> widgets = new ArrayList<>();
        List<EntryIngredient> inputs = display.getInputEntries();
        EntryStack<?> output = display.getOutputEntries().get(0).get(0);
        FloatingPoint point = new FloatingPoint(bounds.getCenterX() - 8, bounds.getCenterY() - 38);
        Point center = new Point(bounds.getCenterX() - 8, bounds.getCenterY() - 6);
        widgets.add(Widgets.createRecipeBase(bounds));


        Slot inputSlot = Widgets.createSlot(new Point(center.x + 20,center.y - 20)).entry(inputs.get(0).get(0)).markInput();
        widgets.add(inputSlot);
        widgets.add(Widgets.createSlot(new Point(center.x + 20,center.y + 20)).entry(output));
        widgets.add(Widgets.createSlot(new Point(center.x + 60,center.y - 40)).entry(EntryStacks.of(new ItemStack(ModItems.CRUSHING_HEAD))));

        widgets.add(Widgets.createDrawableWidget(((helper, matrices, mouseX, mouseY, delta) -> {
            renderer.drawFluid(matrices, new FluidStack(FluidVariant.of(ModFluids.OIL_STILL), FluidStack.convertDropletsToMb(FluidConstants.BUCKET * 50)), center.x - 30, center.y - 25, 16, 61,
                    FluidStack.convertDropletsToMb(FluidConstants.BUCKET) * 50);
        })));
        assignEnergyInfoArea(center);

        widgets.add(Widgets.createDrawableWidget(((helper, matrices, mouseX, mouseY, delta) -> {
            area.draw(matrices);
        })));

        widgets.add(Widgets.createDrawableWidget(((helper, matrices, mouseX, mouseY, delta) -> {
            renderEnergyAreaTooltips(matrices, center, inputSlot.getCurrentEntry().castValue());
        })));

        widgets.add(Widgets.createDrawableWidget(((helper, matrices, mouseX, mouseY, delta) -> {
            renderFluidTooltip(matrices, center, new FluidStack(FluidVariant.of(ModFluids.HONEY_STILL), FluidStack.convertDropletsToMb(FluidConstants.BUCKET * 50)));
        })));
        return widgets;
    }

    private void renderTooltip(MatrixStack matrices, List<Text> lines, Optional<TooltipData> data, int x, int y) {
        assert MinecraftClient.getInstance().currentScreen != null;
        MinecraftClient.getInstance().currentScreen.renderTooltip(matrices, lines, data, x, y);
    }

    private void renderFluidTooltip(MatrixStack matrices, Point center, FluidStack fluidStack) {
        List<Text> tooltip = new ArrayList<>();
        MutableText displayName = Text.translatable("block." + Registry.FLUID.getId(fluidStack.fluidVariant.getFluid()).toTranslationKey());
        tooltip.add(displayName);
        long amount = FluidStack.convertDropletsToMb(FluidConstants.BUCKET * 50);
        MutableText amountString = Text.literal("50,000 mB");
        tooltip.add(amountString.fillStyle(Style.EMPTY.withColor(Formatting.DARK_GRAY)));
        renderTooltip(matrices, tooltip,
                Optional.empty(), center.x - 100, center.y);
    }

    private void renderEnergyAreaTooltips(MatrixStack matrices, Point center, ItemStack stack) {
        Item item = stack.getItem();
        renderTooltip(matrices, List.of(Text.literal("Required Energy: " + getEnergyAmount(item) + "E")),
                Optional.empty(), center.x + 40, center.y - 10);
    }



    private static long getEnergyAmount(Item item) {
        return EnergyAmountsUtil.CrushingEnergyAmounts.getEnergyAmountFromItem(item);
    }

    private void assignEnergyInfoArea(Point center) {
        area = new EnergyInfoArea( center.x + 50, center.y + 15, energyStorage);
    }

    @Override
    public int getDisplayHeight() {
        return 150;
    }

    @Override
    public int getDisplayWidth(CrushingREIDisplay display) {
        return 250;
    }
}
