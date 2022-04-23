package net.vakror.thommas.world.dimensions.dimension;

import net.minecraft.block.Blocks;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.blockitem.block.ModBlocks;
import net.vakror.thommas.util.Dimension;

public class ModDimensions {
    private static void registerDimensions() {
        new Dimension("goldland", false, Blocks.GOLD_BLOCK, 179, 184, 37);
        new Dimension("plains", true, Blocks.COARSE_DIRT, 40, 122, 20);
        new Dimension("safe_nether", false, Blocks.NETHERRACK, 71, 23, 99);
        new Dimension("building_haven", true, ModBlocks.MYTHRIL_BLOCK, 255, 21, 0);
    }

    public static void register() {
        Thommas.LOGGER.info("Registering Dimensions For " + Thommas.MOD_ID + "!");
        registerDimensions();
    }
}
