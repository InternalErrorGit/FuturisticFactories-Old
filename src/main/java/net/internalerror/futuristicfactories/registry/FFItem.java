package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.FFTabs;
import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.registry.util.FFRegistryItem;
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

    // aluminum
    public static final FFRegistryItem aluminum_clump = new FFRegistryItem("aluminum_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem aluminum_crystal = new FFRegistryItem("aluminum_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem aluminum_dust = new FFRegistryItem("aluminum_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem aluminum_dust_dirty = new FFRegistryItem("aluminum_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem aluminum_ingot = new FFRegistryItem("aluminum_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem aluminum_nugget = new FFRegistryItem("aluminum_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem aluminum_raw = new FFRegistryItem("aluminum_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem aluminum_shard = new FFRegistryItem("aluminum_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // bismuth
    public static final FFRegistryItem bismuth_clump = new FFRegistryItem("bismuth_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem bismuth_crystal = new FFRegistryItem("bismuth_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem bismuth_dust = new FFRegistryItem("bismuth_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem bismuth_dust_dirty = new FFRegistryItem("bismuth_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem bismuth_ingot = new FFRegistryItem("bismuth_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem bismuth_nugget = new FFRegistryItem("bismuth_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem bismuth_raw = new FFRegistryItem("bismuth_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem bismuth_shard = new FFRegistryItem("bismuth_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // copper
    public static final FFRegistryItem copper_clump = new FFRegistryItem("copper_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem copper_crystal = new FFRegistryItem("copper_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem copper_dust = new FFRegistryItem("copper_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem copper_dust_dirty = new FFRegistryItem("copper_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem copper_ingot = new FFRegistryItem("copper_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem copper_nugget = new FFRegistryItem("copper_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem copper_raw = new FFRegistryItem("copper_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem copper_shard = new FFRegistryItem("copper_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // gallium
    public static final FFRegistryItem gallium_clump = new FFRegistryItem("gallium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gallium_crystal = new FFRegistryItem("gallium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gallium_dust = new FFRegistryItem("gallium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gallium_dust_dirty = new FFRegistryItem("gallium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gallium_ingot = new FFRegistryItem("gallium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gallium_nugget = new FFRegistryItem("gallium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gallium_raw = new FFRegistryItem("gallium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gallium_shard = new FFRegistryItem("gallium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // gold
    public static final FFRegistryItem gold_clump = new FFRegistryItem("gold_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gold_crystal = new FFRegistryItem("gold_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gold_dust = new FFRegistryItem("gold_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gold_dust_dirty = new FFRegistryItem("gold_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gold_ingot = new FFRegistryItem("gold_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gold_nugget = new FFRegistryItem("gold_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gold_raw = new FFRegistryItem("gold_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem gold_shard = new FFRegistryItem("gold_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // iridium
    public static final FFRegistryItem iridium_clump = new FFRegistryItem("iridium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iridium_crystal = new FFRegistryItem("iridium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iridium_dust = new FFRegistryItem("iridium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iridium_dust_dirty = new FFRegistryItem("iridium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iridium_ingot = new FFRegistryItem("iridium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iridium_nugget = new FFRegistryItem("iridium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iridium_raw = new FFRegistryItem("iridium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iridium_shard = new FFRegistryItem("iridium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // iron
    public static final FFRegistryItem iron_clump = new FFRegistryItem("iron_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iron_crystal = new FFRegistryItem("iron_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iron_dust = new FFRegistryItem("iron_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iron_dust_dirty = new FFRegistryItem("iron_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iron_ingot = new FFRegistryItem("iron_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iron_nugget = new FFRegistryItem("iron_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iron_raw = new FFRegistryItem("iron_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem iron_shard = new FFRegistryItem("iron_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // lead
    public static final FFRegistryItem lead_clump = new FFRegistryItem("lead_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem lead_crystal = new FFRegistryItem("lead_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem lead_dust = new FFRegistryItem("lead_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem lead_dust_dirty = new FFRegistryItem("lead_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem lead_ingot = new FFRegistryItem("lead_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem lead_nugget = new FFRegistryItem("lead_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem lead_raw = new FFRegistryItem("lead_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem lead_shard = new FFRegistryItem("lead_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // nickel
    public static final FFRegistryItem nickel_clump = new FFRegistryItem("nickel_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem nickel_crystal = new FFRegistryItem("nickel_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem nickel_dust = new FFRegistryItem("nickel_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem nickel_dust_dirty = new FFRegistryItem("nickel_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem nickel_ingot = new FFRegistryItem("nickel_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem nickel_nugget = new FFRegistryItem("nickel_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem nickel_raw = new FFRegistryItem("nickel_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem nickel_shard = new FFRegistryItem("nickel_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // osmium
    public static final FFRegistryItem osmium_clump = new FFRegistryItem("osmium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem osmium_crystal = new FFRegistryItem("osmium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem osmium_dust = new FFRegistryItem("osmium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem osmium_dust_dirty = new FFRegistryItem("osmium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem osmium_ingot = new FFRegistryItem("osmium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem osmium_nugget = new FFRegistryItem("osmium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem osmium_raw = new FFRegistryItem("osmium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem osmium_shard = new FFRegistryItem("osmium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // platinum
    public static final FFRegistryItem platinum_clump = new FFRegistryItem("platinum_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem platinum_crystal = new FFRegistryItem("platinum_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem platinum_dust = new FFRegistryItem("platinum_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem platinum_dust_dirty = new FFRegistryItem("platinum_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem platinum_ingot = new FFRegistryItem("platinum_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem platinum_nugget = new FFRegistryItem("platinum_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem platinum_raw = new FFRegistryItem("platinum_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem platinum_shard = new FFRegistryItem("platinum_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // silver
    public static final FFRegistryItem silver_clump = new FFRegistryItem("silver_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem silver_crystal = new FFRegistryItem("silver_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem silver_dust = new FFRegistryItem("silver_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem silver_dust_dirty = new FFRegistryItem("silver_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem silver_ingot = new FFRegistryItem("silver_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem silver_nugget = new FFRegistryItem("silver_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem silver_raw = new FFRegistryItem("silver_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem silver_shard = new FFRegistryItem("silver_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // tin
    public static final FFRegistryItem tin_clump = new FFRegistryItem("tin_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem tin_crystal = new FFRegistryItem("tin_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem tin_dust = new FFRegistryItem("tin_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem tin_dust_dirty = new FFRegistryItem("tin_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem tin_ingot = new FFRegistryItem("tin_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem tin_nugget = new FFRegistryItem("tin_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem tin_raw = new FFRegistryItem("tin_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem tin_shard = new FFRegistryItem("tin_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // uranium
    public static final FFRegistryItem uranium_clump = new FFRegistryItem("uranium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem uranium_crystal = new FFRegistryItem("uranium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem uranium_dust = new FFRegistryItem("uranium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem uranium_dust_dirty = new FFRegistryItem("uranium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem uranium_ingot = new FFRegistryItem("uranium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem uranium_nugget = new FFRegistryItem("uranium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem uranium_raw = new FFRegistryItem("uranium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem uranium_shard = new FFRegistryItem("uranium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    // zinc
    public static final FFRegistryItem zinc_clump = new FFRegistryItem("zinc_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem zinc_crystal = new FFRegistryItem("zinc_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem zinc_dust = new FFRegistryItem("zinc_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem zinc_dust_dirty = new FFRegistryItem("zinc_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem zinc_ingot = new FFRegistryItem("zinc_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem zinc_nugget = new FFRegistryItem("zinc_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem zinc_raw = new FFRegistryItem("zinc_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    public static final FFRegistryItem zinc_shard = new FFRegistryItem("zinc_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));

    public static final FFRegistryItem soldering_mixture = new FFRegistryItem("soldering_mixture", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem solderer = new FFRegistryItem("solderer", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem circuit_board = new FFRegistryItem("circuit_board", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem transistor = new FFRegistryItem("transistor", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem transformer = new FFRegistryItem("transformer", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem resistor = new FFRegistryItem("resistor", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem gold_wire = new FFRegistryItem("gold_wire", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem copper_wire = new FFRegistryItem("copper_wire", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem silver_wire = new FFRegistryItem("silver_wire", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));

    public static final FFRegistryItem basic_controlling_circuit = new FFRegistryItem("basic_controlling_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_controlling_circuit = new FFRegistryItem("advanced_controlling_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_controlling_circuit = new FFRegistryItem("elite_controlling_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_redstone_circuit = new FFRegistryItem("basic_redstone_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_redstone_circuit = new FFRegistryItem("advanced_redstone_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_redstone_circuit = new FFRegistryItem("elite_redstone_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_logistics_circuit = new FFRegistryItem("basic_logistics_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_logistics_circuit = new FFRegistryItem("advanced_logistics_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_logistics_circuit = new FFRegistryItem("elite_logistics_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_efficiency_circuit = new FFRegistryItem("basic_efficiency_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_efficiency_circuit = new FFRegistryItem("advanced_efficiency_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_efficiency_circuit = new FFRegistryItem("elite_efficiency_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_effectivity_circuit = new FFRegistryItem("basic_effectivity_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_effectivity_circuit = new FFRegistryItem("advanced_effectivity_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_effectivity_circuit = new FFRegistryItem("elite_effectivity_circuit", () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));


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
