package com.graviton.block.entity;

import com.graviton.Graviton;
import com.graviton.block.GravitonBlocks;
import com.graviton.block.entity.custom.GravitonSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.aetherteam.aether.blockentity.AetherBlockEntityTypes.BLOCK_ENTITY_TYPES;

public class GravitonBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Graviton.MOD_ID);

    public static final RegistryObject<BlockEntityType<GravitonSignBlockEntity>> SIGN =
            BLOCK_ENTITY_TYPES.register("sign", ()->
                    BlockEntityType.Builder.of(GravitonSignBlockEntity::new,
                            )
            ).build(null));
}
