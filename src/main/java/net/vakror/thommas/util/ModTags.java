package net.vakror.thommas.util;

import net.vakror.thommas.Thommas;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SAPLINGS =
                createCommonTag("saplings");

        public static final TagKey<Block> SCRAP =
                createCommonTag("scrap");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Thommas.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MYTHRIL_ITEMS = createCommonTag("mythril_items");

        public static final TagKey<Item> SAPLINGS =
                createCommonTag("saplings");

        public static final TagKey<Item> SCRAP =
                createCommonTag("scrap");

        public static final TagKey<Item> OIL =
                createCommonTag("oil");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Thommas.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
