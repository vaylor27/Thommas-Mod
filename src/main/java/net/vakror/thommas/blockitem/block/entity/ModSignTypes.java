package net.vakror.thommas.blockitem.block.entity;

import net.minecraft.util.SignType;
import net.vakror.thommas.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType JACARANDA =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("jacaranda"));
}
