package net.ghostyy.betterminecraft.world.feature;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class ModPlacedFeatures {

    //Voidsteel Debris
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS = PlacedFeatures.register("voidsteel_debris",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(16), YOffset.aboveBottom(32))));

    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS_SMALL = PlacedFeatures.register("voidsteel_debris_small",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS_SMALL, ModOreFeatures.modifiersWithCount(3,
                    PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE));

    //End Obsidian
    public static final RegistryEntry<PlacedFeature> OBSIDIAN_CLUMP = PlacedFeatures.register("obsidian_clump",
            ModConfiguredFeatures.OBSIDIAN_CLUMP, ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));
    public static final RegistryEntry<PlacedFeature> CRYING_OBSIDIAN_SHATTERED = PlacedFeatures.register("crying_obsidian_shattered",
            ModConfiguredFeatures.CRYING_OBSIDIAN_SHATTERED, ModOreFeatures.modifiersWithCount(16,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

    //Nether Blackstone
    public static final RegistryEntry<PlacedFeature> BLACKSTONE = PlacedFeatures.register("blackstone_disk",
            ModConfiguredFeatures.BLACKSTONE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(24), YOffset.belowTop(0))));

    //Soul Magma
    public static final RegistryEntry<PlacedFeature> SOUL_MAGMA = PlacedFeatures.register("soul_magma",
            ModConfiguredFeatures.SOUL_MAGMA, ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(27), YOffset.belowTop(0))));
    //Init
    public static void registerModPlacedFeatures() {
        Better_Minecraft.LOGGER.info("Registering placed features for " + Better_Minecraft.MOD_ID);
    }

}
