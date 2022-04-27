package net.vakror.thommas.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.vakror.thommas.blockitem.ModItems;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier GRASS_ID
            = new Identifier("minecraft", "blocks/grass");
    private static final Identifier SAND_ID
            = new Identifier("minecraft", "blocks/sand");
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier DESERT_TEMPLE_CHEST_ID
            = new Identifier("minecraft", "chests/desert_pyramid_chest");
    private static final Identifier CREEPER_ID
            = new Identifier("minecraft", "entities/creeper");
    private static final Identifier GLOW_LICHEN_ID = new Identifier("minecraft", "blocks/glow_lichen");

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
                        .conditionally(RandomChanceLootCondition.builder(0.08F)) // Drops 24% of the time
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
                        .conditionally(RandomChanceLootCondition.builder(0.18f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.GOLDEN_PICKLE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder poolBuilders = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.16f)) // Drops 1% of the time
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
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.AMMONITE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(4.0f, 9.0f)).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}
