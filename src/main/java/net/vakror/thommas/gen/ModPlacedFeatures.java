package net.vakror.thommas.gen;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.vakror.thommas.config.ModConfigs;

import java.util.Arrays;

import static net.vakror.thommas.gen.ModConfiguredFeatures.*;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> JACARANDA_PLACED = PlacedFeatures.register("jacaranda_placed",
            ModConfiguredFeatures.JACARANDA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.01F, 2)));

    public static final RegistryEntry<PlacedFeature> REDWOOD_PLACED = PlacedFeatures.register("redwood_placed",
            ModConfiguredFeatures.REDWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.01F, 5)));

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

    public static PlacedFeature ALUMINUM_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(ALUMINUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(ModConfigs.NUMBER_OF_ALUMINUM_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature AMBER_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(AMBER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(ModConfigs.NUMBER_OF_AMBER_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            )); // Height

    public static PlacedFeature AMETHYST_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(AMETHYST_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(ModConfigs.NUMBER_OF_AMETHYST_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
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

    public static final RegistryEntry<PlacedFeature> CORRUPTED_PLACED = PlacedFeatures.register("corrupted_placed",
            ModConfiguredFeatures.CORRUPTED_FLOWER, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
}
