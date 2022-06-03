package net.vakror.thommas.entity.client.armor;

import net.vakror.thommas.item.custom.LeadArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class LeadArmorRenderer extends GeoArmorRenderer<LeadArmorItem> {
    public LeadArmorRenderer() {
        super(new LeadArmorModel());

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
