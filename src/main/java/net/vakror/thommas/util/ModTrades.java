package net.vakror.thommas.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.WanderingTraderManager;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.villager.ModVillagers;

public class ModTrades {public static void registerTrades() {
    TradeOfferHelper.registerVillagerOffers(ModVillagers.BLAST_MASTER,1,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 6),
                        new ItemStack(ModItems.MYTHRIL_PICK, 1),
                        12,7,0.08f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 4),
                        new ItemStack(ModItems.MYTHRIL_BOOTS, 1),
                        12,7,0.08f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 2),
                        new ItemStack(ModItems.MYTHRIL_CHESTPLATE, 1),
                        12,7,0.08f));
            });

    TradeOfferHelper.registerVillagerOffers(ModVillagers.BLAST_MASTER,2,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 2),
                        new ItemStack(ModItems.MYTHRIL_HOE, 1),
                        12,7,0.08f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 5),
                        new ItemStack(ModItems.MYTHRIL_INGOT, 1),
                        12,7,0.08f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 3),
                        new ItemStack(ModItems.KAUPEN_BOW, 1),
                        12,7,0.08f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 1),
                        new ItemStack(ModItems.RUBY_PICKAXE, 1),
                        12,7,0.08f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 5),
                        new ItemStack(ModItems.RUBY_AXE, 1),
                        12,7,0.08f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.COPPER_COIN, 2),
                        new ItemStack(ModItems.RUBY_HOE, 1),
                        12,7,0.08f));
            });

    TradeOfferHelper.registerVillagerOffers(ModVillagers.COMBINER, 1,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(ModItems.TIN_HAMMER, 1),
                        6, 2, 0.02f));

                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(ModItems.BULB_6, 64),
                        6, 10, 0.02f));
            });

    TradeOfferHelper.registerVillagerOffers(ModVillagers.COMBINER, 2,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 14),
                        new ItemStack(ModItems.ORICHALCUM_PAXEL, 1),
                        2, 8, 0.4f));

                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(ModItems.BULB_6, 64),
                        6, 10, 0.02f));
            });

    TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 1,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 1),
                        new ItemStack(ModItems.COAL_COKE, 46),
                        999999999, 21, 0.01f));

                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 1),
                        new ItemStack(ModItems.CORRUPTED_DUST, 64),
                        999999999, 21, 0.01f));
            });

    TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 2,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 1),
                        new ItemStack(ModItems.DUST, 64),
                        999999999, 21, 0.01f));

                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 1),
                        new ItemStack(ModItems.MAGIC_CHARGE, 64),
                        999999999, 21, 0.01f));
            });

    TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 3,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 20),
                        new ItemStack(ModItems.CITRINE, 1),
                        999999999, 21, 0.01f));

                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 20),
                        new ItemStack(ModItems.MAGIC_GEM, 1),
                        1, 21, 1f));
            });

    TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 4,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 20),
                        new ItemStack(ModItems.MAGIC_DUST, 1),
                        1, 21, 1f));

                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.GOLD_COIN_FANCY, 20),
                        new ItemStack(ModItems.TREEHEART, 1),
                        1, 21, 1f));
            });

    TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(ModItems.GRAPE, 64),
                        6, 2, 0.02f));
            });

    TradeOfferHelper.registerVillagerOffers(VillagerProfession.NITWIT, 1,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 6),
                        new ItemStack(ModItems.ORICHALCUM_PAXEL, 1),
                        6, 2, 0.02f));
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 6),
                        new ItemStack(ModItems.COBALT_PAXEL, 1),
                        6, 2, 0.02f));
            });

    TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD_BLOCK, 5),
                        new ItemStack(ModItems.GOLDEN_PICKLE, 2),
                        523643653, 2, 0.02f));
            });


    TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 6),
                        new ItemStack(ModItems.RUBY, 7),
                        12, 7, 0.08f));
            });


    TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 4,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(ModItems.PHILOSOPHERS_STONE, 6),
                        new ItemStack(ModItems.LEAD_SWORD, 1),
                        1, 100, 10));
            });
}
}
