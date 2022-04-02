package net.vakror.thommas.gen;

import net.vakror.thommas.gen.featureGen.ModFlowerGen;
import net.vakror.thommas.gen.featureGen.ModOreGen;
import net.vakror.thommas.gen.featureGen.ModTreeGen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModTreeGen.generateTrees();
        ModOreGen.generateOres();
        ModFlowerGen.generateFlowers();
    }
}
