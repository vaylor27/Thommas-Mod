package net.vakror.thommas.screen;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ScreenTexts;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.option.GameOptions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameMode;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.config.ModConfigs;

import java.util.Objects;
import java.util.UUID;

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
            return new LiteralText("Creative");
        else
            return new LiteralText("Not Creative");
    }

    protected void init() {
        if (ModConfigs.hacks) {
            // Fish Button
            this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height / 6 + 90, 200, 20, fishText(), (button) -> {
                Thommas.autofish = !Thommas.autofish;
                button.setMessage(fishText());
            }));

            // Back Button
            this.addDrawableChild(new ButtonWidget(10, 30, 50, 20, ScreenTexts.BACK, (button) -> {
                this.client.setScreen(this.parent);
            }));
        }
    }
}
