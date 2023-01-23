package net.internalerror.futuristicfactories.registry;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.internalerror.futuristicfactories.FFTabs;
import net.internalerror.futuristicfactories.FuturisticFactories;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFItems {

  public static final List<RegistryObject<Item>> list = new ArrayList<>();
  private static final DeferredRegister<Item> register = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

  public static final RegistryObject<Item> aluminum_clump = register("aluminum_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> aluminum_crystal = register("aluminum_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> aluminum_dust = register("aluminum_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> aluminum_dust_dirty = register("aluminum_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> aluminum_ingot = register("aluminum_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> aluminum_nugget = register("aluminum_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> aluminum_raw = register("aluminum_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> aluminum_shard = register("aluminum_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_clump = register("bismuth_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_crystal = register("bismuth_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_dust = register("bismuth_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_dust_dirty = register("bismuth_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_ingot = register("bismuth_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_nugget = register("bismuth_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_raw = register("bismuth_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> bismuth_shard = register("bismuth_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_clump = register("copper_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_crystal = register("copper_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_dust = register("copper_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_dust_dirty = register("copper_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_ingot = register("copper_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_nugget = register("copper_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_raw = register("copper_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> copper_shard = register("copper_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_clump = register("gallium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_crystal = register("gallium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_dust = register("gallium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_dust_dirty = register("gallium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_ingot = register("gallium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_nugget = register("gallium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_raw = register("gallium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gallium_shard = register("gallium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_clump = register("gold_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_crystal = register("gold_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_dust = register("gold_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_dust_dirty = register("gold_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_ingot = register("gold_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_nugget = register("gold_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_raw = register("gold_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> gold_shard = register("gold_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_clump = register("iridium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_crystal = register("iridium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_dust = register("iridium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_dust_dirty = register("iridium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_ingot = register("iridium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_nugget = register("iridium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_raw = register("iridium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iridium_shard = register("iridium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_clump = register("iron_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_crystal = register("iron_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_dust = register("iron_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_dust_dirty = register("iron_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_ingot = register("iron_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_nugget = register("iron_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_raw = register("iron_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> iron_shard = register("iron_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_clump = register("lead_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_crystal = register("lead_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_dust = register("lead_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_dust_dirty = register("lead_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_ingot = register("lead_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_nugget = register("lead_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_raw = register("lead_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> lead_shard = register("lead_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_clump = register("nickel_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_crystal = register("nickel_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_dust = register("nickel_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_dust_dirty = register("nickel_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_ingot = register("nickel_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_nugget = register("nickel_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_raw = register("nickel_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> nickel_shard = register("nickel_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_clump = register("osmium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_crystal = register("osmium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_dust = register("osmium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_dust_dirty = register("osmium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_ingot = register("osmium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_nugget = register("osmium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_raw = register("osmium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> osmium_shard = register("osmium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_clump = register("platinum_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_crystal = register("platinum_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_dust = register("platinum_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_dust_dirty = register("platinum_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_ingot = register("platinum_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_nugget = register("platinum_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_raw = register("platinum_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> platinum_shard = register("platinum_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_clump = register("silver_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_crystal = register("silver_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_dust = register("silver_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_dust_dirty = register("silver_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_ingot = register("silver_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_nugget = register("silver_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_raw = register("silver_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> silver_shard = register("silver_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_clump = register("tin_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_crystal = register("tin_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_dust = register("tin_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_dust_dirty = register("tin_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_ingot = register("tin_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_nugget = register("tin_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_raw = register("tin_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> tin_shard = register("tin_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_clump = register("uranium_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_crystal = register("uranium_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_dust = register("uranium_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_dust_dirty = register("uranium_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_ingot = register("uranium_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_nugget = register("uranium_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_raw = register("uranium_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> uranium_shard = register("uranium_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_clump = register("zinc_clump", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_crystal = register("zinc_crystal", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_dust = register("zinc_dust", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_dust_dirty = register("zinc_dust_dirty", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_ingot = register("zinc_ingot", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_nugget = register("zinc_nugget", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_raw = register("zinc_raw", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
  public static final RegistryObject<Item> zinc_shard = register("zinc_shard", () -> new Item(new Item.Properties().tab(FFTabs.MATERIALS)));
    
    
    /*
    public static final FFRegistryItem soldering_mixture = new FFRegistryItem("soldering_mixture", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem solderer = new FFRegistryItem("solderer", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem circuit_board = new FFRegistryItem("circuit_board", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem transistor = new FFRegistryItem("transistor", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem transformer = new FFRegistryItem("transformer", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem resistor = new FFRegistryItem("resistor", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem gold_wire = new FFRegistryItem("gold_wire", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem copper_wire = new FFRegistryItem("copper_wire", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem silver_wire = new FFRegistryItem("silver_wire", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_controlling_circuit = new FFRegistryItem("basic_controlling_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_controlling_circuit = new FFRegistryItem("advanced_controlling_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_controlling_circuit = new FFRegistryItem("elite_controlling_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_redstone_circuit = new FFRegistryItem("basic_redstone_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_redstone_circuit = new FFRegistryItem("advanced_redstone_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_redstone_circuit = new FFRegistryItem("elite_redstone_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_logistics_circuit = new FFRegistryItem("basic_logistics_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_logistics_circuit = new FFRegistryItem("advanced_logistics_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_logistics_circuit = new FFRegistryItem("elite_logistics_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_efficiency_circuit = new FFRegistryItem("basic_efficiency_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_efficiency_circuit = new FFRegistryItem("advanced_efficiency_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_efficiency_circuit = new FFRegistryItem("elite_efficiency_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem basic_effectivity_circuit = new FFRegistryItem("basic_effectivity_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem advanced_effectivity_circuit = new FFRegistryItem("advanced_effectivity_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    public static final FFRegistryItem elite_effectivity_circuit = new FFRegistryItem("elite_effectivity_circuit", () -> () -> new Item(new Item.Properties().tab(FFTabs.COMPONENTS)));
    
     */


  public static RegistryObject<Item> register(String pName, Supplier<Item> pItemSupplier) {
    FuturisticFactories.LOGGER.debug("Registering >> {}", pName);
    RegistryObject<Item> registryObject = register.register(pName, pItemSupplier);
    list.add(registryObject);
    return registryObject;
  }

  public static void register(IEventBus modEventBus) {
    register.register(modEventBus);
  }

  public static class Util {

    public static List<RegistryObject<Item>> getAll() {
      return list;
    }
  }
}
