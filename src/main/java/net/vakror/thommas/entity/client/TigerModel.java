package net.vakror.thommas.entity.client;

import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.entity.custom.TigerEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TigerModel extends AnimatedGeoModel<TigerEntity> {
    @Override
    public Identifier getModelLocation(TigerEntity entity) {
        return new Identifier(Thommas.MOD_ID, "geo/tiger.geo.json");
    }

    @Override
    public Identifier getTextureLocation(TigerEntity entity) {
        return new Identifier(Thommas.MOD_ID, "textures/entity/tiger/tiger.png");
    }

    @Override
    public Identifier getAnimationFileLocation(TigerEntity entity) {
        return new Identifier(Thommas.MOD_ID, "animations/tiger.animation.json");
    }
}