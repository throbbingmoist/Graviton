package com.graviton.block.custom;

import com.graviton.block.entity.custom.GravitonSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GravitonCeilingHangingSignBlock extends CeilingHangingSignBlock {

    public GravitonCeilingHangingSignBlock(Properties p_250481_, WoodType p_248716_) {
        super(p_250481_, p_248716_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState){
        return new GravitonSignBlockEntity(pPos, pState);
    }
}
