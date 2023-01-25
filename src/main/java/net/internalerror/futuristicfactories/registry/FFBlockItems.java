package net.internalerror.futuristicfactories.registry;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import net.internalerror.futuristicfactories.FFTabs;
import net.internalerror.futuristicfactories.FuturisticFactories;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFBlockItems {

    public static final List<RegistryObject<Item>> list = new ArrayList<>();
    private static final DeferredRegister<Item> register = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> aluminum_ore = register("aluminum_ore", () -> new BlockItem(FFBlocks.aluminum_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> aluminum_deepslate_ore = register("aluminum_deepslate_ore", () -> new BlockItem(FFBlocks.aluminum_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> aluminum_block_raw = register("aluminum_block_raw", () -> new BlockItem(FFBlocks.aluminum_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> aluminum_block = register("aluminum_block", () -> new BlockItem(FFBlocks.aluminum_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> aluminum_nether_ore = register("aluminum_nether_ore", () -> new BlockItem(FFBlocks.aluminum_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> bismuth_ore = register("bismuth_ore", () -> new BlockItem(FFBlocks.bismuth_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> bismuth_deepslate_ore = register("bismuth_deepslate_ore", () -> new BlockItem(FFBlocks.bismuth_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> bismuth_block_raw = register("bismuth_block_raw", () -> new BlockItem(FFBlocks.bismuth_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> bismuth_block = register("bismuth_block", () -> new BlockItem(FFBlocks.bismuth_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> bismuth_nether_ore = register("bismuth_nether_ore", () -> new BlockItem(FFBlocks.bismuth_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> copper_ore = register("copper_ore", () -> new BlockItem(FFBlocks.copper_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> copper_deepslate_ore = register("copper_deepslate_ore", () -> new BlockItem(FFBlocks.copper_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> copper_block_raw = register("copper_block_raw", () -> new BlockItem(FFBlocks.copper_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> copper_block = register("copper_block", () -> new BlockItem(FFBlocks.copper_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> copper_nether_ore = register("copper_nether_ore", () -> new BlockItem(FFBlocks.copper_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gallium_ore = register("gallium_ore", () -> new BlockItem(FFBlocks.gallium_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gallium_deepslate_ore = register("gallium_deepslate_ore", () -> new BlockItem(FFBlocks.gallium_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gallium_block_raw = register("gallium_block_raw", () -> new BlockItem(FFBlocks.gallium_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gallium_block = register("gallium_block", () -> new BlockItem(FFBlocks.gallium_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gallium_nether_ore = register("gallium_nether_ore", () -> new BlockItem(FFBlocks.gallium_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gold_ore = register("gold_ore", () -> new BlockItem(FFBlocks.gold_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gold_deepslate_ore = register("gold_deepslate_ore", () -> new BlockItem(FFBlocks.gold_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gold_block_raw = register("gold_block_raw", () -> new BlockItem(FFBlocks.gold_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gold_block = register("gold_block", () -> new BlockItem(FFBlocks.gold_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> gold_nether_ore = register("gold_nether_ore", () -> new BlockItem(FFBlocks.gold_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iridium_ore = register("iridium_ore", () -> new BlockItem(FFBlocks.iridium_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iridium_deepslate_ore = register("iridium_deepslate_ore", () -> new BlockItem(FFBlocks.iridium_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iridium_block_raw = register("iridium_block_raw", () -> new BlockItem(FFBlocks.iridium_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iridium_block = register("iridium_block", () -> new BlockItem(FFBlocks.iridium_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iridium_nether_ore = register("iridium_nether_ore", () -> new BlockItem(FFBlocks.iridium_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iron_ore = register("iron_ore", () -> new BlockItem(FFBlocks.iron_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iron_deepslate_ore = register("iron_deepslate_ore", () -> new BlockItem(FFBlocks.iron_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iron_block_raw = register("iron_block_raw", () -> new BlockItem(FFBlocks.iron_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iron_block = register("iron_block", () -> new BlockItem(FFBlocks.iron_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> iron_nether_ore = register("iron_nether_ore", () -> new BlockItem(FFBlocks.iron_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> lead_ore = register("lead_ore", () -> new BlockItem(FFBlocks.lead_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> lead_deepslate_ore = register("lead_deepslate_ore", () -> new BlockItem(FFBlocks.lead_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> lead_block_raw = register("lead_block_raw", () -> new BlockItem(FFBlocks.lead_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> lead_block = register("lead_block", () -> new BlockItem(FFBlocks.lead_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> lead_nether_ore = register("lead_nether_ore", () -> new BlockItem(FFBlocks.lead_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> nickel_ore = register("nickel_ore", () -> new BlockItem(FFBlocks.nickel_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> nickel_deepslate_ore = register("nickel_deepslate_ore", () -> new BlockItem(FFBlocks.nickel_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> nickel_block_raw = register("nickel_block_raw", () -> new BlockItem(FFBlocks.nickel_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> nickel_block = register("nickel_block", () -> new BlockItem(FFBlocks.nickel_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> nickel_nether_ore = register("nickel_nether_ore", () -> new BlockItem(FFBlocks.nickel_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> osmium_ore = register("osmium_ore", () -> new BlockItem(FFBlocks.osmium_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> osmium_deepslate_ore = register("osmium_deepslate_ore", () -> new BlockItem(FFBlocks.osmium_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> osmium_block_raw = register("osmium_block_raw", () -> new BlockItem(FFBlocks.osmium_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> osmium_block = register("osmium_block", () -> new BlockItem(FFBlocks.osmium_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> osmium_nether_ore = register("osmium_nether_ore", () -> new BlockItem(FFBlocks.osmium_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> platinum_ore = register("platinum_ore", () -> new BlockItem(FFBlocks.platinum_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> platinum_deepslate_ore = register("platinum_deepslate_ore", () -> new BlockItem(FFBlocks.platinum_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> platinum_block_raw = register("platinum_block_raw", () -> new BlockItem(FFBlocks.platinum_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> platinum_block = register("platinum_block", () -> new BlockItem(FFBlocks.platinum_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> platinum_nether_ore = register("platinum_nether_ore", () -> new BlockItem(FFBlocks.platinum_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> silver_ore = register("silver_ore", () -> new BlockItem(FFBlocks.silver_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> silver_deepslate_ore = register("silver_deepslate_ore", () -> new BlockItem(FFBlocks.silver_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> silver_block_raw = register("silver_block_raw", () -> new BlockItem(FFBlocks.silver_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> silver_block = register("silver_block", () -> new BlockItem(FFBlocks.silver_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> silver_nether_ore = register("silver_nether_ore", () -> new BlockItem(FFBlocks.silver_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> tin_ore = register("tin_ore", () -> new BlockItem(FFBlocks.tin_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> tin_deepslate_ore = register("tin_deepslate_ore", () -> new BlockItem(FFBlocks.tin_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> tin_block_raw = register("tin_block_raw", () -> new BlockItem(FFBlocks.tin_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> tin_block = register("tin_block", () -> new BlockItem(FFBlocks.tin_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> tin_nether_ore = register("tin_nether_ore", () -> new BlockItem(FFBlocks.tin_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> uranium_ore = register("uranium_ore", () -> new BlockItem(FFBlocks.uranium_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> uranium_deepslate_ore = register("uranium_deepslate_ore", () -> new BlockItem(FFBlocks.uranium_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> uranium_block_raw = register("uranium_block_raw", () -> new BlockItem(FFBlocks.uranium_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> uranium_block = register("uranium_block", () -> new BlockItem(FFBlocks.uranium_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> uranium_nether_ore = register("uranium_nether_ore", () -> new BlockItem(FFBlocks.uranium_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> zinc_ore = register("zinc_ore", () -> new BlockItem(FFBlocks.zinc_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> zinc_deepslate_ore = register("zinc_deepslate_ore", () -> new BlockItem(FFBlocks.zinc_deepslate_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> zinc_block_raw = register("zinc_block_raw", () -> new BlockItem(FFBlocks.zinc_block_raw.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> zinc_block = register("zinc_block", () -> new BlockItem(FFBlocks.zinc_block.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> zinc_nether_ore = register("zinc_nether_ore", () -> new BlockItem(FFBlocks.zinc_nether_ore.get(), new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final RegistryObject<Item> crushing_machine = register("crushing_machine", () -> new BlockItem(FFBlocks.crushing_machine.get(), new Item.Properties().tab(FFTabs.MACHINES)));

    public static RegistryObject<Item> register(String pName, Supplier<Item> pItemSupplier) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", pName);
        RegistryObject<Item> registryObject = register.register(pName, pItemSupplier);
        list.add(registryObject);
        return registryObject;
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }
}
