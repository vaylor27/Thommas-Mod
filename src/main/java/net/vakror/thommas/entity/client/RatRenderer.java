package net.vakror.thommas.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.entity.custom.RatEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RatRenderer extends GeoEntityRenderer<RatEntity> {
    public RatRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RatModel());
    }

    @Override
    public Identifier getTextureResource(RatEntity instance) {
        return new Identifier(Thommas.MOD_ID, "textures/entity/rat/rat.png");
    }
}
