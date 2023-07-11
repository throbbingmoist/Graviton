package com.graviton.block.custom;

import com.graviton.block.GravitonBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HoneyBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.BiPredicate;

public class DarkChilledSwetBlock extends HoneyBlock {

    private final BiPredicate<BlockState, BlockState> stickyPredicate = (state, other) -> other.getBlock() != state.getBlock();
    public DarkChilledSwetBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK));
    }

    @Override
    public boolean isStickyBlock(BlockState state) {
        return true;
    }
    @Override
    public boolean canStickTo(BlockState state, BlockState other) {
        return stickyPredicate.test(GravitonBlocks.BLUE_SWET_BLOCK.get().defaultBlockState(), other) &&
                stickyPredicate.test(GravitonBlocks.GOLDEN_SWET_BLOCK.get().defaultBlockState(), other) &&
                stickyPredicate.test(GravitonBlocks.DARK_SWET_BLOCK.get().defaultBlockState(), other) &&
                stickyPredicate.test(Blocks.SLIME_BLOCK.defaultBlockState(), other);
    }
}

