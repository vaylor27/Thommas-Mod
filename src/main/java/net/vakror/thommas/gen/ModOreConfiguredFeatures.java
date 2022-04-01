package net.vakror.thommas.gen;

import net.minecraft.world.gen.feature.*;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.config.ModConfigs;

public class ModOreConfiguredFeatures {


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

}
