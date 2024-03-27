package net.matt.magemod.item;

import net.matt.magemod.MageMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    CAMO("camo", 26, new int[]{ 5, 7, 5, 4 }, 25, SoundEvents.ARMOR_EQUIP_ELYTRA, 1f, 0f, () -> Ingredient.of(ModItems.CAMO.get())),
    DRY_WATER("dry_water", 26, new int[]{ 5, 7, 5, 4 }, 25, SoundEvents.ARMOR_EQUIP_ELYTRA, 1f, 0f, () -> Ingredient.of(ModItems.CAMO.get())),
    CURSE("curse", 26, new int[]{ 5, 7, 5, 4 }, 25, SoundEvents.ARMOR_EQUIP_ELYTRA, 1f, 0f, () -> Ingredient.of(ModItems.CAMO.get())),
    REDGLOW("red_glow", 26, new int[]{ 5, 7, 5, 4 }, 25, SoundEvents.ARMOR_EQUIP_ELYTRA, 1f, 0f, () -> Ingredient.of(ModItems.CAMO.get())),
    ECTOPLASM("ectoplasm", 26, new int[]{ 5, 7, 5, 4 }, 25, SoundEvents.ARMOR_EQUIP_ELYTRA, 1f, 0f, () -> Ingredient.of(ModItems.ECTOPLASM.get()));


    private final String name;
    private final int duribilityMultiplier;
    private  final int[] protectionAmmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmorMaterials(String name, int duribilityMultiplier, int[] protectionAmmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.duribilityMultiplier = duribilityMultiplier;
        this.protectionAmmounts = protectionAmmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.duribilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MageMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
