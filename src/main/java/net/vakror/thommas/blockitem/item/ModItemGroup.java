package net.vakror.thommas.blockitem.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.blockitem.ModBlocks;
import net.vakror.thommas.blockitem.ModItems;

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

    public static final ItemGroup BRICKS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "bricks"),
            () -> new ItemStack(ModBlocks.BRICK_MIXED));

    public static final ItemGroup LAMPS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "lamps"),
            () -> new ItemStack(ModBlocks.MYTHRIL_LAMP));

    public static final ItemGroup ARTIFACTS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "artifacts"),
            () -> new ItemStack(ModItems.MAGIC_GEM));

    public static final ItemGroup COINS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "coins"),
            () -> new ItemStack(ModItems.ALUMINUM_COIN));

    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "materials"),
            () -> new ItemStack(ModItems.CITRINE));

}
