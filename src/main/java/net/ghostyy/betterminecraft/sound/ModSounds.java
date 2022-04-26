package net.ghostyy.betterminecraft.sound;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    //Sound Events
    public static SoundEvent VOIDSTEEL_DEBRIS_BREAK = registerSoundEvent("voidsteel_debris_break");
    public static SoundEvent VOIDSTEEL_DEBRIS_STEP = registerSoundEvent("voidsteel_debris_step");
    public static SoundEvent VOIDSTEEL_DEBRIS_PLACE = registerSoundEvent("voidsteel_debris_place");
    public static SoundEvent VOIDSTEEL_DEBRIS_HIT = registerSoundEvent("voidsteel_debris_hit");
    public static SoundEvent VOIDSTEEL_DEBRIS_FALL = registerSoundEvent("voidsteel_debris_fall");

    public static SoundEvent VOIDSTEEL_BLOCK_BREAK = registerSoundEvent("voidsteel_block_break");
    public static SoundEvent VOIDSTEEL_BLOCK_STEP = registerSoundEvent("voidsteel_block_step");
    public static SoundEvent VOIDSTEEL_BLOCK_PLACE = registerSoundEvent("voidsteel_block_place");
    public static SoundEvent VOIDSTEEL_BLOCK_HIT = registerSoundEvent("voidsteel_block_hit");
    public static SoundEvent VOIDSTEEL_BLOCK_FALL = registerSoundEvent("voidsteel_block_fall");

    public static SoundEvent VOIDSTEEL_ARMOR_EQUIP = registerSoundEvent("voidsteel_armor_equip");

    //Block Sound Groups
    public static final BlockSoundGroup VOIDSTEEL_DEBRIS = new BlockSoundGroup(1.0f, 1.0f,
            ModSounds.VOIDSTEEL_DEBRIS_BREAK, ModSounds.VOIDSTEEL_DEBRIS_STEP, ModSounds.VOIDSTEEL_DEBRIS_PLACE,
            ModSounds.VOIDSTEEL_DEBRIS_HIT, ModSounds.VOIDSTEEL_DEBRIS_FALL);
    public static final BlockSoundGroup VOIDSTEEL_BLOCK = new BlockSoundGroup(1.0f, 1.0f,
            ModSounds.VOIDSTEEL_BLOCK_BREAK, ModSounds.VOIDSTEEL_BLOCK_STEP, ModSounds.VOIDSTEEL_BLOCK_PLACE,
            ModSounds.VOIDSTEEL_BLOCK_HIT, ModSounds.VOIDSTEEL_BLOCK_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Better_Minecraft.MODID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
