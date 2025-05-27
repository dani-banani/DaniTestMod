package com.dani.daniTest.item;

import net.minecraft.registry.Registry;
import com.dani.daniTest.DaniMod;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup DANI_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(DaniMod.MOD_ID, "example_item"),
    FabricItemGroup.builder().displayName(Text.translatable("itemGroup.dani_item_group"))
            .icon(() -> new ItemStack(ModItems.EXAMPLEITEM)).entries((displayContext,entries)->{

            }).build()); // Change to your desired icon item
}