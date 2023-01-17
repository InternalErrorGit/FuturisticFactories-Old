package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.FuturisticFactories;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlock {

    public static final List<FFRegistryBlock> list = new ArrayList<>();

    private static final DeferredRegister<Block> register = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final FFRegistryBlock ALUMINUM_ORE = new FFRegistryBlock("aluminum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock BISMUTH_ORE = new FFRegistryBlock("bismuth_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock LEAD_ORE = new FFRegistryBlock("lead_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock IRON_ORE = new FFRegistryBlock("iron_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock GALLIUM_ORE = new FFRegistryBlock("gallium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock GOLD_ORE = new FFRegistryBlock("gold_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock IRIDIUM_ORE = new FFRegistryBlock("iridium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock COPPER_ORE = new FFRegistryBlock("copper_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock NICKEL_ORE = new FFRegistryBlock("nickel_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock OSMIUM_ORE = new FFRegistryBlock("osmium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock PLATINUM_ORE = new FFRegistryBlock("platinum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock SILVER_ORE = new FFRegistryBlock("silver_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock URANIUM_ORE = new FFRegistryBlock("uranium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock ZINC_ORE = new FFRegistryBlock("zinc_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final FFRegistryBlock TIN_ORE = new FFRegistryBlock("tin_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));

    public static List<FFRegistryBlock> getAll() {
        return list;
    }

    public static List<FFRegistryBlock> getSimpleBlocks() {
        List<FFRegistryBlock> simpleBlocks = new ArrayList<>();

        simpleBlocks.add(ALUMINUM_ORE);
        simpleBlocks.add(BISMUTH_ORE);
        simpleBlocks.add(LEAD_ORE);
        simpleBlocks.add(IRON_ORE);
        simpleBlocks.add(GALLIUM_ORE);
        simpleBlocks.add(GOLD_ORE);
        simpleBlocks.add(IRIDIUM_ORE);
        simpleBlocks.add(COPPER_ORE);
        simpleBlocks.add(NICKEL_ORE);
        simpleBlocks.add(OSMIUM_ORE);
        simpleBlocks.add(PLATINUM_ORE);
        simpleBlocks.add(SILVER_ORE);
        simpleBlocks.add(URANIUM_ORE);
        simpleBlocks.add(ZINC_ORE);
        simpleBlocks.add(TIN_ORE);

        return simpleBlocks;
    }

    public static RegistryObject<Block> register(FFRegistryBlock registryBlock) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", registryBlock.getName());
        list.add(registryBlock);
        return register.register(registryBlock.getName(), registryBlock.getSupplier());
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }
}
