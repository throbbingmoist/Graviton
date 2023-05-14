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

import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.effect.AetherEffects;

public class CockatriceCocktail extends Item {
    public CockatriceCocktail(){
        super(new Item.Properties().stacksTo(1).food((new FoodProperties.Builder())
                .nutrition(4)
                .saturationMod(0.5F)
                .alwaysEat()
                .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 2),1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 2),1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 1),0.3F)
                .effect(() -> new MobEffectInstance(AetherEffects.INEBRIATION.get(), 1200, 0),1.0F)
                .build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }
    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack(AetherItems.SKYROOT_BUCKET.get());
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
