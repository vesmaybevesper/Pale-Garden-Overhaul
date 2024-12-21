package vesper.pgo.Biomes;

import net.minecraft.Bootstrap;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final RegistryKey<Biome> PALE_CAVE = RegistryKey.of(RegistryKeys.BIOME, Identifier.of("pale_world", "pale_cave"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(PALE_CAVE, paleCave(context));
    }

    private static Biome paleCave(Registerable<Biome> context) {
        return null;
    }
}
