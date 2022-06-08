package net.vakror.thommas.world.gen.featureGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.vakror.thommas.world.gen.ModPlacedFeatures;

public class GenerateOthers {
    public static void generateOthers() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_STRUCTURES, ModPlacedFeatures.HONEY_OASIS.getKey().get());
    }
}