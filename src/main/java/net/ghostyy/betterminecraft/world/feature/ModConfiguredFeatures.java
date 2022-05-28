package net.ghostyy.betterminecraft.world.feature;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.block.ModBlocks;
import net.ghostyy.betterminecraft.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    //Voidsteel Debris
    public static final List<OreFeatureConfig.Target> END_VOIDSTEEL_DEBRIS = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    ModBlocks.VOIDSTEEL_DEBRIS.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOIDSTEEL_DEBRIS =
            ConfiguredFeatures.register("voidsteel_debris", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(END_VOIDSTEEL_DEBRIS,5, 1.0f));
    public static final List<OreFeatureConfig.Target> END_VOIDSTEEL_DEBRIS_SMALL = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    ModBlocks.VOIDSTEEL_DEBRIS.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOIDSTEEL_DEBRIS_SMALL =
            ConfiguredFeatures.register("voidsteel_debris_small", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(END_VOIDSTEEL_DEBRIS_SMALL,4, 1.0f));

    //End Obsidian
    public static final List<OreFeatureConfig.Target> END_OBSIDIAN_CLUMP = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OBSIDIAN_CLUMP =
            ConfiguredFeatures.register("end_obsidian_clump", Feature.ORE,
                    new OreFeatureConfig(END_OBSIDIAN_CLUMP,64, 0.0f));
    public static final List<OreFeatureConfig.Target> END_OBSIDIAN_SHATTERED = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OBSIDIAN_SHATTERED =
            ConfiguredFeatures.register("end_obsidian_shattered", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(END_OBSIDIAN_SHATTERED,16, 0.0f));
    public static final List<OreFeatureConfig.Target> END_CRYING_OBSIDIAN_CLUMP = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.CRYING_OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYING_OBSIDIAN_CLUMP =
            ConfiguredFeatures.register("end_crying_obsidian_clump", Feature.ORE,
                    new OreFeatureConfig(END_CRYING_OBSIDIAN_CLUMP,64, 0.0f));
    public static final List<OreFeatureConfig.Target> END_CRYING_OBSIDIAN_SHATTERED = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.CRYING_OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYING_OBSIDIAN_SHATTERED =
            ConfiguredFeatures.register("end_crying_obsidian_shattered", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(END_CRYING_OBSIDIAN_SHATTERED,16, 0.0f));

    public static void registerConfiguredFeatures() {
        Better_Minecraft.LOGGER.info("Regsitering configured features for " + Better_Minecraft.MODID);
    }
}
