package net.vakror.thommas.util;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.vakror.thommas.world.biome.ModBiomes;

public class Flower {
    public Flower(String name, Block flower, int triesPerChunk, int rarityFilterPlacementModifier) {
        registerConfiguredFeature(name, flower, triesPerChunk);
        registerPlacedFeature(name, rarityFilterPlacementModifier);
        generateFlower();
    }

    private static RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> FLOWER;
    private static RegistryEntry<PlacedFeature> FLOWER_PLACED;

    private static void registerConfiguredFeature(String name, Block flower, int triesPerChunk) {
        FLOWER = ConfiguredFeatures.register(name, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(triesPerChunk, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(flower)))));
    }

    private static void registerPlacedFeature(String name, int rarityFilterPlacementModifier) {
         FLOWER_PLACED = PlacedFeatures.register(name + "_placed",
                FLOWER, RarityFilterPlacementModifier.of(rarityFilterPlacementModifier), SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    private static void generateFlower() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.HIGHLANDS_FOREST, ModBiomes.BARRENS_FOREST, ModBiomes.MIDLANDS_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, FLOWER_PLACED.getKey().get());
    }
}
