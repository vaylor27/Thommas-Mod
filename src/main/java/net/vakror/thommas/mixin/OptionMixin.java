package net.vakror.thommas.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.DoubleOption;
import net.minecraft.client.option.Option;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Option.class)
public abstract class OptionMixin {

    @Shadow protected abstract Text getDisplayPrefix();

    @Shadow @Final private Text key;

    @Shadow protected abstract Text getGenericLabel(int value);

    @Shadow public static DoubleOption GAMMA = new DoubleOption("options.gamma", 0.0D, 5.0D, 0.0F, (gameOptions) -> {
        return gameOptions.gamma;
    }, (gameOptions, gamma) -> {
        gameOptions.gamma = gamma;
    }, (gameOptions, option) -> {
        double d = option.getRatio(option.get(gameOptions));
        int i = (int)(d * 500.0D);
        if (i == 0) {
            return new LiteralText(new TranslatableText("options.gamma").getString() + ": " +new TranslatableText("options.gamma.min").getString());
        } else if (i == 100) {
            return new LiteralText(new TranslatableText("options.gamma").getString() + ": " + new TranslatableText("options.gamma.default").getString());
        } else {
            return i == 500 ? new LiteralText(new TranslatableText("options.gamma").getString() + ": " +new TranslatableText("options.gamma.max").getString()) : new LiteralText(new TranslatableText("options.gamma").getString() + ": " + i);
        }
    });

    @Shadow public static final DoubleOption FOV = new DoubleOption("options.fov", 3.0D, 150.0D, 1.0F, (gameOptions) -> {
        return gameOptions.fov;
    }, (gameOptions, fov) -> {
        gameOptions.fov = fov;
        MinecraftClient.getInstance().worldRenderer.scheduleTerrainUpdate();
    }, (gameOptions, option) -> {
        double d = option.get(gameOptions);
        if (d == 100.0D) {
            return new LiteralText(new TranslatableText("options.fov").getString() + ": " + new TranslatableText("options.fov.min").getString());
        } else {
            return d == option.getMax() ? new LiteralText(new TranslatableText("options.fov").getString() + ": " + new TranslatableText("options.fov.max").getString()) : new LiteralText(new TranslatableText("options.fov").getString() + ": " + (int) d);
        }
    });
}
