package net.vakror.thommas.world.gen;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.vakror.thommas.blockitem.ModBlocks;
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
                    new StraightTrunkPlacer(24, 24, 24),
                    BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 6),
                    new TwoLayersFeatureSize(3, 4, 2)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> EBONY_TREE =
            ConfiguredFeatures.register("ebony_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.EBONY_LOG),
                    new StraightTrunkPlacer(12, 13, 12),
                    BlockStateProvider.of(ModBlocks.EBONY_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 6),
                    new TwoLayersFeatureSize(6, 6, 6)).build());

    public static final RegistryEntry<PlacedFeature> JACARANDA_CHECKED =
            PlacedFeatures.register("jacaranda_checked", JACARANDA_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.JACARANDA_SAPLING));

    public static final RegistryEntry<PlacedFeature> REDWOOD_CHECKED =
            PlacedFeatures.register("redwood_checked", REDWOOD_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.REDWOOD_SAPLING));

    public static final RegistryEntry<PlacedFeature> EBONY_CHECKED =
            PlacedFeatures.register("ebony_checked", EBONY_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.EBONY_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> JACARANDA_SPAWN =
            ConfiguredFeatures.register("jacaranda_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(JACARANDA_CHECKED, 0.5f)),
                            JACARANDA_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> REDWOOD_SPAWN =
            ConfiguredFeatures.register("redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(REDWOOD_CHECKED, 0.5f)),
                            REDWOOD_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> EBONY_SPAWN =
            ConfiguredFeatures.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(EBONY_CHECKED, 0.5f)),
                            EBONY_CHECKED));



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

    public static final ConfiguredFeature<?, ?> BITUMEN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.BITUMEN_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_BITUMEN_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> CHLOROPHYTE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.CHLOROPHYTE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_CHLOROPHYTE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> COPPER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.COPPER_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_COPPER_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> CRIMTANE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.CRIMTANE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_CRIMTANE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> DEMONITE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.DEMONITE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_DEMONITE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> PURE_DIAMOND_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.PURE_DIAMOND_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_PURE_DIAMOND_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> PURE_EMERALD_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.PURE_EMERALD_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_PURE_EMERALD_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> LEAD_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.LEAD_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_LEAD_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> LUMENITE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.LUMENITE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_LUMENITE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> METEORITE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.METEORITE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_METEORITE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> PLATINUM_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.PLATINUM_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_PLATINUM_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> SALTPETER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SALTPETER_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_SALTPETER_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> SAPPHIRE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SAPPHIRE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_SAPPHIRE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> SILVER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SILVER_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_SILVER_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> SULPHUR_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SULPHUR_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_SULPHUR_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> TIN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.TIN_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_TIN_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> TITANIUM_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.TITANIUM_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_TITANIUM_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> TOPAZ_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.TOPAZ_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_TOPAZ_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> TUNGSTEN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.TUNGSTEN_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_TUNGSTEN_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> CITRINE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.CITRINE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_CITRINE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> DEEPSLATE_CITRINE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_CITRINE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_DEEPSLATE_CITRINE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> NETHERRACK_CITRINE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_CITRINE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_NETHERRACK_CITRINE_ORE_IN_VEIN)); // Vein size

    public static final ConfiguredFeature<?, ?> ENDSTONE_CITRINE_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>
            (Feature.ORE, new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.ENDSTONE_CITRINE_ORE.getDefaultState(),
                    ModConfigs.NUMBER_OF_ENDSTONE_CITRINE_ORE_IN_VEIN)); // Vein size



    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> CORRUPTED_FLOWER =
            ConfiguredFeatures.register("corrupted_flower", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CORRUPTED_FLOWER)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> ORCHID =
            ConfiguredFeatures.register("orchid", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ORCHID)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> HYACINTH =
            ConfiguredFeatures.register("hyacinth", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.HYACINTH)))));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PINK_ROSE =
            ConfiguredFeatures.register("pink_rose", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PINK_ROSE)))));



    public static final RegistryEntry<ConfiguredFeature<LakeFeature.Config, ?>> HONEY_OASIS =
            ConfiguredFeatures.register("honey_oasis", Feature.LAKE,
                    new LakeFeature.Config(BlockStateProvider.of(ModBlocks.HONEY_FLUID_BLOCK.getDefaultState()), BlockStateProvider.of(Blocks.HONEYCOMB_BLOCK.getDefaultState())));

}
