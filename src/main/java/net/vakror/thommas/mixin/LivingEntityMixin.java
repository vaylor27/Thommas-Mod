package net.vakror.thommas.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.util.MixinUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("HEAD"), method = "jump", cancellable = true)
    private void jump(CallbackInfo info) {
        if (!Thommas.CONFIG.isPlayerOnly || this.getClass().equals(ServerPlayerEntity.class)) {
            // `isPlayerOnly`: false -> all entities can teleport
            // `isPlayerOnly`: true -> only player entities can teleport
            MixinUtil.teleportUp(world, getBlockPos(), getBoundingBox(), (Double y) -> {
                if (world instanceof ServerWorld) {
                    refreshPositionAfterTeleport(getX(), y, getZ());
                } else {
                    teleport(getX(), y, getZ());
                }
                return null;
            });
        }
    }
}