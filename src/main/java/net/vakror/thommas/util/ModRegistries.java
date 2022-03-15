package net.vakror.thommas.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.command.ReturnHome;
import net.vakror.thommas.command.SetHome;
import net.vakror.thommas.event.ModPlayerPlayerEventCopyFrom;
import net.vakror.thommas.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registerEvents();
    }

    private static void registerFuels() {
        Thommas.LOGGER.info("Registering Fuels for " + Thommas.MOD_ID + "!");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.CORRUPTED_DUST, 350);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHome::register);
        CommandRegistrationCallback.EVENT.register(ReturnHome::register);
    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerPlayerEventCopyFrom());
    }
}
