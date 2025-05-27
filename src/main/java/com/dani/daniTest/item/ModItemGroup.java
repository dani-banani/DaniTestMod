package com.dani.daniTest.item;

import com.dani.daniTest.DaniMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DANI_ITEM_GROUP = Registry.register(
        Registries.ITEM_GROUP,
        Identifier.of(DaniMod.MOD_ID, "dani_item_group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.dani_item_group"))
            .icon(() -> new ItemStack(ModItems.EXAMPLEITEM))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.EXAMPLEITEM); // Add your items here1
            })
            .build()
    );
}