package net.vakror.thommas.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Item;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.command.home.ReturnHome;
import net.vakror.thommas.command.home.SetHome;
import net.vakror.thommas.command.secondaryhome.ReturnSecondaryHome;
import net.vakror.thommas.command.secondaryhome.SetSecondaryHome;
import net.vakror.thommas.entity.ModEntities;
import net.vakror.thommas.entity.custom.RaccoonEntity;
import net.vakror.thommas.entity.custom.RatEntity;
import net.vakror.thommas.event.ModPlayerPlayerEventCopyFrom;
import net.vakror.thommas.event.ModPlayerPlayerEventCopyFromTwo;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.villager.trade.ModTrades;

public class ModRegistries {
    
    public static void registerModStuffs() {
        registerFuels();
        registerModComposterChances();
        registerCommands();
        registerEvents();
        registerTrades();
        registerStrippables();
        registerFlammableBlock();
        registerAttributes();
    }

    public static void registerTrades() {
        new ModTrades();
    }


    public static void registerFuels() {
        Thommas.LOGGER.info("Registering Fuels for " + Thommas.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.COAL_COKE, 2000);
        registry.add(ModItems.CORRUPTED_DUST, 2000);
        registry.add(ModItems.MOTOR_3, 20000);
        registry.add(ModItems.COAL_SLIVER, 500);
    }

    public static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {SetHome.register(dispatcher);}));
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {ReturnHome.register(dispatcher);}));
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {SetSecondaryHome.register(dispatcher);}));
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {ReturnSecondaryHome.register(dispatcher);}));
    }
    
    public static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.RAT, RatEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TIGER, RatEntity.setAttributes());
    }

    public static void registerModComposterChances() {
        registerCompostableItem(ModItems.TURNIP, 0.45f);
        registerCompostableItem(ModItems.TURNIP_SEEDS, 0.43f);
    }

    private static void registerCompostableItem(Item item, float chance) {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item, chance);
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_LOG, ModBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_WOOD, ModBlocks.STRIPPED_JACARANDA_WOOD);
        StrippableBlockRegistry.register(ModBlocks.EBONY_LOG, ModBlocks.STRIPPED_EBONY_LOG);
        StrippableBlockRegistry.register(ModBlocks.EBONY_WOOD, ModBlocks.STRIPPED_EBONY_WOOD);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_LOG, ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_WOOD, ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD);
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
        instance.add(ModBlocks.CHERRY_BLOSSOM_PLANKS, 5, 20);
        instance.add(ModBlocks.CHERRY_BLOSSOM_WOOD, 30, 60);
        instance.add(ModBlocks.CHERRY_BLOSSOM_LEAVES, 5, 20);
        instance.add(ModBlocks.CHERRY_BLOSSOM_LOG, 30, 60);
        instance.add(ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG, 5, 20);
        instance.add(ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD, 30, 60);
    }

    public static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerPlayerEventCopyFrom());
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerPlayerEventCopyFromTwo());
    }
}
