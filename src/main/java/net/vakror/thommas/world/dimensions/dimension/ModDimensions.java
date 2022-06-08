package net.vakror.thommas.world.dimensions.dimension;

import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.fluid.ModFluids;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.util.Dimension;

public class ModDimensions {
    public static void registerDimensions() {
        new Dimension("goldland", ModItems.STAFF, Blocks.GOLD_BLOCK, 179, 184, 37);
        new Dimension("plains", ModFluids.HONEY_STILL,true, Blocks.COARSE_DIRT, 40, 122, 20);
        new Dimension("safe_nether", ModItems.SWITCH,Blocks.BASALT, 71, 23, 99);
        new Dimension("building_haven", ModItems.AMETHYST, true, ModBlocks.MYTHRIL_BLOCK, 255, 21, 0);
        new Dimension("flat", ModItems.DARK_CRYSTAL, true, ModBlocks.AMETHYST_BLOCK, 196, 41, 204);
        new Dimension("toemas_fred_jefferson", Fluids.WATER, Blocks.GLOWSTONE, 41, 196, 204);
        new Dimension("gorgified_bob_washington", ModItems.STEEL_HAMMER,true,Blocks.WAXED_CUT_COPPER, 189, 15, 79);
        new Dimension("joe_h_kennedy", ModItems.ADAMANTIUM_DUST,true,Blocks.WAXED_CUT_COPPER, 157, 86, 13);
    }

    public static void register() {
        Thommas.LOGGER.info("Registering Dimensions For " + Thommas.MOD_ID + "!");
        registerDimensions();
    }
}
