package net.vakror.thommas.world.gen;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.vakror.thommas.block.ModBlocks;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> JACARANDA_TREE =
            ConfiguredFeatures.register("jacaranda_tree", Feature.TREE,new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.JACARANDA_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.JACARANDA_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDWOOD_TREE =
            ConfiguredFeatures.register("redwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.REDWOOD_LOG),
                    new StraightTrunkPlacer(24, 24, 24),
                    BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 5),
                    new TwoLayersFeatureSize(3, 4, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> EBONY_TREE =
            ConfiguredFeatures.register("ebony_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.EBONY_LOG),
                    new StraightTrunkPlacer(12, 13, 12),
                    BlockStateProvider.of(ModBlocks.EBONY_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 5),
                    new TwoLayersFeatureSize(4, 5, 1))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BONE_TREE =
            ConfiguredFeatures.register("bone_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BONETREE_LOG),
                    new StraightTrunkPlacer(20, 20, 20),
                    BlockStateProvider.of(ModBlocks.BONETREE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 5),
                    new TwoLayersFeatureSize(4, 5, 4))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GOLDENWOOD_TREE =
            ConfiguredFeatures.register("goldenwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.GOLDENWOOD_LOG),
                    new StraightTrunkPlacer(8, 15, 3),
                    BlockStateProvider.of(ModBlocks.GOLDENWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 8),
                    new TwoLayersFeatureSize(6, 6, 6))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CRONETREE =
            ConfiguredFeatures.register("cronetree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CRONETREE_LOG),
                    new StraightTrunkPlacer(19, 5, 8),
                    BlockStateProvider.of(ModBlocks.CRONETREE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 5),
                    new TwoLayersFeatureSize(4, 6, 6))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GLOAMBLOSSOM =
            ConfiguredFeatures.register("gloamblossom", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.GLOAMBLOSSOM_LOG),
                    new StraightTrunkPlacer(24, 1, 16),
                    BlockStateProvider.of(ModBlocks.GLOAMBLOSSOM_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(4, 3, 1))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_BLOSSOM_TREE =
            ConfiguredFeatures.register("cherry_blossom", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());


    public static final RegistryEntry<ConfiguredFeature<LakeFeature.Config, ?>> HONEY_OASIS =
            ConfiguredFeatures.register("honey_oasis", Feature.LAKE,
                    new LakeFeature.Config(BlockStateProvider.of(ModBlocks.HONEY_FLUID_BLOCK.getDefaultState()), BlockStateProvider.of(Blocks.HONEYCOMB_BLOCK.getDefaultState())));

}
