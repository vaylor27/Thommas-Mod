package net.vakror.thommas.command.secondaryhome;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.util.IEntityDataSaver;

public class SetSecondaryHome {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("secondaryhome")
                .then(CommandManager.literal("set").executes(SetSecondaryHome::run)));
    }

    public static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        IEntityDataSaver player = (IEntityDataSaver)context.getSource().getPlayer();
        BlockPos playerPos = context.getSource().getPlayer().getBlockPos();
        String pos = "(" + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ() + ")";

        player.getPersistentData().putIntArray("secondaryhome",
                new int[] {playerPos.getX(), playerPos.getY(), playerPos.getZ() });

        context.getSource().sendFeedback(new LiteralText("Set Secondary Home at " + pos), true);
        return 1;
    }
}
