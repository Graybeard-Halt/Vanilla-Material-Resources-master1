package com.robdog777.enchantmentsplus.enchants;

import com.robdog777.enchantmentsplus.EnchantmentsPlus;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

import java.util.Random;

public class DualLeapEnchantment extends Enchantment {
    public DualLeapEnchantment() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.ARMOR_FEET, new EquipmentSlot[]{EquipmentSlot.FEET});
    }

    @Override
    public int getMinPower(int level) {
        return (20 * level);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return other != EnchantmentsPlus.MOONWALKER;
    }

    public String registryName() {
        return "dualleap";
    }

    private final static Random random = new Random();
}
