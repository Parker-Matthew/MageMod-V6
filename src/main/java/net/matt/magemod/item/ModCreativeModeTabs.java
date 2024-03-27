package net.matt.magemod.item;

import net.matt.magemod.MageMod;
import net.matt.magemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MageMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAGE_TAB = CREATIVE_MODE_TABS.register("mage_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECTOPLASM.get()))
                    .title(Component.translatable("creativetab.mage_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //items
                        output.accept(ModItems.CAMO.get());
                        output.accept(ModItems.ECTOPLASM.get());
                        output.accept(ModItems.DRY_WATER.get());
                        output.accept(ModItems.REDGLOW.get());
                        output.accept(ModItems.CURSE.get());

                        //armor
                        output.accept(ModItems.CAMO_HELMET.get());
                        output.accept(ModItems.CAMO_CHESTPLATE.get());
                        output.accept(ModItems.CAMO_LEGGINGS.get());
                        output.accept(ModItems.CAMO_BOOTS.get());

                        output.accept(ModItems.ECTOPLASM_HELMET.get());
                        output.accept(ModItems.ECTOPLASM_CHESTPLATE.get());
                        output.accept(ModItems.ECTOPLASM_LEGGINGS.get());
                        output.accept(ModItems.ECTOPLASM_BOOTS.get());

                        output.accept(ModItems.DRY_WATER_HELMET.get());
                        output.accept(ModItems.DRY_WATER_CHESTPLATE.get());
                        output.accept(ModItems.DRY_WATER_LEGGINGS.get());
                        output.accept(ModItems.DRY_WATER_BOOTS.get());

                        output.accept(ModItems.REDGLOW_HELMET.get());
                        output.accept(ModItems.REDGLOW_CHESTPLATE.get());
                        output.accept(ModItems.REDGLOW_LEGGINGS.get());
                        output.accept(ModItems.REDGLOW_BOOTS.get());

                        output.accept(ModItems.CURSE_HELMET.get());
                        output.accept(ModItems.CURSE_CHESTPLATE.get());
                        output.accept(ModItems.CURSE_LEGGINGS.get());
                        output.accept(ModItems.CURSE_BOOTS.get());

                        //output.accept(ModBlocks.MOD_PORTAL.get());

                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
