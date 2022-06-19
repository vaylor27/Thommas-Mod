/*
 * This class is distributed as part of the Botania Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 */
package net.vakror.thommas.compat.rei;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.vakror.thommas.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
public class UpgraderREICategory implements DisplayCategory<UpgraderREIDisplay> {
	private final EntryStack<ItemStack> altar = EntryStacks.of(new ItemStack(ModBlocks.UPGRADER));
	@Override
	public @NotNull CategoryIdentifier<UpgraderREIDisplay> getCategoryIdentifier() {
		return ThommasREICategoryIdentifiers.UPGRADER;
	}

	@Override
	public @NotNull Renderer getIcon() {
		return altar;
	}

	@Override
	public Text getTitle() {
		return Text.literal("Upgrader");
	}

	@Override
	public @NotNull List<Widget> setupDisplay(UpgraderREIDisplay display, Rectangle bounds) {
		List<Widget> widgets = new ArrayList<>();
		List<EntryIngredient> inputs = display.getInputEntries();
		EntryStack<?> output = display.getOutputEntries().get(0).get(0);
		Point center = new Point(bounds.getCenterX() - 8, bounds.getCenterY() - 6);
		widgets.add(Widgets.createRecipeBase(bounds));

		widgets.add(Widgets.createSlot(new Point(center.x, center.y - 10)).entry(inputs.get(0).get(0)));
		widgets.add(Widgets.createSlot(new Point(center.x, center.y + 10)).entry(inputs.get(1).get(0)));
		widgets.add(Widgets.createSlot(new Point(center.x + 47, center.y)).entry(output));


		widgets.add(Widgets.createArrow(new Point(center.x + 20, center.y)).animationDurationTicks(210));

		return widgets;
	}

	@Override
	public int getDisplayHeight() {
		return 114;
	}
}
