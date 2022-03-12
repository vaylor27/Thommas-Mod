package net.vakror.thommas.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModPaintings {

    public static final PaintingMotive MARATHON = registerPainting("marathon", new PaintingMotive(16, 16));
    public static final PaintingMotive FAMILY = registerPainting("family", new PaintingMotive(16, 32));

    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Thommas.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
        Thommas.LOGGER.info("Registering Paintings for " + Thommas.MOD_ID + "!");
    }
}
