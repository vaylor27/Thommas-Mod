package net.vakror.thommas.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.util.Hand;
import net.vakror.thommas.Thommas;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(FishingBobberEntity.class)
public class AutoFishMixin {

    @Shadow private boolean caughtFish;


    @Inject(at = @At("TAIL"), method = "onTrackedDataSet")
    public void onTrackedDataSet(TrackedData<?> data, CallbackInfo ci) {

        MinecraftClient client = MinecraftClient.getInstance();

        if (caughtFish && Thommas.autofish) {
            client.interactionManager.interactItem(client.player, Hand.MAIN_HAND);
        }

    }

}
