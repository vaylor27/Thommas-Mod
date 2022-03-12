package net.vakror.thommas.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL_ITEMS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "mythril_items"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));

    public static final ItemGroup MYTHRIL_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "mythril_blocks"),
            () -> new ItemStack(ModBlocks.MYTHRIL_BLOCK));

    public static final ItemGroup SPECIAL_ITEMS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "special_items"),
            () -> new ItemStack(ModItems.ROD_OF_FINDING));

    public static final ItemGroup FOOD_ITEMS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "food_items"),
            () -> new ItemStack(ModItems.STRAWBERRY));

    public static final ItemGroup DETRANIUM = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "detranium"),
            () -> new ItemStack(ModBlocks.KAUPEN_DOOR));
}
