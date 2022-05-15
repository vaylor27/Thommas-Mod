package net.vakror.thommas.command.player;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.util.IEntityDataSaver;

import java.util.Random;
import java.util.UUID;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;


public class NewPlayer {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(literal("player")
                .then(literal("spawn").executes(NewPlayer::run)));
    }

    public static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        EntityType.PLAYER.spawn(context.getSource().getWorld(), null, Text.of("Steve"), player(context.getSource().getWorld(), context.getSource().getEntity().getBlockPos(), new GameProfile(UUID.randomUUID(), "4")), context.getSource().getEntity().getBlockPos(), SpawnReason.SPAWN_EGG, false, false);
        return 1;
    }

    public static PlayerEntity player(World world, BlockPos pos, GameProfile profile) {
        return new PlayerEntity(world, pos, 0, profile) {
            @Override
            public boolean isSpectator() {
                return false;
            }

            @Override
            public boolean isCreative() {
                return true;
            }
        };
    }
}