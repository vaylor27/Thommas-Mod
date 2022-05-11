package net.vakror.thommas.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.vakror.thommas.Thommas;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<MythrilBlasterScreenHandler> MYTHRIL_BLASTER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "mythril_blaster"),
                    ((syncId, playerInventory) -> {
                        return new MythrilBlasterScreenHandler(syncId, playerInventory);
                    }));

    public static ScreenHandlerType<LightningChannelerScreenHandler> LIGHTNING_CHANNELER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "lightning_channeler"),
                    ((syncId, playerInventory) -> {
                        return new LightningChannelerScreenHandler(syncId, playerInventory);
                    }));

    public static ScreenHandlerType<CombinerScreenHandler> COMBINER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "combiner"),
                    ((syncId, playerInventory) -> {
                        return new CombinerScreenHandler(syncId, playerInventory);
                    }));
}
