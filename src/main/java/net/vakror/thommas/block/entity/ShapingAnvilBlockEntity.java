package net.vakror.thommas.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.item.custom.RedHotMetal;
import net.vakror.thommas.item.inventory.ImplementedInventory;
import net.vakror.thommas.screen.ShapingAnvilScreenHandler;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ShapingAnvilBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(3, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    static int tickNum;

    public ShapingAnvilBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SHAPING_ANVIL_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Shaping Anvil");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ShapingAnvilScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, ShapingAnvilBlockEntity entity) {
        if (entity.inventory.get(1).getItem() instanceof RedHotMetal) {
            if (tickNum == 200) {
                world.playSound(Double.parseDouble(String.valueOf(pos.getX())), Double.parseDouble(String.valueOf(pos.getY())), Double.parseDouble(String.valueOf(pos.getZ())), SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS, 10F, 1F, true);
            }
        }
    }
}
