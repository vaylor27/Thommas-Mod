package net.vakror.thommas.entity.client.armor;

import net.vakror.thommas.blockitem.custom.item.RubyArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class RubyArmorRenderer extends GeoArmorRenderer<RubyArmorItem> {
    public RubyArmorRenderer() {
        super(new RubyArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
