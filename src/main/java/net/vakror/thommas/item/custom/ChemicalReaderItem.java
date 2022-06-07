package net.vakror.thommas.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.vakror.thommas.util.IEntityDataSaver;

public class ChemicalReaderItem extends Item {
    public ChemicalReaderItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        IEntityDataSaver player = (IEntityDataSaver)user;

        // not 0 means it contains SOMETHING
        int[] homepos = player.getPersistentData().getIntArray("homepos");

        if(homepos.length != 0) {
            int[] playerPos = player.getPersistentData().getIntArray("homepos");
            user.requestTeleport(playerPos[0], playerPos[1], playerPos[2]);

            user.sendSystemMessage(new LiteralText(user.getName().asString() + " Returned Hone"), null);
        }
        return super.use(world, user, hand);
    }
}
