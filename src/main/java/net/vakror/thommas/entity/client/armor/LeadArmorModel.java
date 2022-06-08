package net.vakror.thommas.entity.client.armor;

import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.custom.LeadArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LeadArmorModel extends AnimatedGeoModel<LeadArmorItem> {
    @Override
    public Identifier getModelResource(LeadArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "geo/lead_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(LeadArmorItem object) {
        return new Identifier(Thommas.MOD_ID, "textures/models/armor/lead_armor.png");
    }

    @Override
    public Identifier getAnimationResource(LeadArmorItem animatable) {
        return new Identifier(Thommas.MOD_ID, "animations/armor_animation.json");
    }
}
