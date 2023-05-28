package com.graviton.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlimeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlueFrozenSwetBlock extends SlimeBlock {
    public BlueFrozenSwetBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK));
    }
}
