package net.vakror.thommas.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.custom.DowsingRodItem;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL_ITEMS)));

    public static final Item ROD_OF_FINDING = registerItem("rod_of_finding",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS)));

    public static final Item CORRUPTED_DUST = registerItem("corrupted_dust",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.SPECIAL_ITEMS).maxDamage(16)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Thommas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Thommas.LOGGER.info("Registering Mod Items for " + Thommas.MOD_ID + "!");
    }
}
