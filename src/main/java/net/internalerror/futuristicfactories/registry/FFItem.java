package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.FFTabs;
import net.internalerror.futuristicfactories.FuturisticFactories;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFItem {

    public static final List<FFRegistryItem> list = new ArrayList<>();
    private static final DeferredRegister<Item> register = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final FFRegistryItem ALUMINUM_INGOT = new FFRegistryItem("aluminum_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem BISMUTH_INGOT = new FFRegistryItem("bismuth_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem LEAD_INGOT = new FFRegistryItem("lead_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem IRON_INGOT = new FFRegistryItem("iron_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem GALLIUM_INGOT = new FFRegistryItem("gallium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem GOLD_INGOT = new FFRegistryItem("gold_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem IRIDIUM_INGOT = new FFRegistryItem("iridium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem COPPER_INGOT = new FFRegistryItem("copper_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem NICKEL_INGOT = new FFRegistryItem("nickel_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem OSMIUM_INGOT = new FFRegistryItem("osmium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem PLATINUM_INGOT = new FFRegistryItem("platinum_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem SILVER_INGOT = new FFRegistryItem("silver_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem URANIUM_INGOT = new FFRegistryItem("uranium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem ZINC_INGOT = new FFRegistryItem("zinc_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem TIN_INGOT = new FFRegistryItem("tin_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));


    public static RegistryObject<Item> register(FFRegistryItem registryItem) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", registryItem.getName());
        list.add(registryItem);
        return register.register(registryItem.getName(), registryItem.getSupplier());
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }

    public static List<FFRegistryItem> getAll() {
        return list;
    }
}
