package com.alxolotl.organics;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = Organics.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Organics.MOD_ID, value = Dist.CLIENT)
public class OrganicsClient {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
