package net.vakror.thommas.mixin;

import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.vakror.thommas.config.ModConfigs;
import net.vakror.thommas.screen.ThommasScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameMenuScreen.class)
public abstract class PauseButtonMixin extends Screen {
    protected PauseButtonMixin(Text text) {
        super(text);
    }

    @Inject(at = @At("HEAD"), method = "initWidgets")
    private void initWidgets(CallbackInfo ci) {
        if (ModConfigs.hacks) {
            this.addDrawableChild(new ButtonWidget(10, 20, 90, 20, new LiteralText("Thommas"), button -> {

                this.client.setScreen(new ThommasScreen(this, this.client.options));
            }));
        }
    }
}
