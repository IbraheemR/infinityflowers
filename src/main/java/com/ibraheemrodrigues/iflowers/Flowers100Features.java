package com.ibraheemrodrigues.iflowers;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.function.Predicate;
import static com.ibraheemrodrigues.iflowers.Flowers100.*;

import static com.ibraheemrodrigues.iflowers.Flowers100.Flower13;
import static com.ibraheemrodrigues.iflowers.IFlowersMod.getId;

public class Flowers100Features extends ConfiguredFeatures {
    // HACK: subclassing to get access to ConfiguredFeatures.Decorator. is this bad?

    private static RandomPatchFeatureConfig.Builder getRPFCBuilder(Block[] states) {

        DataPool.Builder<BlockState> statePool = new DataPool.Builder<>();

        for (Block state:
                states) {
            statePool.add(state.getDefaultState(), 1);
        }

        WeightedBlockStateProvider blockStateProvider = new WeightedBlockStateProvider(statePool.build());
        return new RandomPatchFeatureConfig.Builder(
                blockStateProvider,
                SimpleBlockPlacer.INSTANCE
        );
    }

    private static ConfiguredFeature<?, ?> buildSimpleFlowerPatch(boolean useFlower, Block... states) {
        Feature<RandomPatchFeatureConfig> f = useFlower ? Feature.FLOWER : Feature.RANDOM_PATCH ;
        return f.configure(
                getRPFCBuilder(states).build()
        )
                .decorate(ConfiguredFeatures.Decorators.SPREAD_32_ABOVE)
                .decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP);
    }

    private static void registerSimpleFlowerPatch(Predicate<BiomeSelectionContext> selector, ConfiguredFeature<?, ?> configuredFeature, String id) {
        RegistryKey<ConfiguredFeature<?, ?>> flowerFeatureKey = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, getId(id));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, flowerFeatureKey.getValue(), configuredFeature);

        BiomeModifications.addFeature(selector, GenerationStep.Feature.VEGETAL_DECORATION, flowerFeatureKey);
    }



    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_TAIGA = buildSimpleFlowerPatch(true, Flower13, Flower14, Flower16, Flower17, Flower03, Flower06, Flower08, Flower47, Flower48, Flower49, Flower66);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_EXTREME_HILLS = buildSimpleFlowerPatch(true, Flower03, Flower23, Flower41, Flower44, Flower22, Flower81);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_JUNGLE = buildSimpleFlowerPatch(false, Flower68, Flower88, Flower89, Flower99, Flower73, Flower25, Flower87, Flower19, Flower09, Flower60, Flower61);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_MESA = buildSimpleFlowerPatch(true, Flower00, Flower23, Flower46, Flower60, Flower62, Flower76);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_PLAINS = buildSimpleFlowerPatch(true, Flower04, Flower07, Flower11, Flower20, Flower21, Flower24, Flower26, Flower27, Flower28, Flower33, Flower41, Flower49, Flower50, Flower51, Flower52, Flower53, Flower54, Flower56, Flower57, Flower58, Flower77, Flower70, Flower71, Flower84, Flower82, Flower83, Flower71, Flower76, Flower90, Flower91, Flower92, Flower93, Flower94, Flower95, Flower96, Flower97, Flower98);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_SAVANNA = buildSimpleFlowerPatch(true, Flower00, Flower34, Flower43, Flower63, Flower64);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_ICY = buildSimpleFlowerPatch(true, Flower05, Flower13, Flower36, Flower69, Flower65);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_THEEND = buildSimpleFlowerPatch(true, Flower15);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_FOREST = buildSimpleFlowerPatch(true, Flower01, Flower04, Flower10, Flower11, Flower12, Flower26, Flower27, Flower28, Flower29, Flower30, Flower31, Flower32, Flower35, Flower50, Flower51, Flower52, Flower53, Flower54, Flower56, Flower57, Flower59, Flower75, Flower75, Flower71, Flower76, Flower90, Flower91, Flower92, Flower93, Flower94, Flower95, Flower96, Flower97, Flower98);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_DESERT = buildSimpleFlowerPatch(true, Flower02);
    private static final ConfiguredFeature<?, ?> FLOWER_PATCH_SWAMP = buildSimpleFlowerPatch(true, Flower17, Flower18, Flower38, Flower42, Flower45, Flower55, Flower67, Flower69, Flower79, Flower72, Flower74, Flower78, Flower71, Flower76);





    public static void init() {
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.TAIGA), FLOWER_PATCH_TAIGA, "flower_patch_taiga");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.EXTREME_HILLS), FLOWER_PATCH_EXTREME_HILLS, "flower_patch_extreme_hills");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.JUNGLE), FLOWER_PATCH_JUNGLE, "flower_patch_jungle");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.MESA), FLOWER_PATCH_MESA, "flower_patch_mesa");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.PLAINS), FLOWER_PATCH_PLAINS, "flower_patch_plains");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.SAVANNA), FLOWER_PATCH_SAVANNA, "flower_patch_savanna");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.ICY), FLOWER_PATCH_ICY, "flower_patch_icy");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.THEEND), FLOWER_PATCH_THEEND, "flower_patch_theend");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.FOREST), FLOWER_PATCH_FOREST, "flower_patch_forest");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.DESERT), FLOWER_PATCH_DESERT, "flower_patch_desert");
        registerSimpleFlowerPatch(BiomeSelectors.categories(Biome.Category.SWAMP), FLOWER_PATCH_SWAMP, "flower_patch_swamp");
    }
}
