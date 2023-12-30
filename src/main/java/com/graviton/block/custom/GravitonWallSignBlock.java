package com.graviton.block.custom;

import com.graviton.block.entity.custom.GravitonSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GravitonWallSignBlock extends WallSignBlock {
    public GravitonWallSignBlock(Properties p_58068_, WoodType p_58069_) {
        super(p_58068_, p_58069_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState){
        return new GravitonSignBlockEntity(pPos, pState);
    }
}
