package net.ghostyy.betterminecraft.world.feature;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.block.ModBlocks;
import net.ghostyy.betterminecraft.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.PredicatedStateProvider;

import javax.swing.text.html.HTML;
import java.util.List;

public class ModConfiguredFeatures {

    //Voidsteel Debris
    public static final List<OreFeatureConfig.Target> END_VOIDSTEEL_DEBRIS = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    ModBlocks.VOIDSTEEL_DEBRIS.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOIDSTEEL_DEBRIS =
            ConfiguredFeatures.register("voidsteel_debris", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(END_VOIDSTEEL_DEBRIS,4, 1.0f));
    public static final List<OreFeatureConfig.Target> END_VOIDSTEEL_DEBRIS_SMALL = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    ModBlocks.VOIDSTEEL_DEBRIS.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOIDSTEEL_DEBRIS_SMALL =
            ConfiguredFeatures.register("voidsteel_debris_small", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(END_VOIDSTEEL_DEBRIS_SMALL,2, 1.0f));

    //End Obsidian
    public static final List<OreFeatureConfig.Target> END_OBSIDIAN_CLUMP = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OBSIDIAN_CLUMP =
            ConfiguredFeatures.register("obsidian_clump", Feature.ORE,
                    new OreFeatureConfig(END_OBSIDIAN_CLUMP,64, 0.0f));
    public static final List<OreFeatureConfig.Target> END_CRYING_OBSIDIAN_SHATTERED = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.CRYING_OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYING_OBSIDIAN_SHATTERED =
            ConfiguredFeatures.register("crying_obsidian_shattered", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(END_CRYING_OBSIDIAN_SHATTERED,16, 0.0f));

    //Nether Blackstone
    public static final RegistryEntry<ConfiguredFeature<DiskFeatureConfig, ?>> BLACKSTONE =
            ConfiguredFeatures.register("blackstone_disk", Feature.DISK,
                    new DiskFeatureConfig(PredicatedStateProvider.of(Blocks.BLACKSTONE), BlockPredicate.matchingBlocks(Blocks.NETHERRACK),
                            UniformIntProvider.create(3, 6), 1));
    //Soul Magma
    public static final List<OreFeatureConfig.Target> NETHER_SOUL_MAGMA = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(BlockTags.WITHER_SUMMON_BASE_BLOCKS),
                    ModBlocks.SOUL_MAGMA.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SOUL_MAGMA =
            ConfiguredFeatures.register("soul_magma", Feature.ORE,
                    new OreFeatureConfig(NETHER_SOUL_MAGMA,33, 0.0f));


    public static void registerConfiguredFeatures() {
        Better_Minecraft.LOGGER.info("Regsitering configured features for " + Better_Minecraft.MODID);
    }
}
