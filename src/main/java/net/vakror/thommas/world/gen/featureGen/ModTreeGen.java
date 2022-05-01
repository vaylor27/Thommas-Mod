package net.vakror.thommas.world.gen.featureGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.vakror.thommas.blockitem.ModBlocks;
import net.vakror.thommas.util.Tree;
import net.vakror.thommas.world.gen.ModConfiguredFeatures;
import net.vakror.thommas.world.gen.ModPlacedFeatures;

public class ModTreeGen {
    public static void generateTrees() {

        new Tree("jacaranda", ModBlocks.JACARANDA_SAPLING, ModConfiguredFeatures.JACARANDA_TREE, Biome.Category.PLAINS);

        new Tree("redwood", ModBlocks.REDWOOD_SAPLING, ModConfiguredFeatures.REDWOOD_TREE, Biome.Category.PLAINS);

        new Tree("ebony", ModBlocks.EBONY_SAPLING, ModConfiguredFeatures.EBONY_TREE, Biome.Category.PLAINS);

        new Tree("bone", ModBlocks.BONETREE_SAPLING, ModConfiguredFeatures.BONE_TREE, Biome.Category.PLAINS);

        new Tree("goldenwood", ModBlocks.GOLDENWOOD_SAPLING, ModConfiguredFeatures.GOLDENWOOD_TREE, Biome.Category.PLAINS);

        new Tree("cronetree", ModBlocks.CRONETREE_SAPLING, ModConfiguredFeatures.CRONETREE, Biome.Category.PLAINS);

        new Tree("gloamblossom", ModBlocks.GLOAMBLOSSOM_SAPLING, ModConfiguredFeatures.GLOAMBLOSSOM, Biome.Category.PLAINS);
    }
}
