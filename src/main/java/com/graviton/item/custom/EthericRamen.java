package com.graviton.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class EthericRamen extends Item {
    public EthericRamen(){
        super(new Item.Properties().stacksTo(1).food((new FoodProperties.Builder())
                .nutrition(12)
                .saturationMod(0.5F)
                .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1600, 0),1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 0),0.6F)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0),0.4F)
                .build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack(Items.BOWL);
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
