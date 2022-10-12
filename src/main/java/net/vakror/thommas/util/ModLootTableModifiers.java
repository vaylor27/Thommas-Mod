package net.vakror.thommas.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.vakror.thommas.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier GRASS_ID
            = new Identifier("minecraft", "blocks/grass");
    private static final Identifier SAND_ID
            = new Identifier("minecraft", "blocks/sand");
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier DESERT_TEMPLE_CHEST_ID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier CREEPER_ID
            = new Identifier("minecraft", "entities/creeper");
    private static final Identifier PIG_ID
            = new Identifier("minecraft", "entities/pig");
    private static final Identifier GLOW_LICHEN_ID = new Identifier("minecraft", "blocks/glow_lichen");
    private static final Identifier SHIPWRECK_ID
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier SHIPWRECK_ID_2
            = new Identifier("minecraft", "chests/shipwreck_supply");
    private static final Identifier SHIPWRECK_ID_3
            = new Identifier("minecraft", "chests/shipwreck_map");
    private static final Identifier DUNGEON_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_CORRIDOR
            = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING
            = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier STRONGHOLD_LIBRARY
            = new Identifier("minecraft", "chests/stronghold_library");
    private static final Identifier UNDERWATER_RUIN_1
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier UNDERWATER_RUIN_2
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier MANSION
            = new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier PILLAGER_OUTPOST
            = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier PORTAL
            = new Identifier("minecraft", "chests/ruined_portal");
    private static final Identifier BRIDGE
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier TEMPLE
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier END_CITY
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier TREASURE
            = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier BASTION_TREASURE
            = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BASTION_OTHER
            = new Identifier("minecraft", "chests/bastion_other");
    private static final Identifier BASTION_STABLE
            = new Identifier("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier BASTION_BRIDGE
            = new Identifier("minecraft", "chests/bastion_bridge");
    private static final Identifier MINESHAFT
            = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier ARMORER
            = new Identifier("minecraft", "chests/village/village_armorer");
    private static final Identifier BUTCHER
            = new Identifier("minecraft", "chests/village/village_butcher");
    private static final Identifier CARTOGRAPHER
            = new Identifier("minecraft", "chests/village/village_cartographer");
    private static final Identifier DESERT_HOUSE
            = new Identifier("minecraft", "chests/village/village_desert_house");
    private static final Identifier FISHER
            = new Identifier("minecraft", "chests/village/village_fisher");
    private static final Identifier FLETCHER
            = new Identifier("minecraft", "chests/village/village_fletcher");
    private static final Identifier MASON
            = new Identifier("minecraft", "chests/village/village_mason");
    private static final Identifier PLAINS_HOUSE
            = new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier SAVANNA_HOUSE
            = new Identifier("minecraft", "chests/village/village_savanna_house");
    private static final Identifier SHEPHERD
            = new Identifier("minecraft", "chests/village/village_shepherd");
    private static final Identifier SNOWY_HOUSE
            = new Identifier("minecraft", "chests/village/village_snowy_house");
    private static final Identifier TAIGA_HOUSE
            = new Identifier("minecraft", "chests/village/village_taiga_house");
    private static final Identifier TANNERY
            = new Identifier("minecraft", "chests/village/village_tannery");
    private static final Identifier VILLAGE_TEMPLE
            = new Identifier("minecraft", "chests/village/village_temple");
    private static final Identifier TOOLSMITH
            = new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier WEAPONSMITH
            = new Identifier("minecraft", "chests/village/village_weaponsmith");
    private static final Identifier TREASURE_FISH
            = new Identifier("minecraft", "gameplay/fishing/junk");
    private static final Identifier ENDERMAN
            = new Identifier("minecraft", "entities/enderman");



    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for grass block loot table.
            if(GRASS_ID.equals(id)) {
                // Adds Grape Seeds to the grass loot table.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.GRAPE_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());

                LootPool.Builder builder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.STRAWBERRY_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(builder.build());

                LootPool.Builder Builder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.PEPPER_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(Builder.build());

                LootPool.Builder PoolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.TOMATO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(PoolBuilder.build());

                LootPool.Builder iBuild = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.OATS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                supplier.pool(iBuild.build());

                LootPool.Builder iBuilds = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.CORN_KERNEL))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                supplier.pool(iBuilds.build());

                LootPool.Builder poolBuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.36f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.COTTON_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.pool(poolBuilders.build());

                LootPool.Builder IBuild = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.CUCUMBER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(IBuild.build());
            }

            if(IGLOO_STRUCTURE_CHEST_ID.equals(id)) {
                // Adds a Dowsing Rod into the Igloo Chest with 100% chance.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.DATA_TABLET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());

                LootPool.Builder poolBuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.21f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.RUBY_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilders.build());

                LootPool.Builder builders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.36f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TITANIUM_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(builders.build());

                LootPool.Builder Builders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.AMETHYST_HORSE_ARMOR))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(Builders.build());
            }

            if (GLOW_LICHEN_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.13f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.BLIGHTSPORE_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.pool(poolBuilder.build());

                LootPool.Builder poolBuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.13f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.CAVEWHEAT_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.pool(poolBuilders.build());
            }
            if(DESERT_TEMPLE_CHEST_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.GOLDEN_PICKLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.pool(poolBuilder.build());

                LootPool.Builder poolBuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.ENCHANTED_GOLDEN_PICKLE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.pool(poolBuilders.build());
            }

            if(CREEPER_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.36f)) // Drops 36% of the time
                        .with(ItemEntry.builder(ModItems.CORRUPTED_DUST))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.pool(poolBuilder.build());
            }
            if(SAND_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.AMMONITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.pool(poolBuilder.build());
            }
            if(PIG_ID.equals(id)) {
                // Adds a Pork Slab to Pigs.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) // Drops 40% of the time
                        .with(ItemEntry.builder(ModItems.PORK_SLAB_RAW))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());
                supplier.pool(poolBuilder.build());
            }
            if (SHIPWRECK_ID.equals(id) || MANSION.equals(id) || UNDERWATER_RUIN_1.equals(id) || UNDERWATER_RUIN_2.equals(id) || STRONGHOLD_LIBRARY.equals(id) || STRONGHOLD_CROSSING.equals(id) || STRONGHOLD_CORRIDOR.equals(id) || DUNGEON_ID.equals(id) || SHIPWRECK_ID_2.equals(id) || SHIPWRECK_ID_3.equals(id) || PORTAL.equals(id) || PILLAGER_OUTPOST.equals(id) || BRIDGE.equals(id) || TEMPLE.equals(id) || IGLOO_STRUCTURE_CHEST_ID.equals(id) || END_CITY.equals(id) || DESERT_TEMPLE_CHEST_ID.equals(id) || TREASURE.equals(id) || BASTION_TREASURE.equals(id) || BASTION_OTHER.equals(id) || BASTION_STABLE.equals(id) || BASTION_BRIDGE.equals(id) || MINESHAFT.equals(id) || ARMORER.equals(id) || BUTCHER.equals(id) || CARTOGRAPHER.equals(id) || DESERT_HOUSE.equals(id) || FISHER.equals(id) || FLETCHER.equals(id) || MASON.equals(id) || PLAINS_HOUSE.equals(id) || SAVANNA_HOUSE.equals(id) || SHEPHERD.equals(id) || SNOWY_HOUSE.equals(id) || TAIGA_HOUSE.equals(id) || TANNERY.equals(id) || VILLAGE_TEMPLE.equals(id) || TOOLSMITH.equals(id) || WEAPONSMITH.equals(id) || TREASURE_FISH.equals(id)) {
                // Add Old Stuff to shipwreck
                LootPool.Builder builder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.CHIP_0))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(builder.build());
                LootPool.Builder builders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.CIRCUIT_OLD_0))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(builders.build());
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.CIRCUIT_OLD_1))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(poolBuilder.build());
                LootPool.Builder poolBuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RUSTY_OLD_BATTERY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(poolBuilders.build());
                LootPool.Builder poolbuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RUSTY_OLD_THERMIONIC_VALVE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(poolbuilder.build());
                LootPool.Builder poolbuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.COIL_OLD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(poolbuilders.build());
                LootPool.Builder poolsbuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.COIL_OLD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(poolsbuilders.build());
                LootPool.Builder poolsBuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.MAGNET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.pool(poolsBuilders.build());

            }
            if(ENDERMAN.equals(id)) {
                // Adds a Pork Slab to Pigs.
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) // Drops 40% of the time
                        .with(ItemEntry.builder(ModItems.ENDERMAN_HEART))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());
                supplier.pool(poolBuilder.build());

                LootPool.Builder poolBuilders = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 40% of the time
                        .with(ItemEntry.builder(ModItems.CRYSTALLIZED_ENDERMAN_HEART))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
    }
}
