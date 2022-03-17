package net.vakror.thommas.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.command.ReturnHome;
import net.vakror.thommas.command.SetHome;
import net.vakror.thommas.event.ModPlayerPlayerEventCopyFrom;
import net.vakror.thommas.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registerEvents();
        registerStrippables();
        registerFlammableBlock();
    }


    private static void registerFuels() {
        Thommas.LOGGER.info("Registering Fuels for " + Thommas.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.CORRUPTED_DUST, 200);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHome::register);
        CommandRegistrationCallback.EVENT.register(ReturnHome::register);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.REDWOOD_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_REDWOOD_LOG, 5, 5);
        instance.add(ModBlocks.REDWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_REDWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.REDWOOD_PLANKS, 5, 20);
        instance.add(ModBlocks.REDWOOD_LEAVES, 30, 60);
    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerPlayerEventCopyFrom());
    }
}
