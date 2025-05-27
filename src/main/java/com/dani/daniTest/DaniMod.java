package com.dani.daniTest;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dani.daniTest.item.ModItemGroup;
import com.dani.daniTest.item.ModItems;

public class DaniMod implements ModInitializer {
    public static final String MOD_ID = "danimod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
		ModItems.initialize();
        ModItemGroup.DANI_ITEM_GROUP.getDisplayName();
        LOGGER.info("Hello Fabric world!");
    }
}