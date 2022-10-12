package net.vakror.thommas.block;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.custom.VakrorFurnaceBlock;
import net.vakror.thommas.item.ModItemGroup;
import net.vakror.thommas.item.custom.FurnaceItem;

import java.util.function.ToIntFunction;

import static net.vakror.thommas.block.FurnaceRegistry.allFurnaces;

public enum Furnaces {
    IRON("iron_furnace", 2, 2, 0, 0),
    GOLD("gold_furnace", 3, 3, 3, 1),
    EMERALD("emerald_furnace", 4, 6, 8, 1),
    DIAMOND("diamond_furnace", 5, 7, 14,1),
    OBSIDIAN("obsidian_furnace", 6, 8, 16, 1),
    NETHERITE("netherite_furnace", 8, 8, 19, 1);

    Furnaces(String name, double speedModifier, double fuelModifier, int duplicationChance, int dupeAmount) {
        registerFurnace(name, speedModifier, fuelModifier, duplicationChance, dupeAmount);
    }

    public static void init() {
        Thommas.LOGGER.info("Registering Furnaces!");
    }

    private static void registerFurnace(String name, double speedModifier, double fuelModifier, int duplicationChance, int dupeAmount) {
        VakrorFurnaceBlock baseFurnace = register(name, new VakrorFurnaceBlock(FabricBlockSettings.of(Material.STONE).hardness(3.5f).requiresTool().luminance(createLightLevelFromBlockState()).nonOpaque(), speedModifier, fuelModifier, duplicationChance, dupeAmount));
        Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name), new FurnaceItem(baseFurnace, new Item.Settings().group(ModItemGroup.SPECIAL_BLOCKS)));
        allFurnaces.add(baseFurnace);
    }

    private static VakrorFurnaceBlock register(String name, VakrorFurnaceBlock block) {
        return Registry.register(Registry.BLOCK, new Identifier(Thommas.MOD_ID, name), block);
    }

    private static ToIntFunction<BlockState> createLightLevelFromBlockState() {
        return (blockState) -> (Boolean) blockState.get(Properties.LIT) ? 13 : 0;
    }
}