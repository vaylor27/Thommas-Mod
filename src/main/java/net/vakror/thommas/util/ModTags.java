package net.vakror.thommas.util;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SAPLINGS =
                createCommonTag("saplings");

        public static final TagKey<Block> SCRAP =
                createCommonTag("scrap");

        public static final TagKey<Block> FAKE_ORES =
                createCommonTag("fake_ores");

        public static final TagKey<Block> PAXEL =
                createTag("paxel");

        public static final TagKey<Block> BEE_CONTAINERS =
                createCommonTag("bee_containers");

        public static final TagKey<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");

        public static final TagKey<Block> ORICHALCUM_BLOCKS =
                createCommonTag("orichalcum_blocks");

        public static final TagKey<Block> ORICHALCUM_ORES =
                createCommonTag("orichalcum_ores");

        public static final TagKey<Block> ALL =
                createTag("all");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Thommas.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Fluids {
        public static final TagKey<Fluid> COOLANTS =
                createCommonTag("coolants");

        public static final TagKey<Fluid> FOSSIL_FUELS =
                createCommonTag("fossil_fuels");

        private static TagKey<Fluid> createTag(String name) {
            return TagKey.of(Registry.FLUID_KEY, new Identifier(Thommas.MOD_ID, name));
        }

        private static TagKey<Fluid> createCommonTag(String name) {
            return TagKey.of(Registry.FLUID_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MYTHRIL_ITEMS = createCommonTag("mythril_items");

        public static final TagKey<Item> SAPLINGS =
                createCommonTag("saplings");

        public static final TagKey<Item> OIL =
                createCommonTag("oil");

        public static final TagKey<Item> TUBE =
                createCommonTag("tubes");

        public static final TagKey<Item> CIRCUIT =
                createCommonTag("circuits");

        public static final TagKey<Item> CIRCUIT_OLD =
                createCommonTag("circuits_old");

        public static final TagKey<Item> WIRE =
                createCommonTag("wire");

        public static final TagKey<Item> SMALL_PLATE =
                createCommonTag("small_plate");

        public static final TagKey<Item> GEAR =
                createCommonTag("gear");

        public static final TagKey<Item> ORICHALCUM_INGOTS =
                createCommonTag("orichalcum_ingots");

        public static final TagKey<Item> ORICHALCUM_NUGGETS =
                createCommonTag("orichalcum_nuggets");

        public static final TagKey<Item> STICKS =
                createCommonTag("sticks");

        public static final TagKey<Item> HAMMERS =
                createCommonTag("hammers");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Thommas.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
