package net.vakror.thommas.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
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

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);
    }
}
