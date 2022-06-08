package net.vakror.thommas.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.entity.ModEntities;
import net.vakror.thommas.fluid.ModFluids;
import net.vakror.thommas.item.custom.*;
import net.vakror.thommas.sound.ModSounds;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item CORRUPTED_DUST = registerItem("corrupted_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item MAGIC_CHARGE = registerItem("magic_charge",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.STRAWBERRY)));

    public static final Item ROTTEN_STRAWBERRY = registerItem("rotten_strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.ROTTEN_STRAWBERRY)));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new ModBleedSword(ModToolMaterials.MYTHRIL, 1, 4,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_PICK = registerItem("mythril_pick",
            new ModPickaxeItem(ModToolMaterials.MYTHRIL, 1, 2,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModBleedAxe(ModToolMaterials.MYTHRIL, 4, 3,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoe(ModToolMaterials.MYTHRIL, 1, 1,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, 1, 1,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ModMythrilArmor(ModArmorMaterials.MYTHRIL, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item DUST = registerItem("dust",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static final Item DATA_TABLET_MACHINERY = registerItem("data_tablet_machinery",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).maxCount(1)));

    public static final Item DATA_TABLET_SCREEN = registerItem("data_tablet_screen",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).maxCount(1)));

    public static final Item DATA_TABLET_CASING = registerItem("data_tablet_casing",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).maxCount(1)));

    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.GRAPE)));

    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINE,
                    new FabricItemSettings().group(ModItemGroup.NATURE)));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_PLANT,
                    new FabricItemSettings().group(ModItemGroup.NATURE)));

    public static final Item KAUPEN_BOW = registerItem("kaupen_bow",
            new ModOrichalcumBow(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(5000)));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PEPPER = registerItem("pepper", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())
            .group(ModItemGroup.NATURE)));

    public static final Item IRON_WOOL = registerItem("iron_wool",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new ModBleedSword(ModToolMaterials.RUBY, 3, 1f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RUBY, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModBleedAxe(ModToolMaterials.RUBY, 8, 3f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoe(ModToolMaterials.RUBY, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModRubyArmor(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor",
            new HorseArmorItem(7, "ruby",
                    new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item PEPPER_SEEDS = registerItem("pepper_seeds",
            new AliasedBlockItem(ModBlocks.PEPPER_PLANT, new FabricItemSettings().group(ModItemGroup.NATURE)));

    public static final Item TOMATO = registerItem("tomato",
            new AliasedBlockItem(ModBlocks.TOMATO_PLANT, new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.TOMATO)));

    public static final Item ADAMANTIUM_DUST = registerItem("adamantium_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ADAMANTIUM_INGOT = registerItem("adamantium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ADAMANTIUM_NUGGET = registerItem("adamantium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ALUMINUM_DUST = registerItem("aluminum_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item AMBER_DUST = registerItem("amber_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item AMBER_GEM = registerItem("amber_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item AMETHYST = registerItem("amethyst",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item AMETHYST_DUST = registerItem("amethyst_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item BITUMEN_BALL = registerItem("bitumen_ball",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item BRONZE_DUST = registerItem("bronze_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item CHAINSAW = registerItem("chainsaw",
            new ModBleedAxe(ModToolMaterials.ADAMANTIUM,2, 23, new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item COPPER_DUST = registerItem("copper_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item DEMONITE_DUST = registerItem("demonite_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item DEMONITE_INGOT = registerItem("demonite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item DEMONITE_NUGGET = registerItem("demonite_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ENERGIZED_REDSTONE_DUST = registerItem("energized_redstone_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ENERGIZED_REDSTONE_INGOT = registerItem("energized_redstone_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item DIAMOND_DRILL = registerItem("diamond_drill",
            new ModPickaxeItem(ModToolMaterials.PURE_DIAMOND, 9, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item GEM_STEEL_DUST = registerItem("gem_steel_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item GEM_STEEL_INGOT = registerItem("gem_steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item GEM_STEEL_NUGGET = registerItem("gem_steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item GEM_STEEL_STAFF = registerItem("gem_steel_staff",
            new ModPaxel(40 , 40, ModToolMaterials.GEM_STEEL, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static final Item HAND_DRILL = registerItem("hand_drill",
            new ModPickaxeItem(ModToolMaterials.HAND_DRILL,40 , 40, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item HELLSTONE_DUST = registerItem("hellstone_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item HELLSTONE_INGOT = registerItem("hellstone_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item HELLSTONE_NUGGET = registerItem("hellstone_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item LEAD_DUST = registerItem("lead_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item LEAD_INGOT = registerItem("lead_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item LEAD_NUGGET = registerItem("lead_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item LUMENITE_DUST = registerItem("lumenite_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item LUMENITE_INGOT = registerItem("lumenite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item LUMENITE_NUGGET = registerItem("lumenite_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item METEORITE_DUST = registerItem("meteorite_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item METEORITE_INGOT = registerItem("meteorite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item METEORITE_NUGGET = registerItem("meteorite_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item MOTOR_COMPONENT = registerItem("motor_component",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ORICHALCUM_DUST = registerItem("orichalcum_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PLATINUM_DUST = registerItem("platinum_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PURE_DIAMOND_DUST = registerItem("pure_diamond_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PURE_DIAMOND_GEM = registerItem("pure_diamond_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PURE_EMERALD_DUST = registerItem("pure_emerald_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SALTPETER_DUST = registerItem("saltpeter_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SAPPHIRE_DUST = registerItem("sapphire_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SAPPHIRE_GEM = registerItem("sapphire_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SILVER_DUST = registerItem("silver_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item STEEL_DUST = registerItem("steel_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SULPHUR_DUST = registerItem("sulphur_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TIN_DUST = registerItem("tin_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TIN_NUGGET = registerItem("tin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TITANIUM_DUST = registerItem("titanium_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TOPAZ_DUST = registerItem("topaz_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TOPAZ_GEM = registerItem("topaz_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TUNGSTEN_DUST = registerItem("tungsten_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item TUNGSTEN_NUGGET = registerItem("tungsten_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new ModMusicDiscItem(7, ModSounds.BAR_BRAWL, new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static final Item MAGIC_INGOT = registerItem("magic_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item MAGIC_AXE = registerItem("magic_axe",
            new ModBleedAxe(ModToolMaterials.MAGIC, 4, 0, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MAGIC_SWORD = registerItem("magic_sword",
            new ModBleedSword(ModToolMaterials.MAGIC, 3, 2, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MAGIC_HOE = registerItem("magic_hoe",
            new ModHoe(ModToolMaterials.MAGIC, 0, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MAGIC_SHOVEL = registerItem("magic_shovel",
            new ModShovel(ModToolMaterials.MAGIC, 0, 0, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item HONEY_BUCKET = registerItem("honey_bucket",
            new BucketItem(ModFluids.HONEY_STILL, new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static final Item STAFF = registerItem("staff",
            new ModMythrilStaffItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static Item LIGHTNING_SUMMONER = registerItem("lightning_summoner",
            new Summoner(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static Item CANE = registerItem("cane",
            new ModCane(ModToolMaterials.CANE, 4, 0.01F,new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static Item HEAVENLY_SHIELD = registerItem("heavenly_shield",
            new GodShield(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(1000).fireproof().rarity(Rarity.EPIC)));

    public static Item REINFORCED_SHIELD = registerItem("reinforced_shield",
            new ShieldItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(100).fireproof().rarity(Rarity.COMMON)));

    public static Item COAL_COKE = registerItem("coal_coke",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static Item TITANIUM_SWORD = registerItem("titanium_sword",
            new ModBleedSword(ModToolMaterials.TITANIUM, 7, 8.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).maxCount(1).fireproof().rarity(Rarity.RARE)));

    public static Item TITANIUM_AXE = registerItem("titanium_axe",
            new ModBleedAxe(ModToolMaterials.TITANIUM, 9, 11.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof().maxCount(1).rarity(Rarity.RARE)));

    public static Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TITANIUM, 4, 5.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE).maxCount(1).fireproof()));

    public static Item TITANIUM_HOE = registerItem("titanium_hoe",
            new ModHoe(ModToolMaterials.TITANIUM, 1, 1.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE).maxCount(1).fireproof()));

    public static Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM, 3, 2.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE).maxCount(1).fireproof()));

    public static Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ModTitaniumArmor(ModArmorMaterials.TITANIUM, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static final Item TITANIUM_HORSE_ARMOR = registerItem("titanium_horse_armor",
            new HorseArmorItem(12, "titanium",
                    new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).rarity(Rarity.RARE)));

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item OATS = registerItem("oats",
            new AliasedBlockItem(ModBlocks.OATS, new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.GRAPE)));

    public static Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new ModBleedSword(ModToolMaterials.AMETHYST, 7, 8.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).maxCount(1).fireproof().rarity(Rarity.RARE)));

    public static Item AMETHYST_AXE = registerItem("amethyst_axe",
            new ModBleedAxe(ModToolMaterials.AMETHYST, 9, 11.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof().maxCount(1).rarity(Rarity.RARE)));

    public static Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new ModPickaxeItem(ModToolMaterials.AMETHYST, 4, 5.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE).maxCount(1).fireproof()));

    public static Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new ModHoe(ModToolMaterials.AMETHYST, 1, 1.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE).maxCount(1).fireproof()));

    public static Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterials.AMETHYST, 3, 2.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE).maxCount(1).fireproof()));

    public static Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new ModAmethystArmor(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new ArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.RARE)));

    public static final Item AMETHYST_HORSE_ARMOR = registerItem("amethyst_horse_armor",
            new HorseArmorItem(16, "amethyst",
                    new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).rarity(Rarity.RARE)));

    public static final Item CUCUMBER = registerItem("cucumber",
            new AliasedBlockItem(ModBlocks.CUCUMBER_PLANT, new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.TOMATO)));

    public static Item CITRINE_SWORD = registerItem("citrine_sword",
            new ModBleedSword(ModToolMaterials.CITRINE, 7, 8.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static Item CITRINE_AXE = registerItem("citrine_axe",
            new ModBleedAxe(ModToolMaterials.CITRINE, 9, 11.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof().maxCount(1).rarity(Rarity.EPIC)));

    public static Item CITRINE_PICKAXE = registerItem("citrine_pickaxe",
            new ModPickaxeItem(ModToolMaterials.CITRINE, 4, 5.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC).maxCount(1).fireproof()));

    public static Item CITRINE_HOE = registerItem("citrine_hoe",
            new ModHoe(ModToolMaterials.CITRINE, 1, 1.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC).maxCount(1).fireproof()));

    public static Item CITRINE_SHOVEL = registerItem("citrine_shovel",
            new ShovelItem(ModToolMaterials.CITRINE, 3, 2.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC).maxCount(1).fireproof()));

    public static Item CITRINE_HELMET = registerItem("citrine_helmet",
            new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC)));

    public static Item CITRINE_CHESTPLATE = registerItem("citrine_chestplate",
            new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC)));

    public static Item CITRINE_LEGGINGS = registerItem("citrine_leggings",
            new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC)));

    public static Item CITRINE_BOOTS = registerItem("citrine_boots",
            new ModCitrineArmor(ModArmorMaterials.CITRINE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC)));

    public static Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item BLIGHTSPORE_SEEDS = registerItem("blightspore_seeds",
            new AliasedBlockItem(ModBlocks.BLIGHTSPORE, new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.CAVEWHEAT)));

    public static Item CAVEWHEAT_SEEDS = registerItem("cavewheat_seeds",
            new AliasedBlockItem(ModBlocks.CAVEWHEAT, new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.CAVEWHEAT)));

    public static Item CORN_KERNEL = registerItem("corn_kernel",
            new AliasedBlockItem(ModBlocks.CORN, new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.CORN)));

    public static Item COTTON_SEEDS = registerItem("cotton_seeds",
            new AliasedBlockItem(ModBlocks.COTTON, new FabricItemSettings().group(ModItemGroup.NATURE).fireproof()));

    public static Item COTTON_RAW = registerItem("cotton_raw",
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE)));

    public static Item COTTON_BALL = registerItem("cotton_ball",
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE)));

    public static final Item PICKLING_SUBSTANCE = registerItem("pickling_substance",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).maxCount(1)));

    public static final Item PICKLE = registerItem("pickle",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).food(ModFoodComponents.PICKLE)));

    public static final Item SALT_CRYSTAL = registerItem("salt_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item SALT_DUST = registerItem("salt_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item GOLDEN_PICKLE = registerItem("golden_pickle",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).food(ModFoodComponents.GOLDEN_PICKLE)));

    public static final Item ENCHANTED_GOLDEN_PICKLE = registerItem("enchanted_golden_pickle",
            new EnchantedGoldenPickle(new FabricItemSettings().group(ModItemGroup.ITEMS).food(ModFoodComponents.ENCHANTED_GOLDEN_PICKLE)));

    public static Item ADAMANTIUM_SWORD = registerItem("adamantium_sword",
            new ModBleedSword(ModToolMaterials.ADAMANTIUM, 16, 8.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).maxCount(1).fireproof().rarity(Rarity.EPIC)));

    public static Item ADAMANTIUM_AXE = registerItem("adamantium_axe",
            new ModBleedAxe(ModToolMaterials.ADAMANTIUM, 17, 11.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof().maxCount(1).rarity(Rarity.EPIC)));

    public static Item ADAMANTIUM_PICKAXE = registerItem("adamantium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADAMANTIUM, 14, 5.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC).maxCount(1).fireproof()));

    public static Item ADAMANTIUM_HOE = registerItem("adamantium_hoe",
            new ModHoe(ModToolMaterials.ADAMANTIUM, 1, 1.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC).maxCount(1).fireproof()));

    public static Item ADAMANTIUM_SHOVEL = registerItem("adamantium_shovel",
            new ShovelItem(ModToolMaterials.ADAMANTIUM, 12, 2.0F,
                    new FabricItemSettings().group(ModItemGroup.TOOLS).rarity(Rarity.EPIC).maxCount(1).fireproof()));

    public static Item MAGIC_DUST = registerItem("magic_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static Item PHILOSOPHERS_STONE = registerItem("philosopher_stone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item MAGIC_GEM = registerItem("magic_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item BLACK_PEARL = registerItem("black_pearl",
            new BlackPearlItem(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item BLOODSTONE = registerItem("bloodstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item TREEHEART = registerItem("treeheart",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item SMALL_INERT_SOULSTONE = registerItem("small_inert_soulstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item MEDIUM_INERT_SOULSTONE = registerItem("medium_inert_soulstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item LARGE_INERT_SOULSTONE = registerItem("large_inert_soulstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item SMALL_SOULSTONE = registerItem("small_soulstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item MEDIUM_SOULSTONE = registerItem("medium_soulstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item LARGE_SOULSTONE = registerItem("large_soulstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item AMMONITE = registerItem("ammonite",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item AMULET = registerItem("amulet",
            new AmuletItem(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item DARK_CRYSTAL = registerItem("dark_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item EMPERYAN_JEWEL = registerItem("emperyan_jewel",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item FLUTE = registerItem("flute",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item FRIGID_RUNESTONE = registerItem("frigid_runestone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item HEART_MECHANISM = registerItem("heart_mechanism",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item LODESTONE = registerItem("lodestone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item MALIGN_EMBER = registerItem("malign_ember",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item ODDSTONE = registerItem("oddstone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item RUNESTONE = registerItem("runestone",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));

    public static Item SOUL_MATRIX = registerItem("soul_matrix",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item SOUL_PLASM = registerItem("soul_plasm",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item WEAK_DARK_CRYSTAL = registerItem("weak_dark_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS).fireproof()));

    public static Item ALUMINUM_COIN = registerItem("aluminum_coin",
            new AluminumCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item BRONZE_COIN = registerItem("bronze_coin",
            new BronzeCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item BRONZE_COIN_FANCY = registerItem("bronze_coin_fancy",
            new BronzeCoinFancy(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item COPPER_COIN = registerItem("copper_coin",
            new CopperCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item COPPER_COIN_FANCY = registerItem("copper_coin_fancy",
            new CopperCoinFancy(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item GOLD_COIN = registerItem("gold_coin",
            new GoldCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item GOLD_COIN_FANCY = registerItem("gold_coin_fancy",
            new GoldCoinFancy(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item IRON_COIN = registerItem("iron_coin",
            new IronCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item PLAIN_COIN_FANCY = registerItem("plain_coin_fancy",
            new PlainCoinFancy(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item SILVER_COIN = registerItem("silver_coin",
            new SilverCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item SILVER_COIN_FANCY = registerItem("silver_coin_fancy",
            new SilverCoinFancy(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item STEEL_COIN = registerItem("steel_coin",
            new SteelCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item TIN_COIN = registerItem("tin_coin",
            new TinCoin(new FabricItemSettings().group(ModItemGroup.COINS).fireproof()));

    public static Item ZINC_INGOT = registerItem("zinc_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item ZINC_CHUNKS = registerItem("zinc_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item ZINC_PLATE = registerItem("zinc_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS)));

    public static Item JACARANDA_SIGN = registerItem("jacaranda_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_BLOCKS).maxCount(64),
                    ModBlocks.JACARANDA_SIGN_BLOCK, ModBlocks.JACARANDA_WALL_SIGN_BLOCK));

    public static Item ALUMINUM_CHUNKS = registerItem("aluminum_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item BONE_CHUNKS = registerItem("bone_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item COPPER_CHUNKS = registerItem("copper_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item GOLD_CHUNKS = registerItem("gold_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item IRON_CHUNKS = registerItem("iron_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item LEAD_CHUNKS = registerItem("lead_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item NICKEL_CHUNKS = registerItem("nickel_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item SILVER_CHUNKS = registerItem("silver_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item TIN_CHUNKS = registerItem("tin_chunks",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item PENTLANDITE_ROCK = registerItem("pentlandite_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item OIL_BOTTLE = registerItem("oil_bottle",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item AURICUPRIDE_ROCK = registerItem("auricupride_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.MATERIALS)));

    public static Item BAUXITE_ROCK = registerItem("bauxite_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.MATERIALS)));

    public static Item CYLINDRITE_ROCK = registerItem("cylindrite_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.MATERIALS)));

    public static Item GAHNITE_ROCK = registerItem("gahnite_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.MATERIALS)));

    public static Item GALENA_ROCK = registerItem("galena_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.MATERIALS)));

    public static Item REALGAR_ROCK = registerItem("realgar_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.MATERIALS)));

    public static Item SPHALERITE_ROCK = registerItem("sphalerite_rock",
            new Item(new FabricItemSettings().group(ModItemGroup.MATERIALS)));

    public static Item GOLDENWOOD_ROD = registerItem("goldenwood_rod",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static Item WISDOM_FRUIT = registerItem("wisdom_fruit",
            new WisdomFruit(new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.WISDOM_FRUIT)));

    public static Item SWEETPOD_STEW = registerItem("sweetpod_stew",
            new SweetPodSoupItem(new FabricItemSettings().group(ModItemGroup.ITEMS).food(ModFoodComponents.SWEETPOD_STEW)));

    public static Item SWEETPOD = registerItem("sweetpod",
            new AliasedBlockItem(ModBlocks.SWEETPOD, new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.SWEETPOD_STEW)));

    public static Item PORK_SLAB_RAW = registerItem("pork_slab_raw",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.RAW_PORK_SLAB)));

    public static Item PORK_SLAB_SALTED = registerItem("pork_slab_salted",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SALTED_PORK_SLAB)));

    public static Item PORK_SLAB_COOKED = registerItem("pork_slab_cooked",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.COOKED_PORK_SLAB)));

    public static Item ADAMANTIUM_PLATE = registerItem("adamantium_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item ADAMANTIUM_WIRE = registerItem("adamantium_wire",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item ALUMINUM_PLATE = registerItem("aluminum_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BATTERY_COMPONENTS = registerItem("battery_components",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BLANK_PUNCHCARD = registerItem("blank_punchcard",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BRASS_PLATE = registerItem("brass_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BRONZE_GEAR = registerItem("bronze_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BRONZE_PLATE = registerItem("bronze_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BULB_0 = registerItem("bulb_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BULB_1 = registerItem("bulb_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BULB_2 = registerItem("bulb_2",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BULB_3 = registerItem("bulb_3",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BULB_4 = registerItem("bulb_4",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BULB_5 = registerItem("bulb_5",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BULB_6 = registerItem("bulb_6",
            new AliasedBlockItem(Blocks.LIGHT, new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CAN = registerItem("can",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CAPACITOR_0 = registerItem("capacitor_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CAPACITOR_1 = registerItem("capacitor_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CHAINLINKS = registerItem("chainlinks",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CHEMICAL_READER = registerItem("chemical_reader",
            new ChemicalReaderItem(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CHIP_0 = registerItem("chip_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CHIP_1 = registerItem("chip_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CIRCUIT_BLUE = registerItem("circuit_blue",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CIRCUIT_DISCRETE = registerItem("circuit_discrete",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CIRCUIT_INTEGRATED = registerItem("circuit_integrated",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CIRCUIT_OLD_0 = registerItem("circuit_old_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CIRCUIT_OLD_1 = registerItem("circuit_old_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CIRCUIT_PRINTED = registerItem("circuit_printed",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COIL_COPPER = registerItem("coil_copper",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COIL_GOLD = registerItem("coil_gold",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COIL_OLD = registerItem("coil_old",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COIL_RAREEARTHS = registerItem("coil_rareearths",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COIL_SILVER = registerItem("coil_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CONDENSER = registerItem("condenser",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COPPER_GEAR = registerItem("copper_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COPPER_PLATE = registerItem("copper_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COPPER_TUBE = registerItem("copper_tube",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item COPPER_WIRE = registerItem("copper_wire",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CURRENT_SWITCHER = registerItem("current_switcher",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item CURRENT_TOGGLER = registerItem("current_toggler",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DARK_GEAR = registerItem("dark_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_0 = registerItem("datacard_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_1 = registerItem("datacard_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_2 = registerItem("datacard_2",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_3 = registerItem("datacard_3",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_4 = registerItem("datacard_4",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_5 = registerItem("datacard_5",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_6 = registerItem("datacard_6",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_7 = registerItem("datacard_7",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_8 = registerItem("datacard_8",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATACARD_9 = registerItem("datacard_9",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DATAREEL = registerItem("datareel",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DUALCOIL_0 = registerItem("dualcoil_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DUALCOIL_1 = registerItem("dualcoil_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item DUALCOIL_2 = registerItem("dualcoil_2",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item ELECTRIC_MAGNET = registerItem("electric_magnet",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item ELECTRUM_GEAR = registerItem("electrum_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item FERRITE = registerItem("ferrite",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item GALVANIC_BATTERY = registerItem("galvanic_battery",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item GALVANIZED_PLATE = registerItem("galvanized_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item GALVANIZED_TUBE = registerItem("galvanized_tube",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item GLOWING_GEAR = registerItem("glowing_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item GOLD_GEAR = registerItem("gold_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item GOLD_PLATE = registerItem("gold_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item GOLD_WIRE = registerItem("gold_wire",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item IRON_GEAR = registerItem("iron_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item IRON_PLATE = registerItem("iron_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item IRON_TUBE = registerItem("iron_tube",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item IRON_WIRE = registerItem("iron_wire",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item LEAD_GEAR = registerItem("lead_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item LEAD_PLATE = registerItem("lead_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MAGNET = registerItem("magnet",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MODERN_BATTERY_0 = registerItem("modern_battery_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MODERN_BATTERY_1 = registerItem("modern_battery_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MODERN_BATTERY_2 = registerItem("modern_battery_2",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MODERN_BATTERY_3 = registerItem("modern_battery_3",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MODERN_BATTERY_4 = registerItem("modern_battery_4",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MOTOR_0 = registerItem("motor_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MOTOR_1 = registerItem("motor_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MOTOR_2 = registerItem("motor_2",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item MOTOR_3 = registerItem("motor_3",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item LIGHT_BULB_BASE = registerItem("light_bulb_base",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item NICKEL_GEAR = registerItem("nickel_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item NICKEL_PLATE = registerItem("nickel_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item PEWTER_PLATE = registerItem("pewter_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item PLASTIC_TUBE = registerItem("plastic_tube",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item RAREEARTHS_PLATE = registerItem("rareearths_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item RESISTOR_0 = registerItem("resistor_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item RESISTOR_1 = registerItem("resistor_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item RIVETS_PLATE = registerItem("rivets_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item ROPE = registerItem("rope",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item RUSTY_OLD_BATTERY = registerItem("rusty_old_battery",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SILVER_PLATE = registerItem("silver_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SILVER_WIRE = registerItem("silver_wire",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_BRONZE_PLATE = registerItem("small_bronze_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_CERAMIC_PLATE = registerItem("small_ceramic_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_CLAY_PLATE = registerItem("small_clay_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_COPPER_PLATE = registerItem("small_copper_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_GALVANIZED_PLATE = registerItem("small_galvanized_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_GOLD_PLATE = registerItem("small_gold_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_IRON_PLATE = registerItem("small_iron_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_LAMINATED_BROWN_PLATE = registerItem("small_laminated_brown_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_LAMINATED_GREEN_PLATE = registerItem("small_laminated_green_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_LEATHERBOUND_PLATE = registerItem("small_leatherbound_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_NICKEL_PLATE = registerItem("small_nickel_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_PLASTIC_PLATE = registerItem("small_plastic_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_STEEL_PLATE = registerItem("small_steel_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_STONE_PLATE = registerItem("small_stone_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_TIN_PLATE = registerItem("small_tin_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SMALL_WOOD_PLATE = registerItem("small_wood_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item STEEL_CASING = registerItem("steel_casing",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item STEEL_GEAR = registerItem("steel_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item STEEL_PLATE = registerItem("steel_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SUPERALLOY_PLATE = registerItem("superalloy_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SUPERALLOY_WIRE = registerItem("superalloy_wire",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item SWITCH = registerItem("switch",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item THERMIONIC_VALVE_0 = registerItem("thermionic_valve_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item THERMIONIC_VALVE_1 = registerItem("thermionic_valve_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item THERMIONIC_VALVE_2 = registerItem("thermionic_valve_2",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item THERMIONIC_VALVE_3 = registerItem("thermionic_valve_3",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item THERMIONIC_VALVE_4 = registerItem("thermionic_valve_4",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item RUSTY_OLD_THERMIONIC_VALVE = registerItem("rusty_old_thermionic_valve",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item THICK_GALVANIZED_PLATE = registerItem("thick_galvanized_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item THICK_STEEL_PLATE = registerItem("thick_steel_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TIN_GEAR = registerItem("tin_gear",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TIN_PLATE = registerItem("tin_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TITANIUM_INFUSED_STEEL_CASING = registerItem("titanium_infused_steel_casing",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TRANSISTOR_0 = registerItem("transistor_0",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TRANSISTOR_1 = registerItem("transistor_1",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TRANSISTOR_2 = registerItem("transistor_2",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TRANSISTOR_3 = registerItem("transistor_3",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TRANSISTOR_4 = registerItem("transistor_4",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item TRIPLE_ELECTRIC_OUTLET = registerItem("triple_electric_outlet",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item WIRE = registerItem("wire",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item WRITTEN_PUNCHCARD = registerItem("written_punchcard",
            new Item(new FabricItemSettings().group(ModItemGroup.ELECTRONICS).fireproof()));

    public static Item BRASS_INGOT = registerItem("brass_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).fireproof()));

    public static Item RAREEARTHS_INGOT = registerItem("rareearths_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).fireproof()));

    public static Item RAREEARTH_CRYSTAL = registerItem("rareearth_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).fireproof()));

    public static Item NICKEL_INGOT = registerItem("nickel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).fireproof()));

    public static Item PEWTER_INGOT = registerItem("pewter_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).fireproof()));

    public static Item LITHIUM_BATTERY = registerItem("lithium_battery",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS).fireproof()));

    public static Item PLUMP_HELMET_SEEDS = registerItem("plump_helmet_seeds",
            new AliasedBlockItem(ModBlocks.PLUMP_HELMET, new FabricItemSettings().group(ModItemGroup.NATURE)));

    public static Item PLUMP_HELMET = registerItem("plump_helmet",
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE).fireproof().food(ModFoodComponents.PLUMP_HELMET)));

    public static Item ADAMANTIUM_HAMMER = registerItem("adamantium_hammer",
            new ModPaxel(10, 1, ModToolMaterials.ADAMANTIUM, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item BRONZE_HAMMER = registerItem("bronze_hammer",
            new ModPaxel(10, 1, ModToolMaterials.BRONZE, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new ModPaxel(10, 1, ToolMaterials.DIAMOND, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item GOLD_HAMMER = registerItem("gold_hammer",
            new ModPaxel(10, 1, ToolMaterials.GOLD, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item IRON_HAMMER = registerItem("iron_hammer",
            new ModPaxel(10, 1, ToolMaterials.IRON, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item STEEL_HAMMER = registerItem("steel_hammer",
            new ModPaxel(10, 1, ModToolMaterials.STEEL, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item STONE_HAMMER = registerItem("stone_hammer",
            new ModPaxel(10, 1, ToolMaterials.STONE, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item SUPERALLOY_HAMMER = registerItem("superalloy_hammer",
            new ModPaxel(10, 1, ModToolMaterials.GEM_STEEL, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static Item TIN_HAMMER = registerItem("tin_hammer",
            new ModPaxel(10, 1, ModToolMaterials.TIN, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static final Item NOISE_FROM_CLASS = registerItem("noise_from_class",
            new ModMusicDiscItem(7, ModSounds.NOISE, new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static final Item TIN_SHEARS = registerItem("tin_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(16542)));

    public static final Item STEEL_SHEARS = registerItem("steel_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(97648)));

    public static final Item PEWTER_SHEARS = registerItem("pewter_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(19483)));

    public static final Item LEAD_SHEARS = registerItem("lead_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(86246)));

    public static final Item GOLD_SHEARS = registerItem("gold_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(10486)));

    public static final Item COPPER_SHEARS = registerItem("copper_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(32345)));

    public static final Item BRONZE_SHEARS = registerItem("bronze_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(54327)));

    public static final Item ADAMANTIUM_SHEARS = registerItem("adamantium_shears",
            new ShearsItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(4632564)));
    
    public static final Item TIN_PICKAXE = registerItem("tin_pickaxe",
            new ModPickaxeItem(ModToolMaterials.TIN, 12, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item TIN_AXE = registerItem("tin_axe",
            new ModBleedAxe(ModToolMaterials.TIN, 19, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item TIN_HOE = registerItem("tin_hoe",
            new ModHoe(ModToolMaterials.TIN, 10, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item TIN_SWORD = registerItem("tin_sword",
            new ModBleedSword(ModToolMaterials.TIN, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item TIN_SHOVEL = registerItem("tin_shovel",
            new ModShovel(ModToolMaterials.TIN, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterials.STEEL, 12, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new ModBleedAxe(ModToolMaterials.STEEL, 19, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoe(ModToolMaterials.STEEL, 10, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new ModBleedSword(ModToolMaterials.STEEL, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ModShovel(ModToolMaterials.STEEL, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item LEAD_PICKAXE = registerItem("lead_pickaxe",
            new ModPickaxeItem(ModToolMaterials.LEAD, 12, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item LEAD_AXE = registerItem("lead_axe",
            new ModBleedAxe(ModToolMaterials.LEAD, 19, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item LEAD_HOE = registerItem("lead_hoe",
            new ModHoe(ModToolMaterials.LEAD, 10, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item LEAD_SWORD = registerItem("lead_sword",
            new ModBleedSword(ModToolMaterials.LEAD, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item LEAD_SHOVEL = registerItem("lead_shovel",
            new ModShovel(ModToolMaterials.LEAD, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, 12, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModBleedAxe(ModToolMaterials.COPPER, 19, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoe(ModToolMaterials.COPPER, 10, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new ModBleedSword(ModToolMaterials.COPPER, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ModShovel(ModToolMaterials.COPPER, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe",
            new ModPickaxeItem(ModToolMaterials.BRONZE, 12, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item BRONZE_AXE = registerItem("bronze_axe",
            new ModBleedAxe(ModToolMaterials.BRONZE, 19, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item BRONZE_HOE = registerItem("bronze_hoe",
            new ModHoe(ModToolMaterials.BRONZE, 10, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item BRONZE_SWORD = registerItem("bronze_sword",
            new ModBleedSword(ModToolMaterials.BRONZE, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel",
            new ModShovel(ModToolMaterials.BRONZE, 16, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item BONE_PICKAXE = registerItem("bone_pickaxe",
            new ModPickaxeItem(ModToolMaterials.BONE, 12, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item DYNAMITE = registerItem("dynamite",
            new DynamiteItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item ENDERMAN_HEART = registerItem("enderman_heart",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item DONKEY_HIDE = registerItem("donkey_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item HORSE_HIDE = registerItem("horse_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item LLAMA_HIDE = registerItem("llama_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item MOOSHROOM_HIDE = registerItem("mooshroom_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item MULE_HIDE = registerItem("mule_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item OCELOT_HIDE = registerItem("ocelot_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item PIG_HIDE = registerItem("pig_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item POLARBEAR_HIDE = registerItem("polarbear_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item POG_HIDE = registerItem("pog_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).fireproof()));

    public static final Item WOLF_HIDE = registerItem("wolf_hide",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item SILVERFISH_DUST = registerItem("silverfish_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item SLIME_BOLUS = registerItem("slime_bolus",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item VENOM_SAC = registerItem("venom_sac",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item WITHER_FLESH = registerItem("wither_flesh",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item ZOMBIE_LIVER = registerItem("zombie_liver",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item CREEPER_GALL = registerItem("creeper_gall",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item CRYSTALLIZED_ENDERMAN_HEART = registerItem("crystallized_enderman_heart",
            new Item(new FabricItemSettings().group(ModItemGroup.DROPS).fireproof()));

    public static final Item LEAD_HELMET = registerItem("lead_helmet",
            new LeadArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static final Item LEAD_CHESTPLATE = registerItem("lead_chestplate",
            new LeadArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static final Item LEAD_LEGGINGS = registerItem("lead_leggings",
            new LeadArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static final Item LEAD_BOOTS = registerItem("lead_boots",
            new LeadArmorItem(ModArmorMaterials.LEAD, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TOOLS).fireproof()));

    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxDamage(500)));

    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.TURNIP)));

    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));
    
    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new ModBleedAxe(ModToolMaterials.ORICHALCUM, 3, 1f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));
    
    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new ModHoe(ModToolMaterials.ORICHALCUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));
    
    public static final Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
            new ShovelItem(ModToolMaterials.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));
    
    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new ModBleedSword(ModToolMaterials.ORICHALCUM, 3, 3f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item ORICHALCUM_PAXEL = registerItem("orichalcum_paxel",
            new ModPaxel(1, 1, ModToolMaterials.ORICHALCUM,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet",
            new OrichalcumArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate",
            new OrichalcumArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item ORICHALCUM_LEGGINGS = registerItem("orichalcum_leggings",
            new OrichalcumArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots",
            new OrichalcumArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item ORICHALCUM_HORSE_ARMOR = registerItem("orichalcum_horse_armor",
            new HorseArmorItem(15, "orichalcum",
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item TURNIP_SEEDS = registerItem("turnip_seeds",
            new AliasedBlockItem(ModBlocks.TURNIP_CROP,
                    new FabricItemSettings().group(ModItemGroup.NATURE)));

    public static final Item ORICHALCUM_STAFF = registerItem("orichalcum_staff",
            new ModOrichalcumStaffItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static final Item ORICHALCUM_BOW = registerItem("orichalcum_bow",
            new ModOrichalcumBow(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(7895)));

    public static final Item CHERRY_BLOSSOM_SIGN = registerItem("cherry_blossom_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_BLOCKS).maxCount(16),
                    ModBlocks.CHERRY_BLOSSOM_SIGN_BLOCK, ModBlocks.CHERRY_BLOSSOM_WALL_SIGN_BLOCK));
    
    public static final Item MAGIC_ORICHALCUM_DUST = registerItem("magic_orichalcum_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ARTIFACTS)));
    
    public static final Item RACCOON_SPAWN_EGG = registerItem("raccoon_spawn_egg",
            new SpawnEggItem(ModEntities.RACCOON,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item TIGER_SPAWN_EGG = registerItem("tiger_spawn_egg",
            new SpawnEggItem(ModEntities.TIGER,0xfcb603, 0x242321,
                    new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item COBALT_NUGGET = registerItem("cobalt_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item RAW_COBALT = registerItem("raw_cobalt",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item COBALT_SWORD = registerItem("cobalt_sword",
            new ModBleedSword(ModToolMaterials.COBALT, 2, 3f,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));
    
    public static final Item COBALT_PICKAXE = registerItem("cobalt_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COBALT, 2, 3f,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));
    
    public static final Item COBALT_SHOVEL = registerItem("cobalt_shovel",
            new ShovelItem(ModToolMaterials.COBALT, 2, 3f,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));
    
    public static final Item COBALT_AXE = registerItem("cobalt_axe",
            new ModBleedAxe(ModToolMaterials.COBALT, 4, 0f,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));
    
    public static final Item COBALT_HOE = registerItem("cobalt_hoe",
            new ModHoe(ModToolMaterials.COBALT, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item COBALT_PAXEL = registerItem("cobalt_paxel",
            new ModPaxel(8, 0, ModToolMaterials.COBALT,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item COBALT_HELMET = registerItem("cobalt_helmet",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));
    
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));
    
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));
    
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots",
            new ArmorItem(ModArmorMaterials.COBALT, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item COBALT_HORSE_ARMOR = registerItem("cobalt_horse_armor",
            new HorseArmorItem(12, "cobalt",
                    new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item COBALT_STAFF = registerItem("cobalt_staff",
            new ModCobaltStaffItem(new FabricItemSettings().group(ModItemGroup.ITEMS).maxCount(1)));

    public static final Item COBALT_BOW = registerItem("cobalt_bow",
            new ModCobaltBow(new FabricItemSettings().group(ModItemGroup.ITEMS).maxDamage(8635)));
    
    public static final Item MAGIC_COBALT_DUST = registerItem("magic_cobalt_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item POUCH = registerItem("pouch",
            new BundleItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Thommas.LOGGER.info("Registering Mod Items for " + Thommas.MOD_ID + "!");
    }
}
