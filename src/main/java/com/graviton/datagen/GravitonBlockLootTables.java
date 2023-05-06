package com.graviton.datagen;

import com.graviton.block.GravitonBlocks;
import com.graviton.item.GravitonItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class GravitonBlockLootTables extends BlockLootSubProvider {
    public GravitonBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(GravitonBlocks.COARSE_AETHER_DIRT.get());
        this.dropSelf(GravitonBlocks.BLUE_SKYROOT_SAPLING.get());
        this.dropSelf(GravitonBlocks.AERO_STALKS.get());

        this.add(GravitonBlocks.BLUE_SKYROOT_LEAVES.get(), (block) ->
                createLeavesDrops(block, GravitonBlocks.BLUE_SKYROOT_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GravitonBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
