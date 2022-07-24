package net.myndmelt.better_minecraft.world.structure;

import com.mojang.serialization.Codec;
import net.myndmelt.better_minecraft.Better_Minecraft;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

public class ModStructures {

    public static StructureType<?> VARIABLE_HEIGHT_STRUCTURE;

    public static void registerModStructureFeatures() {
        VARIABLE_HEIGHT_STRUCTURE = register(new Identifier(Better_Minecraft.MOD_ID, "variable_height"), VariableHeightStructure.CODEC);
    }
    // Helper method to register since compiler will complain about typing if we did () -> SkyStructures.CODEC directly.
    private static <S extends Structure> StructureType<S> register(Identifier id, Codec<S> codec) {
        return Registry.register(Registry.STRUCTURE_TYPE, id, () -> codec);
    }
}
