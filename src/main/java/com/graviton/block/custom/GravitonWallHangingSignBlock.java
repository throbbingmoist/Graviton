package com.graviton.block.custom;

import com.graviton.block.entity.custom.GravitonSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GravitonWallHangingSignBlock extends WallHangingSignBlock {

    public GravitonWallHangingSignBlock(Properties p_251606_, WoodType p_252140_) {
        super(p_251606_, p_252140_);
    }
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState){
        return new GravitonSignBlockEntity(pPos, pState);
    }
}
