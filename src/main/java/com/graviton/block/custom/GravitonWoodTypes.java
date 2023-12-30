package com.graviton.block.custom;

import com.graviton.Graviton;
import com.graviton.block.custom.*;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GravitonWoodTypes {
    public static final BlockSetType ATMOSROOT_BLOCK_SET = new BlockSetType(Graviton.MOD_ID + ":atmosroot");
    public static final WoodType ATMOSROOT = new WoodType(Graviton.MOD_ID + ":atmosroot", ATMOSROOT_BLOCK_SET);

}
