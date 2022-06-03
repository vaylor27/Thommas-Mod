package net.vakror.thommas.world.gen.featureGen;

import net.minecraft.world.biome.Biome;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.util.Flower;

public class ModFlowerGen {
    public static void generateFlowers() {
        new Flower("corrupted_flower", ModBlocks.CORRUPTED_FLOWER, 64, 4, Biome.Category.PLAINS);
        new Flower("orchid", ModBlocks.ORCHID, 64,3,Biome.Category.PLAINS);
        new Flower("hyacinth", ModBlocks.HYACINTH, 64, 2, Biome.Category.PLAINS);
        new Flower("bluebells", ModBlocks.BLUEBELLS, 64, 1, Biome.Category.PLAINS);
        new Flower("plumphelmet", ModBlocks.PLUMP_HELMET, 64, 1, Biome.Category.TAIGA);
    }
}
