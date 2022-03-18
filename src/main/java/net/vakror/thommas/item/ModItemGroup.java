package net.vakror.thommas.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "blocks"),
            () -> new ItemStack(ModBlocks.MYTHRIL_BLOCK));

    public static final ItemGroup ORES = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "ores"),
            () -> new ItemStack(ModBlocks.MYTHRIL_ORE));

    public static final ItemGroup ITEMS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "items"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));

    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "tools"),
            () -> new ItemStack(ModItems.MYTHRIL_SWORD));

    public static final ItemGroup SPECIAL_ITEMS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "special_items"),
            () -> new ItemStack(ModItems.DATA_TABLET));

    public static final ItemGroup SPECIAL_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "special_blocks"),
            () -> new ItemStack(ModBlocks.SPEEDY_BLOCK));

    public static final ItemGroup NATURE = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "crops"),
            () -> new ItemStack(ModItems.PEPPER));

}
