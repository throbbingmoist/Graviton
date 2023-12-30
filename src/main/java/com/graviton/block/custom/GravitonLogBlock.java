package com.graviton.block.custom;

import com.aetherteam.aether.block.AetherBlockStateProperties;
import com.aetherteam.aether.block.natural.AetherLogBlock;
import com.graviton.block.GravitonBlocks;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class GravitonLogBlock extends AetherLogBlock {

    public GravitonLogBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
        this.registerDefaultState(this.defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, false));
    }
    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(GravitonBlocks.ATMOSROOT_LOG.get())) {
                return GravitonBlocks.STRIPPED_ATMOSROOT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(GravitonBlocks.ATMOSROOT_WOOD.get())) {
                return GravitonBlocks.STRIPPED_ATMOSROOT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
