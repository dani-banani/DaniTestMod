package com.dani.daniTest.item;

import com.dani.daniTest.DaniMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item EXAMPLEITEM = registerItem("example_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DaniMod.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        DaniMod.LOGGER.info("Registering Mod Items for " + DaniMod.MOD_ID);
    }
}