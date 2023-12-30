package com.graviton.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.SignBlockEntity;

public class GravitonSignBlockEntity extends SignBlockEntity {
    public GravitonSignBlockEntity(BlockPos pWorldPosition, BlockState pBlockState){
        super(pWorldPosition, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return
    }
}
