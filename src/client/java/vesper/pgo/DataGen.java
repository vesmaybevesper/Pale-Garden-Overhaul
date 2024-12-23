package vesper.pgo;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import vesper.pgo.Biomes.ModBiomes;

public class DataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator (FabricDataGenerator fabricDataGen){
    FabricDataGenerator.Pack pack = fabricDataGen.createPack();
    }

    @Override
    public void buildRegistry(RegistryBuilder regBuild){
        regBuild.addRegistry(RegistryKeys.BIOME, ModBiomes::bootstrap);
    }
}
