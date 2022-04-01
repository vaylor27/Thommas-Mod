package net.vakror.thommas;

import com.google.gson.stream.JsonReader;
import net.fabricmc.api.ModInitializer;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.config.ModConfigs;
import net.vakror.thommas.enchantments.ModEnchantments;
import net.vakror.thommas.gen.ModGen;
import net.vakror.thommas.gen.ModOreConfiguredFeatures;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.painting.ModPaintings;
import net.vakror.thommas.util.ModLootTableModifiers;
import net.vakror.thommas.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thommas implements ModInitializer {
	public static final String MOD_ID = "thommas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfigs.registerConfigs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModPaintings.registerPaintings();
		ModLootTableModifiers.modifyLootTables();
		ModEnchantments.registerModEnchantments();
		ModRegistries.registerOres();
		ModGen.generateModWorldGen();
	}
}
