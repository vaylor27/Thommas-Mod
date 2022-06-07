package net.vakror.thommas.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.Option;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.File;

@Mixin(GameOptions.class)
public abstract class GameOptionsMixin {

    @Shadow public abstract void load();

    @Shadow public double gamma;

    @Inject(at = @At("TAIL"), method = "<init>")
    public void GameOptions(MinecraftClient client, File optionsFile, CallbackInfo ci) {
        Option.RENDER_DISTANCE.setMax(256.0F);
        Option.SIMULATION_DISTANCE.setMax(256.0F);
        gamma = 1.0D;
        this.load();
    }
}
