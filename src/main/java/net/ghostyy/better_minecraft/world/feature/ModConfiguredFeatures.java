package net.ghostyy.better_minecraft.world.feature;

import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.block.ModBlocks;
import net.ghostyy.better_minecraft.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.PredicatedStateProvider;
import org.checkerframework.framework.qual.CFComment;

import java.util.List;

public class ModConfiguredFeatures {

    //Voidsteel Debris
    private static final List<OreFeatureConfig.Target> VOIDSTEEL_DEBRIS_CONFIG = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    ModBlocks.VOIDSTEEL_DEBRIS.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> VOIDSTEEL_DEBRIS =
            ConfiguredFeatures.register("voidsteel_debris", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(VOIDSTEEL_DEBRIS_CONFIG,4, 1.0f));

    //End Obsidian
    private static final List<OreFeatureConfig.Target> OBSIDIAN_CLUMP_CONFIG = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OBSIDIAN_CLUMP =
            ConfiguredFeatures.register("obsidian_clump", Feature.ORE,
                    new OreFeatureConfig(OBSIDIAN_CLUMP_CONFIG,64, 0.0f));
    private static final List<OreFeatureConfig.Target> CRYING_OBSIDIAN_SHATTERED_CONFIG = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(ModTags.Blocks.BASE_STONE_END),
                    Blocks.CRYING_OBSIDIAN.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CRYING_OBSIDIAN_SHATTERED =
            ConfiguredFeatures.register("crying_obsidian_shattered", Feature.SCATTERED_ORE,
                    new OreFeatureConfig(CRYING_OBSIDIAN_SHATTERED_CONFIG,16, 0.0f));

    //Nether Blackstone
    private static final List<OreFeatureConfig.Target> BLACKSTONE_CLUMP_CONFIG = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.NETHERRACK),
                    Blocks.BLACKSTONE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BLACKSTONE_CLUMP =
            ConfiguredFeatures.register("blackstone_clump", Feature.ORE,
                    new OreFeatureConfig(BLACKSTONE_CLUMP_CONFIG,24, 0.0f));
    //Soul Magma
    private static final List<OreFeatureConfig.Target> SOUL_MAGMA_CONFIG = List.of(
            OreFeatureConfig.createTarget(new TagMatchRuleTest(BlockTags.WITHER_SUMMON_BASE_BLOCKS),
                    ModBlocks.SOUL_MAGMA.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SOUL_MAGMA =
            ConfiguredFeatures.register("soul_magma", Feature.ORE,
                    new OreFeatureConfig(SOUL_MAGMA_CONFIG,33, 0.0f));

    public static void registerConfiguredFeatures() {
        Better_Minecraft.LOGGER.info("Regsitering configured features for " + Better_Minecraft.MOD_ID);
    }

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return (F) Registry.register(Registry.FEATURE, name, feature);
    }
}
