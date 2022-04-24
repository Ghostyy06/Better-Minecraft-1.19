package net.ghostyy.betterminecraft.sound;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent VOIDSTEEL_DEBRIS_BREAK = registerSoundEvent("voidsteel_debris_break");
    public static SoundEvent VOIDSTEEL_DEBRIS_STEP = registerSoundEvent("voidsteel_debris_step");
    public static SoundEvent VOIDSTEEL_DEBRIS_PLACE = registerSoundEvent("voidsteel_debris_place");
    public static SoundEvent VOIDSTEEL_DEBRIS_HIT = registerSoundEvent("voidsteel_debris_hit");
    public static SoundEvent VOIDSTEEL_DEBRIS_FALL = registerSoundEvent("voidsteel_debris_fall");

    public static final BlockSoundGroup VOIDSTEEL_DEBRIS = new BlockSoundGroup(1f, 1f,
            ModSounds.VOIDSTEEL_DEBRIS_BREAK, ModSounds.VOIDSTEEL_DEBRIS_STEP, ModSounds.VOIDSTEEL_DEBRIS_PLACE,
            ModSounds.VOIDSTEEL_DEBRIS_HIT, ModSounds.VOIDSTEEL_DEBRIS_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Better_Minecraft.MODID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
