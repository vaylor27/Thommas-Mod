package net.vakror.thommas.world.gen;

import net.vakror.thommas.world.gen.featureGen.GenerateOthers;
import net.vakror.thommas.world.gen.featureGen.ModFlowerGen;
import net.vakror.thommas.world.gen.featureGen.ModOreGen;
import net.vakror.thommas.world.gen.featureGen.ModTreeGen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        GenerateOthers.generateOthers();
        ModTreeGen.generateTrees();
        ModOreGen.generateOres();
        ModFlowerGen.generateFlowers();
        ModEntitySpawns.addEntitySpawns();
    }
}
