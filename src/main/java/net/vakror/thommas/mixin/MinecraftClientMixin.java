package net.vakror.thommas.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.util.InventoryUtil;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Shadow
    private int itemUseCooldown;

    @Shadow
    @Nullable
    public ClientPlayerEntity player;

    @Inject(at = @At("HEAD"), method = "tick")
    public void tick(CallbackInfo ci) {
        if (MinecraftClient.getInstance().player != null) {
            if (InventoryUtil.hasPlayerStackInInventory(MinecraftClient.getInstance().player, ModItems.LARGE_SOULSTONE)) {
                itemUseCooldown = 0;
            }
        }
    }

}