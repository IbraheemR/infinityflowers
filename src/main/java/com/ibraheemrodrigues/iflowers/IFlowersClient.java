package com.ibraheemrodrigues.iflowers;

import net.fabricmc.api.ClientModInitializer;

public class IFlowersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Flowers100.initClient();
    }
}
