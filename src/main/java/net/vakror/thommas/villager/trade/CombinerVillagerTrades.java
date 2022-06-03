package net.vakror.thommas.villager.trade;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.villager.ModVillagers;

public class CombinerVillagerTrades {
    protected static void register() {
        registerTrades();
    }
    private static void registerTrades() {
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
    }
}
