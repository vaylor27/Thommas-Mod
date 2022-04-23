package net.vakror.thommas.villager.trade;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.vakror.thommas.blockitem.item.ModItems;
import net.vakror.thommas.villager.ModVillagers;

public class BlastMasterTrades {
    public static void register() {
        registerCustomTrades();
    }
    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLAST_MASTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(ModItems.MYTHRIL_PICK, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.MYTHRIL_BOOTS, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 26),
                            new ItemStack(ModItems.MYTHRIL_CHESTPLATE, 1),
                            12,7,0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.BLAST_MASTER,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.MYTHRIL_HOE, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.MYTHRIL_INGOT, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.RUBY, 46),
                            999999,21,0.01f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.RUBY, 46),
                            999999,21,0.01f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 50),
                            new ItemStack(ModItems.KAUPEN_BOW, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.RUBY_PICKAXE, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.RUBY_AXE, 1),
                            12,7,0.08f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 50),
                            new ItemStack(ModItems.RUBY_HOE, 1),
                            12,7,0.08f));
                });
    }
}
