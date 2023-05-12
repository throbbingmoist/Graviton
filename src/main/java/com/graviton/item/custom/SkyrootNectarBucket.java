package com.graviton.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class SkyrootNectarBucket extends Item {
    public SkyrootNectarBucket(){
        super(new Item.Properties().stacksTo(1).food((new FoodProperties.Builder())
                .nutrition(0)
                .saturationMod(0.0F)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 450, 0),1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0),1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1800, 0),1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 1),1.0F)
                .build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }
    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack(Items.BUCKET);
        super.finishUsingItem(itemstack, world, entity);
        if (itemstack.isEmpty()) {
            return retval;
        } else {
            if (entity instanceof Player player && !player.getAbilities().instabuild) {
                if (!player.getInventory().add(retval))
                    player.drop(retval, false);
            }
            return itemstack;
        }
    }
}
