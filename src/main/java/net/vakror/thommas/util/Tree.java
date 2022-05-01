package net.vakror.thommas.util;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.vakror.thommas.world.gen.ModPlacedFeatures;

import java.util.List;


public class Tree {
    public Tree(String name, Block saplingBlock, RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> treeFeatureConfig, Biome.Category biome, int countPerChunk, float extraChance, int extraCount) {
        makeTree(name, saplingBlock, treeFeatureConfig, biome, countPerChunk, extraChance, extraCount);
    }

    private static void makeTree(String name, Block saplingBlock, RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> treeFeatureConfig, Biome.Category biome, int countPerChunk, float extraChance, int extraCount) {

        RegistryEntry<PlacedFeature> TREE_CHECKED = PlacedFeatures.register(name + "_checked", treeFeatureConfig,
                PlacedFeatures.wouldSurvive(saplingBlock));

        RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> TREE_SPAWN = ConfiguredFeatures.register(name + "_spawn", Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(TREE_CHECKED, 0.5f)),
                        TREE_CHECKED));

        RegistryEntry<PlacedFeature> TREE_PLACED = PlacedFeatures.register(name + "_placed",
                TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                        PlacedFeatures.createCountExtraModifier(countPerChunk, extraChance, extraCount)));

        BiomeModifications.addFeature(BiomeSelectors.categories(biome),
                GenerationStep.Feature.VEGETAL_DECORATION, TREE_PLACED.getKey().get());
    }
}
