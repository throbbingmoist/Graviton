package com.graviton.datagen;

import com.graviton.Graviton;
import com.graviton.item.GravitonItems;
import com.graviton.block.GravitonBlocks;
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
        this.dropSelf(GravitonBlocks.RED_SKYROOT_SAPLING.get());
        this.dropSelf(GravitonBlocks.AERO_STALKS.get());


        this.dropSelf(GravitonBlocks.HELIOSITE_BLOCK.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_BRICKS.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_PILLAR.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_SLAB.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_STAIRS.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_WALL.get());

        this.add(GravitonBlocks.RED_SKYROOT_LEAVES.get(), (block) ->
                createLeavesDrops(block, GravitonBlocks.RED_SKYROOT_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GravitonBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
