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

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(Thommas.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("config.number_of_nether_mythril_veins_in_chunk", 30), "The Number of nether mythril ore veins that spawn in one nether chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_nether_mythril_ore_in_vein", 50), "The Number of nether mythril ore that spawns in one vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_mythril_ore_veins_in_chunk", 20), "number of mythril ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_mythril_ore_in_vein", 16), "number of mythril ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_deepslate_mythril_ore_veins_in_chunk", 20), "number of deepslate mythril ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_deepslate_mythril_ore_in_vein", 26), "number of deepslate mythril ore in a vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_ruby_ore_veins_in_chunk", 50), "number of ruby ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_ruby_ore_in_vein", 4), "number of ruby ore in a vein");
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


        Thommas.LOGGER.info("All " + configs.getConfigsList().size() + " configs have been set properly!");
    }
}
