package com.graviton.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlueSwetBlock extends SlimeBlock {
    public BlueSwetBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK));
    }
}
