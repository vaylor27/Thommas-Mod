package net.vakror.thommas.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.custom.*;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item ROD_OF_FINDING = registerItem("rod_of_finding",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxDamage(16)));

    public static final Item CORRUPTED_DUST = registerItem("corrupted_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_ITEMS).food(ModFoodComponents.STRAWBERRY)));

    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_ITEMS).food(ModFoodComponents.STRAWBERRY)));

    public static final Item ROTTEN_STRAWBERRY = registerItem("rotten_strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD_ITEMS).food(ModFoodComponents.ROTTEN)));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new ModSlownessSword(ModToolMaterials.MYTHRIL, 1, 4,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_PICK = registerItem("mythril_pick",
            new ModPickaxe(ModToolMaterials.MYTHRIL, 1, 2,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModSlownessSword(ModToolMaterials.MYTHRIL, 4, 3,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoe(ModToolMaterials.MYTHRIL, 1, 1,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, 1, 1,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ModArmor(ModArmorMaterials.MYTHRIL, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Thommas.LOGGER.info("Registering Mod Items for " + Thommas.MOD_ID + "!");
    }
}
