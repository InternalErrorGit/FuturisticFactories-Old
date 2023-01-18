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

    // aluminum
    public static final FFRegistryBlockItem aluminum_ore = new FFRegistryBlockItem("aluminum_ore", () -> new BlockItem(FFBlock.aluminum_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem aluminum_deepslate_ore = new FFRegistryBlockItem("aluminum_deepslate_ore", () -> new BlockItem(FFBlock.aluminum_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem aluminum_block_raw = new FFRegistryBlockItem("aluminum_block_raw", () -> new BlockItem(FFBlock.aluminum_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem aluminum_block = new FFRegistryBlockItem("aluminum_block", () -> new BlockItem(FFBlock.aluminum_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem aluminum_nether_ore = new FFRegistryBlockItem("aluminum_nether_ore", () -> new BlockItem(FFBlock.aluminum_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // bismuth
    public static final FFRegistryBlockItem bismuth_ore = new FFRegistryBlockItem("bismuth_ore", () -> new BlockItem(FFBlock.bismuth_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem bismuth_deepslate_ore = new FFRegistryBlockItem("bismuth_deepslate_ore", () -> new BlockItem(FFBlock.bismuth_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem bismuth_block_raw = new FFRegistryBlockItem("bismuth_block_raw", () -> new BlockItem(FFBlock.bismuth_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem bismuth_block = new FFRegistryBlockItem("bismuth_block", () -> new BlockItem(FFBlock.bismuth_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem bismuth_nether_ore = new FFRegistryBlockItem("bismuth_nether_ore", () -> new BlockItem(FFBlock.bismuth_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // copper
    public static final FFRegistryBlockItem copper_ore = new FFRegistryBlockItem("copper_ore", () -> new BlockItem(FFBlock.copper_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem copper_deepslate_ore = new FFRegistryBlockItem("copper_deepslate_ore", () -> new BlockItem(FFBlock.copper_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem copper_block_raw = new FFRegistryBlockItem("copper_block_raw", () -> new BlockItem(FFBlock.copper_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem copper_block = new FFRegistryBlockItem("copper_block", () -> new BlockItem(FFBlock.copper_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem copper_nether_ore = new FFRegistryBlockItem("copper_nether_ore", () -> new BlockItem(FFBlock.copper_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // gallium
    public static final FFRegistryBlockItem gallium_ore = new FFRegistryBlockItem("gallium_ore", () -> new BlockItem(FFBlock.gallium_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gallium_deepslate_ore = new FFRegistryBlockItem("gallium_deepslate_ore", () -> new BlockItem(FFBlock.gallium_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gallium_block_raw = new FFRegistryBlockItem("gallium_block_raw", () -> new BlockItem(FFBlock.gallium_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gallium_block = new FFRegistryBlockItem("gallium_block", () -> new BlockItem(FFBlock.gallium_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gallium_nether_ore = new FFRegistryBlockItem("gallium_nether_ore", () -> new BlockItem(FFBlock.gallium_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // gold
    public static final FFRegistryBlockItem gold_ore = new FFRegistryBlockItem("gold_ore", () -> new BlockItem(FFBlock.gold_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gold_deepslate_ore = new FFRegistryBlockItem("gold_deepslate_ore", () -> new BlockItem(FFBlock.gold_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gold_block_raw = new FFRegistryBlockItem("gold_block_raw", () -> new BlockItem(FFBlock.gold_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gold_block = new FFRegistryBlockItem("gold_block", () -> new BlockItem(FFBlock.gold_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem gold_nether_ore = new FFRegistryBlockItem("gold_nether_ore", () -> new BlockItem(FFBlock.gold_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // iridium
    public static final FFRegistryBlockItem iridium_ore = new FFRegistryBlockItem("iridium_ore", () -> new BlockItem(FFBlock.iridium_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iridium_deepslate_ore = new FFRegistryBlockItem("iridium_deepslate_ore", () -> new BlockItem(FFBlock.iridium_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iridium_block_raw = new FFRegistryBlockItem("iridium_block_raw", () -> new BlockItem(FFBlock.iridium_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iridium_block = new FFRegistryBlockItem("iridium_block", () -> new BlockItem(FFBlock.iridium_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iridium_nether_ore = new FFRegistryBlockItem("iridium_nether_ore", () -> new BlockItem(FFBlock.iridium_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // iron
    public static final FFRegistryBlockItem iron_ore = new FFRegistryBlockItem("iron_ore", () -> new BlockItem(FFBlock.iron_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iron_deepslate_ore = new FFRegistryBlockItem("iron_deepslate_ore", () -> new BlockItem(FFBlock.iron_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iron_block_raw = new FFRegistryBlockItem("iron_block_raw", () -> new BlockItem(FFBlock.iron_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iron_block = new FFRegistryBlockItem("iron_block", () -> new BlockItem(FFBlock.iron_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem iron_nether_ore = new FFRegistryBlockItem("iron_nether_ore", () -> new BlockItem(FFBlock.iron_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // lead
    public static final FFRegistryBlockItem lead_ore = new FFRegistryBlockItem("lead_ore", () -> new BlockItem(FFBlock.lead_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem lead_deepslate_ore = new FFRegistryBlockItem("lead_deepslate_ore", () -> new BlockItem(FFBlock.lead_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem lead_block_raw = new FFRegistryBlockItem("lead_block_raw", () -> new BlockItem(FFBlock.lead_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem lead_block = new FFRegistryBlockItem("lead_block", () -> new BlockItem(FFBlock.lead_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem lead_nether_ore = new FFRegistryBlockItem("lead_nether_ore", () -> new BlockItem(FFBlock.lead_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // nickel
    public static final FFRegistryBlockItem nickel_ore = new FFRegistryBlockItem("nickel_ore", () -> new BlockItem(FFBlock.nickel_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem nickel_deepslate_ore = new FFRegistryBlockItem("nickel_deepslate_ore", () -> new BlockItem(FFBlock.nickel_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem nickel_block_raw = new FFRegistryBlockItem("nickel_block_raw", () -> new BlockItem(FFBlock.nickel_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem nickel_block = new FFRegistryBlockItem("nickel_block", () -> new BlockItem(FFBlock.nickel_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem nickel_nether_ore = new FFRegistryBlockItem("nickel_nether_ore", () -> new BlockItem(FFBlock.nickel_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // osmium
    public static final FFRegistryBlockItem osmium_ore = new FFRegistryBlockItem("osmium_ore", () -> new BlockItem(FFBlock.osmium_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem osmium_deepslate_ore = new FFRegistryBlockItem("osmium_deepslate_ore", () -> new BlockItem(FFBlock.osmium_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem osmium_block_raw = new FFRegistryBlockItem("osmium_block_raw", () -> new BlockItem(FFBlock.osmium_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem osmium_block = new FFRegistryBlockItem("osmium_block", () -> new BlockItem(FFBlock.osmium_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem osmium_nether_ore = new FFRegistryBlockItem("osmium_nether_ore", () -> new BlockItem(FFBlock.osmium_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // platinum
    public static final FFRegistryBlockItem platinum_ore = new FFRegistryBlockItem("platinum_ore", () -> new BlockItem(FFBlock.platinum_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem platinum_deepslate_ore = new FFRegistryBlockItem("platinum_deepslate_ore", () -> new BlockItem(FFBlock.platinum_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem platinum_block_raw = new FFRegistryBlockItem("platinum_block_raw", () -> new BlockItem(FFBlock.platinum_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem platinum_block = new FFRegistryBlockItem("platinum_block", () -> new BlockItem(FFBlock.platinum_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem platinum_nether_ore = new FFRegistryBlockItem("platinum_nether_ore", () -> new BlockItem(FFBlock.platinum_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // silver
    public static final FFRegistryBlockItem silver_ore = new FFRegistryBlockItem("silver_ore", () -> new BlockItem(FFBlock.silver_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem silver_deepslate_ore = new FFRegistryBlockItem("silver_deepslate_ore", () -> new BlockItem(FFBlock.silver_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem silver_block_raw = new FFRegistryBlockItem("silver_block_raw", () -> new BlockItem(FFBlock.silver_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem silver_block = new FFRegistryBlockItem("silver_block", () -> new BlockItem(FFBlock.silver_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem silver_nether_ore = new FFRegistryBlockItem("silver_nether_ore", () -> new BlockItem(FFBlock.silver_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // tin
    public static final FFRegistryBlockItem tin_ore = new FFRegistryBlockItem("tin_ore", () -> new BlockItem(FFBlock.tin_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem tin_deepslate_ore = new FFRegistryBlockItem("tin_deepslate_ore", () -> new BlockItem(FFBlock.tin_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem tin_block_raw = new FFRegistryBlockItem("tin_block_raw", () -> new BlockItem(FFBlock.tin_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem tin_block = new FFRegistryBlockItem("tin_block", () -> new BlockItem(FFBlock.tin_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem tin_nether_ore = new FFRegistryBlockItem("tin_nether_ore", () -> new BlockItem(FFBlock.tin_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // uranium
    public static final FFRegistryBlockItem uranium_ore = new FFRegistryBlockItem("uranium_ore", () -> new BlockItem(FFBlock.uranium_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem uranium_deepslate_ore = new FFRegistryBlockItem("uranium_deepslate_ore", () -> new BlockItem(FFBlock.uranium_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem uranium_block_raw = new FFRegistryBlockItem("uranium_block_raw", () -> new BlockItem(FFBlock.uranium_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem uranium_block = new FFRegistryBlockItem("uranium_block", () -> new BlockItem(FFBlock.uranium_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem uranium_nether_ore = new FFRegistryBlockItem("uranium_nether_ore", () -> new BlockItem(FFBlock.uranium_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));

    // zinc
    public static final FFRegistryBlockItem zinc_ore = new FFRegistryBlockItem("zinc_ore", () -> new BlockItem(FFBlock.zinc_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem zinc_deepslate_ore = new FFRegistryBlockItem("zinc_deepslate_ore", () -> new BlockItem(FFBlock.zinc_deepslate_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem zinc_block_raw = new FFRegistryBlockItem("zinc_block_raw", () -> new BlockItem(FFBlock.zinc_block_raw.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem zinc_block = new FFRegistryBlockItem("zinc_block", () -> new BlockItem(FFBlock.zinc_block.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryBlockItem zinc_nether_ore = new FFRegistryBlockItem("zinc_nether_ore", () -> new BlockItem(FFBlock.zinc_nether_ore.getRegistryObject().get(), new Item.Properties().tab(FFTabs.MATERIALS)));


    public static RegistryObject<Item> register(FFRegistryBlockItem registryBlockItem) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", registryBlockItem.getName());
        BLOCKITEMS.put(registryBlockItem.getName(), registryBlockItem);
        return register.register(registryBlockItem.getName(), registryBlockItem.getSupplier());
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }
}
