package net.vakror.thommas.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.vakror.thommas.util.IEntityDataSaver;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DataTabletItem extends Item {
    public DataTabletItem(Settings settings) {
        super(settings);
    }

    public static IEntityDataSaver user;
    public static int[] homepos;

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        user = (IEntityDataSaver) context.getPlayer();
        assert user != null;
        homepos = user.getPersistentData().getIntArray("homepos");
        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (!Screen.hasShiftDown()) {
            tooltip.add(new LiteralText("Hold §eSHIFT§r for more Information!"));
        }
        if (Screen.hasShiftDown()) {
            if (user != null) {
                if (Screen.hasShiftDown()) {
                    if (homepos.length != 0) {
                        tooltip.add(new LiteralText("Your Home Position is (" + homepos[0] + ", " + homepos[1] + ", " + homepos[2] + ")!"));
                    } else {
                        tooltip.add(new LiteralText("You have no Home Position! :( use \"/home set\" to set it here! Right click on a block again after that!"));
                    }
                    super.appendTooltip(stack, world, tooltip, context);
                }
            } else {
                tooltip.add(new LiteralText("Use \"home set\" to set a home pos. Then right click this on a block"));
            }
        }

    }
}
