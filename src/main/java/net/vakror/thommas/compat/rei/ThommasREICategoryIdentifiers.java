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
import net.vakror.thommas.recipe.*;

public class ThommasREICategoryIdentifiers {
	public static final CategoryIdentifier<MythrilBlasterREIDisplay> MYTHRIL_BLASTER = CategoryIdentifier.of(MythrilBlasterRecipe.Type.ID);
	public static final CategoryIdentifier<CombinerREIDisplay> COMBINER = CategoryIdentifier.of(CombinerRecipe.Type.ID);
	public static final CategoryIdentifier<UpgraderREIDisplay> UPGRADER = CategoryIdentifier.of(UpgraderRecipe.Type.ID);
	public static final CategoryIdentifier<LightningChannelerREIDisplay> LIGHTNING_CHANNELER = CategoryIdentifier.of(LightningChannelerRecipe.Type.ID);
	public static final CategoryIdentifier<HoneySuckerREIDisplay> HONEY_SUCKER = CategoryIdentifier.of(HoneySuckerRecipe.Type.ID);

	private ThommasREICategoryIdentifiers() {

	}
}
