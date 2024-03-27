package net.matt.magemod.item;

import net.matt.magemod.MageMod;
import net.matt.magemod.item.custom.ModArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, MageMod.MOD_ID);

    public static final RegistryObject<Item> ECTOPLASM = ITEMS.register("ectoplasm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAMO = ITEMS.register("camo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRY_WATER = ITEMS.register("dry_water",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDGLOW = ITEMS.register("red_glow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CURSE = ITEMS.register("curse",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> CAMO_HELMET = ITEMS.register("camo_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CAMO, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CAMO_CHESTPLATE = ITEMS.register("camo_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CAMO, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CAMO_LEGGINGS = ITEMS.register("camo_leggings",
            () -> new ArmorItem(ModArmorMaterials.CAMO, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CAMO_BOOTS = ITEMS.register("camo_boots",
            () -> new ArmorItem(ModArmorMaterials.CAMO, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ECTOPLASM_HELMET = ITEMS.register("ectoplasm_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ECTOPLASM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ECTOPLASM_CHESTPLATE = ITEMS.register("ectoplasm_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ECTOPLASM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ECTOPLASM_LEGGINGS = ITEMS.register("ectoplasm_leggings",
            () -> new ArmorItem(ModArmorMaterials.ECTOPLASM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ECTOPLASM_BOOTS = ITEMS.register("ectoplasm_boots",
            () -> new ArmorItem(ModArmorMaterials.ECTOPLASM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DRY_WATER_HELMET = ITEMS.register("dry_water_helmet",
            () -> new ModArmorItem(ModArmorMaterials.DRY_WATER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DRY_WATER_CHESTPLATE = ITEMS.register("dry_water_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DRY_WATER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DRY_WATER_LEGGINGS = ITEMS.register("dry_water_leggings",
            () -> new ArmorItem(ModArmorMaterials.DRY_WATER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DRY_WATER_BOOTS = ITEMS.register("dry_water_boots",
            () -> new ArmorItem(ModArmorMaterials.DRY_WATER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> REDGLOW_HELMET = ITEMS.register("redglow_helmet",
            () -> new ModArmorItem(ModArmorMaterials.REDGLOW, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> REDGLOW_CHESTPLATE = ITEMS.register("redglow_chestplate",
            () -> new ArmorItem(ModArmorMaterials.REDGLOW, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> REDGLOW_LEGGINGS = ITEMS.register("redglow_leggings",
            () -> new ArmorItem(ModArmorMaterials.REDGLOW, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> REDGLOW_BOOTS = ITEMS.register("redglow_boots",
            () -> new ArmorItem(ModArmorMaterials.REDGLOW, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CURSE_HELMET = ITEMS.register("curse_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CURSE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CURSE_CHESTPLATE = ITEMS.register("curse_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CURSE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CURSE_LEGGINGS = ITEMS.register("curse_leggings",
            () -> new ArmorItem(ModArmorMaterials.CURSE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CURSE_BOOTS = ITEMS.register("curse_boots",
            () -> new ArmorItem(ModArmorMaterials.CURSE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static  void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
