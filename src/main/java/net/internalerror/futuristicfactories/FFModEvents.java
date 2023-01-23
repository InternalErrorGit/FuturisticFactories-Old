package net.internalerror.futuristicfactories;

import net.internalerror.futuristicfactories.registry.FFMenuTypes;
import net.internalerror.futuristicfactories.screen.CrushingMachineScreen;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        MenuScreens.register(FFMenuTypes.crushing_machine_menu.get(), CrushingMachineScreen::new);
    }

}
