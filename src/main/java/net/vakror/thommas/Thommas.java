package net.vakror.thommas;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.vakror.thommas.block.Furnaces;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.block.entity.ModBlockEntities;
import net.vakror.thommas.config.ModConfigs;
import net.vakror.thommas.config.ThommasConfig;
import net.vakror.thommas.effect.ModEffects;
import net.vakror.thommas.enchantments.ModEnchantments;
import net.vakror.thommas.item.ModItemGroup;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.item.potion.ModPotions;
import net.vakror.thommas.networking.ModMessages;
import net.vakror.thommas.painting.ModPaintings;
import net.vakror.thommas.recipe.ModRecipes;
import net.vakror.thommas.screen.ModScreenHandlers;
import net.vakror.thommas.util.ModLootTableModifiers;
import net.vakror.thommas.util.ModRegistries;
import net.vakror.thommas.util.ModTrades;
import net.vakror.thommas.villager.ModVillagers;
import net.vakror.thommas.world.biome.ModBiomes;
import net.vakror.thommas.world.dimensions.dimension.ModDimensions;
import net.vakror.thommas.world.gen.ModWorldGen;
import net.vakror.thommas.world.structure.ModStructures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Thommas implements ModInitializer {
	public static final String MOD_ID = "thommas";
	public static boolean veinMine = false;
	public static List<Block> comprBlocks = new ArrayList<>();
	public static final Identifier UPDATE_INV_PACKET_ID_NORMAL = new Identifier(MOD_ID, "update_normal");
	public static final Identifier UPDATE_INV_PACKET_ID_BIG = new Identifier(MOD_ID, "update_big");
	public static final Identifier UPDATE_INV_PACKET_ID_MASSIVE = new Identifier(MOD_ID, "update_massive");
	public static final Identifier UPDATE_INV_PACKET_ID_HUMONGOUS = new Identifier(MOD_ID, "update_humongous");
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ThommasConfig CONFIG;
	boolean isDevelopmentEnvironment = FabricLoader.getInstance().isDevelopmentEnvironment();

	public static boolean autofish = false;

	public static List<Item> crushedOres = new ArrayList<>();
	

	@Override
	@SuppressWarnings("all")
	public void onInitialize() {
		AutoConfig.register(ThommasConfig.class, GsonConfigSerializer::new);
		CONFIG = AutoConfig.getConfigHolder(ThommasConfig.class).getConfig();
		ModMessages.registerS2CPackets();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Furnaces.init();
		ModRegistries.registerModStuffs();
		ModScreenHandlers.registerAllScreenHandlers();
		ModBlockEntities.registerAllBlockEntities();
		ModConfigs.registerConfigs();
		ModBiomes.registerBiomes();
		ModWorldGen.generateModWorldGen();
		ModDimensions.register();
		ModPaintings.registerPaintings();
		ModEnchantments.registerModEnchantments();
		ModLootTableModifiers.modifyLootTables();
		ModRecipes.registerRecipes();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModStructures.registerStructureFeatures();
		ModVillagers.registerVillagers();
		ModTrades.registerTrades();




		if (isDevelopmentEnvironment) {
			ModItemGroup.printNumberOfItems(MOD_ID);
		}
		// check if riding

		GeckoLib.initialize();
	}
}
