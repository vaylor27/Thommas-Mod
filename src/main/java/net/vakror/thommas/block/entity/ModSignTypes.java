package net.vakror.thommas.block.entity;

import net.minecraft.util.SignType;
import net.vakror.thommas.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType JACARANDA =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("jacaranda"));

    public static final SignType CHERRY_BLOSSOM =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry_blossom"));
}
