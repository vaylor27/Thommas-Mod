package net.vakror.thommas.mixin;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.vakror.thommas.Thommas;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClampedEntityAttribute.class})
public class ClampedEntityAttributeMixin {
  private static boolean patchRan = false;
  
  @Mutable
  @Shadow
  @Final
  private double minValue;
  
  @Mutable
  @Shadow
  @Final
  private double maxValue;
  
  @Inject(method = {"<init>"}, at = {@At("RETURN")})
  public void patch(String translationKey, double fallback, double min, double max, CallbackInfo ci) {
    if (!patchRan) {
      Thommas.LOGGER.info("Patching Minecraft Attributes");
      patchRan = true;
    } 
    switch (translationKey) {
      case "attribute.name.generic.max_health":
      case "attribute.name.generic.movement_speed":
      case "attribute.name.generic.flying_speed":
      case "attribute.name.generic.attack_damage":
      case "attribute.name.generic.attack_knockback":
      case "attribute.name.generic.attack_speed":
      case "attribute.name.generic.armor":
      case "attribute.name.generic.armor_toughness":
      case "attribute.name.horse.jump_strength":
        this.maxValue = Double.MAX_VALUE;
        break;
      case "attribute.name.generic.luck":
        this.maxValue = Double.MAX_VALUE;
        this.minValue = Double.MIN_VALUE;
        break;
    } 
  }
}