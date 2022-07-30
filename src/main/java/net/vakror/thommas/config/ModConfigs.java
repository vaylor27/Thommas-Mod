package net.vakror.thommas.config;

import com.mojang.datafixers.util.Pair;
import net.vakror.thommas.Thommas;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static boolean hacks;
    public static String username;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(Thommas.MOD_ID + "_config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("config.hacks", false), "Hacks");
        configs.addKeyValuePair(new Pair<>("config.username", "Human"), "Username");
    }

    private static void assignConfigs() {
        hacks = CONFIG.getOrDefault("config.hacks", false);
        username = CONFIG.getOrDefault("config.username", "Human");

        Thommas.LOGGER.info("All " + configs.getConfigsList().size() + " configs have been set properly!");
    }
}
