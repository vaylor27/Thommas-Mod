/*
 * This class is distributed as part of the Botania Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 */
package net.vakror.thommas.compat.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.vakror.thommas.recipe.CrushingRecipe;
import net.vakror.thommas.recipe.GemInfusingRecipe;
import org.jetbrains.annotations.NotNull;

public class CrushingREIDisplay extends ThommasRecipeDisplay<CrushingRecipe> {
	public CrushingREIDisplay(CrushingRecipe recipe) {
		super(recipe);
	}

	@Override
	public @NotNull CategoryIdentifier<?> getCategoryIdentifier() {
		return ThommasREICategoryIdentifiers.CRUSHER;
	}

}
