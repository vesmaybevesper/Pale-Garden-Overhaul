package vesper.pgo.Biomes;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.UndergroundPlacedFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> PALE_CAVE = RegistryKey.of(RegistryKeys.BIOME, Identifier.of("pale_world", "pale_cave"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(PALE_CAVE, paleCave(context));
    }

    private static Biome paleCave(Registerable<Biome> context) {
        SpawnSettings.Builder spawner = new SpawnSettings.Builder();
        spawner.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.CAVE_SPIDER, 2, 1, 3));


        DefaultBiomeFeatures.addBatsAndMonsters(spawner);

        GenerationSettings.LookupBackedBuilder builder = new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE), context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
        builder.feature((GenerationStep.Feature.UNDERGROUND_DECORATION), UndergroundPlacedFeatures.LUSH_CAVES_CEILING_VEGETATION);
        builder.feature((GenerationStep.Feature.UNDERGROUND_DECORATION), UndergroundPlacedFeatures.LUSH_CAVES_VEGETATION);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.5f)
                .generationSettings(builder.build())
                .spawnSettings(spawner.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xff76889D)
                        .waterFogColor(0xff556980)
                        .skyColor(0xffb9b9b9)
                        .grassColor(0xff778272)
                        .foliageColor(0xff878D76)
                        .fogColor(0xff817770)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }
}
