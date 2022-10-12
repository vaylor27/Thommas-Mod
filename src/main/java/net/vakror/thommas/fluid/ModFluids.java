package net.vakror.thommas.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.item.ModItemGroup;
import net.vakror.thommas.item.ModItems;

public class ModFluids {
    public static final FlowableFluid HONEY_STILL = register("honey_still", new HoneyFluid.Still());
    public static final FlowableFluid HONEY_FLOWING = register("honey_flowing", new HoneyFluid.Flowing());

    public static final FlowableFluid OIL_STILL = Registry.register(Registry.FLUID,
            new Identifier(Thommas.MOD_ID, "oil"), new OilFluid.Still());
    public static final FlowableFluid OIL_FLOWING = Registry.register(Registry.FLUID,
            new Identifier(Thommas.MOD_ID, "flowing_oil"), new OilFluid.Flowing());

    public static final Block OIL_BLOCK = Registry.register(Registry.BLOCK, new Identifier(Thommas.MOD_ID, "oil_block"),
                new FluidBlock(ModFluids.OIL_STILL, FabricBlockSettings.copy(Blocks.WATER)));
    public static final Item OIL_BUCKET = Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, "oil_bucket"),
                new BucketItem(ModFluids.OIL_STILL, new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).recipeRemainder(Items.BUCKET).maxCount(1)));

    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {

        return Registry.register(Registry.FLUID, new Identifier(Thommas.MOD_ID, name), flowableFluid);
    }
}