package net.vakror.thommas.blockitem.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.blockitem.block.ModBlocks;
import net.vakror.thommas.blockitem.block.fluid.ModFluids;
import net.vakror.thommas.blockitem.item.custom.*;
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
            new Item(new FabricItemSettings().group(ModItemGroup.NATURE).food(ModFoodComponents.ROTTEN)));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new ModSlownessSword(ModToolMaterials.MYTHRIL, 1, 4,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_PICK = registerItem("mythril_pick",
            new ModPickaxe(ModToolMaterials.MYTHRIL, 1, 2,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModSlownessAxe(ModToolMaterials.MYTHRIL, 4, 3,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoe(ModToolMaterials.MYTHRIL, 1, 1,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, 1, 1,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ModArmor(ModArmorMaterials.MYTHRIL, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.TOOLS)));

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
            new BowItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(5000)));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item PEPPER = registerItem("pepper", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())
            .group(ModItemGroup.NATURE)));

    public static final Item IRON_WOOL = registerItem("iron_wool",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, 3, 1f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxe(ModToolMaterials.RUBY, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.TOOLS)));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxe(ModToolMaterials.RUBY, 8, 3f,
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

    public static final Item AMETHYST_GEM = registerItem("amethyst_gem",
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
            new ModAxe(ModToolMaterials.ADAMANTIUM,2, 23, new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item CHLOROPHYTE_DUST = registerItem("chlorophyte_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item CHLOROPHYTE_INGOT = registerItem("chlorophyte_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item CHLOROPHYTE_NUGGET = registerItem("chlorophyte_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item COPPER_DUST = registerItem("copper_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item HARD_COPPER_INGOT = registerItem("hard_copper_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item CRIMTANE_DUST = registerItem("crimtane_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item CRIMTANE_INGOT = registerItem("crimtane_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item CRIMTANE_NUGGET = registerItem("crimtane_nugget",
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
            new ModPickaxe(ModToolMaterials.PURE_DIAMOND, 9, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item GEM_STEEL_DUST = registerItem("gem_steel_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item GEM_STEEL_INGOT = registerItem("gem_steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item GEM_STEEL_NUGGET = registerItem("gem_steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ITEMS)));

    public static final Item GEM_STEEL_STAFF = registerItem("gem_steel_staff",
            new ModStaff(ModToolMaterials.GEM_STEEL,40 , 40, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item HAND_DRILL = registerItem("hand_drill",
            new ModPickaxe(ModToolMaterials.HAND_DRILL,40 , 40, new FabricItemSettings().group(ModItemGroup.TOOLS)));

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
            new ModSlownessAxe(ModToolMaterials.MAGIC, 4, 0, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MAGIC_SWORD = registerItem("magic_sword",
            new ModSlownessSword(ModToolMaterials.MAGIC, 3, 2, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MAGIC_HOE = registerItem("magic_hoe",
            new ModHoe(ModToolMaterials.MAGIC, 0, 1, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item MAGIC_SHOVEL = registerItem("magic_shovel",
            new ModShovel(ModToolMaterials.MAGIC, 0, 0, new FabricItemSettings().group(ModItemGroup.TOOLS)));

    public static final Item HONEY_BUCKET = registerItem("honey_bucket",
            new BucketItem(ModFluids.HONEY_STILL, new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static final Item STAFF = registerItem("staff",
            new ModStaffItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static Item LIGHTNING_SUMMONER = registerItem("lightning_summoner",
            new Summoner(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static Item CANE = registerItem("cane",
            new ModCane(ModToolMaterials.CANE, 4, 0.01F,new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxCount(1)));

    public static Item HEAVENLY_SHIELD = registerItem("heavenly_shield",
            new GodShield(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(1000).fireproof().rarity(Rarity.EPIC)));

    public static Item REINFORCED_SHIELD = registerItem("reinforced_shield",
            new ShieldItem(new FabricItemSettings().group(ModItemGroup.TOOLS).maxDamage(100).fireproof().rarity(Rarity.COMMON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Thommas.LOGGER.info("Registering Mod Items for " + Thommas.MOD_ID + "!");
    }
}
