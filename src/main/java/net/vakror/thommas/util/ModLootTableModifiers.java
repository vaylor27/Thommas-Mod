package net.vakror.thommas.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
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
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for grass block loot table.
            if(GRASS_ID.equals(id)) {
                // Adds Grape Seeds to the grass loot table.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.GRAPE_SEEDS))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.STRAWBERRY_SEEDS))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.withPool(builder.build());

                FabricLootPoolBuilder Builder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.PEPPER_SEEDS))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.withPool(Builder.build());

                FabricLootPoolBuilder PoolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6F)) // Drops 24% of the time
                        .with(ItemEntry.builder(ModItems.TOMATO))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.withPool(PoolBuilder.build());

                FabricLootPoolBuilder iBuild = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.OATS))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                supplier.withPool(iBuild.build());

                FabricLootPoolBuilder iBuilds = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.CORN_KERNEL))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                supplier.withPool(iBuilds.build());

                FabricLootPoolBuilder poolBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.36f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.COTTON_SEEDS))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilders.build());

                FabricLootPoolBuilder IBuild = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.CUCUMBER))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.withPool(IBuild.build());
            }

            if(IGLOO_STRUCTURE_CHEST_ID.equals(id)) {
                // Adds a Dowsing Rod into the Igloo Chest with 100% chance.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.DATA_TABLET))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder poolBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.21f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.RUBY_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(poolBuilders.build());

                FabricLootPoolBuilder builders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.36f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TITANIUM_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(builders.build());

                FabricLootPoolBuilder Builders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.14f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.AMETHYST_HORSE_ARMOR))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.withPool(Builders.build());
            }

            if (GLOW_LICHEN_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.13f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.BLIGHTSPORE_SEEDS))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder poolBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.13f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.CAVEWHEAT_SEEDS))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilders.build());
            }
            if(DESERT_TEMPLE_CHEST_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.GOLDEN_PICKLE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder poolBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.ENCHANTED_GOLDEN_PICKLE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilders.build());
            }

            if(CREEPER_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.36f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.CORRUPTED_DUST))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
            if(SAND_ID.equals(id)) {
                // Adds a Corrupted Dust to Creepers.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.09f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.AMMONITE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
            if(PIG_ID.equals(id)) {
                // Adds a Pork Slab to Pigs.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) // Drops 40% of the time
                        .with(ItemEntry.builder(ModItems.PORK_SLAB_RAW))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
            if (SHIPWRECK_ID.equals(id) || MANSION.equals(id) || UNDERWATER_RUIN_1.equals(id) || UNDERWATER_RUIN_2.equals(id) || STRONGHOLD_LIBRARY.equals(id) || STRONGHOLD_CROSSING.equals(id) || STRONGHOLD_CORRIDOR.equals(id) || DUNGEON_ID.equals(id) || SHIPWRECK_ID_2.equals(id) || SHIPWRECK_ID_3.equals(id) || PORTAL.equals(id) || PILLAGER_OUTPOST.equals(id) || BRIDGE.equals(id) || TEMPLE.equals(id) || IGLOO_STRUCTURE_CHEST_ID.equals(id) || END_CITY.equals(id) || DESERT_TEMPLE_CHEST_ID.equals(id) || TREASURE.equals(id) || BASTION_TREASURE.equals(id) || BASTION_OTHER.equals(id) || BASTION_STABLE.equals(id) || BASTION_BRIDGE.equals(id) || MINESHAFT.equals(id) || ARMORER.equals(id) || BUTCHER.equals(id) || CARTOGRAPHER.equals(id) || DESERT_HOUSE.equals(id) || FISHER.equals(id) || FLETCHER.equals(id) || MASON.equals(id) || PLAINS_HOUSE.equals(id) || SAVANNA_HOUSE.equals(id) || SHEPHERD.equals(id) || SNOWY_HOUSE.equals(id) || TAIGA_HOUSE.equals(id) || TANNERY.equals(id) || VILLAGE_TEMPLE.equals(id) || TOOLSMITH.equals(id) || WEAPONSMITH.equals(id) || TREASURE_FISH.equals(id)) {
                // Add Old Stuff to shipwreck
                FabricLootPoolBuilder builder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.CHIP_0))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(builder.build());
                FabricLootPoolBuilder builders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.CIRCUIT_OLD_0))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(builders.build());
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.CIRCUIT_OLD_1))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(poolBuilder.build());
                FabricLootPoolBuilder poolBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RUSTY_OLD_BATTERY))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(poolBuilders.build());
                FabricLootPoolBuilder poolbuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RUSTY_OLD_THERMIONIC_VALVE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(poolbuilder.build());
                FabricLootPoolBuilder poolbuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.COIL_OLD))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(poolbuilders.build());
                FabricLootPoolBuilder poolsbuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.COIL_OLD))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(poolsbuilders.build());
                FabricLootPoolBuilder poolsBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.MAGNET))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3, 8)).build());
                supplier.withPool(poolsBuilders.build());

            }
            if(ENDERMAN.equals(id)) {
                // Adds a Pork Slab to Pigs.
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) // Drops 40% of the time
                        .with(ItemEntry.builder(ModItems.ENDERMAN_HEART))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder poolBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 40% of the time
                        .with(ItemEntry.builder(ModItems.CRYSTALLIZED_ENDERMAN_HEART))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}
