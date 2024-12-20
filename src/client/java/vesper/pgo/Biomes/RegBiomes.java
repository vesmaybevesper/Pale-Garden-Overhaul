package vesper.pgo.Biomes;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;

public class RegBiomes {
    public static final RegistryKey<Biome> PALE_CAVE = RegistryKey.of(RegistryKeys.BIOME, Identifier.of("pale_world", "pale_cave"));

    public static void registerBiomes(){

    }
}
