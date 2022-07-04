package net.vakror.thommas.util;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.vakror.thommas.world.biome.ModBiomes;

import java.util.List;

public class Geode {
    public Geode(String name, Block fillingProvider, Block innerLayerProvider, Block alternateInnerLayerProvider, Block middleLayerProvider, Block outerLayerProvider) {
        registerConfiguredFeature(name, fillingProvider, innerLayerProvider, alternateInnerLayerProvider, middleLayerProvider, outerLayerProvider);
        registerPlacedFeature(name);
        generateGeode();
    }

    private static RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> GEODE;
    private static RegistryEntry<PlacedFeature> GEODE_PLACED;


    private static void registerConfiguredFeature(String name, Block fillingProvider, Block innerLayerProvider, Block alternateInnerLayerProvider, Block middleLayerProvider, Block outerLayerProvider) {
        GEODE =
                ConfiguredFeatures.register(name + "_geode", Feature.GEODE ,
                        new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                                BlockStateProvider.of(fillingProvider),
                                BlockStateProvider.of(innerLayerProvider),
                                BlockStateProvider.of(alternateInnerLayerProvider),
                                BlockStateProvider.of(middleLayerProvider),
                                List.of(outerLayerProvider.getDefaultState()),
                                BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                                new GeodeLayerThicknessConfig(1.7D, 1.2D, 2.5D, 3.5D),
                                new GeodeCrackConfig(0.25D, 1.5D, 1),
                                0.5D, 0.1D,
                                true, UniformIntProvider.create(3, 8),
                                UniformIntProvider.create(2, 6), UniformIntProvider.create(1, 2),
                                -18, 18, 0.075D, 1));
    }

    private static void registerPlacedFeature(String name) {
        GEODE_PLACED = PlacedFeatures.register(name,
                GEODE, RarityFilterPlacementModifier.of(42),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.aboveBottom(50)),
                BiomePlacementModifier.of());
    }

    private static void generateGeode() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld().and(BiomeSelectors.includeByKey(ModBiomes.HIGHLANDS_FOREST, ModBiomes.MIDLANDS_FOREST, ModBiomes.BARRENS_FOREST)),
                GenerationStep.Feature.UNDERGROUND_DECORATION, GEODE_PLACED.getKey().get());
    }
}
