package studymod.tentoshka.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.function.Predicate;

import static studymod.tentoshka.Mod.MOD_ID;

public class ModFeatures {
    public static final ConfiguredFeature<?, ?> GAY_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.GAY_ORE.getDefaultState(),
                    9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                            0,
                            0,
                            64)))
            .spreadHorizontally()
            .repeat(20);

    public static void registryFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "gay_ore_overworld"), GAY_ORE_OVERWORLD);
        Predicate<BiomeSelectionContext> biomeSelector = BiomeSelectors.foundInOverworld();
        RegistryKey<ConfiguredFeature<?, ?>> gayOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "gay_ore_overworld"));
        BiomeModifications.addFeature(biomeSelector, GenerationStep.Feature.UNDERGROUND_ORES, gayOreOverworld);
    }
}
