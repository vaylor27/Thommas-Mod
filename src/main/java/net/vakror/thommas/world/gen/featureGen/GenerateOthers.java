package net.vakror.thommas.world.gen.featureGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationStep;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.util.Geode;
import net.vakror.thommas.world.gen.ModPlacedFeatures;

public class GenerateOthers {
    public static void generateOthers() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.LAKES, ModPlacedFeatures.HONEY_OASIS.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.LAKES, ModPlacedFeatures.OIL.getKey().get());

    }
}