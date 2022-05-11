package net.vakror.thommas.screen;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.option.GameOptions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.Vec3d;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.config.ModConfigs;

public class ThommasScreen extends Screen {
    private final Screen parent;
    private final GameOptions settings;

    public ThommasScreen(Screen parent, GameOptions gameOptions) {
        super(new LiteralText("Thommas Mod"));
        this.parent = parent;
        this.settings = gameOptions;
    }

    LiteralText fishText() {
        if (Thommas.autofish)
            return new LiteralText("Autofish is Enabled");
        else
            return new LiteralText("Autofish is Disabled");
    }
    LiteralText flyText() {
        if (Thommas.flyhack)
            return new LiteralText("BoatFly is Enabled");
        else
            return new LiteralText("BoatFly is Disabled");
    }

    protected void init() {
        if (ModConfigs.hacks) {
            // Fish Button
            this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height / 6 + 90, 200, 20, fishText(), (button) -> {
                Thommas.autofish = !Thommas.autofish;
                button.setMessage(fishText());
            }));

            this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height / 6 + 110, 200, 20, flyText(), (button) -> {
                Thommas.flyhack = !Thommas.flyhack;
                button.setMessage(flyText());
            }));

            // Back Button
            this.addDrawableChild(new ButtonWidget(10, 30, 50, 20, ScreenTexts.BACK, (button) -> {
                this.client.setScreen(this.parent);
            }));
        }
    }
}
