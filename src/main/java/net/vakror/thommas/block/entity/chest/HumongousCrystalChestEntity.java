package net.vakror.thommas.block.entity.chest;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ChestTypes;

import java.util.Collection;

public class HumongousCrystalChestEntity extends GenericChestEntity {

    private final DefaultedList<ItemStack> topStacks;
    private boolean inventoryTouched;

    public HumongousCrystalChestEntity(BlockPos pos, BlockState state) {
        super(ChestTypes.HUMONGOUS_CRYSTAL, pos, state);
        topStacks = DefaultedList.ofSize(12, ItemStack.EMPTY);
        inventoryTouched = true;
    }


    public void tick() {
        if (world != null && !world.isClient && this.inventoryTouched) {
            Collection<ServerPlayerEntity> viewers = PlayerLookup.tracking(this);
            PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
            buf.writeBlockPos(pos);
            getTopStacks();
            for (int i = 0; i < 12; i++) {
                buf.writeItemStack(topStacks.get(i));
            }
            viewers.forEach(player -> ServerPlayNetworking.send(player, Thommas.UPDATE_INV_PACKET_ID_HUMONGOUS, buf));
            inventoryTouched = false;
            topStacks.clear();
        }
    }
    private void getTopStacks() {
        int startIndex = 0;
        for (int i = 0; i < 12; i++) {
            DefaultedList<ItemStack> inv = getInventory();
            for (int j = startIndex; j < inv.size(); j++) {
                ItemStack stack = inv.get(j);
                if (stack.getItem() != Items.AIR) {
                    startIndex = j+1;
                    topStacks.set(i, stack);
                    if (startIndex > inv.size()) { return; }
                    break;
                }
            }
        }
    }

    private DefaultedList<ItemStack> getInventory() {
        return super.getInvStackList();
    }

    @Override
    public DefaultedList<ItemStack> getInvStackList() {
        this.inventoryTouched = true;
        return super.getInvStackList();
    }

    @Override
    public void setInvStackList(DefaultedList<ItemStack> list) {
        super.setInvStackList(list);
        this.inventoryTouched = true;
    }

    @Override
    public void onClose(PlayerEntity player) {
        super.onClose(player);
        this.inventoryTouched = true;
    }
}
