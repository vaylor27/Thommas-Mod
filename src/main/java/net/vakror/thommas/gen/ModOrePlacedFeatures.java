package net.vakror.thommas.gen;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.vakror.thommas.config.ModConfigs;
import static net.vakror.thommas.gen.ModOreConfiguredFeatures.*;

import java.util.Arrays;

public class ModOrePlacedFeatures {

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
}
