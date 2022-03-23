package net.vakror.thommas.config;

import com.mojang.datafixers.util.Pair;
import net.vakror.thommas.Thommas;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int NUMBER_OF_NETHER_MYTHRIL_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_NETHER_MYTHRIL_ORE_IN_VEIN;
    public static int NUMBER_OF_MYTHRIL_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_MYTHRIL_ORE_IN_VEIN;
    public static int NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_IN_VEIN;
    public static int NUMBER_OF_RUBY_ORE_IN_VEIN;
    public static int NUMBER_OF_RUBY_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_ALUMINUM_ORE_IN_VEIN;
    public static int NUMBER_OF_ALUMINUM_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_AMBER_ORE_IN_VEIN;
    public static int NUMBER_OF_AMBER_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_AMETHYST_ORE_IN_VEIN;
    public static int NUMBER_OF_AMETHYST_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_BITUMEN_ORE_IN_VEIN;
    public static int NUMBER_OF_BITUMEN_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_CHLOROPHYTE_ORE_IN_VEIN;
    public static int NUMBER_OF_CHLOROPHYTE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_COPPER_ORE_IN_VEIN;
    public static int NUMBER_OF_COPPER_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_CRIMTANE_ORE_IN_VEIN;
    public static int NUMBER_OF_CRIMTANE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_DEMONITE_ORE_IN_VEIN;
    public static int NUMBER_OF_DEMONITE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_PURE_DIAMOND_ORE_IN_VEIN;
    public static int NUMBER_OF_PURE_DIAMOND_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_PURE_EMERALD_ORE_IN_VEIN;
    public static int NUMBER_OF_PURE_EMERALD_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_LEAD_ORE_IN_VEIN;
    public static int NUMBER_OF_LEAD_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_LUMENITE_ORE_IN_VEIN;
    public static int NUMBER_OF_LUMENITE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_METEORITE_ORE_IN_VEIN;
    public static int NUMBER_OF_METEORITE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_PLATINUM_ORE_IN_VEIN;
    public static int NUMBER_OF_PLATINUM_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_SALTPETER_ORE_IN_VEIN;
    public static int NUMBER_OF_SALTPETER_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_SAPPHIRE_ORE_IN_VEIN;
    public static int NUMBER_OF_SAPPHIRE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_SILVER_ORE_IN_VEIN;
    public static int NUMBER_OF_SILVER_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_SULPHUR_ORE_IN_VEIN;
    public static int NUMBER_OF_SULPHUR_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_TIN_ORE_IN_VEIN;
    public static int NUMBER_OF_TIN_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_TITANIUM_ORE_IN_VEIN;
    public static int NUMBER_OF_TITANIUM_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_TOPAZ_ORE_IN_VEIN;
    public static int NUMBER_OF_TOPAZ_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_TUNGSTEN_ORE_IN_VEIN;
    public static int NUMBER_OF_TUNGSTEN_ORE_VEINS_IN_CHUNK;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(Thommas.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("config.number_of_nether_mythril_veins_in_chunk", 5), "The Number of nether mythril ore veins that spawn in one nether chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_nether_mythril_ore_in_vein", 50), "The Number of nether mythril ore that spawns in one vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_mythril_ore_veins_in_chunk", 8), "number of mythril ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_mythril_ore_in_vein", 9), "number of mythril ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_deepslate_mythril_ore_veins_in_chunk", 9), "number of deepslate mythril ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_deepslate_mythril_ore_in_vein", 4), "number of deepslate mythril ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_ruby_ore_veins_in_chunk", 9), "number of ruby ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_ruby_ore_in_vein", 4), "number of ruby ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_aluminum_ore_veins_in_chunk", 3), "number of aluminum ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_aluminum_ore_in_vein", 4), "number of aluminum ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_amber_ore_veins_in_chunk", 7), "number of amber ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_amber_ore_in_vein", 3), "number of amber ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_amethyst_ore_veins_in_chunk", 2), "number of amethyst ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_amethyst_ore_in_vein", 3), "number of amethyst ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_amethyst_ore_vein_in_chunk", 4), "number of amethyst ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_bitumen_ore_in_vein", 6), "number of bitumen ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_bitumen_ore_veins_in_chunk", 3), "number of bitumen ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_amber_ore_in_vein", 3), "number of amber ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_amethyst_ore_veins_in_chunk", 2), "number of amethyst ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_amethyst_ore_in_vein", 3), "number of amethyst ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_amethyst_ore_vein_in_chunk", 4), "number of amethyst ore veins in a chunk");
    }

    private static void assignConfigs() {
        NUMBER_OF_NETHER_MYTHRIL_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_nether_mythril_veins_in_chunk", 2);
        NUMBER_OF_NETHER_MYTHRIL_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_nether_mythril_ore_in_vein", 46);
        NUMBER_OF_MYTHRIL_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_mythril_ore_veins_in_chunk", 20);
        NUMBER_OF_MYTHRIL_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_mythril_ore_in_vein", 16);
        NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_deepslate_mythril_ore_veins_in_chunk", 20);
        NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_deepslate_mythril_ore_in_vein", 26);
        NUMBER_OF_RUBY_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_ruby_ore_veins_in_chunk", 46);
        NUMBER_OF_RUBY_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_ruby_ore_in_vein", 4);
        NUMBER_OF_ALUMINUM_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_aluminum_ore_veins_in_chunk", 3);
        NUMBER_OF_ALUMINUM_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_aluminum_ore_in_vein", 4);
        NUMBER_OF_AMBER_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_amber_ore_veins_in_chunk", 7);
        NUMBER_OF_AMBER_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_amber_ore_in_vein", 3);
        NUMBER_OF_AMETHYST_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_amethyst_ore_veins_in_chunk", 2);
        NUMBER_OF_AMETHYST_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_amethyst_ore_in_vein", 3);


        Thommas.LOGGER.info("All " + configs.getConfigsList().size() + " configs have been set properly!");
    }
}
