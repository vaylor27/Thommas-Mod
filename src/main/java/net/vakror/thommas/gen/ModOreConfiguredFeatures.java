package net.vakror.thommas.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.config.ModConfigs;

import java.util.Arrays;

public class ModOreConfiguredFeatures {

    public static void doWorldGen() {
        registerMythrilOres();
    }

    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeFeatureConfig.Builder redwood() {
        return builder(ModBlocks.REDWOOD_LOG, ModBlocks.REDWOOD_LEAVES, 4, 2, 0, 2).ignoreVines();
    }

    private static final ConfiguredFeature<?, ?> MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.MYTHRIL_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_MYTHRIL_ORE_IN_VEIN)); // Vein size

    private static final ConfiguredFeature<?, ?> DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_MYTHRIL_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_IN_VEIN)); // Vein size

    private static final ConfiguredFeature<?, ?> NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_MYTHRIL_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_NETHER_MYTHRIL_ORE_IN_VEIN)); // Vein size

    private static final ConfiguredFeature<?, ?> RUBY_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.RUBY_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_RUBY_ORE_IN_VEIN)); // Vein size


    public static PlacedFeature MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(ModConfigs.NUMBER_OF_MYTHRIL_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature DEEPSLATE_MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(ModConfigs.NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature NETHER_MYTHRIL_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(ModConfigs.NUMBER_OF_NETHER_MYTHRIL_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature RUBY_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(RUBY_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(ModConfigs.NUMBER_OF_RUBY_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
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
                new Identifier(Thommas.MOD_ID, "ruby_ore"), RUBY_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "ruby_ore"),
                RUBY_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "ruby_ore")));
    }
}
