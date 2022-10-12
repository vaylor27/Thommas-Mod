package net.vakror.thommas.block.entity.machine;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.base.SingleVariantStorage;
import net.fabricmc.fabric.api.transfer.v1.transaction.Transaction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.block.custom.GemInfusingStationBlock;
import net.vakror.thommas.block.entity.ModBlockEntities;
import net.vakror.thommas.fluid.ModFluids;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.item.inventory.ImplementedInventory;
import net.vakror.thommas.mixin.BucketItemAccessor;
import net.vakror.thommas.mixin.EnergyAccessor;
import net.vakror.thommas.networking.ModMessages;
import net.vakror.thommas.recipe.GemInfusingRecipe;
import net.vakror.thommas.screen.GemInfusingScreenHandler;
import net.vakror.thommas.util.EnergyAmountsUtil;
import net.vakror.thommas.util.FluidStack;
import org.jetbrains.annotations.Nullable;
import team.reborn.energy.api.base.SimpleEnergyStorage;

import java.util.Optional;

import static net.vakror.thommas.block.entity.machine.GemInfusingBlockEntity.FluidAmountMultipliers.*;

public abstract class ThommasMachineBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory {
    public ThommasMachineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public final SingleVariantStorage<FluidVariant> fluidStorage = new SingleVariantStorage<FluidVariant>() {
        /**
         * Return the blank variant.
         */
        @Override
        protected FluidVariant getBlankVariant() {
            return FluidVariant.blank();
        }

        /**
         * Return the maximum capacity of this storage for the passed transfer variant.
         * If the passed variant is blank, an estimate should be returned.
         *
         * @param variant
         */
        @Override
        protected long getCapacity(FluidVariant variant) {
            return FluidStack.convertDropletsToMb(FluidConstants.BUCKET);
        }
    };

    public void setEnergyLevel(long energyLevel) {

    }

    public void setFluidLevel(FluidVariant fluidVariant, long fluidLevel) {

    }
}
