package net.vakror.thommas.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModPaintings {

    public static final PaintingVariant MARATHON = registerPainting("marathon", new PaintingVariant(16, 16));
    public static final PaintingVariant FAMILY = registerPainting("family", new PaintingVariant(16, 32));
    public static final PaintingVariant PLANT = registerPainting("plant", new PaintingVariant(16, 16));
    public static final PaintingVariant SUNSET = registerPainting("sunset", new PaintingVariant(32, 16));
    public static final PaintingVariant WANDERER = registerPainting("wanderer", new PaintingVariant(16, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant PaintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(Thommas.MOD_ID, name), PaintingVariant);
    }

    public static void registerPaintings() {
        Thommas.LOGGER.info("Registering Paintings for " + Thommas.MOD_ID + "!");
    }
}
