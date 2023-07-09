package com.graviton.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HoneyBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlueFrozenSwetBlock extends HoneyBlock {
    public BlueFrozenSwetBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).sound(SoundType.SLIME_BLOCK));
    }
}

