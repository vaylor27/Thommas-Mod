package net.vakror.thommas.world.gen.featureGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.vakror.thommas.world.gen.ModPlacedFeatures;

public class ModFlowerGen {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CORRUPTED_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ORCHID_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HYACINTH_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_PLACED.getKey().get());
    }
}
