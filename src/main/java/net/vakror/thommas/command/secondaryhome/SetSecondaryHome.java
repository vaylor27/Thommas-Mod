package net.vakror.thommas.command.secondaryhome;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.util.IEntityDataSaverNumber2;

public class SetSecondaryHome {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("secondaryhome")
                .then(CommandManager.literal("set").executes(SetSecondaryHome::run)));
    }

    public static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        IEntityDataSaverNumber2 player = (IEntityDataSaverNumber2)context.getSource().getPlayer();
        BlockPos playerPos = context.getSource().getPlayer().getBlockPos();
        String pos = "(" + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ() + ")";

        player.data().putIntArray("secondaryhomepos",
                new int[] {playerPos.getX(), playerPos.getY(), playerPos.getZ() });

        context.getSource().sendFeedback(Text.literal("Set Secondary Home at " + pos), true);
        return 1;
    }
}
