package net.vakror.thommas.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;

import java.util.concurrent.atomic.AtomicInteger;

public class ModItemGroup {
    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "blocks"),
            () -> new ItemStack(ModBlocks.MYTHRIL_BLOCK));

    public static final ItemGroup ORES = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "ores"),
            () -> new ItemStack(ModBlocks.DEEPSLATE_CITRINE_ORE));

    public static final ItemGroup ITEMS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "items"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));

    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "tools"),
            () -> new ItemStack(ModItems.MYTHRIL_SWORD));

    public static final ItemGroup SPECIAL_ITEMS = ( FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "special_items"),
            () -> new ItemStack(ModItems.DATA_TABLET)));

    public static final ItemGroup SPECIAL_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "special_blocks"),
            () -> new ItemStack(ModBlocks.SPEEDY_BLOCK));

    public static final ItemGroup NATURE = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "crops"),
            () -> new ItemStack(ModItems.PEPPER));

    public static final ItemGroup BRICKS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "bricks"),
            () -> new ItemStack(ModBlocks.BRICK_MIXED));

    public static final ItemGroup LAMPS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "lamps"),
            () -> new ItemStack(ModBlocks.MYTHRIL_LAMP));

    public static final ItemGroup ARTIFACTS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "artifacts"),
            () -> new ItemStack(ModItems.MAGIC_GEM));

    public static final ItemGroup COINS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "coins"),
            () -> new ItemStack(ModItems.ALUMINUM_COIN));

    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "materials"),
            () -> new ItemStack(ModItems.CITRINE));

    public static final ItemGroup ELECTRONICS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "electronics"),
            () -> new ItemStack(ModItems.BATTERY_COMPONENTS));

    public static final ItemGroup DROPS = FabricItemGroupBuilder.build(new Identifier(Thommas.MOD_ID, "drops"),
            () -> new ItemStack(ModItems.LLAMA_HIDE));


	public static final ItemGroup EVERYTHING = FabricItemGroupBuilder.create(new Identifier(Thommas.MOD_ID, "all")).appendItems(itemStacks -> Registry.ITEM.forEach(item -> {
        if(Registry.ITEM.getId(item).getNamespace().equals(Thommas.MOD_ID)){
            itemStacks.add(new ItemStack(item));
        }
    })).icon(() -> new ItemStack(Items.RECOVERY_COMPASS)).build();

    public static void printNumberOfItems(String mod_id) {
        AtomicInteger e = new AtomicInteger();
        AtomicInteger b = new AtomicInteger();
        AtomicInteger a = new AtomicInteger();
        Registry.ITEM.forEach(item -> {
            if (Registry.ITEM.getId(item).getNamespace().equals(mod_id) && !(item instanceof BlockItem)) {
                e.getAndIncrement();
            }
        });
        Registry.ITEM.forEach(item -> {
            if (Registry.ITEM.getId(item).getNamespace().equals(mod_id)) {
                b.getAndIncrement();
            }
        });

        Registry.BLOCK.forEach(block -> {
            if (Registry.BLOCK.getId(block).getNamespace().equals(mod_id)) {
                a.getAndIncrement();
            }
        });
        Thommas.LOGGER.info("Number of Items (Including BlockItems) for \"" + Thommas.MOD_ID + "\": " + b.get());
        Thommas.LOGGER.info("Number of Items (Not Including BlockItems) for \"" + Thommas.MOD_ID + "\": " + e.get());
        Thommas.LOGGER.info("Number of BlockItems for \"" + Thommas.MOD_ID + "\": " + (b.get() - e.get()));
        Thommas.LOGGER.info("Number of Blocks for \"" + Thommas.MOD_ID + "\": " + a.get());
    }
}
