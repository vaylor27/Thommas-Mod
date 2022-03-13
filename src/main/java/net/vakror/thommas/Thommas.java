package net.vakror.thommas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.enchantments.ModEnchantments;
import net.vakror.thommas.gen.ModConfiguredFeatures;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.painting.ModPaintings;
import net.vakror.thommas.util.ModLootTableModifiers;
import net.vakror.thommas.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Thommas implements ModInitializer {
	public static final String MOD_ID = "thommas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModPaintings.registerPaintings();
		ModLootTableModifiers.modifyLootTables();
		ModConfiguredFeatures.doWorldGen();
		ModEnchantments.registerModEnchantments();
	}
}
