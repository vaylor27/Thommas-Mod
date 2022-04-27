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
    public static int NUMBER_OF_CITRINE_ORE_IN_VEIN;
    public static int NUMBER_OF_CITRINE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_DEEPSLATE_CITRINE_ORE_IN_VEIN;
    public static int NUMBER_OF_DEEPSLATE_CITRINE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_NETHERRACK_CITRINE_ORE_IN_VEIN;
    public static int NUMBER_OF_NETHERRACK_CITRINE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_ENDSTONE_CITRINE_ORE_IN_VEIN;
    public static int NUMBER_OF_ENDSTONE_CITRINE_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_SALT_ORE_VEINS_IN_CHUNK;
    public static int NUMBER_OF_SALT_ORE_IN_VEIN;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(Thommas.MOD_ID + "_config").provider(configs).request();

        assignConfigs();
    }

    public static void createOreConfig(String name, int veins_in_chunk, int ore_in_vein) {
        configs.addKeyValuePair(new Pair<>("config.number_of_" + name + "_ore_veins_in_chunk", veins_in_chunk), "The Number of " + name + " ore veins that spawn in one chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_" + name + "_ore_in_vein", ore_in_vein), "The Number of " + name + " ore that spawns in one vein");
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("config.number_of_nether_mythril_veins_in_chunk", 5), "The Number of nether mythril ore veins that spawn in one nether chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_nether_mythril_ore_in_vein", 50), "The Number of nether mythril ore that spawns in one vein");
        configs.addKeyValuePair(new Pair<>("config.number_of_deepslate_mythril_ore_veins_in_chunk", 9), "number of deepslate mythril ore veins in a chunk");
        configs.addKeyValuePair(new Pair<>("config.number_of_deepslate_mythril_ore_in_vein", 4), "number of deepslate mythril ore in a vein");
        createOreConfig("mythril", 8, 9);
        createOreConfig("ruby", 9, 4);
        createOreConfig("aluminum", 3, 4);
        createOreConfig("amber", 7, 3);
        createOreConfig("amethyst", 1, 2);
        createOreConfig("bitumen", 6, 3);
        createOreConfig("chlorophyte", 4, 3);
        createOreConfig("copper", 7,8);
        createOreConfig("crimtane",4,2);
        createOreConfig("demonite",4,8);
        createOreConfig("pure_diamond",9,2);
        createOreConfig("pure_emerald",6,2);
        createOreConfig("lead",23,7);
        createOreConfig("lumenite",3,6);
        createOreConfig("meteorite",3,7);
        createOreConfig("platinum",1,10);
        createOreConfig("saltpeter", 3,5);
        createOreConfig("sapphire",6,3);
        createOreConfig("silver",1,54);
        createOreConfig("sulphur",3,5);
        createOreConfig("tin",4,4);
        createOreConfig("titanium",2,5);
        createOreConfig("topaz",2,5);
        createOreConfig("tungsten",4,7);
        createOreConfig("citrine", 2, 1);
        createOreConfig("deepslate_citrine", 4, 1);
        createOreConfig("netherrack_citrine", 2, 1);
        createOreConfig("endstone_citrine", 26, 3);
        createOreConfig("salt", 40, 9);
    }

    private static void assignConfigs() {
        NUMBER_OF_NETHER_MYTHRIL_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_nether_mythril_veins_in_chunk", 2);
        NUMBER_OF_NETHER_MYTHRIL_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_nether_mythril_ore_in_vein", 46);
        NUMBER_OF_MYTHRIL_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_mythril_ore_veins_in_chunk", 20);
        NUMBER_OF_MYTHRIL_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_mythril_ore_in_vein", 16);
        NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_deepslate_mythril_ore_veins_in_chunk", 20);
        NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_deepslate_mythril_ore_in_vein", 26);
        NUMBER_OF_RUBY_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_ruby_ore_veins_in_chunk", 9);
        NUMBER_OF_RUBY_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_ruby_ore_in_vein", 4);
        NUMBER_OF_ALUMINUM_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_aluminum_ore_veins_in_chunk", 3);
        NUMBER_OF_ALUMINUM_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_aluminum_ore_in_vein", 4);
        NUMBER_OF_AMBER_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_amber_ore_veins_in_chunk", 7);
        NUMBER_OF_AMBER_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_amber_ore_in_vein", 3);
        NUMBER_OF_AMETHYST_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_amethyst_ore_veins_in_chunk", 1);
        NUMBER_OF_AMETHYST_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_amethyst_ore_in_vein", 2);
        NUMBER_OF_BITUMEN_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_bitumen_ore_veins_in_chunk",6);
        NUMBER_OF_BITUMEN_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_bitumen_ore_in_vein_chunk",3);
        NUMBER_OF_PLATINUM_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_platinum_ore_veins_in_chunk", 1);
        NUMBER_OF_PLATINUM_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_platinum_ore_in_vein", 10);
        NUMBER_OF_METEORITE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_meteorite_ore_veins_in_chunk", 3);
        NUMBER_OF_METEORITE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_meteorite_ore_in_vein", 7);
        NUMBER_OF_PURE_DIAMOND_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_pure_diamond_ore_veins_in_chunk", 9);
        NUMBER_OF_PURE_DIAMOND_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_pure_diamond_ore_in_vein", 2);
        NUMBER_OF_PURE_EMERALD_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_pure_emerald_ore_veins_in_chunk", 6);
        NUMBER_OF_PURE_EMERALD_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_pure_emerald_ore_in_vein", 2);
        NUMBER_OF_SALTPETER_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_saltpeter_ore_veins_in_chunk", 3);
        NUMBER_OF_SALTPETER_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_saltpeter_ore_in_vein", 5);
        NUMBER_OF_SULPHUR_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_sulphur_ore_veins_in_chunk", 3);
        NUMBER_OF_SULPHUR_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_sulphur_ore_in_vein", 5);
        NUMBER_OF_SILVER_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_silver_ore_veins_in_chunk", 1);
        NUMBER_OF_SILVER_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_silver_ore_in_vein", 54);
        NUMBER_OF_SAPPHIRE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_sapphire_ore_veins_in_chunk", 6);
        NUMBER_OF_SAPPHIRE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_sapphire_ore_in_vein", 3);
        NUMBER_OF_TIN_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_tin_ore_veins_in_chunk", 4);
        NUMBER_OF_TIN_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_tin_ore_in_vein", 4);
        NUMBER_OF_TITANIUM_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_titanium_ore_veins_in_chunk", 2);
        NUMBER_OF_TITANIUM_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_titanium_ore_in_vein", 5);
        NUMBER_OF_TOPAZ_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_topaz_ore_veins_in_chunk", 2);
        NUMBER_OF_TOPAZ_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_topaz_ore_in_vein", 5);
        NUMBER_OF_TUNGSTEN_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_tungsten_ore_veins_in_chunk", 4);
        NUMBER_OF_TUNGSTEN_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_tungsten_ore_in_vein", 7);
        NUMBER_OF_CHLOROPHYTE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_chlorophyte_ore_veins_in_chunk", 4);
        NUMBER_OF_CHLOROPHYTE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_chlorophyte_ore_in_vein", 3);
        NUMBER_OF_COPPER_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_copper_ore_veins_in_chunk", 7);
        NUMBER_OF_COPPER_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_copper_ore_in_vein", 8);
        NUMBER_OF_CRIMTANE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_crimtane_ore_veins_in_chunk", 4);
        NUMBER_OF_CRIMTANE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_crimtane_ore_in_vein", 2);
        NUMBER_OF_DEMONITE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_demonite_ore_veins_in_chunk", 4);
        NUMBER_OF_DEMONITE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_demonite_ore_in_vein", 8);
        NUMBER_OF_LEAD_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_lead_ore_veins_in_chunk", 23);
        NUMBER_OF_LEAD_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_lead_ore_in_vein", 7);
        NUMBER_OF_LUMENITE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_lumenite_ore_veins_in_chunk", 3);
        NUMBER_OF_LUMENITE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_lumenite_ore_in_vein", 6);
        NUMBER_OF_CITRINE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_citrine_ore_in_vein", 1);
        NUMBER_OF_CITRINE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_citrine_ore_veins_in_chunk", 2);
        NUMBER_OF_DEEPSLATE_CITRINE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_deepslate_citrine_ore_in_vein", 1);
        NUMBER_OF_DEEPSLATE_CITRINE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_deepslate_citrine_ore_veins_in_chunk",4);
        NUMBER_OF_NETHERRACK_CITRINE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_netherrack_citrine_ore_in_vein", 1);
        NUMBER_OF_NETHERRACK_CITRINE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_netherrack_citrine_ore_veins_in_chunk", 2);
        NUMBER_OF_ENDSTONE_CITRINE_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_endstone_citrine_ore_in_vein", 9);
        NUMBER_OF_ENDSTONE_CITRINE_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_endstone_citrine_ore_veins_in_chunk", 40);
        NUMBER_OF_SALT_ORE_IN_VEIN = CONFIG.getOrDefault("config.number_of_salt_ore_in_vein", 9);
        NUMBER_OF_SALT_ORE_VEINS_IN_CHUNK = CONFIG.getOrDefault("config.number_of_salt_ore_veins_in_chunk", 40);


        Thommas.LOGGER.info("All " + configs.getConfigsList().size() + " configs have been set properly!");
    }
}
