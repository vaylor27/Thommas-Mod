package net.vakror.thommas.world.gen.featureGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.vakror.thommas.world.gen.ModPlacedFeatures;

public class ModTreeGen {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.JACARANDA_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDWOOD_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.EBONY_PLACED.getKey().get());
    }
}
