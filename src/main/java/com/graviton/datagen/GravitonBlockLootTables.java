package com.graviton.datagen;

import com.graviton.Graviton;
import com.graviton.item.GravitonItems;
import com.graviton.block.GravitonBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
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


        this.dropSelf(GravitonBlocks.HELIOSITE_BRICKS.get());
        this.dropSelf(GravitonBlocks.CHISELED_HELIOSITE_BLOCK.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_PILLAR.get());

        this.dropSelf(GravitonBlocks.HELIOSITE_BLOCK.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_SLAB.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_STAIRS.get());
        this.dropSelf(GravitonBlocks.HELIOSITE_WALL.get());

        this.dropSelf(GravitonBlocks.SMOOTH_HELIOSITE_BLOCK.get());
        this.dropSelf(GravitonBlocks.SMOOTH_HELIOSITE_SLAB.get());
        this.dropSelf(GravitonBlocks.SMOOTH_HELIOSITE_STAIRS.get());
        this.dropSelf(GravitonBlocks.SMOOTH_HELIOSITE_WALL.get());


        this.dropSelf(GravitonBlocks.KARTHUULIUM_BLOCK.get());

        this.dropSelf(GravitonBlocks.AETHER_SMITHING_TABLE.get());

        this.add(GravitonBlocks.KARTHUULIUM_ORE.get(), (block) ->
                createSingleItemTable(GravitonItems.RAW_KARTHUULIUM.get()));

        this.add(GravitonBlocks.HELIOSITE_ORE.get(), (block) ->
                createSingleItemTable(GravitonItems.HELIOSITE.get()));

        this.add(GravitonBlocks.RED_SKYROOT_LEAVES.get(), (block) ->
                createLeavesDrops(block, GravitonBlocks.RED_SKYROOT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GravitonBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
