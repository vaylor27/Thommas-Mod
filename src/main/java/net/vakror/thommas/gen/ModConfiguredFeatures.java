package net.vakror.thommas.gen;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.config.ModConfigs;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> JACARANDA_TREE =
            ConfiguredFeatures.register("jacaranda_tree", Feature.TREE,new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.JACARANDA_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.JACARANDA_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDWOOD_TREE =
            ConfiguredFeatures.register("redwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.REDWOOD_LOG),
                    new StraightTrunkPlacer(8, 4, 3),
                    BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final RegistryEntry<PlacedFeature> JACARANDA_CHECKED =
            PlacedFeatures.register("jacaranda_checked", JACARANDA_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.JACARANDA_SAPLING));

    public static final RegistryEntry<PlacedFeature> REDWOOD_CHECKED =
            PlacedFeatures.register("redwood_checked", REDWOOD_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.REDWOOD_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> JACARANDA_SPAWN =
            ConfiguredFeatures.register("jacaranda_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(JACARANDA_CHECKED, 0.5f)),
                            JACARANDA_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> REDWOOD_SPAWN =
            ConfiguredFeatures.register("redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(REDWOOD_CHECKED, 0.5f)),
                            REDWOOD_CHECKED));

    public static final ConfiguredFeature<?, ?> MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.MYTHRIL_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_MYTHRIL_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_MYTHRIL_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_MYTHRIL_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_NETHER_MYTHRIL_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> RUBY_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.RUBY_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_RUBY_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> ALUMINUM_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ALUMINUM_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_ALUMINUM_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> AMBER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.AMBER_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_AMBER_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> AMETHYST_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.AMETHYST_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_AMETHYST_ORE_IN_VEIN)); // Vein size

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> CORRUPTED_FLOWER =
            ConfiguredFeatures.register("corrupted_flower", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CORRUPTED_FLOWER)))));

}
