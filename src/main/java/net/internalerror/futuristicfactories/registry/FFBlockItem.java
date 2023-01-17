package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.FFTabs;
import net.internalerror.futuristicfactories.FuturisticFactories;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlockItem {

    public static final Map<String, FFRegistryBlockItem> BLOCKITEMS = new HashMap<>();
    private static final DeferredRegister<Item> register = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static FFRegistryBlockItem ALUMINUM_ORE = new FFRegistryBlockItem("aluminum_ore", () -> new BlockItem(FFBlock.ALUMINUM_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem BISMUTH_ORE = new FFRegistryBlockItem("bismuth_ore", () -> new BlockItem(FFBlock.BISMUTH_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem LEAD_ORE = new FFRegistryBlockItem("lead_ore", () -> new BlockItem(FFBlock.LEAD_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem IRON_ORE = new FFRegistryBlockItem("iron_ore", () -> new BlockItem(FFBlock.IRON_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem GALLIUM_ORE = new FFRegistryBlockItem("gallium_ore", () -> new BlockItem(FFBlock.GALLIUM_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem GOLD_ORE = new FFRegistryBlockItem("gold_ore", () -> new BlockItem(FFBlock.GOLD_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem IRIDIUM_ORE = new FFRegistryBlockItem("iridium_ore", () -> new BlockItem(FFBlock.IRIDIUM_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem COPPER_ORE = new FFRegistryBlockItem("copper_ore", () -> new BlockItem(FFBlock.COPPER_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem NICKEL_ORE = new FFRegistryBlockItem("nickel_ore", () -> new BlockItem(FFBlock.NICKEL_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem OSMIUM_ORE = new FFRegistryBlockItem("osmium_ore", () -> new BlockItem(FFBlock.OSMIUM_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem PLATINUM_ORE = new FFRegistryBlockItem("platinum_ore", () -> new BlockItem(FFBlock.PLATINUM_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem SILVER_ORE = new FFRegistryBlockItem("silver_ore", () -> new BlockItem(FFBlock.SILVER_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem URANIUM_ORE = new FFRegistryBlockItem("uranium_ore", () -> new BlockItem(FFBlock.URANIUM_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem ZINC_ORE = new FFRegistryBlockItem("zinc_ore", () -> new BlockItem(FFBlock.ZINC_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static FFRegistryBlockItem TIN_ORE = new FFRegistryBlockItem("tin_ore", () -> new BlockItem(FFBlock.TIN_ORE.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));


    public static RegistryObject<Item> register(FFRegistryBlockItem registryBlockItem) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", registryBlockItem.getName());
        BLOCKITEMS.put(registryBlockItem.getName(), registryBlockItem);
        return register.register(registryBlockItem.getName(), registryBlockItem.getSupplier());
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }
}
