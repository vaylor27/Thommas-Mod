package net.vakror.thommas.entity.client.armor;

import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.blockitem.custom.item.RubyArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RubyArmorModel extends AnimatedGeoModel<RubyArmorItem> {
    @Override
    public Identifier getModelLocation(RubyArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "geo/ruby.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RubyArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "textures/models/armor/ruby.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RubyArmorItem animatable) {
        return new Identifier(Thommas.MOD_ID, "animations/ruby.animation.json");
    }
}
