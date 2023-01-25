package net.internalerror.futuristicfactories.registry;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

import net.internalerror.futuristicfactories.gui.menu.CrushingMachineMenu;
import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.gui.menu.PulverizingMachineMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFMenuTypes {

  public static final DeferredRegister<MenuType<?>> register =
      DeferredRegister.create(ForgeRegistries.MENU_TYPES, MOD_ID);

  public static final RegistryObject<MenuType<CrushingMachineMenu>> crushing_machine_menu = register("crushing_machine_menu", CrushingMachineMenu::new);
  public static final RegistryObject<MenuType<PulverizingMachineMenu>> pulverizing_machine_menu = register("pulverizing_machine_menu", PulverizingMachineMenu::new);

  
  public static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> register(String pName, IContainerFactory<T> factory) {
    FuturisticFactories.LOGGER.debug("Registering >> {}", pName);
    return register.register(pName, () -> IForgeMenuType.create(factory));
  }

  public static void register(IEventBus modEventBus) {
    register.register(modEventBus);
  }

}
