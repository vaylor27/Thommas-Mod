package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.sound.ModSounds;
import net.vakror.thommas.util.IEntityDataSaver;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DataTabletItem extends Item {
    public DataTabletItem(Settings settings) {
        super(settings);
    }

    public static IEntityDataSaver user;
    public static int[] homepos;
    public static PlayerEntity player;

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        user = (IEntityDataSaver) context.getPlayer();
        player = context.getPlayer();
        assert user != null;
        homepos = user.getPersistentData().getIntArray("homepos");
        addNbtToDataTablet(context.getStack(), context.getWorld(), context.getBlockPos(), context.getPlayer());
        return super.useOnBlock(context);
    }

    private void addNbtToDataTablet(ItemStack stack, World world,BlockPos pos, PlayerEntity player) {
        ItemStack dataTablet = stack;

        NbtCompound nbtData = new NbtCompound();
        if (homepos.length != 0) {
            nbtData.putString("thommas.homeposplayer", "Your Homepos is (" + homepos[0] + ", " + homepos[1] + ", " + homepos[2]);
            dataTablet.setNbt(nbtData);
            world.playSound(player, pos, ModSounds.DATA_TABLET_RECORDED_HOMEPOS, SoundCategory.BLOCKS, 1, 1);
            player.sendSystemMessage(new LiteralText("Your home position has been recorded"), Util.NIL_UUID);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            if (stack.hasNbt()) {
                String homeposOfPlayer = stack.getNbt().getString("thommas.homeposplayer");
                tooltip.add(new LiteralText(homeposOfPlayer));
        }
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return stack.hasNbt();
    }
}