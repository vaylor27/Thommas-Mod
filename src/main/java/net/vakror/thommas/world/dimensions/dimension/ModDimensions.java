package net.vakror.thommas.world.dimensions.dimension;

import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Items;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.fluid.ModFluids;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.util.Dimension;

public class ModDimensions {
    public static void registerDimensions() {
        new Dimension("plains", ModFluids.HONEY_STILL,true, Blocks.COARSE_DIRT, 40, 122, 20);
        new Dimension("safe_nether", ModItems.SWITCH,Blocks.BASALT, 71, 23, 99);
        new Dimension("building_haven", ModItems.SMALL_SOULSTONE, true, ModBlocks.CITRINE_BLOCK, 255, 21, 0);
        new Dimension("flat", ModItems.DARK_CRYSTAL, true, ModBlocks.SMOOTH_AMETHYST_BLOCK, 196, 41, 204);
        new Dimension("hell", Items.LAVA_BUCKET, false, ModBlocks.DEMONITE_BLOCK, 176, 76, 14);
    }

    public static void register() {
        Thommas.LOGGER.info("Registering Dimensions For " + Thommas.MOD_ID + "!");
        registerDimensions();
    }
}
