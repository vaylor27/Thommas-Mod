package net.vakror.thommas.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.custom.*;
import net.vakror.thommas.item.ModItemGroup;

public class ModBlocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block NETHERRACK_MYTHRIL_ORE = registerBlock("netherrack_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.SPECIAL_ITEMS);

    public static final Block MYTHRIL_BUTTON = registerBlock("mythril_button",
            new ModStoneButton(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().noCollision()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block MYTHRIL_PRESSURE_PLATE = registerBlock("mythril_pressure_plate",
            new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block MYTHRIL_FENCE = registerBlock("mythril_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block MYTHRIL_FENCE_GATE = registerBlock("mythril_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block MYTHRIL_WALL = registerBlock("mythril_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block MYTHRIL_SLAB = registerBlock("mythril_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block MYTHRIL_STAIRS = registerBlock("mythril_stairs",
            new ModStairs(ModBlocks.MYTHRIL_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block DETRANIUM_TRAPDOOR = registerBlock("detranium_trapdoor",
            new ModTrapdoor(FabricBlockSettings.of(Material.WOOD).strength(6f).requiresTool().nonOpaque()), ModItemGroup.DETRANIUM);

    public static final Block SAFE_DETRANIUM_TRAPDOOR = registerBlock("safe_detranium_trapdoor",
            new ModTrapdoor(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().nonOpaque()), ModItemGroup.DETRANIUM);

    public static final Block PURE_DETRANIUM = registerBlock("pure_detranium",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(6f).requiresTool()), ModItemGroup.MYTHRIL_BLOCKS);

    public static final Block CORRUPTED_FLOWER = registerBlock("corrupted_flower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()), ModItemGroup.SPECIAL_ITEMS);

    public static final Block KAUPEN_DOOR = registerBlock("kaupen_door",
            new ModDoor(FabricBlockSettings.of(Material.WOOD).strength(6f).requiresTool()), ModItemGroup.DETRANIUM);

    public static final Block SAFE_KAUPEN_DOOR = registerBlock("safe_kaupen_door",
            new ModDoor(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.DETRANIUM);

    public static final Block POTTED_CORRUPTED_FLOWER = registerBlockWithoutBlockItem("potted_corrupted_flower",
            new FlowerPotBlock(ModBlocks.CORRUPTED_FLOWER, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()), ModItemGroup.SPECIAL_ITEMS);


    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(Thommas.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Thommas.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Thommas.LOGGER.info("Registering ModBlocks for " + Thommas.MOD_ID + "!");
    }
}
