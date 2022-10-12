package net.vakror.thommas.screen.button;

import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ChooseEnergyOutputButton extends TexturedButtonWidget {
    public ChooseEnergyOutputButton(int x, int y, int width, int height, int textureFileX, int textureFileY, Identifier texture, PressAction pressAction) {
        super(x, y, width, height, textureFileX, textureFileY, texture, pressAction);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);
    }
}
