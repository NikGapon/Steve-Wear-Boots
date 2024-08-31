package com.github.nikgapon.SteveWearBoots;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class AllItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SteveWearBoots.MODID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

    public static final RegistryObject<Item> Cacao = ITEMS.register("Cacao",
            () -> new Item(
                    new Item.Properties()
                            .food(new FoodProperties.Builder().alwaysEdible().nutrition(1).saturationModifier(6f).build()))

    );

}
