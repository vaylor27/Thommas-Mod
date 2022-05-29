package net.vakror.thommas.blockitem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.blockitem.block.entity.ModSignTypes;
import net.vakror.thommas.blockitem.block.fluid.ModFluids;
import net.vakror.thommas.blockitem.custom.block.*;
import net.vakror.thommas.blockitem.item.ModItemGroup;
import net.vakror.thommas.sound.ModSounds;
import net.vakror.thommas.world.gen.tree.sapling.*;

public class ModBlocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.1f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.7f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_BUTTON = registerBlock("mythril_button",
            new ModStoneButton(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool().noCollision()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_PRESSURE_PLATE = registerBlock("mythril_pressure_plate",
            new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_FENCE = registerBlock("mythril_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_FENCE_GATE = registerBlock("mythril_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_WALL = registerBlock("mythril_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_SLAB = registerBlock("mythril_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MYTHRIL_STAIRS = registerBlock("mythril_stairs",
            new ModStairs(ModBlocks.MYTHRIL_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block DETRANIUM_TRAPDOOR = registerBlock("detranium_trapdoor",
            new ModTrapdoor(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool().nonOpaque()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block SAFE_DETRANIUM_TRAPDOOR = registerBlock("safe_detranium_trapdoor",
            new ModTrapdoor(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).requiresTool().nonOpaque()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block PURE_DETRANIUM = registerBlock("pure_detranium",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block CORRUPTED_FLOWER = registerBlock("corrupted_flower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()), ModItemGroup.NATURE);

    public static final Block KAUPEN_DOOR = registerBlock("kaupen_door",
            new ModDoor(FabricBlockSettings.of(Material.WOOD).strength(1f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block SAFE_KAUPEN_DOOR = registerBlock("safe_kaupen_door",
            new ModDoor(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block POTTED_CORRUPTED_FLOWER = registerBlockWithoutBlockItem("potted_corrupted_flower",
            new FlowerPotBlock(ModBlocks.CORRUPTED_FLOWER, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block MYTHRIL_LAMP = registerBlock("mythril_lamp",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block WINTER_WINDOW = registerBlock("winter_window",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block GRAPE_VINE = registerBlockWithoutBlockItem("grape_vine",
            new GrapeVine(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    public static final Block STRAWBERRY_PLANT = registerBlockWithoutBlockItem("strawberry_plant",
            new StrawberryPlant(FabricBlockSettings.copy(Blocks.POTATOES).nonOpaque()));


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
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.BLOCKS);

    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.BLOCKS);

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.BLOCKS);

    public static final Block TOMATO_PLANT = registerBlockWithoutBlockItem("tomato_plant",
            new TomatoPlant(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    public static final Block ADAMANTIUM_BLOCK = registerBlock("adamantium_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block ADAMANTIUM_BRICK = registerBlock("adamantium_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BRICKS);

    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block ALUMINUM_BRICK = registerBlock("aluminum_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block AMBER_BRICK = registerBlock("amber_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block AMETHYST_BLOCK = registerBlock("amethyst_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block AMETHYST_BRICK = registerBlock("amethyst_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block BITUMEN_BLOCK = registerBlock("bitumen_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block BITUMEN_BRICK = registerBlock("bitumen_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block BRICK_AGED = registerBlock("brick_aged",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block BRICK_COTSWOLD = registerBlock("brick_cotswold",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block BRICK_MIXED = registerBlock("brick_mixed",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block BRONZE_BRICK = registerBlock("bronze_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block CHLOROPHYTE_BLOCK = registerBlock("chlorophyte_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(1.0F)), ModItemGroup.BLOCKS);

    public static final Block CHLOROPHYTE_BRICK = registerBlock("chlorophyte_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block COPPER_BLOCK = registerBlock("copper_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block COPPER_BRICK = registerBlock("copper_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block CRIMTANE_BLOCK = registerBlock("crimtane_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block CRIMTANE_BRICK = registerBlock("crimtane_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block DEMONITE_BLOCK = registerBlock("demonite_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block DEMONITE_BRICK = registerBlock("demonite_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block PURE_DIAMOND_BLOCK = registerBlock("pure_diamond_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block PURE_DIAMOND_BRICK = registerBlock("pure_diamond_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block PURE_EMERALD_BLOCK = registerBlock("pure_emerald_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block PURE_EMERALD_BRICK = registerBlock("pure_emerald_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block ENERGIZED_REDSTONE_BLOCK = registerBlock("energized_redstone_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block GEM_STEEL_BLOCK = registerBlock("gem_steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block HELLSTONE_BLOCK = registerBlock("hellstone_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block HELLSTONE_BRICK = registerBlock("hellstone_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block LEAD_BRICK = registerBlock("lead_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block LUMENITE_BLOCK = registerBlock("lumenite_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block LUMENITE_BRICK = registerBlock("lumenite_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block METEORITE_BLOCK = registerBlock("meteorite_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block METEORITE_BRICK = registerBlock("meteorite_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block ORICHALCUM_BRICK = registerBlock("orichalcum_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BLOCKS);

    public static final Block PLATINUM_BRICK = registerBlock("platinum_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F)), ModItemGroup.BRICKS);

    public static final Block REDSTONE_LAMP_BLACK = registerBlock("redstone_lamp_black",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_BLUE = registerBlock("redstone_lamp_blue",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_BROWN = registerBlock("redstone_lamp_brown",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_CYAN = registerBlock("redstone_lamp_cyan",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_GRAY = registerBlock("redstone_lamp_gray",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_GREEN = registerBlock("redstone_lamp_green",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_LIGHT_BLUE = registerBlock("redstone_lamp_light_blue",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_LIME = registerBlock("redstone_lamp_lime",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_MAGENTA = registerBlock("redstone_lamp_magenta",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_ORANGE = registerBlock("redstone_lamp_orange",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_PINK = registerBlock("redstone_lamp_pink",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_PURPLE = registerBlock("redstone_lamp_purple",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_RED = registerBlock("redstone_lamp_red",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_SILVER = registerBlock("redstone_lamp_silver",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_WHITE = registerBlock("redstone_lamp_white",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block REDSTONE_LAMP_YELLOW = registerBlock("redstone_lamp_yellow",
            new MythrilLamp(FabricBlockSettings.of(Material.METAL).requiresTool()
                    .strength(1f).requiresTool()
                    .luminance((state) -> state.get(MythrilLamp.CLICKED) ? 15 : 0)
                    .sounds(ModSounds.MYTHRIL_SOUNDS)), ModItemGroup.LAMPS);

    public static final Block SALTPETER_BLOCK = registerBlock("saltpeter_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block SALTPETER_BRICK = registerBlock("saltpeter_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BRICKS);

    public static final Block GRAINY_SANDSTONE_BRICK = registerBlock("grainy_sandstone_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BRICKS);

    public static final Block GRAINY_SANDSTONE_COBBLE = registerBlock("grainy_sandstone_cobble",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block GRAINY_SANDSTONE_POLISHED = registerBlock("grainy_sandstone_polished",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block SAPPHIRE_BRICK = registerBlock("sapphire_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BRICKS);

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block SILVER_BRICK = registerBlock("silver_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BRICKS);

    public static final Block SMOOTH_AMETHYST_BLOCK = registerBlock("smooth_amethyst_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6).sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroup.BLOCKS);

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block STEEL_BRICK = registerBlock("steel_brick",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BRICKS);

    public static final Block STONE_ANDESITE_BRICK = registerBlock("stone_andesite_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block STONE_ANDESITE_COBBLE = registerBlock("stone_andesite_cobble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_ANDESITE_FLAT = registerBlock("stone_andesite_flat",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_ANDESITE_POLISHED = registerBlock("stone_andesite_polished",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_BASALT = registerBlock("stone_basalt",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_BASALT_BRICK = registerBlock("stone_basalt_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block STONE_BASALT_COBBLE = registerBlock("stone_basalt_cobble",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block STONE_BASALT_POLISHED = registerBlock("stone_basalt_polished",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_DIORITE_FLAT = registerBlock("stone_diorite_flat",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_DIORITE_BRICK = registerBlock("stone_diorite_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block STONE_DIORITE_COBBLE = registerBlock("stone_diorite_cobble",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block STONE_DIORITE_POLISHED = registerBlock("stone_diorite_polished",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_GRANITE_FLAT = registerBlock("stone_granite_flat",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_GRANITE_BRICK = registerBlock("stone_granite_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block STONE_GRANITE_COBBLE = registerBlock("stone_granite_cobble",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block STONE_GRANITE_POLISHED = registerBlock("stone_granite_polished",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_LIMESTONE = registerBlock("stone_limestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_LIMESTONE_BRICK = registerBlock("stone_limestone_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block STONE_LIMESTONE_COBBLE = registerBlock("stone_limestone_cobble",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block STONE_LIMESTONE_POLISHED = registerBlock("stone_limestone_polished",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_MARBLE = registerBlock("stone_marble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block STONE_MARBLE_BRICK = registerBlock("stone_marble_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block STONE_MARBLE_COBBLE = registerBlock("stone_marble_cobble",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6)), ModItemGroup.BLOCKS);

    public static final Block STONE_MARBLE_POLISHED = registerBlock("stone_marble_polished",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block SULPHUR_BLOCK = registerBlock("sulphur_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block SULPHUR_BRICK = registerBlock("sulphur_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block TIN_BRICK = registerBlock("tin_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block TITANIUM_BRICK = registerBlock("titanium_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block TOPAZ_BRICK = registerBlock("topaz_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(13.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block TUNGSTEN_BRICK = registerBlock("tungsten_brick",
            new Block(FabricBlockSettings.of(Material.STONE).strength(13.0F).requiresTool()), ModItemGroup.BRICKS);

    public static final Block JACARANDA_LOG = registerBlock("jacaranda_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.NATURE);

    public static final Block JACARANDA_WOOD = registerBlock("jacaranda_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.NATURE);

    public static final Block STRIPPED_JACARANDA_LOG = registerBlock("stripped_jacaranda_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.BLOCKS);

    public static final Block STRIPPED_JACARANDA_WOOD = registerBlock("stripped_jacaranda_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.BLOCKS);

    public static final Block JACARANDA_PLANKS = registerBlock("jacaranda_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.BLOCKS);

    public static final Block JACARANDA_LEAVES = registerBlock("jacaranda_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.NATURE);

    public static final Block JACARANDA_SAPLING = registerBlock("jacaranda_sapling",
            new ModSaplingBlock(new JacarandaSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.NATURE);

    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new ModSaplingBlock(new RedwoodSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.NATURE);

    public static final Block MYTHRIL_BLASTER = registerBlock("mythril_blaster",
            new MythrilBlasterBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0f).nonOpaque()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().nonOpaque().strength(3.0f)), ModItemGroup.BLOCKS);

    public static final Block HONEY_FLUID_BLOCK = registerBlockWithoutBlockItem("honey_fluid_block",
            new ModFluidBlock(ModFluids.HONEY_STILL, FabricBlockSettings.copy(Blocks.WATER)));

    public static final Block CROWN = registerBlock("crown",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().nonOpaque().dynamicBounds().strength(3f)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block STOP = registerBlock("stop",
            new StopBlock(FabricBlockSettings.of(Material.METAL).requiresTool().nonOpaque().dynamicBounds().strength(3f)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block POLE = registerBlock("pole",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().nonOpaque().dynamicBounds().strength(3f)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block LIGHTNING_CHANNELER_BLOCK = registerBlock("lightning_channeler",
            new LightningChannelerBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block ORCHID = registerBlock("orchid",
            new FlowerBlock(StatusEffects.WITHER, 200, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()), ModItemGroup.NATURE);

    public static final Block POTTED_ORCHID = registerBlockWithoutBlockItem("potted_orchid",
            new FlowerPotBlock(ModBlocks.ORCHID, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block TITANIUM_TRAPDOOR = registerBlock("titanium_trapdoor",
            new ModTrapdoor(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_DOOR = registerBlock("titanium_door",
            new ModDoor(FabricBlockSettings.copy(Blocks.IRON_DOOR)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_BUTTON = registerBlock("titanium_button",
            new ModStoneButton(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool().noCollision()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_FENCE = registerBlock("titanium_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_FENCE_GATE = registerBlock("titanium_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_PRESSURE_PLATE = registerBlock("titanium_pressure_plate",
            new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_SLAB = registerBlock("titanium_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_STAIRS = registerBlock("titanium_stairs",
            new ModStairs(ModBlocks.TITANIUM_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block TITANIUM_WALL = registerBlock("titanium_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_TRAPDOOR = registerBlock("amethyst_trapdoor",
            new ModTrapdoor(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_DOOR = registerBlock("amethyst_door",
            new ModDoor(FabricBlockSettings.copy(Blocks.IRON_DOOR)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_BUTTON = registerBlock("amethyst_button",
            new ModStoneButton(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool().noCollision()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_FENCE = registerBlock("amethyst_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_FENCE_GATE = registerBlock("amethyst_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_PRESSURE_PLATE = registerBlock("amethyst_pressure_plate",
            new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            new ModStairs(ModBlocks.SMOOTH_AMETHYST_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block HYACINTH = registerBlock("hyacinth",
            new FlowerBlock(StatusEffects.BAD_OMEN, 200, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()), ModItemGroup.NATURE);

    public static final Block POTTED_HYACINTH = registerBlockWithoutBlockItem("potted_hyacinth",
            new FlowerPotBlock(ModBlocks.HYACINTH, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block OATS = registerBlockWithoutBlockItem("oats",
            new OatCrop(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3f)), ModItemGroup.BLOCKS);

    public static final Block CITRINE_BUTTON = registerBlock("citrine_button",
            new ModStoneButton(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool().noCollision()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block CITRINE_FENCE = registerBlock("citrine_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block CITRINE_FENCE_GATE = registerBlock("citrine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block CITRINE_PRESSURE_PLATE = registerBlock("citrine_pressure_plate",
            new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).requiresTool().strength(2f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block CITRINE_SLAB = registerBlock("citrine_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block CITRINE_STAIRS = registerBlock("citrine_stairs",
            new ModStairs(ModBlocks.CITRINE_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block CITRINE_WALL = registerBlock("citrine_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3f).requiresTool()), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block CUCUMBER_PLANT = registerBlockWithoutBlockItem("cucumber_plant",
            new CucumberPlant(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(6.0f)), ModItemGroup.ORES);

    public static final Block EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            new ModTrapdoor(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block EBONY_DOOR = registerBlock("ebony_door",
            new ModDoor(FabricBlockSettings.copy(Blocks.IRON_DOOR)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block EBONY_LOG = registerBlock("ebony_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.NATURE);

    public static final Block EBONY_WOOD = registerBlock("ebony_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.NATURE);

    public static final Block STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.BLOCKS);

    public static final Block STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.BLOCKS);

    public static final Block EBONY_PLANKS = registerBlock("ebony_planks",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.BLOCKS);

    public static final Block EBONY_LEAVES = registerBlock("ebony_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroup.NATURE);

    public static final Block NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.ORES);

    public static final Block PINK_ROSE = registerBlock("pink_rose",
            new FlowerBlock(StatusEffects.ABSORPTION, 200, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()), ModItemGroup.NATURE);

    public static final Block POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            new FlowerPotBlock(ModBlocks.PINK_ROSE, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block RAW_CITRINE_BLOCK = registerBlock("raw_citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.1f).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0f)), ModItemGroup.ORES);

    public static final Block EBONY_SAPLING = registerBlock("ebony_sapling",
            new ModSaplingBlock(new EbonySaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.NATURE);

    public static final Block BLIGHTSPORE = registerBlockWithoutBlockItem("blightspore",
            new BlightSpore(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    public static final Block CAVEWHEAT = registerBlockWithoutBlockItem("cavewheat",
            new CaveWheat(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    public static final Block CORN = registerBlockWithoutBlockItem("corn",
            new Corn(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    public static final Block COTTON = registerBlockWithoutBlockItem("cotton",
            new Cotton(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    public static final Block JACARANDA_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("jacaranda_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.JACARANDA));

    public static final Block JACARANDA_SIGN_BLOCK = registerBlockWithoutBlockItem("jacaranda_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.JACARANDA));

    public static final Block SLADE_NORMAL = registerBlock("slade_normal",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block SLADE_COLUMN = registerBlock("slade_column",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3.0F).requiresTool()), ModItemGroup.BLOCKS);

    public static final Block BONETREE_LOG = registerBlock("bonetree_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.NATURE);

    public static final Block BONETREE_LEAVES = registerBlock("bonetree_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.NATURE);

    public static final Block BONETREE_SAPLING = registerBlock("bonetree_sapling",
            new ModSaplingBlock(new BoneTreeSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.NATURE);

    public static final Block GOLDENWOOD_LOG = registerBlock("goldenwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.NATURE);

    public static final Block GOLDENWOOD_LEAVES = registerBlock("goldenwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.NATURE);

    public static final Block GOLDENWOOD_SAPLING = registerBlock("goldenwood_sapling",
            new ModSaplingBlock(new GoldenWoodSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.NATURE);

    public static final Block CRONETREE_LOG = registerBlock("cronetree_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.NATURE);

    public static final Block CRONETREE_LEAVES = registerBlock("cronetree_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.NATURE);

    public static final Block CRONETREE_SAPLING = registerBlock("cronetree_sapling",
            new ModSaplingBlock(new CroneTreeSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.NATURE);

    public static final Block GLOAMBLOSSOM_LOG = registerBlock("gloamblossom_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.NATURE);

    public static final Block GLOAMBLOSSOM_LEAVES = registerBlock("gloamblossom_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.NATURE);

    public static final Block GLOAMBLOSSOM_SAPLING = registerBlock("gloamblossom_sapling",
            new ModSaplingBlock(new GloamBlossomSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque()), ModItemGroup.NATURE);

    public static final Block BLUEBELLS = registerBlock("bluebells",
            new FlowerBlock(StatusEffects.ABSORPTION, 2000, FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque()), ModItemGroup.NATURE);

    public static final Block POTTED_BLUEBELLS = registerBlockWithoutBlockItem("potted_bluebells",
            new FlowerPotBlock(ModBlocks.BLUEBELLS, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.NATURE);

    public static final Block SWEETPOD = registerBlockWithoutBlockItem("sweetpod",
            new SweetPodBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    public static final Block COMBINER = registerBlock("combiner",
            new CombinerBlock(FabricBlockSettings.of(Material.METAL)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block PLUMP_HELMET = registerBlockWithoutBlockItem("plump_helmet",
            new PlumpHelmetBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()));

    public static final Block PACKED_FEATHERS = registerBlock("packed_feathers",
            new FeatherBlock(FabricBlockSettings.of(Material.STONE)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block WHITE_ELEVATOR = registerBlock("white_elevator",
            new ElevatorBlock(FabricBlockSettings.of(Material.STONE)), ModItemGroup.SPECIAL_BLOCKS);

    public static final Block BLACK_ELEVATOR = registerBlock("black_elevator",
            new ElevatorBlock(FabricBlockSettings.of(Material.STONE)), ModItemGroup.SPECIAL_BLOCKS);


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
