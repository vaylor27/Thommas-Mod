package net.vakror.thommas.mixin;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import team.reborn.energy.api.base.SimpleEnergyStorage;

@Mixin(SimpleEnergyStorage.class)
public interface EnergyAccessor {
    @Mutable
    @Accessor("capacity")
    public void setCapacity(long capacity);

    @Mutable
    @Accessor("maxInsert")
    public void setMaxInsert(long maxInsert);

    @Mutable
    @Accessor("maxExtract")
    public void setMaxExtract(long maxExtract);

}
