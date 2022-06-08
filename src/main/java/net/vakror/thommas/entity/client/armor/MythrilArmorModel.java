package net.vakror.thommas.entity.client.armor;

import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.custom.MythrilArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MythrilArmorModel extends AnimatedGeoModel<MythrilArmorItem> {
    @Override
    public Identifier getModelResource(MythrilArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "geo/mythril_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(MythrilArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "textures/models/armor/mythril_armor.png");
    }

    @Override
    public Identifier getAnimationResource(MythrilArmorItem animatable) {
        return new Identifier(Thommas.MOD_ID, "animations/armor_animation.json");
    }
}
