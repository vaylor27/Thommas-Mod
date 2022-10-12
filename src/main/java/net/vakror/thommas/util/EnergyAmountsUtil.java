package net.vakror.thommas.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.item.ModItems;

public class EnergyAmountsUtil {

    public enum InfusingEnergyAmounts {
        AMETHYST(ModItems.AMETHYST_DUST,279371),
        CITRINE_DUST(ModItems.CITRINE_DUST, 97436),
        ALUMINUM_DUST(ModItems.ALUMINUM_DUST, 14846),
        ADAMANTIUM_DUST(ModItems.ADAMANTIUM_DUST, 19495),
        CHAROITE(ModItems.CHAROITE_DUST, 53406),
        COPPER(ModItems.COPPER_DUST, 9053),
        GARNET(ModItems.GARNET_DUST, 76936),
        GOLD(ModItems.GOLD_DUST, 9436),
        JADE(ModItems.JADE_DUST, 76823),
        LARIMAR(ModItems.LARIMAR_DUST, 23786),
        LEAD(ModItems.LEAD_DUST, 83025),
        LUMENITE(ModItems.LUMENITE_DUST, 10583),
        MYTHRIL(ModItems.MYTHRIL_DUST, 34729),
        PLATINUM(ModItems.PLATINUM_DUST, 76923),
        RUBY(ModItems.RUBY_DUST, 40413),
        SILVER(ModItems.SILVER_DUST, 27841),
        SOUL(ModItems.SOUL_DUST, 79643),
        TIN(ModItems.TIN_DUST, 79786),
        ZINC(ModItems.ZINC_DUST, 41894),
        BENITOITE(ModItems.BENITOITE_DUST, 37769),
        IRON(ModItems.IRON_DUST, 14873),
        COBALT(ModItems.COBALT_DUST, 23498);

        final long energyAmount;
        final Item item;
        InfusingEnergyAmounts(Item item, long energyAmount) {
            this.item = item;
            this.energyAmount = energyAmount;
        }

        public static long getEnergyAmountFromItem(Item item) {
            for (InfusingEnergyAmounts amount: InfusingEnergyAmounts.values()) {
                if (item.equals(amount.item)) {
                    return amount.energyAmount;
                }
            }
            return 0;
        }
    }

