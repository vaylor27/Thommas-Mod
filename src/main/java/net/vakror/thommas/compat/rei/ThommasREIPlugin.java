/*
 * This class is distributed as part of the Botania Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 */
package net.vakror.thommas.compat.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.recipe.*;

import java.util.List;

@Environment(EnvType.CLIENT)
public class ThommasREIPlugin implements REIClientPlugin {
	public ThommasREIPlugin() {
	}

	@Override
	public void registerCategories(CategoryRegistry helper) {
		helper.add(List.of(
				new MythrilBlasterREICategory(),
				new CombinerREICategory(),
				new UpgraderREICategory(),
				new LightningChannelerREICategory(),
				new HoneySuckerREICategory(),
				new GemInfusingREICategory(),
				new CrushingREICategory()
		));
		helper.addWorkstations(ThommasREICategoryIdentifiers.MYTHRIL_BLASTER, EntryStacks.of(ModBlocks.MYTHRIL_BLASTER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.MYTHRIL_BLASTER, EntryStacks.of(ModBlocks.ORICHALCUM_BLASTER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.COMBINER, EntryStacks.of(ModBlocks.COMBINER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.UPGRADER, EntryStacks.of(ModBlocks.UPGRADER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.LIGHTNING_CHANNELER, EntryStacks.of(ModBlocks.LIGHTNING_CHANNELER_BLOCK));
		helper.addWorkstations(ThommasREICategoryIdentifiers.HONEY_SUCKER, EntryStacks.of(ModBlocks.HONEY_SUCKER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.GEM_INFUSING, EntryStacks.of(ModBlocks.GEM_INFUSING_STATION));
		helper.addWorkstations(ThommasREICategoryIdentifiers.GEM_INFUSING, EntryStacks.of(ModBlocks.BASIC_GEM_INFUSING_STATION));
		helper.addWorkstations(ThommasREICategoryIdentifiers.GEM_INFUSING, EntryStacks.of(ModBlocks.ADVANCED_GEM_INFUSING_STATION));
		helper.addWorkstations(ThommasREICategoryIdentifiers.GEM_INFUSING, EntryStacks.of(ModBlocks.EPIC_GEM_INFUSING_STATION));
		helper.addWorkstations(ThommasREICategoryIdentifiers.GEM_INFUSING, EntryStacks.of(ModBlocks.OMEGA_GEM_INFUSING_STATION));
		helper.addWorkstations(ThommasREICategoryIdentifiers.GEM_INFUSING, EntryStacks.of(ModBlocks.ULTIMATE_GEM_INFUSING_STATION));
		helper.addWorkstations(ThommasREICategoryIdentifiers.CRUSHER, EntryStacks.of(ModBlocks.STARTER_CRUSHER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.CRUSHER, EntryStacks.of(ModBlocks.BASIC_CRUSHER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.CRUSHER, EntryStacks.of(ModBlocks.ADVANCED_CRUSHER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.CRUSHER, EntryStacks.of(ModBlocks.EPIC_CRUSHER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.CRUSHER, EntryStacks.of(ModBlocks.OMEGA_CRUSHER));
		helper.addWorkstations(ThommasREICategoryIdentifiers.CRUSHER, EntryStacks.of(ModBlocks.ULTIMATE_CRUSHER));
	}

	@Override
	public void registerDisplays(DisplayRegistry helper) {
		helper.registerFiller(MythrilBlasterRecipe.class, MythrilBlasterREIDisplay::new);
		helper.registerFiller(UpgraderRecipe.class, UpgraderREIDisplay::new);
		helper.registerFiller(CombinerRecipe.class, CombinerREIDisplay::new);
		helper.registerFiller(LightningChannelerRecipe.class, LightningChannelerREIDisplay::new);
		helper.registerFiller(HoneySuckerRecipe.class, HoneySuckerREIDisplay::new);
		helper.registerFiller(GemInfusingRecipe.class, GemInfusingREIDisplay::new);
		helper.registerFiller(CrushingRecipe.class, CrushingREIDisplay::new);
	}
}
