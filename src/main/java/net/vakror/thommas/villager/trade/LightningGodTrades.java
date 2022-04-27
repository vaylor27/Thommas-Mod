package net.vakror.thommas.villager.trade;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.vakror.thommas.blockitem.ModItems;
import net.vakror.thommas.villager.ModVillagers;

public class LightningGodTrades {
    protected static void register() {
        registerTrades();
    }

    private static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.COAL_COKE, 46),
                            999999999, 21, 0.01f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.CORRUPTED_DUST, 64),
                            999999999, 21, 0.01f));
                });
        
        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.DUST, 64),
                            999999999, 21, 0.01f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.MAGIC_CHARGE, 64),
                            999999999, 21, 0.01f));
                });
        
        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.CITRINE, 1),
                            999999999, 21, 0.01f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.MAGIC_GEM, 1),
                            1, 21, 1f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.LIGHTNING_GOD, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.MAGIC_DUST, 1),
                            1, 21, 1f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.TREEHEART, 1),
                            1, 21, 1f));
                });
    }
}
