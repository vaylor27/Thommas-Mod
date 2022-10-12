package net.vakror.thommas.mixin;

import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import team.reborn.energy.api.base.SimpleEnergyStorage;

@Mixin(WItemSlot.class)
public interface InsertAccessor {
    @Mutable
    @Accessor("insertingAllowed")
    public void setInsertingAllowed(boolean insertingAllowed);

}
