package net.vakror.thommas.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.item.inventory.ImplementedInventory;
import org.jetbrains.annotations.Nullable;

public class PedestalBlockEntity extends BlockEntity implements ImplementedInventory {
    public DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);
    private float rotation = 0f;

    public PedestalBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.PEDESTAL, pWorldPosition, pBlockState);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    public void addRotation(float value) {
        rotation += value;
        if (rotation > 360) {
            rotation -= 360;
        }
        if (rotation < 0){
            rotation += 360;
        }
    }

    public float getRotation() {
        return rotation;
    }

    @Override
    protected void writeNbt(NbtCompound tag) {
        Inventories.writeNbt(tag, inventory);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        this.inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);
        Inventories.readNbt(nbt, inventory);
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        NbtCompound compound = createNbt();
        readNbt(compound);

        return compound;
    }
}