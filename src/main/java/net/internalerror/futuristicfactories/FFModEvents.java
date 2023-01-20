package net.internalerror.futuristicfactories;

import net.internalerror.futuristicfactories.registry.FFMenuType;
import net.internalerror.futuristicfactories.screen.CrushingMachineScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        MenuScreens.register(FFMenuType.crushing_machine_menu.get(), CrushingMachineScreen::new);
    }
}
