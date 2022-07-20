package net.vakror.thommas.screen;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ChestTypes;

public class ModScreenHandlers {

    public static ScreenHandlerType<MythrilBlasterScreenHandler> MYTHRIL_BLASTER_SCREEN_HANDLER;
    public static ScreenHandlerType<LightningChannelerScreenHandler> LIGHTNING_CHANNELER_SCREEN_HANDLER;
    public static ScreenHandlerType<CombinerScreenHandler> COMBINER_SCREEN_HANDLER;
    public static ScreenHandlerType<OrichalcumBlasterScreenHandler> ORICHALCUM_BLASTER_SCREEN_HANDLER;
    public static ScreenHandlerType<UpgraderScreenHandler> UPGRADER_SCREEN_HANDLER;
    public static ScreenHandlerType<ChestScreenHandler> COPPER_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> IRON_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> GOLD_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> DIAMOND_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> EMERALD_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> CRYSTAL_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> OBSIDIAN_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> NETHERITE_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> BIG_CRYSTAL_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> MASSIVE_CRYSTAL_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> HUMONGOUS_CRYSTAL_CHEST;
    public static ScreenHandlerType<ChestScreenHandler> SMALL_BACKPACK;

    public static void registerAllScreenHandlers() {
        MYTHRIL_BLASTER_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "mythril_blaster"),
                        MythrilBlasterScreenHandler::new);

        LIGHTNING_CHANNELER_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "lightning_channeler"),
                        LightningChannelerScreenHandler::new);

        COMBINER_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "combiner"),
                        CombinerScreenHandler::new);

         ORICHALCUM_BLASTER_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "orichalcum_blaster"),
                        OrichalcumBlasterScreenHandler::new);

         UPGRADER_SCREEN_HANDLER =
                 ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "upgrader"),
                         UpgraderScreenHandler::new);

        COPPER_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "copper_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(COPPER_CHEST, ChestTypes.COPPER, syncId, inventory, ScreenHandlerContext.EMPTY));

        IRON_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "iron_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(IRON_CHEST, ChestTypes.IRON, syncId, inventory, ScreenHandlerContext.EMPTY));

        GOLD_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "gold_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(GOLD_CHEST, ChestTypes.GOLD, syncId, inventory, ScreenHandlerContext.EMPTY));

        DIAMOND_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "diamond_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(DIAMOND_CHEST, ChestTypes.DIAMOND, syncId, inventory, ScreenHandlerContext.EMPTY));

        EMERALD_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "emerald_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(EMERALD_CHEST, ChestTypes.EMERALD, syncId, inventory, ScreenHandlerContext.EMPTY));

        CRYSTAL_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "crystal_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(CRYSTAL_CHEST, ChestTypes.CRYSTAL, syncId, inventory, ScreenHandlerContext.EMPTY));

        OBSIDIAN_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "obsidian_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(OBSIDIAN_CHEST, ChestTypes.OBSIDIAN, syncId, inventory, ScreenHandlerContext.EMPTY));

        BIG_CRYSTAL_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "big_crystal_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(BIG_CRYSTAL_CHEST, ChestTypes.BIG_CRYSTAL, syncId, inventory, ScreenHandlerContext.EMPTY));

        MASSIVE_CRYSTAL_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "massive_crystal_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(MASSIVE_CRYSTAL_CHEST, ChestTypes.MASSIVE_CRYSTAL, syncId, inventory, ScreenHandlerContext.EMPTY));

        HUMONGOUS_CRYSTAL_CHEST = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "humongous_crystal_chest"),
                         (syncId, inventory) -> new ChestScreenHandler(HUMONGOUS_CRYSTAL_CHEST, ChestTypes.HUMONGOUS_CRYSTAL, syncId, inventory, ScreenHandlerContext.EMPTY));

        SMALL_BACKPACK = ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "small_backpack"),
                         (syncId, inventory) -> new ChestScreenHandler(SMALL_BACKPACK, ChestTypes.SMALL_BACKPACK, syncId, inventory, ScreenHandlerContext.EMPTY));

    }
    
    public static void registerChestScreenHandlers() {
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(COPPER_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(IRON_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(GOLD_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(DIAMOND_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(EMERALD_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(CRYSTAL_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(OBSIDIAN_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(BIG_CRYSTAL_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(MASSIVE_CRYSTAL_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(HUMONGOUS_CRYSTAL_CHEST, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));
        ScreenRegistry.<ChestScreenHandler, CottonInventoryScreen<ChestScreenHandler>>register(SMALL_BACKPACK, (desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));

    }
}
