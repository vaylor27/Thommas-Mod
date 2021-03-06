package net.vakror.thommas.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.custom.VakrorFurnaceBlock;
import net.vakror.thommas.config.FurnaceData;
import net.vakror.thommas.config.RegisterFurnaces;
import net.vakror.thommas.item.ModItemGroup;
import net.vakror.thommas.item.custom.FurnaceItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class FurnaceBlocks {

    public static final List<Block> allFurnaces = new ArrayList<>();
    public static final List<Block> regularFurnaces = new ArrayList<>();
    public static Block IRON_FURNACE;
    public static Block GOLD_FURNACE;
    public static Block EMERALD_FURNACE;
    public static Block DIAMOND_FURNACE;
    public static Block OBSIDIAN_FURNACE;
    public static Block STEEL_OVEN;

    public static void init() {
        IRON_FURNACE = registerFurnace(RegisterFurnaces.furnaceData.get(0));
        GOLD_FURNACE = registerFurnace(RegisterFurnaces.furnaceData.get(1));
        EMERALD_FURNACE = registerFurnace(RegisterFurnaces.furnaceData.get(2));
        DIAMOND_FURNACE = registerFurnace(RegisterFurnaces.furnaceData.get(3));
        OBSIDIAN_FURNACE = registerFurnace(RegisterFurnaces.furnaceData.get(4));
        STEEL_OVEN = registerFurnace(RegisterFurnaces.furnaceData.get(5));
    }

    private static Block registerFurnace(FurnaceData data) {
        if (!data.getName().contains("steel_oven")) {
            VakrorFurnaceBlock baseFurnace = register(data.getName(), new VakrorFurnaceBlock(FabricBlockSettings.of(Material.STONE).hardness(3.5f).luminance(createLightLevelFromBlockState(13)).nonOpaque(), data.getSpeedModifier(), data.getFuelModifier(), data.getDuplicationChance()));
            Registry.register(Registry.ITEM, data.getID(), new FurnaceItem(baseFurnace, new Item.Settings().group(ModItemGroup.SPECIAL_BLOCKS)));
            regularFurnaces.add(baseFurnace);
            allFurnaces.add(baseFurnace);
            return baseFurnace;
        }
        else {
            VakrorFurnaceBlock baseFurnace = register("steel_oven", new VakrorFurnaceBlock(FabricBlockSettings.of(Material.STONE).hardness(3.5f).luminance(createLightLevelFromBlockState(13)).nonOpaque(), data.getSpeedModifier(), data.getFuelModifier(), data.getDuplicationChance()));
            Registry.register(Registry.ITEM, data.getID(), new FurnaceItem(baseFurnace, new Item.Settings().group(ModItemGroup.SPECIAL_BLOCKS)));
            regularFurnaces.add(baseFurnace);
            allFurnaces.add(baseFurnace);
            return baseFurnace;
        }
    }

    private static VakrorFurnaceBlock register(String name, VakrorFurnaceBlock block) {
        return Registry.register(Registry.BLOCK, new Identifier(Thommas.MOD_ID, name), block);
    }

    public static List<Block> getFurnaces() {
        return allFurnaces;
    }

    private static ToIntFunction<BlockState> createLightLevelFromBlockState(int litLevel) {
        return (blockState) -> (Boolean)blockState.get(Properties.LIT) ? litLevel : 0;
    }
}



