package com.graviton.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.PlantType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AeroStalksBlock extends SugarCaneBlock {
    public AeroStalksBlock() {
        super(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.NONE));
    }
    public boolean waterCheck(BlockPos pos, LevelReader worldIn) {
        BlockPos blockpos = pos.below();
        BlockState groundState = worldIn.getBlockState(blockpos);

        if (!groundState.is(this)) {
            ArrayList<Boolean> checks = new ArrayList<Boolean>();

            blockpos = pos.below();
            blockpos = blockpos.north();
            blockpos = blockpos.west();
            groundState = worldIn.getBlockState(blockpos);
            boolean checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            blockpos = pos.below();
            blockpos = blockpos.north();
            groundState = worldIn.getBlockState(blockpos);
            checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            blockpos = pos.below();
            blockpos = blockpos.north();
            blockpos = blockpos.east();
            groundState = worldIn.getBlockState(blockpos);
            checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            blockpos = pos.below();
            blockpos = blockpos.west();
            groundState = worldIn.getBlockState(blockpos);
            checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            blockpos = pos.below();
            blockpos = blockpos.east();
            groundState = worldIn.getBlockState(blockpos);
            checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            blockpos = pos.below();
            blockpos = blockpos.south();
            blockpos = blockpos.west();
            groundState = worldIn.getBlockState(blockpos);
            checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            blockpos = pos.below();
            blockpos = blockpos.south();
            groundState = worldIn.getBlockState(blockpos);
            checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            blockpos = pos.below();
            blockpos = blockpos.south();
            blockpos = blockpos.east();
            groundState = worldIn.getBlockState(blockpos);
            checkBlock = groundState.is(Blocks.WATER);
            checks.add(checkBlock);

            if (checks.contains(true)) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 0;
    }

    @Override
    public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
        return BlockPathTypes.OPEN;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 0;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this));
    }

    @Override
    public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.below();
        var blockAllowed = waterCheck(pos, worldIn);
        BlockState groundState = worldIn.getBlockState(blockpos);
        if (blockAllowed) {
            return groundState.is(this) || groundState.is(BlockTags.create(new ResourceLocation("graviton:aerostalksgrowblocks"))) || groundState.is(BlockTags.create(new ResourceLocation("minecraft:dirt")));
        }
        else {
            return false;
        }
    }
    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.BEACH;
    }

    @Override
    public void randomTick(BlockState blockstate, ServerLevel world, BlockPos blockpos, RandomSource random) {
        if (world.isEmptyBlock(blockpos.above())) {
            int i = 1;
            for (; world.getBlockState(blockpos.below(i)).is(this); ++i);
            if (i < 4) {
                int j = blockstate.getValue(AGE);
                if (ForgeHooks.onCropsGrowPre(world, blockpos, blockstate, true)) {
                    if (j == 15) {
                        world.setBlockAndUpdate(blockpos.above(), defaultBlockState());
                        world.setBlock(blockpos, blockstate.setValue(AGE, 0), 4);
                    } else
                        world.setBlock(blockpos, blockstate.setValue(AGE, j + 1), 4);
                }
            }
        }
    }
}
