package net.vakror.thommas.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.EnchantmentScreenHandler;
import net.minecraft.screen.StonecutterScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.item.custom.RedHotMetal;

import java.util.Objects;

public class ShapingAnvilScreen extends HandledScreen<ShapingAnvilScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(Thommas.MOD_ID, "textures/gui/shaping_anvil_gui.png");

    public ShapingAnvilScreen(ShapingAnvilScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);

    }

    @Override
    protected void init() {
        super.init();
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY) {
        this.addDrawableChild(new ButtonWidget(x + 30, y + 18, 50, 15, Text.literal("Axe"), (button) -> {
            this.handler.entity.craftAxeHead();
        }));
        this.addDrawableChild(new ButtonWidget(x + 30, y + 38, 50, 15, Text.literal("Sword"), (button) -> {
            this.handler.entity.craftSwordBlade();
        }));
        this.addDrawableChild(new ButtonWidget(x + 30, y + 58, 50, 15, Text.literal("Pickaxe"), (button) -> {
            this.handler.entity.craftPickAxeHead();
        }));
        this.addDrawableChild(new ButtonWidget(x + 90, y + 18, 50, 15, Text.literal("Hoe"), (button) -> {
            this.handler.entity.craftHoeHead();
        }));
        this.addDrawableChild(new ButtonWidget(x + 90, y + 38, 50, 15, Text.literal("Shovel"), (button) -> {
            this.handler.entity.craftShovelHead();
        }));
        if (this.handler.entity.getStack(0).getCount() >= 3 && this.handler.entity.getStack(1).isEmpty()) {
            if ((this.handler.entity.getStack(0).getItem()) instanceof RedHotMetal metal) {
                if (this.handler.entity.getAxeHeadCraft()) {
                    this.itemRenderer.renderGuiItemIcon(new ItemStack(metal.getAxeHeadItem()), x + 20, y + 10);
                }
                if (this.handler.entity.getPickAxeHeadCraft()) {
                    this.itemRenderer.renderGuiItemIcon(new ItemStack(metal.getPickAxeHeadItem()), x + 20, y + 10);
                }
                if (this.handler.entity.getSwordBladeCraft()) {
                    this.itemRenderer.renderGuiItemIcon(new ItemStack(metal.getSwordBladeItem()), x + 20, y + 10);
                }
                if (this.handler.entity.getHoeHeadCraft()) {
                    this.itemRenderer.renderGuiItemIcon(new ItemStack(metal.getHoeHeadItem()), x + 20, y + 10);
                }
                if (this.handler.entity.getShovelHeadCraft()) {
                    this.itemRenderer.renderGuiItemIcon(new ItemStack(metal.getShovelHeadItem()), x + 20, y + 10);
                }
            }
        }
        super.drawForeground(matrices, mouseX, mouseY);
    }

    @Override
    public ShapingAnvilScreenHandler getScreenHandler() {
        return super.getScreenHandler();
    }
}
