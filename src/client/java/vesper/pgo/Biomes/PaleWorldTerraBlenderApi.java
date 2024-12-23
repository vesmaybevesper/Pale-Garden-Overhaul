package vesper.pgo.Biomes;

import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;


public class PaleWorldTerraBlenderApi implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of("pale_world", "overworld"), 4));
    }
}
