package net.vakror.thommas.util;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
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
import net.vakror.thommas.block.custom.FakeOreBlock;
import net.vakror.thommas.item.ModItemGroup;

import java.util.Arrays;


public class Ore {
    public Ore(String initName, Block replacesBlock, int veinsInChunk , int veinSize, boolean hasFake) {
        register(initName + "_ore", replacesBlock, veinsInChunk, veinSize);
        if (hasFake)
            registerFake(initName + "_ore_fake", veinsInChunk, veinSize);
    }

    public Ore(String initName, Block replacesBlock, int veinsInChunk , int veinSize) {
        register(initName + "_ore", replacesBlock, veinsInChunk, veinSize);
        registerFake(initName + "_ore_fake", veinsInChunk, veinSize);
    }

    public Ore(String initName, Block block, Block replacesBlock, int veinsInChunk, int veinSize) {
        configuredFeature(initName, replacesBlock, veinSize, block);
        placedFeature(initName, veinsInChunk);
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

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Thommas.MOD_ID, name), block);
    }


    private static Block BLOCK;

    private static void register(String name, Block replacedBlock, int veinsInChunk , int veinSize) {
        BLOCK = registerBlock(name, new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool(), UniformIntProvider.create(9, 27)));
        configuredFeature(name, replacedBlock, veinSize, BLOCK);
        placedFeature(name, veinsInChunk);
    }


    private static void registerFake(String name, int veinsInChunk , int veinSize) {
        Block FAKEBLOCK = registerBlock(name, new FakeOreBlock(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()));
        configuredFeature(name, BLOCK, veinSize, FAKEBLOCK);
        placedFeature(name, 50);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.ORES)));
    }
}
