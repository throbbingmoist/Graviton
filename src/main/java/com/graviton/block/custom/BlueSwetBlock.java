package com.graviton.block.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HoneyBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BlueSwetBlock extends HoneyBlock {
    public BlueSwetBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK));
    }
}
