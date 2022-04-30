package net.vakror.thommas.util;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.vakror.thommas.Thommas;

import java.util.Arrays;


public class Ore {
    public Ore(String initName, Block block, Block replacedBlock, int veinsInChunk , int veinSize) {
        String name = initName + "_ore";
        configuredFeature(name, replacedBlock, veinSize, block);
        placedFeature(name, veinsInChunk);
    }
    private static ConfiguredFeature<?, ?> CONFIGURED_FEATURE = null;

    private static void configuredFeature(String name, Block replacedBlock, int veinSize, Block block) {
         CONFIGURED_FEATURE = new ConfiguredFeature<>
                (Feature.ORE, new OreFeatureConfig(
                        new BlockMatchRuleTest(replacedBlock),
                        block.getDefaultState(),
                        veinSize)); // Vein size

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Thommas.MOD_ID, name), CONFIGURED_FEATURE);
    }

    private static void placedFeature(String name, int veinsInChunk) {
        // Number of veins per chunk
        PlacedFeature PLACED_FEATURE = new PlacedFeature(
                RegistryEntry.of(CONFIGURED_FEATURE),
                Arrays.asList(
                        CountPlacementModifier.of(veinsInChunk), // Number of veins per chunk
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
                ));

        registerPlacedFeature(PLACED_FEATURE, name);
    }

    private static void registerPlacedFeature(PlacedFeature feature, String name) {
        if (name.contains("nether")) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(Thommas.MOD_ID, name)));
        }
        if (name.contains("end")) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(Thommas.MOD_ID, name)));
        }
        else  {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(Thommas.MOD_ID, name)));
        }

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, name), feature);
    }
}
