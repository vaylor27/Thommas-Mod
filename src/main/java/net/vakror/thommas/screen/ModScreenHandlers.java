package net.vakror.thommas.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.vakror.thommas.Thommas;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static ScreenHandlerType<MythrilBlasterScreenHandler> MYTHRIL_BLASTER_SCREEN_HANDLER;
    public static ScreenHandlerType<LightningChannelerScreenHandler> LIGHTNING_CHANNELER_SCREEN_HANDLER;
    public static ScreenHandlerType<CombinerScreenHandler> COMBINER_SCREEN_HANDLER;

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
    }
}
