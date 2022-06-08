package net.vakror.thommas.mixin;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.util.MixinUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SlimeEntity.class)
public abstract class SlimeEntityMixin extends Entity {
    public SlimeEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("HEAD"), method = "jump", cancellable = true)
    private void jump(CallbackInfo info) {
        if (!Thommas.CONFIG.isPlayerOnly) {
            // `isPlayerOnly`: false -> Slime entities can also teleport
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
