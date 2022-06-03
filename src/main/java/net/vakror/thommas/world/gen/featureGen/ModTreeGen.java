package net.vakror.thommas.world.gen.featureGen;

import net.minecraft.world.biome.Biome;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.util.Tree;
import net.vakror.thommas.world.gen.ModConfiguredFeatures;

public class ModTreeGen {
    public static void generateTrees() {

        new Tree("jacaranda", ModBlocks.JACARANDA_SAPLING, ModConfiguredFeatures.JACARANDA_TREE, Biome.Category.PLAINS, 0, 0.5f, 8);

        new Tree("redwood", ModBlocks.REDWOOD_SAPLING, ModConfiguredFeatures.REDWOOD_TREE, Biome.Category.PLAINS, 2, 0.5f, 3);

        new Tree("ebony", ModBlocks.EBONY_SAPLING, ModConfiguredFeatures.EBONY_TREE, Biome.Category.PLAINS, 4, 0.5f, 6);

        new Tree("bone", ModBlocks.BONETREE_SAPLING, ModConfiguredFeatures.BONE_TREE, Biome.Category.PLAINS,4,0.5f, 3);

        new Tree("goldenwood", ModBlocks.GOLDENWOOD_SAPLING, ModConfiguredFeatures.GOLDENWOOD_TREE, Biome.Category.PLAINS, 2,0.5f, 3);

        new Tree("cronetree", ModBlocks.CRONETREE_SAPLING, ModConfiguredFeatures.CRONETREE, Biome.Category.PLAINS,0,1, 6);

        new Tree("gloamblossom", ModBlocks.GLOAMBLOSSOM_SAPLING, ModConfiguredFeatures.GLOAMBLOSSOM, Biome.Category.PLAINS,8,0.01f, 6);

        new Tree("cherry_blossom", ModBlocks.CHERRY_BLOSSOM_SAPLING, ModConfiguredFeatures.CHERRY_BLOSSOM_TREE, Biome.Category.PLAINS,8,0.01f, 6);
    }
}
