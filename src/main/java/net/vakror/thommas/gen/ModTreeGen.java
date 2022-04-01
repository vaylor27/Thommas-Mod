package net.vakror.thommas.gen;


import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.vakror.thommas.Thommas;

public class ModTreeGen {
    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModTreePlacedFeatures.JACARANDA_PLACED.getKey().get());
    }

    public static void generateRedwoodTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModTreePlacedFeatures.REDWOOD_PLACED.getKey().get());
    }
}
