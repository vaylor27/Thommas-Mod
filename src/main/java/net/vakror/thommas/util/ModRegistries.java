package net.vakror.thommas.util;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.blockitem.ModBlocks;
import net.vakror.thommas.command.home.ReturnHome;
import net.vakror.thommas.command.home.SetHome;
import net.vakror.thommas.command.secondaryhome.ReturnSecondaryHome;
import net.vakror.thommas.command.secondaryhome.SetSecondaryHome;
import net.vakror.thommas.event.ModPlayerPlayerEventCopyFrom;
import net.vakror.thommas.villager.trade.LightningGodTrades;
import net.vakror.thommas.villager.trade.ModTrades;
import net.vakror.thommas.world.dimensions.dimension.ModDimensions;
import net.vakror.thommas.world.gen.ModWorldGen;
import net.vakror.thommas.blockitem.ModItems;
import net.vakror.thommas.villager.trade.BlastMasterTrades;
import net.vakror.thommas.villager.trade.VanillaVillagerTrades;

import static net.vakror.thommas.world.gen.ModConfiguredFeatures.*;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registerEvents();
        registerTrades();
        registerStrippables();
        registerFlammableBlock();
        registerOres();
        ModWorldGen.generateModWorldGen();
        ModDimensions.register();
    }

    private static void registerOres() {
        registerOreConfiguredFeatures();
    }

    private static void registerTrades() {
        new ModTrades();
    }


    private static void registerFuels() {
        Thommas.LOGGER.info("Registering Fuels for " + Thommas.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.COAL_COKE, 20000);
        registry.add(ModItems.CORRUPTED_DUST, 2000);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHome::register);
        CommandRegistrationCallback.EVENT.register(ReturnHome::register);
        CommandRegistrationCallback.EVENT.register(SetSecondaryHome::register);
        CommandRegistrationCallback.EVENT.register(ReturnSecondaryHome::register);

    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_LOG, ModBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(ModBlocks.JACARANDA_WOOD, ModBlocks.STRIPPED_JACARANDA_WOOD);
        StrippableBlockRegistry.register(ModBlocks.EBONY_LOG, ModBlocks.STRIPPED_EBONY_LOG);
        StrippableBlockRegistry.register(ModBlocks.EBONY_WOOD, ModBlocks.STRIPPED_EBONY_WOOD);
    }

    private static void registerFlammableBlock() {
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

    private static void registerOreConfiguredFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "aluminum_ore"), ALUMINUM_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "ruby_ore"), RUBY_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "nether_mythril_ore"), NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "deepslate_overworld_mythril_ore"), DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "overworld_mythril_ore"), MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "amber_ore"), AMBER_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "bitumen_ore"), BITUMEN_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "chlorophyte_ore"), CHLOROPHYTE_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "copper_ore"), COPPER_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "crimtane_ore"), CRIMTANE_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "demonite_ore"), DEMONITE_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "pure_diamond_ore"), PURE_DIAMOND_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "pure_emerald_ore"), PURE_EMERALD_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "lead_ore"), LEAD_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "lumenite_ore"), LUMENITE_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "meteorite_ore"), METEORITE_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "platinum_ore"), PLATINUM_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "saltpeter_ore"), SALTPETER_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "silver_ore"), SILVER_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "sulphur_ore"), SULPHUR_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "tin_ore"), TIN_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "titanium_ore"), TITANIUM_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "topaz_ore"), TOPAZ_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "tungsten_ore"), TUNGSTEN_ORE_CONFIGURED_FEATURE);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "stone_zinc_ore"), STONE_ZINC_ORE_CONFIGURED_FEATURE);

    }

    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerPlayerEventCopyFrom());
    }
}
