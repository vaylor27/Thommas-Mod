package net.vakror.thommas.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        Thommas.LOGGER.info("Registering Fuels for " + Thommas.MOD_ID + "!");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.CORRUPTED_DUST, 350);
    }
}
