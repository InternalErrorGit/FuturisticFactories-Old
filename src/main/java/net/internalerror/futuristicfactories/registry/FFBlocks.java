package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.block.entity.machine.pulverizing.PulverizingMachineBlock;
import net.internalerror.futuristicfactories.block.entity.machine.crushing.CrushingMachineBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public final class FFBlocks {

    public static final List<RegistryObject<Block>> list = new ArrayList<>();
    private static final DeferredRegister<Block> register = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> aluminum_ore = register("aluminum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> aluminum_deepslate_ore = register("aluminum_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(aluminum_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> aluminum_block_raw = register("aluminum_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> aluminum_block = register("aluminum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> aluminum_nether_ore = register("aluminum_nether_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> bismuth_ore = register("bismuth_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> bismuth_deepslate_ore = register("bismuth_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(bismuth_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> bismuth_block_raw = register("bismuth_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> bismuth_block = register("bismuth_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> bismuth_nether_ore = register("bismuth_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> copper_ore = register("copper_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> copper_deepslate_ore = register("copper_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(copper_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> copper_block_raw = register("copper_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> copper_block = register("copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> copper_nether_ore = register("copper_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> gallium_ore = register("gallium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> gallium_deepslate_ore = register("gallium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(gallium_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> gallium_block_raw = register("gallium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> gallium_block = register("gallium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> gallium_nether_ore = register("gallium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> gold_ore = register("gold_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> gold_deepslate_ore = register("gold_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(gold_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> gold_block_raw = register("gold_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> gold_block = register("gold_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> gold_nether_ore = register("gold_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> iridium_ore = register("iridium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> iridium_deepslate_ore = register("iridium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(iridium_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> iridium_block_raw = register("iridium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> iridium_block = register("iridium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> iridium_nether_ore = register("iridium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> iron_ore = register("iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> iron_deepslate_ore = register("iron_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(iron_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> iron_block_raw = register("iron_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> iron_block = register("iron_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> iron_nether_ore = register("iron_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> lead_ore = register("lead_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> lead_deepslate_ore = register("lead_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(lead_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> lead_block_raw = register("lead_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> lead_block = register("lead_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> lead_nether_ore = register("lead_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> nickel_ore = register("nickel_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> nickel_deepslate_ore = register("nickel_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(nickel_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> nickel_block_raw = register("nickel_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> nickel_block = register("nickel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> nickel_nether_ore = register("nickel_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> osmium_ore = register("osmium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> osmium_deepslate_ore = register("osmium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(osmium_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> osmium_block_raw = register("osmium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> osmium_block = register("osmium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> osmium_nether_ore = register("osmium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> platinum_ore = register("platinum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> platinum_deepslate_ore = register("platinum_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(platinum_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> platinum_block_raw = register("platinum_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> platinum_block = register("platinum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> platinum_nether_ore = register("platinum_nether_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> silver_ore = register("silver_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> silver_deepslate_ore = register("silver_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(silver_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> silver_block_raw = register("silver_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> silver_block = register("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> silver_nether_ore = register("silver_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> tin_ore = register("tin_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> tin_deepslate_ore = register("tin_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(tin_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> tin_block_raw = register("tin_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> tin_block = register("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> tin_nether_ore = register("tin_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> uranium_ore = register("uranium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> uranium_deepslate_ore = register("uranium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(uranium_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> uranium_block_raw = register("uranium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> uranium_block = register("uranium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> uranium_nether_ore = register("uranium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> zinc_ore = register("zinc_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final RegistryObject<Block> zinc_deepslate_ore = register("zinc_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(zinc_ore.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> zinc_block_raw = register("zinc_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> zinc_block = register("zinc_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> zinc_nether_ore = register("zinc_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    public static final RegistryObject<Block> crushing_machine = register("crushing_machine", () -> new CrushingMachineBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()));
    public static final RegistryObject<Block> pulverizing_machine = register("pulverizing_machine", () -> new PulverizingMachineBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops().noOcclusion()));

    private static RegistryObject<Block> register(String pName, Supplier<Block> pBlockSupplier) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", pName);
        RegistryObject<Block> registryObject = register.register(pName, pBlockSupplier);
        list.add(registryObject);
        return registryObject;
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }

    public static final class Util {


        public static List<RegistryObject<Block>> getSimpleBlocks() {
            List<RegistryObject<Block>> list = new ArrayList<>();
            list.add(aluminum_ore);
            list.add(aluminum_deepslate_ore);
            list.add(aluminum_block_raw);
            list.add(aluminum_block);
            list.add(aluminum_nether_ore);
            list.add(bismuth_ore);
            list.add(bismuth_deepslate_ore);
            list.add(bismuth_block_raw);
            list.add(bismuth_block);
            list.add(bismuth_nether_ore);
            list.add(copper_ore);
            list.add(copper_deepslate_ore);
            list.add(copper_block_raw);
            list.add(copper_block);
            list.add(copper_nether_ore);
            list.add(gallium_ore);
            list.add(gallium_deepslate_ore);
            list.add(gallium_block_raw);
            list.add(gallium_block);
            list.add(gallium_nether_ore);
            list.add(gold_ore);
            list.add(gold_deepslate_ore);
            list.add(gold_block_raw);
            list.add(gold_block);
            list.add(gold_nether_ore);
            list.add(iridium_ore);
            list.add(iridium_deepslate_ore);
            list.add(iridium_block_raw);
            list.add(iridium_block);
            list.add(iridium_nether_ore);
            list.add(iron_ore);
            list.add(iron_deepslate_ore);
            list.add(iron_block_raw);
            list.add(iron_block);
            list.add(iron_nether_ore);
            list.add(lead_ore);
            list.add(lead_deepslate_ore);
            list.add(lead_block_raw);
            list.add(lead_block);
            list.add(lead_nether_ore);
            list.add(nickel_ore);
            list.add(nickel_deepslate_ore);
            list.add(nickel_block_raw);
            list.add(nickel_block);
            list.add(nickel_nether_ore);
            list.add(osmium_ore);
            list.add(osmium_deepslate_ore);
            list.add(osmium_block_raw);
            list.add(osmium_block);
            list.add(osmium_nether_ore);
            list.add(platinum_ore);
            list.add(platinum_deepslate_ore);
            list.add(platinum_block_raw);
            list.add(platinum_block);
            list.add(platinum_nether_ore);
            list.add(silver_ore);
            list.add(silver_deepslate_ore);
            list.add(silver_block_raw);
            list.add(silver_block);
            list.add(silver_nether_ore);
            list.add(tin_ore);
            list.add(tin_deepslate_ore);
            list.add(tin_block_raw);
            list.add(tin_block);
            list.add(tin_nether_ore);
            list.add(uranium_ore);
            list.add(uranium_deepslate_ore);
            list.add(uranium_block_raw);
            list.add(uranium_block);
            list.add(uranium_nether_ore);
            list.add(zinc_ore);
            list.add(zinc_deepslate_ore);
            list.add(zinc_block_raw);
            list.add(zinc_block);
            list.add(zinc_nether_ore);

            return list;
        }

        public static List<RegistryObject<Block>> getAll() {
            return list;
        }
    }
}
