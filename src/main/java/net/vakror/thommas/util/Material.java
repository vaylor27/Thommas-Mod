package net.vakror.thommas.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.item.ModArmorMaterials;
import net.vakror.thommas.item.ModItemGroup;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.item.ModToolMaterials;
import net.vakror.thommas.item.custom.*;

import java.util.function.Supplier;

public class Material {
    private static int durability;
    private static int protection_amount;
    private static int enchantabillity;
    private static Item repairIngredient;
    private static int toughness;
    private static int knockbackResistance;
    private static String name;
    private static StatusEffect effect;
    private static int veinsInChunk;
    private static int veinSize;
    private static float miningSpeed;
    private static int damage;
    private static int attackSpeed;


    public Material(String nameParam, StatusEffect effectParam, int veinsInChunkParam, int veinSizeParam, ToolMaterial toolMaterial, ArmorMaterial armorMaterial) {
        name = nameParam;
        effect = effectParam;
        veinsInChunk = veinsInChunkParam;
        veinSize = veinSizeParam;
        ModItems.registerItem(name + "_helmet", new ModArmor(armorMaterial, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
        ModItems.registerItem(name + "_chestplate", new ModArmor(armorMaterial, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
        ModItems.registerItem(name + "_leggings", new ModArmor(armorMaterial, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
        ModItems.registerItem(name + "_boots", new ModArmor(armorMaterial, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
        new Ore(name, Blocks.STONE, veinsInChunk, veinSize);
        new Ore("deepslate_" + name, Blocks.DEEPSLATE, veinsInChunk, veinSize);
        ModBlocks.registerBlock(name + "_block", new Block(FabricBlockSettings.of(net.minecraft.block.Material.METAL).strength(6).requiresTool()), ModItemGroup.BLOCKS);
        ModItems.registerItem(name + "_pickaxe", new ModPickaxeItem(toolMaterial, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
        ModItems.registerItem(name + "_shovel", new ModShovel(toolMaterial, Math.round(damage * 0.5), attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
        ModItems.registerItem(name + "_hoe", new ModHoe(toolMaterial, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
        ModItems.registerItem(name + "_sword", new ModBleedSword(toolMaterial, damage * 2, Math.round(attackSpeed * 0.7), new FabricItemSettings().group(ModItemGroup.TOOLS)));
        ModItems.registerItem(name + "_axe", new ModBleedAxe(toolMaterial, (int) Math.round(damage * 2.5), Math.round(attackSpeed * 0.5), new FabricItemSettings().group(ModItemGroup.TOOLS)));
        ModItems.registerItem("raw_" + name, new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
        ModItems.registerItem(name + "_gem", new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
    }

}