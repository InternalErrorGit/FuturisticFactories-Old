package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.FuturisticFactories;
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

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public final class FFBlock {

    public static final List<FFRegistryObject<Block>> list = new ArrayList<>();
    private static final DeferredRegister<Block> register = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    // aluminum
    public static final FFRegistryBlock aluminum_ore = new FFRegistryBlock("aluminum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock aluminum_deepslate_ore = new FFRegistryBlock("aluminum_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(aluminum_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock aluminum_block_raw = new FFRegistryBlock("aluminum_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock aluminum_block = new FFRegistryBlock("aluminum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock aluminum_nether_ore = new FFRegistryBlock("aluminum_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // bismuth
    public static final FFRegistryBlock bismuth_ore = new FFRegistryBlock("bismuth_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock bismuth_deepslate_ore = new FFRegistryBlock("bismuth_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(bismuth_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock bismuth_block_raw = new FFRegistryBlock("bismuth_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock bismuth_block = new FFRegistryBlock("bismuth_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock bismuth_nether_ore = new FFRegistryBlock("bismuth_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // copper
    public static final FFRegistryBlock copper_ore = new FFRegistryBlock("copper_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock copper_deepslate_ore = new FFRegistryBlock("copper_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(copper_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock copper_block_raw = new FFRegistryBlock("copper_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock copper_block = new FFRegistryBlock("copper_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock copper_nether_ore = new FFRegistryBlock("copper_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // gallium
    public static final FFRegistryBlock gallium_ore = new FFRegistryBlock("gallium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock gallium_deepslate_ore = new FFRegistryBlock("gallium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(gallium_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock gallium_block_raw = new FFRegistryBlock("gallium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock gallium_block = new FFRegistryBlock("gallium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock gallium_nether_ore = new FFRegistryBlock("gallium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // gold
    public static final FFRegistryBlock gold_ore = new FFRegistryBlock("gold_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock gold_deepslate_ore = new FFRegistryBlock("gold_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(gold_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock gold_block_raw = new FFRegistryBlock("gold_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock gold_block = new FFRegistryBlock("gold_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock gold_nether_ore = new FFRegistryBlock("gold_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // iridium
    public static final FFRegistryBlock iridium_ore = new FFRegistryBlock("iridium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock iridium_deepslate_ore = new FFRegistryBlock("iridium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(iridium_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock iridium_block_raw = new FFRegistryBlock("iridium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock iridium_block = new FFRegistryBlock("iridium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock iridium_nether_ore = new FFRegistryBlock("iridium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // iron
    public static final FFRegistryBlock iron_ore = new FFRegistryBlock("iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock iron_deepslate_ore = new FFRegistryBlock("iron_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(iron_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock iron_block_raw = new FFRegistryBlock("iron_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock iron_block = new FFRegistryBlock("iron_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock iron_nether_ore = new FFRegistryBlock("iron_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // lead
    public static final FFRegistryBlock lead_ore = new FFRegistryBlock("lead_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock lead_deepslate_ore = new FFRegistryBlock("lead_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(lead_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock lead_block_raw = new FFRegistryBlock("lead_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock lead_block = new FFRegistryBlock("lead_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock lead_nether_ore = new FFRegistryBlock("lead_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // nickel
    public static final FFRegistryBlock nickel_ore = new FFRegistryBlock("nickel_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock nickel_deepslate_ore = new FFRegistryBlock("nickel_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(nickel_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock nickel_block_raw = new FFRegistryBlock("nickel_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock nickel_block = new FFRegistryBlock("nickel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock nickel_nether_ore = new FFRegistryBlock("nickel_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // osmium
    public static final FFRegistryBlock osmium_ore = new FFRegistryBlock("osmium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock osmium_deepslate_ore = new FFRegistryBlock("osmium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(osmium_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock osmium_block_raw = new FFRegistryBlock("osmium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock osmium_block = new FFRegistryBlock("osmium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock osmium_nether_ore = new FFRegistryBlock("osmium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // platinum
    public static final FFRegistryBlock platinum_ore = new FFRegistryBlock("platinum_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock platinum_deepslate_ore = new FFRegistryBlock("platinum_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(platinum_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock platinum_block_raw = new FFRegistryBlock("platinum_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock platinum_block = new FFRegistryBlock("platinum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock platinum_nether_ore = new FFRegistryBlock("platinum_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // silver
    public static final FFRegistryBlock silver_ore = new FFRegistryBlock("silver_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock silver_deepslate_ore = new FFRegistryBlock("silver_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(silver_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock silver_block_raw = new FFRegistryBlock("silver_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock silver_block = new FFRegistryBlock("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock silver_nether_ore = new FFRegistryBlock("silver_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // tin
    public static final FFRegistryBlock tin_ore = new FFRegistryBlock("tin_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock tin_deepslate_ore = new FFRegistryBlock("tin_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(tin_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock tin_block_raw = new FFRegistryBlock("tin_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock tin_block = new FFRegistryBlock("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock tin_nether_ore = new FFRegistryBlock("tin_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // uranium
    public static final FFRegistryBlock uranium_ore = new FFRegistryBlock("uranium_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock uranium_deepslate_ore = new FFRegistryBlock("uranium_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(uranium_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock uranium_block_raw = new FFRegistryBlock("uranium_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock uranium_block = new FFRegistryBlock("uranium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock uranium_nether_ore = new FFRegistryBlock("uranium_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));

    // zinc
    public static final FFRegistryBlock zinc_ore = new FFRegistryBlock("zinc_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
    public static final FFRegistryBlock zinc_deepslate_ore = new FFRegistryBlock("zinc_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(zinc_ore.getRegistryObject().get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final FFRegistryBlock zinc_block_raw = new FFRegistryBlock("zinc_block_raw", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.RAW_IRON).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final FFRegistryBlock zinc_block = new FFRegistryBlock("zinc_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final FFRegistryBlock zinc_nether_ore = new FFRegistryBlock("zinc_nether_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_GOLD_ORE), UniformInt.of(0, 1)));


    public static RegistryObject<Block> register(FFRegistryObject<Block> registryBlock) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", registryBlock.getName());
        list.add(registryBlock);
        return register.register(registryBlock.getName(), registryBlock.getSupplier());
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }

    public static final class Util {

        public static List<FFRegistryObject<Block>> getBlocks() {
            return list;
        }

        public static List<FFRegistryBlock> getDeepslateOres() {
            List<FFRegistryBlock> list = new ArrayList<>();
            list.add(aluminum_deepslate_ore);
            list.add(bismuth_deepslate_ore);
            list.add(copper_deepslate_ore);
            list.add(gallium_deepslate_ore);
            list.add(gold_deepslate_ore);
            list.add(iridium_deepslate_ore);
            list.add(iron_deepslate_ore);
            list.add(lead_deepslate_ore);
            list.add(nickel_deepslate_ore);
            list.add(osmium_deepslate_ore);
            list.add(platinum_deepslate_ore);
            list.add(silver_deepslate_ore);
            list.add(tin_deepslate_ore);
            list.add(uranium_deepslate_ore);
            list.add(zinc_deepslate_ore);
            return list;
        }

        public static List<FFRegistryBlock> getOres() {
            List<FFRegistryBlock> list = new ArrayList<>();
            list.add(aluminum_ore);
            list.add(bismuth_ore);
            list.add(copper_ore);
            list.add(gallium_ore);
            list.add(gold_ore);
            list.add(iridium_ore);
            list.add(iron_ore);
            list.add(lead_ore);
            list.add(nickel_ore);
            list.add(osmium_ore);
            list.add(platinum_ore);
            list.add(silver_ore);
            list.add(tin_ore);
            list.add(uranium_ore);
            list.add(zinc_ore);

            return list;
        }

        public static List<FFRegistryBlock> getRawBlocks() {
            List<FFRegistryBlock> list = new ArrayList<>();
            list.add(aluminum_block_raw);
            list.add(bismuth_block_raw);
            list.add(copper_block_raw);
            list.add(gallium_block_raw);
            list.add(gold_block_raw);
            list.add(iridium_block_raw);
            list.add(iron_block_raw);
            list.add(lead_block_raw);
            list.add(nickel_block_raw);
            list.add(osmium_block_raw);
            list.add(platinum_block_raw);
            list.add(silver_block_raw);
            list.add(tin_block_raw);
            list.add(uranium_block_raw);
            list.add(zinc_block_raw);
            return list;
        }

        public static List<FFRegistryBlock> getStorageBlocks() {
            List<FFRegistryBlock> list = new ArrayList<>();
            list.add(aluminum_block);
            list.add(bismuth_block);
            list.add(copper_block);
            list.add(gallium_block);
            list.add(gold_block);
            list.add(iridium_block);
            list.add(iron_block);
            list.add(lead_block);
            list.add(nickel_block);
            list.add(osmium_block);
            list.add(platinum_block);
            list.add(silver_block);
            list.add(tin_block);
            list.add(uranium_block);
            list.add(zinc_block);
            return list;
        }

        public static List<FFRegistryBlock> getNetherOres() {
            List<FFRegistryBlock> list = new ArrayList<>();
            list.add(aluminum_nether_ore);
            list.add(bismuth_nether_ore);
            list.add(copper_nether_ore);
            list.add(gallium_nether_ore);
            list.add(gold_nether_ore);
            list.add(iridium_nether_ore);
            list.add(iron_nether_ore);
            list.add(lead_nether_ore);
            list.add(nickel_nether_ore);
            list.add(osmium_nether_ore);
            list.add(platinum_nether_ore);
            list.add(silver_nether_ore);
            list.add(tin_nether_ore);
            list.add(uranium_nether_ore);
            list.add(zinc_nether_ore);
            return list;
        }

        public static List<FFRegistryBlock> getSimpleBlocks() {
            List<FFRegistryBlock> list = new ArrayList<>();
            list.addAll(getDeepslateOres());
            list.addAll(getOres());
            list.addAll(getRawBlocks());
            list.addAll(getStorageBlocks());
            list.addAll(getNetherOres());
            return list;
        }
    }
}
