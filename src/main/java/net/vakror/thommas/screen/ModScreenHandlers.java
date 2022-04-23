package net.vakror.thommas.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.vakror.thommas.Thommas;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<MythrilBlasterScreenHandler> MYTHRIL_BLASTER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "mythril_blaster"),
                    MythrilBlasterScreenHandler::new);

    public static ScreenHandlerType<LightningChannelerScreenHandler> LIGHTNING_CHANNELER_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Thommas.MOD_ID, "lightning_channeler"),
                    LightningChannelerScreenHandler::new);
}