    public enum CrushingEnergyAmounts {
        AMETHYST(ModBlocks.AMETHYST_ORE.asItem(),97436),
        RAW_CITRINE(ModItems.RAW_CITRINE.asItem(), 86269),
        DEEPSLATE_CHAROITE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_charoite_ore"))).asItem(), 53406),
        RAW_CHAROITE((Registry.ITEM.get(new Identifier(Thommas.MOD_ID, "raw_charoite"))), 53406),
        COPPER_CHUNKS(ModItems.COPPER_CHUNKS, 9053),
        DEEPSLATE_GARNET((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_garnet_ore"))).asItem(), 76936),
        RAW_GARNET((Registry.ITEM.get(new Identifier(Thommas.MOD_ID, "raw_garnet"))), 76936),
        DEEPSLATE_GOLD(Blocks.DEEPSLATE_GOLD_ORE.asItem(), 9436),
        NETHERRACK_GOLD(Blocks.NETHER_GOLD_ORE.asItem(), 9436),
        DEEPSLATE_JADE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_jade_ore"))).asItem(), 76823),
        RAW_JADE((Registry.ITEM.get(new Identifier(Thommas.MOD_ID, "raw_jade"))), 76823),
        DEEPSLATE_LARIMAR((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_larimar_ore"))).asItem(), 23786),
        RAW_LARIMAR((Registry.ITEM.get(new Identifier(Thommas.MOD_ID, "raw_larimar"))), 23786),
        NETHERRACK_MYTHRIL((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "netherrack_mythril_ore"))).asItem(), 34729),
        RAW_MYTHRIL(ModItems.RAW_MYTHRIL, 34729),
        STONE_SILVER((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_silver_ore"))).asItem(), 27841),
        NICKEL_CHUNKS(ModItems.NICKEL_CHUNKS, 12348),
        BENITOITE(ModItems.RAW_BENITOITE, 37769),
        IRON(Blocks.IRON_ORE.asItem(), 14873),
        DEEPSLATE_IRON(Blocks.DEEPSLATE_IRON_ORE.asItem(), 14873),
        COBALT(ModItems.RAW_COBALT, 23498),
        RAW_ORICHALCUM(ModItems.RAW_ORICHALCUM, 24873),





        ADAMANTIUM((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "netherrack_adamantium_ore"))).asItem(), 19495),
        ALUMINUM_CHUNKS(ModItems.ALUMINUM_CHUNKS, 23467),
        ALUMINUM((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "aluminum_ore"))).asItem(), 14846),
        COPPER((Registry.BLOCK.get(new Identifier("copper_ore"))).asItem(), 9053),
        THOMMAS_COPPER((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "copper_ore"))).asItem(), 9053),
        STONE_COPPER((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_copper_ore"))).asItem(), 9053),
        STONE_COPPER_2((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_copper_2_ore"))).asItem(), 9053),
        LEAD_CHUNKS(ModItems.LEAD_CHUNKS, 13489),
        STONE_LEAD((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_lead_ore"))).asItem(), 83025),
        STONE_LEAD_2((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_lead_2_ore"))).asItem(), 83025),
        LEAD((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "lead_ore"))).asItem(), 83025),
        LUMENITE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "lumenite_ore"))).asItem(), 10583),
        ORICHALCUM(ModBlocks.ORICHALCUM_ORE.asItem(), 24873),
        DEEPSLATE_ORICHALCUM(ModBlocks.DEEPSLATE_ORICHALCUM_ORE.asItem(), 24873),
        PLATINUM((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "platinum_ore"))).asItem(), 76923),
        SILVER_CHUNKS(ModItems.SILVER_CHUNKS, 48941),
        SILVER((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "silver_ore"))).asItem(), 27841),
        TIN_CHUNKS(ModItems.TIN_CHUNKS, 34876),
        TIN((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_tin_ore"))).asItem(), 79786),
        CHAROITE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "charoite_ore"))).asItem(), 53406),
        CITRINE(ModBlocks.CITRINE_ORE.asItem(), 86269),
        DEEPSLATE_CITRINE(ModBlocks.DEEPSLATE_CITRINE_ORE.asItem(), 89269),
        ENDSTONE_CITRINE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "endstone_citrine_ore"))).asItem(), 86269),
        NETHERRACK_CITRINE(ModBlocks.NETHERRACK_CITRINE_ORE.asItem(), 89269),
        GARNET((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "garnet_ore"))).asItem(), 76936),
        GOLD_CHUNKS(ModItems.GOLD_CHUNKS, 23478),
        GOLD(Blocks.GOLD_ORE.asItem(), 9436),
        TERRACOTTA_GOLD((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "terracotta_gold_ore"))).asItem(), 9436),
        JADE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "jade_ore"))).asItem(), 76823),
        LARIMAR((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "larimar_ore"))).asItem(), 23786),
        DEEPSLATE_MYTHRIL((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_mythril_ore"))).asItem(), 34729),
        MYTHRIL((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "mythril_ore"))).asItem(), 34729),
        RUBY((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "ruby_ore"))).asItem(), 40413),
        SOUL((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_soul_ore"))).asItem(), 79643),
        ZINC((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "stone_zinc_ore"))).asItem(), 41894),
        ZINC_CHUNKS(ModItems.ZINC_CHUNKS, 34053),
        BENITOITE_ORE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "benitoite_ore"))).asItem(), 37769),
        DEEPSLATE_BENITOITE_ORE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_benitoite_ore"))).asItem(), 37769),
        COBALT_ORE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_cobalt_ore"))).asItem(), 23498),
        DEEPSLATE_COBALT_ORE((Registry.BLOCK.get(new Identifier(Thommas.MOD_ID, "deepslate_cobalt_ore"))).asItem(), 23498),
        IRON_CHUNKS(ModItems.IRON_CHUNKS, 6458);

        final long energyAmount;
        final Item item;
        CrushingEnergyAmounts(Item item, long energyAmount) {
            this.item = item;
            this.energyAmount = energyAmount;
        }

        public static long getEnergyAmountFromItem(Item item) {
            for (CrushingEnergyAmounts amount: CrushingEnergyAmounts.values()) {
                if (item.equals(amount.item)) {
                    return amount.energyAmount;
                }
            }
            return 0;
        }
    }
}
