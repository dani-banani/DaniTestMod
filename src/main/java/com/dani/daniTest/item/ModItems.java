package com.dani.daniTest.item;

import java.util.function.Function;

import com.dani.daniTest.DaniMod;
import com.dani.daniTest.item.custom.LightningStrike;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void initialize() {
    }
	public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DaniMod.MOD_ID, name));
		Item item = itemFactory.apply(settings.registryKey(itemKey));
		Registry.register(Registries.ITEM, itemKey, item);
		return item;
	}
    public static final Item EXAMPLEITEM = register("example_item", LightningStrike::new, new Item.Settings().maxCount(1));

}