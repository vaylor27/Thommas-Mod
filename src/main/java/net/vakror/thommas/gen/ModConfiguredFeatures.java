package net.vakror.thommas.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;

import java.util.Arrays;

public class ModConfiguredFeatures {

    public static void doWorldGen() {
        registerMythrilOres();
    }

    private static ConfiguredFeature<?, ?> MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.MYTHRIL_ORE.getDefaultState(),
                    16)); // Vein size

    private static ConfiguredFeature<?, ?> DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_MYTHRIL_ORE.getDefaultState(),
                    16)); // Vein size

    private static ConfiguredFeature<?, ?> NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_MYTHRIL_ORE.getDefaultState(),
                    46)); // Vein size

    private static ConfiguredFeature<?, ?> RUBYL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.RUBY_ORE.getDefaultState(),
                    4)); // Vein size

    public static PlacedFeature MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature DEEPSLATE_MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature NETHER_MYTHRIL_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(10), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature RUBY_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(RUBYL_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(4), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height




    private static void registerMythrilOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "overworld_mythril_ore"), MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "overworld_mythril_ore"),
                MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "overworld_mythril_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "deepslate_overworld_mythril_ore"), DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "deepslate_overworld_mythril_ore"),
                DEEPSLATE_MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "deepslate_overworld_mythril_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "nether_mythril_ore"), NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "nether_mythril_ore"),
                NETHER_MYTHRIL_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "nether_mythril_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, "ruby_ore"), RUBYL_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "ruby_ore"),
                RUBY_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "ruby_ore")));
    }
}
