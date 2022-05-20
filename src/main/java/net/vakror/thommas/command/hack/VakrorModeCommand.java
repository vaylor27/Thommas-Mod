//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.vakror.thommas.command.hack;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Util;
import net.minecraft.world.GameMode;
import net.minecraft.world.GameRules;

public class VakrorModeCommand {
    public static final int field_33393 = 2;

    public VakrorModeCommand() {
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        LiteralArgumentBuilder<ServerCommandSource> literalArgumentBuilder = (LiteralArgumentBuilder) CommandManager.literal("vakrorgamemode").requires((source) -> {
            return source.hasPermissionLevel(0);
        });
        GameMode[] var2 = GameMode.values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            GameMode gameMode = var2[var4];
            literalArgumentBuilder.then(((LiteralArgumentBuilder)CommandManager.literal(gameMode.getName()).executes((context) -> {
                return execute(context, Collections.singleton(((ServerCommandSource)context.getSource()).getPlayer()), gameMode);
            })).then(CommandManager.argument("target", EntityArgumentType.players()).executes((context) -> {
                return execute(context, EntityArgumentType.getPlayers(context, "target"), gameMode);
            })));
        }

        dispatcher.register(literalArgumentBuilder);
    }

    private static void sendFeedback(ServerCommandSource source, ServerPlayerEntity player, GameMode gameMode) {
        Text text = new TranslatableText("gameMode." + gameMode.getName());
        if (source.getEntity() == player) {
        } else {
            if (source.getWorld().getGameRules().getBoolean(GameRules.SEND_COMMAND_FEEDBACK)) {
            }
        }

    }

    private static int execute(CommandContext<ServerCommandSource> context, Collection<ServerPlayerEntity> targets, GameMode gameMode) {
        int i = 0;
        Iterator var4 = targets.iterator();

        while(var4.hasNext()) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)var4.next();
            if (serverPlayerEntity.changeGameMode(gameMode)) {
                ++i;
            }
        }

        return i;
    }
}
