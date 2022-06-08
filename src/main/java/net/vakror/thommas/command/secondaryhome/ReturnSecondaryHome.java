package net.vakror.thommas.command.secondaryhome;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.vakror.thommas.util.IEntityDataSaverNumber2;

public class ReturnSecondaryHome {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("secondaryhome")
                .then(CommandManager.literal("return").executes(ReturnSecondaryHome::run)));
    }

    private static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        IEntityDataSaverNumber2 player = (IEntityDataSaverNumber2)context.getSource().getPlayer();

        int[] homepos = player.data().getIntArray("secondaryhomepos");

        if(homepos.length != 0) {
            int[] playerPos = player.data().getIntArray("secondaryhomepos");
            context.getSource().getPlayer().requestTeleport(playerPos[0], playerPos[1], playerPos[2]);

            context.getSource().sendFeedback(Text.literal( context.getSource().getName() + " returned home!"), true);
            return 1;
        }
        else {
            context.getSource().sendFeedback(Text.literal("No Home Position has been Set!"), true);
            return -1;
        }
    }
}
