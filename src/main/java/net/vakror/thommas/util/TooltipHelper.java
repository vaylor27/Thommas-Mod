package net.vakror.thommas.util;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.item.TooltipData;
import net.minecraft.client.render.*;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.Matrix4f;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static net.minecraft.client.gui.DrawableHelper.*;

public class TooltipHelper {


    public static void renderTooltip(MatrixStack matrices, List<Text> lines, Optional<TooltipData> data, int x, int y) {
        List<TooltipComponent> list = (List)lines.stream().map(Text::asOrderedText).map(TooltipComponent::of).collect(Collectors.toList());
        data.ifPresent((datax) -> {
            list.add(1, TooltipComponent.of(datax));
        });
        renderTooltipFromComponents(matrices, list, x, y);
    }
    
    protected static TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
    protected static int width;

    {
        assert MinecraftClient.getInstance().currentScreen != null;
        width = MinecraftClient.getInstance().currentScreen.width;
    }

    protected static int height = MinecraftClient.getInstance().currentScreen.height;
    protected static ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
    
    private static void renderTooltipFromComponents(MatrixStack matrices, List<TooltipComponent> components, int x, int y) {
        if (!components.isEmpty()) {
            int i = 0;
            int j = components.size() == 1 ? -2 : 0;

            TooltipComponent tooltipComponent;
            for(Iterator var7 = components.iterator(); var7.hasNext(); j += tooltipComponent.getHeight()) {
                tooltipComponent = (TooltipComponent)var7.next();
                int k = tooltipComponent.getWidth(textRenderer);
                if (k > i) {
                    i = k;
                }
            }

            int l = x + 12;
            int m = y - 12;
            if (l + i > width) {
                l -= 28 + i;
            }

            if (m + j + 6 > height) {
                m = height - j - 6;
            }

            matrices.push();
            int o = -267386864;
            int p = 1347420415;
            int q = 1344798847;
            int r = 1344798847;
            float f = itemRenderer.zOffset;
            itemRenderer.zOffset = 400.0F;
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferBuilder = tessellator.getBuffer();
            RenderSystem.setShader(GameRenderer::getPositionColorShader);
            bufferBuilder.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            Matrix4f matrix4f = matrices.peek().getPositionMatrix();
            fillGradient(matrix4f, bufferBuilder, l - 3, m - 4, l + i + 3, m - 3, 400, -267386864, -267386864);
            fillGradient(matrix4f, bufferBuilder, l - 3, m + j + 3, l + i + 3, m + j + 4, 400, -267386864, -267386864);
            fillGradient(matrix4f, bufferBuilder, l - 3, m - 3, l + i + 3, m + j + 3, 400, -267386864, -267386864);
            fillGradient(matrix4f, bufferBuilder, l - 4, m - 3, l - 3, m + j + 3, 400, -267386864, -267386864);
            fillGradient(matrix4f, bufferBuilder, l + i + 3, m - 3, l + i + 4, m + j + 3, 400, -267386864, -267386864);
            fillGradient(matrix4f, bufferBuilder, l - 3, m - 3 + 1, l - 3 + 1, m + j + 3 - 1, 400, 1347420415, 1344798847);
            fillGradient(matrix4f, bufferBuilder, l + i + 2, m - 3 + 1, l + i + 3, m + j + 3 - 1, 400, 1347420415, 1344798847);
            fillGradient(matrix4f, bufferBuilder, l - 3, m - 3, l + i + 3, m - 3 + 1, 400, 1347420415, 1347420415);
            fillGradient(matrix4f, bufferBuilder, l - 3, m + j + 2, l + i + 3, m + j + 3, 400, 1344798847, 1344798847);
            RenderSystem.enableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            BufferRenderer.drawWithShader(bufferBuilder.end());
            RenderSystem.disableBlend();
            RenderSystem.enableTexture();
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate(Tessellator.getInstance().getBuffer());
            matrices.translate(0.0, 0.0, 400.0);
            int s = m;

            int t;
            TooltipComponent tooltipComponent2;
            for(t = 0; t < components.size(); ++t) {
                tooltipComponent2 = (TooltipComponent)components.get(t);
                tooltipComponent2.drawText(textRenderer, l, s, matrix4f, immediate);
                s += tooltipComponent2.getHeight() + (t == 0 ? 2 : 0);
            }

            immediate.draw();
            matrices.pop();
            s = m;

            for(t = 0; t < components.size(); ++t) {
                tooltipComponent2 = (TooltipComponent)components.get(t);
                tooltipComponent2.drawItems(textRenderer, l, s, matrices, itemRenderer, 400);
                s += tooltipComponent2.getHeight() + (t == 0 ? 2 : 0);
            }

            itemRenderer.zOffset = f;
        }
    }

    protected void fillGradient(MatrixStack matrices, int startX, int startY, int endX, int endY, int colorStart, int colorEnd) {
        fillGradient(matrices, startX, startY, endX, endY, colorStart, colorEnd, (int) itemRenderer.zOffset);
    }

    protected static void fillGradient(MatrixStack matrices, int startX, int startY, int endX, int endY, int colorStart, int colorEnd, int z) {
        RenderSystem.disableTexture();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader(GameRenderer::getPositionColorShader);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        fillGradient(matrices.peek().getPositionMatrix(), bufferBuilder, startX, startY, endX, endY, z, colorStart, colorEnd);
        tessellator.draw();
        RenderSystem.disableBlend();
        RenderSystem.enableTexture();
    }

    protected static void fillGradient(Matrix4f matrix, BufferBuilder builder, int startX, int startY, int endX, int endY, int z, int colorStart, int colorEnd) {
        float f = (float)(colorStart >> 24 & 255) / 255.0F;
        float g = (float)(colorStart >> 16 & 255) / 255.0F;
        float h = (float)(colorStart >> 8 & 255) / 255.0F;
        float i = (float)(colorStart & 255) / 255.0F;
        float j = (float)(colorEnd >> 24 & 255) / 255.0F;
        float k = (float)(colorEnd >> 16 & 255) / 255.0F;
        float l = (float)(colorEnd >> 8 & 255) / 255.0F;
        float m = (float)(colorEnd & 255) / 255.0F;
        builder.vertex(matrix, (float)endX, (float)startY, (float)z).color(g, h, i, f).next();
        builder.vertex(matrix, (float)startX, (float)startY, (float)z).color(g, h, i, f).next();
        builder.vertex(matrix, (float)startX, (float)endY, (float)z).color(k, l, m, j).next();
        builder.vertex(matrix, (float)endX, (float)endY, (float)z).color(k, l, m, j).next();
    }
}
