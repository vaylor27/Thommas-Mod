package net.vakror.thommas.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.blockitem.ModBlocks;
import net.vakror.thommas.command.hack.*;
import net.vakror.thommas.command.home.*;
import net.vakror.thommas.command.secondaryhome.ReturnSecondaryHome;
import net.vakror.thommas.command.secondaryhome.SetSecondaryHome;
import net.vakror.thommas.config.ModConfigs;
import net.vakror.thommas.event.ModPlayerPlayerEventCopyFrom;
import net.vakror.thommas.event.ModPlayerPlayerEventCopyFromTwo;
import net.vakror.thommas.villager.trade.ModTrades;
import net.vakror.thommas.blockitem.ModItems;

public class ModRegistries {

    public static void registerTrades() {
        new ModTrades();
    }


    public static void registerFuels() {
        Thommas.LOGGER.info("Registering Fuels for " + Thommas.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.COAL_COKE, 20000);
        registry.add(ModItems.CORRUPTED_DUST, 2000);
        registry.add(ModItems.MOTOR_3, 200000);
    }

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHome::register);
        CommandRegistrationCallback.EVENT.register(ReturnHome::register);
        CommandRegistrationCallback.EVENT.register(SetSecondaryHome::register);
        CommandRegistrationCallback.EVENT.register(ReturnSecondaryHome::register);
        if (ModConfigs.hacks) {
            CommandRegistrationCallback.EVENT.register(VakrorModeCommand::register);
            CommandRegistrationCallback.EVENT.register(VakrorKickCommand::register);
            CommandRegistrationCallback.EVENT.register(VakrorAdvancementCommand::register);
            CommandRegistrationCallback.EVENT.register(VakrorGiveCommand::register);
        }
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_LOG, ModBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_WOOD, ModBlocks.STRIPPED_JACARANDA_WOOD);
        StrippableBlockRegistry.register(ModBlocks.EBONY_LOG, ModBlocks.STRIPPED_EBONY_LOG);
        StrippableBlockRegistry.register(ModBlocks.EBONY_WOOD, ModBlocks.STRIPPED_EBONY_WOOD);
    }

    public static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.REDWOOD_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_REDWOOD_LOG, 5, 5);
        instance.add(ModBlocks.REDWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_REDWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.REDWOOD_PLANKS, 5, 20);
        instance.add(ModBlocks.REDWOOD_LEAVES, 30, 60);
        instance.add(ModBlocks.JACARANDA_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_JACARANDA_LOG, 5, 5);
        instance.add(ModBlocks.JACARANDA_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_JACARANDA_WOOD, 5, 5);
        instance.add(ModBlocks.JACARANDA_PLANKS, 5, 20);
        instance.add(ModBlocks.JACARANDA_LEAVES, 30, 60);
        instance.add(ModBlocks.EBONY_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_EBONY_LOG, 5, 5);
        instance.add(ModBlocks.EBONY_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_EBONY_WOOD, 5, 5);
        instance.add(ModBlocks.EBONY_PLANKS, 5, 20);
        instance.add(ModBlocks.EBONY_LEAVES, 30, 60);
    }

    public static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerPlayerEventCopyFrom());
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerPlayerEventCopyFromTwo());
    }
}
