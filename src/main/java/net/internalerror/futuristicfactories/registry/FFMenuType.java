package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.screen.CrushingMachineMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFMenuType {

    public static final DeferredRegister<MenuType<?>> register =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, MOD_ID);

    public static final RegistryObject<MenuType<CrushingMachineMenu>> crushing_machine_menu = registerMenuType(CrushingMachineMenu::new, "crushing_machine_menu");


    public static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return register.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }


}
