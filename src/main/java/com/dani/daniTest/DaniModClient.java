package com.dani.daniTest;

import net.fabricmc.api.ClientModInitializer;

public class DaniModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hello Fabric world from the client!");
    }

}
