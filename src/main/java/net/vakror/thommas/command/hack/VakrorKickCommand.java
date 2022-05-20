//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.vakror.thommas.command.hack;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.MessageArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class VakrorKickCommand {
    public VakrorKickCommand() {
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)CommandManager.literal("vakrorkick").requires((source) -> {
            return source.hasPermissionLevel(0);
        })).then(((RequiredArgumentBuilder) CommandManager.argument("targets", EntityArgumentType.players()).executes((context) -> {
            return execute((ServerCommandSource)context.getSource(), EntityArgumentType.getPlayers(context, "targets"), new TranslatableText("multiplayer.disconnect.kicked"));
        })).then(CommandManager.argument("reason", MessageArgumentType.message()).executes((context) -> {
            return execute((ServerCommandSource)context.getSource(), EntityArgumentType.getPlayers(context, "targets"), MessageArgumentType.getMessage(context, "reason"));
        }))));
    }

    private static int execute(ServerCommandSource source, Collection<ServerPlayerEntity> targets, Text reason) {
        Iterator var3 = targets.iterator();

        while(var3.hasNext()) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)var3.next();
            serverPlayerEntity.networkHandler.disconnect(reason);
        }

        return targets.size();
    }
}
