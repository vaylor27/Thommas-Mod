package net.vakror.thommas.villager.trade;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.vakror.thommas.blockitem.item.ModItems;

public class VanillaVillagerTrades {
    public static void register() {
        registerTrades();
    }
    private static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.GRAPE, 64),
                            6, 2, 0.02f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(ModItems.RUBY, 7),
                            12, 7, 0.08f));
                });
    }
}
