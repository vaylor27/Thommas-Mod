package net.vakror.thommas;

import net.fabricmc.api.ModInitializer;
import net.vakror.thommas.blockitem.ModBlocks;
import net.vakror.thommas.blockitem.ModItems;
import net.vakror.thommas.blockitem.block.entity.ModBlockEntities;
import net.vakror.thommas.blockitem.block.painting.ModPaintings;
import net.vakror.thommas.blockitem.item.potion.ModPotions;
import net.vakror.thommas.config.ModConfigs;
import net.vakror.thommas.effect.ModEffects;
import net.vakror.thommas.enchantments.ModEnchantments;
import net.vakror.thommas.recipe.ModRecipes;
import net.vakror.thommas.screen.ModScreenHandlers;
import net.vakror.thommas.util.ModLootTableModifiers;
import net.vakror.thommas.util.ModRegistries;
import net.vakror.thommas.villager.ModVillagers;
import net.vakror.thommas.world.dimensions.dimension.ModDimensions;
import net.vakror.thommas.world.gen.ModWorldGen;
import net.vakror.thommas.world.structure.ModStructures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;


public class Thommas implements ModInitializer {
	public static final String MOD_ID = "thommas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static boolean autofish = false;
	public static boolean flyhack = false;

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModConfigs.registerConfigs();
		ModRegistries.registerModStuffs();
		ModWorldGen.generateModWorldGen();
		ModDimensions.register();
		ModPaintings.registerPaintings();
		ModEnchantments.registerModEnchantments();
		ModLootTableModifiers.modifyLootTables();
		ModBlockEntities.registerAllBlockEntities();
		ModRecipes.registerRecipes();
		ModScreenHandlers.registerAllScreenHandlers();
		ModVillagers.setupPOIs();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModStructures.registerStructureFeatures();
		// check if riding

		GeckoLib.initialize();
	}
}
