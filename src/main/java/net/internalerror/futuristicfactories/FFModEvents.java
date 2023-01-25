package net.internalerror.futuristicfactories;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;
import net.internalerror.futuristicfactories.gui.screen.CrushingMachineScreen;
import net.internalerror.futuristicfactories.gui.screen.PulverizingMachineScreen;
import net.internalerror.futuristicfactories.registry.FFMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFModEvents {
  @SubscribeEvent
  public static void onClientSetup(FMLClientSetupEvent event) {
    MenuScreens.register(FFMenuTypes.crushing_machine_menu.get(), CrushingMachineScreen::new);
    MenuScreens.register(FFMenuTypes.pulverizing_machine_menu.get(), PulverizingMachineScreen::new);
  }
  
}
