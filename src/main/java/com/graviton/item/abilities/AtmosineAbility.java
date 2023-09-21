package com.graviton.item.abilities;

import com.aetherteam.aether.mixin.mixins.common.accessor.ServerGamePacketListenerImplAccessor;
import com.graviton.Graviton;
import com.ibm.icu.text.MessagePattern;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;

import java.util.Random;

/** code by Sunsette */
/** modified it a bit -moist */
public interface AtmosineAbility {

    static void handleJump(LivingEntity entity) {
        boolean jumpUsed = (ABEquipmentUtil.alreadyUsedDoubleJump);
        boolean isjumpbuttondown = Minecraft.getInstance().options.keyJump.isDown();
        boolean oldJump = ABEquipmentUtil.canJump;
        //debugs
        Player player = Minecraft.getInstance().player;

        if (jumpUsed) {
            //Graviton.LOGGER.warn("jumpUsed");
        }
        if (ABEquipmentUtil.hasFullAtmosineSet(entity)) {
            if (player != null && !player.getAbilities().flying) { // The player can't have creative flight enabled, otherwise it causes issues.
                //AetherPlayer.get(player).ifPresent(aetherPlayer -> {
                Vec3 deltaMovement = player.getDeltaMovement();
                //if (!player.getLevel().isClientSide()) { // Updates the flight modifier and timer values.
                if (isjumpbuttondown) {
                    ABEquipmentUtil.jumpHeldTimer++;
                } else {
                    ABEquipmentUtil.jumpHeldTimer = 0;
                }
                if (ABEquipmentUtil.jumpHeldTimer < 2) {
                    ABEquipmentUtil.canJump = true;
                } else {
                    ABEquipmentUtil.canJump = false;
                }

                if (!ABEquipmentUtil.alreadyUsedDoubleJump && isjumpbuttondown && !player.onGround() && !player.isInWater() && !player.isInLava()) { // Checks if the player is off the ground and holding the jump key (space bar by default).
                    if (ABEquipmentUtil.timeSinceGround > 3) { // Starts allowing the player to jump after a 3 tick delay of being off the ground.
                        if (ABEquipmentUtil.canJump) { // Allows the player to fly until the maximum value is hit.
                            player.jumpFromGround();
                            player.push(0, 0.1, 0);
                            for (int i = 0; i < 251; i++) { //Spawns particles
                                double speedY = (new Random().nextFloat() - 1) / 10;
                                double speedZ = (new Random().nextFloat() - 0.5) / 7;
                                double speedX = (new Random().nextFloat() - 0.5) / 7;
                                //new BlockParticleOption(ParticleTypes.BLOCK, Blocks.AMETHYST_BLOCK.defaultBlockState())
                                player.level().addParticle(ParticleTypes.SNOWFLAKE, player.getX() + (new Random().nextFloat()-0.5) /1f, player.getY(), player.getZ() + (new Random().nextFloat()-0.5)/1f, speedX, speedY, speedZ);
                            }
                            player.level().playLocalSound(BlockPos.containing(entity.position()), SoundEvents.ENDER_DRAGON_FLAP, SoundSource.PLAYERS, 1f, 0.4f, true); //plays a WOOSH sound
                            ABEquipmentUtil.alreadyUsedDoubleJump = true;
                        }
                    }
                }
                if (player.onGround()) { // Resets both timer and modifier if the player is on the ground.
                    //aetherPlayer.setFlightTimer(0);
                    //aetherPlayer.setFlightModifier(1.0F);
                    ABEquipmentUtil.alreadyUsedDoubleJump = false;
                    ABEquipmentUtil.timeSinceGround = 0;
                } else {
                    ABEquipmentUtil.timeSinceGround++;
                }
                if (player instanceof ServerPlayer serverPlayer) { // Prevents the player from being kicked for flying.
                    ServerGamePacketListenerImplAccessor serverGamePacketListenerImplAccessor = (ServerGamePacketListenerImplAccessor) serverPlayer.connection;
                    serverGamePacketListenerImplAccessor.aether$setAboveGroundTickCount(0);
                }
            }

        }
    }
}

