package com.graviton.event.listeners.abilities;
import com.graviton.Graviton;
import com.graviton.item.abilities.AtmosineAbility;
import com.aetherteam.aether.Aether;
import com.aetherteam.aether.event.hooks.AbilityHooks;
import com.aetherteam.aether.item.combat.abilities.armor.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/** code by Sunsette */
public class AbilityListener {

    /**
     * @see ValkyrieArmor#handleFlight(LivingEntity)
     * @see NeptuneArmor#boostWaterSwimming(LivingEntity)
     * @see PhoenixArmor#boostLavaSwimming(LivingEntity)
     * @see PhoenixArmor#damageArmor(LivingEntity)
     */
    @SubscribeEvent
    public static void onEntityUpdate(LivingEvent.LivingTickEvent event) {
        LivingEntity livingEntity = event.getEntity();
        if (!event.isCanceled()) {
            AtmosineAbility.handleJump(livingEntity);
        }
    }

}
