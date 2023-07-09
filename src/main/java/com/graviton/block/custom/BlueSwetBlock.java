package com.graviton.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SlimeBlock;

import java.util.function.BiPredicate;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import com.graviton.block.GravitonBlocks;

public class BlueSwetBlock extends SlimeBlock {

    private final BiPredicate<BlockState, BlockState> stickyPredicate = (state, other) -> other.getBlock() != state.getBlock();
    public BlueSwetBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK));
    }

    @Override
    public boolean isStickyBlock(BlockState state) {
        return true;
    }
    @Override
    public boolean canStickTo(BlockState state, BlockState other) {
        return stickyPredicate.test(GravitonBlocks.BLUE_FROZEN_SWET_BLOCK.get().defaultBlockState(), other) && stickyPredicate.test(Blocks.HONEY_BLOCK.defaultBlockState(), other);
    }
}
