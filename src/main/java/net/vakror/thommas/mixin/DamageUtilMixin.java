package net.vakror.thommas.mixin;

import net.minecraft.entity.DamageUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({DamageUtil.class})
public class DamageUtilMixin {
  @Inject(method = {"getDamageLeft"}, at = {@At("HEAD")}, cancellable = true)
  private static void betterDamage(float damage, float armor, float armorToughness, CallbackInfoReturnable<Float> cir) {
    if (armor > 20.0F) {
      float f = 2.0F + armorToughness / 4.0F;
      float g = Math.max(armor - damage / f, armor * 0.2F);
      float extraArmor = g - 20.0F;
      float percent = (extraArmor <= 0.0F) ? 1.0F : (float)Math.pow(0.95D, extraArmor);
      cir.setReturnValue(Float.valueOf(damage * percent * 0.2F));
    } 
  }
  
  @Inject(method = {"getInflictedDamage"}, at = {@At("HEAD")}, cancellable = true)
  private static void betterProt(float damageDealt, float protection, CallbackInfoReturnable<Float> cir) {
    if (protection > 20.0F) {
      float baseMult = 0.2F;
      float additionalMult = (float)Math.pow(0.95D, (protection - 20.0F));
      cir.setReturnValue(Float.valueOf(damageDealt * baseMult * additionalMult));
    } 
  }
}