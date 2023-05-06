package com.graviton.datagen;

import com.graviton.Graviton;
import com.graviton.worldgen.GravitonConfiguredFeatures;
import com.graviton.worldgen.GravitonPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class GravitonWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, GravitonConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, GravitonPlacedFeatures::bootstrap);

    public GravitonWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Graviton.MOD_ID));
    }
}
