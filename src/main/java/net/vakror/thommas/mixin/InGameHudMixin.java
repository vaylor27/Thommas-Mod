package net.vakror.thommas.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.vakror.thommas.Thommas;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.client.gui.DrawableHelper.GUI_ICONS_TEXTURE;
import static net.minecraft.client.gui.DrawableHelper.drawTexture;

@Mixin(InGameHud.class) public abstract class InGameHudMixin
{
	@Shadow
	private int scaledHeight;

	@Shadow
	private int scaledWidth;

	@Shadow
	@Final
	private MinecraftClient client;

	@Shadow
	private int renderHealthValue;

	@Shadow
	protected abstract PlayerEntity getCameraPlayer();

	@Inject(method = {"renderStatusBars"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameHud;renderHealthBar(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/entity/player/PlayerEntity;IIIIFIIIZ)V")})
	public void toughnessOverlay(MatrixStack matrices, CallbackInfo ci) {
		if (!Thommas.CONFIG.renderToughnessBar)
			return;
		RenderSystem.setShaderTexture(0, new Identifier(Thommas.MOD_ID,"textures/toughness.png"));
		PlayerEntity playerEntity = getCameraPlayer();
		if (playerEntity != null) {
			int i = MathHelper.ceil(playerEntity.getHealth());
			int j = this.renderHealthValue;
			int m = this.scaledHeight / 2 - 91;
			int o = this.scaledHeight - 39;
			float f = Math.max((float)playerEntity.getAttributeValue(EntityAttributes.GENERIC_MAX_HEALTH), Math.max(j, i));
			int p = MathHelper.ceil(playerEntity.getAbsorptionAmount());
			int q = MathHelper.ceil((f + p) / 2.0F / 10.0F);
			int r = Math.max(10 - q - 2, 3);
			int s = o - (q - 1) * r - 10;
			int toughness = MathHelper.floor(playerEntity.getAttributeValue(EntityAttributes.GENERIC_ARMOR_TOUGHNESS));
			this.client.getProfiler().push("toughness");
			for (int w = 0; w < 10; w++) {
				if (toughness > 0) {
					int x = m + w * 8;
					if (w * 2 + 1 < toughness)
						drawTexture(matrices, x, s, 0.0F, 9.0F, 9, 9, 9, 18);
					if (w * 2 + 1 == toughness)
						drawTexture(matrices, x, s, 0.0F, 0.0F, 9, 9, 9, 18);
				}
			}
			this.client.getProfiler().pop();
			RenderSystem.disableBlend();
		}
		RenderSystem.setShaderTexture(0, GUI_ICONS_TEXTURE);
	}

}
