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
    static int durability;
    static int protection_amount;
    static int enchantabillity;
    static Item repairIngredient;
    static int toughness;
    static int knockbackResistance;
    static String name;
    static StatusEffect effect;
    static int veinsInChunk;
    static int veinSize;
    static float miningSpeed;
    static int damage;
    static int attackSpeed;


    public Material(String nameParam, int durabilityParam, int protection_amountParam, int enchantabillityParam, int toughnessParam, int knockbackResistanceParam, StatusEffect effectParam, int veinsInChunkParam, int veinSizeParam, float miningSpeedParam, int damageParam, int attackSpeedParam) {
        durability = durabilityParam;
        protection_amount = protection_amountParam;
        enchantabillity = enchantabillityParam;
        toughness = toughnessParam;
        knockbackResistance = knockbackResistanceParam;
        name = nameParam;
        effect = effectParam;
        veinsInChunk = veinsInChunkParam;
        veinSize = veinSizeParam;
        miningSpeed = miningSpeedParam;
        damage = damageParam;
        attackSpeed = attackSpeedParam;
        if (name.equals("larimar")) {
            ModItems.registerItem(name + "_helmet", new ModArmor(ModArmorMaterials.LARIMAR, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_chestplate", new ModArmor(ModArmorMaterials.LARIMAR, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_leggings", new ModArmor(ModArmorMaterials.LARIMAR, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_boots", new ModArmor(ModArmorMaterials.LARIMAR, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            new Ore(name, ModBlocks.registerBlock(name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            new Ore("deepslate_" + name, ModBlocks.registerBlock("deepslate_" + name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            ModBlocks.registerBlock(name + "_block", new Block(FabricBlockSettings.of(net.minecraft.block.Material.METAL).strength(6).requiresTool()), ModItemGroup.BLOCKS);
            ModItems.registerItem(name + "_pickaxe", new ModPickaxeItem(ModToolMaterials.LARIMAR, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_shovel", new ModShovel(ModToolMaterials.LARIMAR, Math.round(damage * 0.5), attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_hoe", new ModHoe(ModToolMaterials.LARIMAR, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_sword", new ModBleedSword(ModToolMaterials.LARIMAR, damage * 2, Math.round(attackSpeed * 0.7), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_axe", new ModBleedAxe(ModToolMaterials.LARIMAR, (int) Math.round(damage * 2.5), Math.round(attackSpeed * 0.5), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem("raw_" + name, new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
            ModItems.registerItem(name + "_gem", new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
        }
        if (name.equals("charoite")) {
            ModItems.registerItem(name + "_helmet", new ModArmor(ModArmorMaterials.CHAROITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_chestplate", new ModArmor(ModArmorMaterials.CHAROITE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_leggings", new ModArmor(ModArmorMaterials.CHAROITE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_boots", new ModArmor(ModArmorMaterials.CHAROITE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            new Ore(name, ModBlocks.registerBlock(name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            new Ore("deepslate_" + name, ModBlocks.registerBlock("deepslate_" + name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            ModBlocks.registerBlock(name + "_block", new Block(FabricBlockSettings.of(net.minecraft.block.Material.METAL).strength(6).requiresTool()), ModItemGroup.BLOCKS);
            ModItems.registerItem(name + "_pickaxe", new ModPickaxeItem(ModToolMaterials.CHAROITE, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_shovel", new ModShovel(ModToolMaterials.CHAROITE, Math.round(damage * 0.5), attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_hoe", new ModHoe(ModToolMaterials.CHAROITE, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_sword", new ModBleedSword(ModToolMaterials.CHAROITE, damage * 2, Math.round(attackSpeed * 0.7), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_axe", new ModBleedAxe(ModToolMaterials.CHAROITE, (int) Math.round(damage * 2.5), Math.round(attackSpeed * 0.5), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem("raw_" + name, new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
            ModItems.registerItem(name + "_gem", new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
        }
        if (name.equals("jade")) {
            ModItems.registerItem(name + "_helmet", new ModArmor(ModArmorMaterials.JADE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_chestplate", new ModArmor(ModArmorMaterials.JADE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_leggings", new ModArmor(ModArmorMaterials.JADE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_boots", new ModArmor(ModArmorMaterials.JADE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            new Ore(name, ModBlocks.registerBlock(name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            new Ore("deepslate_" + name, ModBlocks.registerBlock("deepslate_" + name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            ModBlocks.registerBlock(name + "_block", new Block(FabricBlockSettings.of(net.minecraft.block.Material.METAL).strength(6).requiresTool()), ModItemGroup.BLOCKS);
            ModItems.registerItem(name + "_pickaxe", new ModPickaxeItem(ModToolMaterials.JADE, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_shovel", new ModShovel(ModToolMaterials.JADE, Math.round(damage * 0.5), attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_hoe", new ModHoe(ModToolMaterials.JADE, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_sword", new ModBleedSword(ModToolMaterials.JADE, damage * 2, Math.round(attackSpeed * 0.7), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_axe", new ModBleedAxe(ModToolMaterials.JADE, (int) Math.round(damage * 2.5), Math.round(attackSpeed * 0.5), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem("raw_" + name, new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
            ModItems.registerItem(name + "_gem", new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
        }
        if (name.equals("garnet")) {
            ModItems.registerItem(name + "_helmet", new ModArmor(ModArmorMaterials.GARNET, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_chestplate", new ModArmor(ModArmorMaterials.GARNET, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_leggings", new ModArmor(ModArmorMaterials.GARNET, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            ModItems.registerItem(name + "_boots", new ModArmor(ModArmorMaterials.GARNET, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS), effect));
            new Ore(name, ModBlocks.registerBlock(name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            new Ore("deepslate_" + name, ModBlocks.registerBlock("deepslate_" + name + "_ore", new OreBlock(FabricBlockSettings.of(net.minecraft.block.Material.METAL).requiresTool().strength(6), UniformIntProvider.create(10, 20)), ModItemGroup.ORES), Blocks.STONE, veinsInChunk, veinSize);
            ModBlocks.registerBlock(name + "_block", new Block(FabricBlockSettings.of(net.minecraft.block.Material.METAL).strength(6).requiresTool()), ModItemGroup.BLOCKS);
            ModItems.registerItem(name + "_pickaxe", new ModPickaxeItem(ModToolMaterials.GARNET, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_shovel", new ModShovel(ModToolMaterials.GARNET, Math.round(damage * 0.5), attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_hoe", new ModHoe(ModToolMaterials.GARNET, damage, attackSpeed, new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_sword", new ModBleedSword(ModToolMaterials.GARNET, damage * 2, Math.round(attackSpeed * 0.7), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem(name + "_axe", new ModBleedAxe(ModToolMaterials.GARNET, (int) Math.round(damage * 2.5), Math.round(attackSpeed * 0.5), new FabricItemSettings().group(ModItemGroup.TOOLS)));
            ModItems.registerItem("raw_" + name, new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
            ModItems.registerItem(name + "_gem", new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));
        }
    }

}