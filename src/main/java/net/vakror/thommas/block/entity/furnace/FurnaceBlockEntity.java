package net.vakror.thommas.block.entity.furnace;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class FurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public FurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityType.FURNACE, pos, state, RecipeType.SMELTING);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.furnace");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}