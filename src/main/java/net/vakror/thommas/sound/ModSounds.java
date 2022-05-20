package net.vakror.thommas.sound;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModSounds {
    public static SoundEvent DATA_TABLET_RECORDED_HOMEPOS = registerSoundEvent("data_tablet_recorded_homepos");

    public static SoundEvent MYTHRIL_LAMP_BREAK = registerSoundEvent("mythril_lamp_break");
    public static SoundEvent MYTHRIL_LAMP_STEP = registerSoundEvent("mythril_lamp_step");
    public static SoundEvent MYTHRIL_LAMP_PLACE = registerSoundEvent("mythril_lamp_place");
    public static SoundEvent MYTHRIL_LAMP_HIT = registerSoundEvent("mythril_lamp_hit");
    public static SoundEvent MYTHRIL_LAMP_FALL = registerSoundEvent("mythril_lamp_fall");

    public static SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");
    public static SoundEvent NOISE = registerSoundEvent("noise_from_class");

    public static BlockSoundGroup MYTHRIL_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.MYTHRIL_LAMP_BREAK, ModSounds.MYTHRIL_LAMP_STEP, ModSounds.MYTHRIL_LAMP_PLACE,
            ModSounds.MYTHRIL_LAMP_HIT, ModSounds.MYTHRIL_LAMP_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Thommas.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
