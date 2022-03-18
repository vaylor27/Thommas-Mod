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
import net.vakror.thommas.sound.ModSounds;

public class ModBlocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new MythrilOre(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.ORES);

    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new MythrilOre(FabricBlockSettings.of(Material.STONE).strength(9f).requiresTool()), ModItemGroup.ORES);

    public static final Block NETHERRACK_MYTHRIL_ORE = registerBlock("netherrack_mythril_ore",
            new MythrilOre(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ORES);

    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.1f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(3.7f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_BUTTON = registerBlock("mythril_button",
            new ModStoneButton(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool().noCollision()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_PRESSURE_PLATE = registerBlock("mythril_pressure_plate",
            new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_FENCE = registerBlock("mythril_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_FENCE_GATE = registerBlock("mythril_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_WALL = registerBlock("mythril_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_SLAB = registerBlock("mythril_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_STAIRS = registerBlock("mythril_stairs",
            new ModStairs(ModBlocks.MYTHRIL_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block DETRANIUM_TRAPDOOR = registerBlock("detranium_trapdoor",
            new ModTrapdoor(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool().nonOpaque()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block SAFE_DETRANIUM_TRAPDOOR = registerBlock("safe_detranium_trapdoor",
            new ModTrapdoor(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().nonOpaque()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block PURE_DETRANIUM = registerBlock("pure_detranium",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block CORRUPTED_FLOWER = registerBlock("corrupted_flower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()), ModItemGroup.NATURE);

    public static final Block KAUPEN_DOOR = registerBlock("kaupen_door",
            new ModDoor(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block SAFE_KAUPEN_DOOR = registerBlock("safe_kaupen_door",
            new ModDoor(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block POTTED_CORRUPTED_FLOWER = registerBlockWithoutBlockItem("potted_corrupted_flower",
            new FlowerPotBlock(ModBlocks.CORRUPTED_FLOWER, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block MYTHRIL_LAMP = registerBlock("mythril_lamp",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL)
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block WINTER_WINDOW = registerBlock("winter_window",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block GRAPE_VINE = registerBlockWithoutBlockItem("grape_vine",
            new GrapeVine(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    public static final Block STRAWBERRY_PLANT = registerBlockWithoutBlockItem("strawberry_plant",
            new StrawberryPlant(FabricBlockSettings.copy(Blocks.POTATOES).nonOpaque()));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new MythrilOre(FabricBlockSettings.of(Material.STONE).strength(3.6f).requiresTool()), ModItemGroup.ORES);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new ModStairs(ModBlocks.RUBY_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);


    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ModStoneButton(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new ModDoor(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool().nonOpaque()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new ModTrapdoor(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block DICE_BLOCK = registerBlock("dice_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block PEPPER_PLANT = registerBlockWithoutBlockItem("pepper_plant",
            new PepperPlantBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.NATURE);

    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.NATURE);

    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.NATURE);

    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.NATURE);

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.NATURE);

    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.NATURE);

    public static final Block TOMATO_PLANT = registerBlockWithoutBlockItem("tomato_plant",
            new TomatoPlant(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
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
