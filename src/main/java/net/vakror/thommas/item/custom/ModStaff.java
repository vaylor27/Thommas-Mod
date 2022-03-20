package net.vakror.thommas.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModStaff extends PickaxeItem {
    public ModStaff(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            context.getStack().addEnchantment(Enchantments.MENDING, 1);
            context.getStack().addEnchantment(Enchantments.EFFICIENCY, 5);
            context.getStack().addEnchantment(Enchantments.UNBREAKING, 3);
            int i = 0;
            while (i < 100) {
                EntityType.EXPERIENCE_BOTTLE.spawn((ServerWorld) context.getWorld(), null, null, context.getPlayer(), context.getBlockPos(), SpawnReason.TRIGGERED, true, true);
                i++;
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.world.isClient) {
            entity.kill();
        }
        return super.useOnEntity(stack, user, entity, hand);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new LiteralText("You can use " + stack.getName() + " " + (stack.getMaxDamage() - stack.getDamage()) + " times"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
