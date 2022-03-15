package net.vakror.thommas.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.item.custom.*;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item CORRUPTED_DUST = registerItem("corrupted_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).food(ModFoodComponents.STRAWBERRY)));

    public static final Item ROTTEN_STRAWBERRY = registerItem("rotten_strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).food(ModFoodComponents.ROTTEN)));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new ModSlownessSword(ModToolMaterials.MYTHRIL, 1, 4,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_PICK = registerItem("mythril_pick",
            new ModPickaxe(ModToolMaterials.MYTHRIL, 1, 2,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModSlownessAxe(ModToolMaterials.MYTHRIL, 4, 3,new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

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

    public static final Item DUST = registerItem("dust",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item DATA_TABLET = registerItem("data_tablet",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).maxCount(1)));

    public static final Item DATA_TABLET_MACHINERY = registerItem("data_tablet_machinery",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).maxCount(1)));

    public static final Item DATA_TABLET_SCREEN = registerItem("data_tablet_screen",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).maxCount(1)));

    public static final Item DATA_TABLET_CASING = registerItem("data_tablet_casing",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).maxCount(1)));

    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).food(ModFoodComponents.STRAWBERRY)));

    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINE,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_PLANT,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item KAUPEN_BOW = registerItem("kaupen_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS).maxDamage(5000)));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item PEPPER = registerItem("pepper", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())
            .group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item IRON_WOOL = registerItem("iron_wool",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, 2, 1f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxe(ModToolMaterials.RUBY, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxe(ModToolMaterials.RUBY, 4, -1f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoe(ModToolMaterials.RUBY, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModRubyArmor(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor",
            new HorseArmorItem(7, "ruby",
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item PEPPER_SEEDS = registerItem("pepper_seeds",
            new AliasedBlockItem(ModBlocks.PEPPER_PLANT, new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Thommas.LOGGER.info("Registering Mod Items for " + Thommas.MOD_ID + "!");
    }
}
