package net.vakror.thommas.screen;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.option.GameOptions;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.config.ModConfigs;

public class ThommasScreen extends Screen {
    private final Screen parent;
    private final GameOptions settings;

    public ThommasScreen(Screen parent, GameOptions gameOptions) {
        super(Text.literal("Thommas Mod"));
        this.parent = parent;
        this.settings = gameOptions;
    }

    Text fishText() {
        if (Thommas.autofish)
            return Text.literal("Autofish is Enabled");
        else
            return Text.literal("Autofish is Disabled");
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
