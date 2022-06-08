package net.vakror.thommas.entity.client.armor;

import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.custom.RubyArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RubyArmorModel extends AnimatedGeoModel<RubyArmorItem> {
    @Override
    public Identifier getModelResource(RubyArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "geo/ruby.geo.json");
    }

    @Override
    public Identifier getTextureResource(RubyArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "textures/models/armor/ruby.png");
    }

    @Override
    public Identifier getAnimationResource(RubyArmorItem animatable) {
        return new Identifier(Thommas.MOD_ID, "animations/ruby.animation.json");
    }
}
