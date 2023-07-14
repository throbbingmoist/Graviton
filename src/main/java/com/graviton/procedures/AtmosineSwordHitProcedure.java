package com.graviton.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/** code by Sunsette */
public class AtmosineSwordHitProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity)
            _entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 40, 2));
    }
}
