package net.vakror.thommas.entity.client.armor;

import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.custom.OrichalcumArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OrichalcumArmorModel extends AnimatedGeoModel<OrichalcumArmorItem> {
    @Override
    public Identifier getModelLocation(OrichalcumArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "geo/orichalcum_armor.geo.json");
    }

    @Override
    public Identifier getTextureLocation(OrichalcumArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "textures/models/armor/orichalcum_armor_texture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(OrichalcumArmorItem animatable) {
        return new Identifier(Thommas.MOD_ID, "animations/armor_animation.json");
    }
}
