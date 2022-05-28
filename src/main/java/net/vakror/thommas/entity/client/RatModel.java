package net.vakror.thommas.entity.client;

import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.entity.custom.RatEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class RatModel extends AnimatedGeoModel<RatEntity> {
    @Override
    public Identifier getModelLocation(RatEntity object) {
        return new Identifier(Thommas.MOD_ID, "geo/rat.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RatEntity object) {
        return new Identifier(Thommas.MOD_ID, "textures/entity/rat/rat.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RatEntity animatable) {
        return new Identifier(Thommas.MOD_ID, "animations/rat.animation.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(RatEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
