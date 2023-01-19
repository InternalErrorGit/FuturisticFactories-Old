package net.internalerror.futuristicfactories.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class FFBlockTags {
    public static final TagKey<Block> aluminum_ore = forge("ores/aluminum");
    public static final TagKey<Block> aluminum_deepslate_ore = forge("ores/deepslate/aluminum");
    public static final TagKey<Block> aluminum_block_raw = forge("storage_blocks/raw_aluminum");
    public static final TagKey<Block> aluminum_block = forge("storage_blocks/aluminum");
    public static final TagKey<Block> aluminum_nether_ore = forge("ores/nether/aluminum");
    public static final TagKey<Block> bismuth_ore = forge("ores/bismuth");
    public static final TagKey<Block> bismuth_deepslate_ore = forge("ores/deepslate/bismuth");
    public static final TagKey<Block> bismuth_block_raw = forge("storage_blocks/raw_bismuth");
    public static final TagKey<Block> bismuth_block = forge("storage_blocks/bismuth");
    public static final TagKey<Block> bismuth_nether_ore = forge("ores/nether/bismuth");
    public static final TagKey<Block> copper_ore = forge("ores/copper");
    public static final TagKey<Block> copper_deepslate_ore = forge("ores/deepslate/copper");
    public static final TagKey<Block> copper_block_raw = forge("storage_blocks/raw_copper");
    public static final TagKey<Block> copper_block = forge("storage_blocks/copper");
    public static final TagKey<Block> copper_nether_ore = forge("ores/nether/copper");
    public static final TagKey<Block> gallium_ore = forge("ores/gallium");
    public static final TagKey<Block> gallium_deepslate_ore = forge("ores/deepslate/gallium");
    public static final TagKey<Block> gallium_block_raw = forge("storage_blocks/raw_gallium");
    public static final TagKey<Block> gallium_block = forge("storage_blocks/gallium");
    public static final TagKey<Block> gallium_nether_ore = forge("ores/nether/gallium");
    public static final TagKey<Block> gold_ore = forge("ores/gold");
    public static final TagKey<Block> gold_deepslate_ore = forge("ores/deepslate/gold");
    public static final TagKey<Block> gold_block_raw = forge("storage_blocks/raw_gold");
    public static final TagKey<Block> gold_block = forge("storage_blocks/gold");
    public static final TagKey<Block> gold_nether_ore = forge("ores/nether/gold");
    public static final TagKey<Block> iridium_ore = forge("ores/iridium");
    public static final TagKey<Block> iridium_deepslate_ore = forge("ores/deepslate/iridium");
    public static final TagKey<Block> iridium_block_raw = forge("storage_blocks/raw_iridium");
    public static final TagKey<Block> iridium_block = forge("storage_blocks/iridium");
    public static final TagKey<Block> iridium_nether_ore = forge("ores/nether/iridium");
    public static final TagKey<Block> iron_ore = forge("ores/iron");
    public static final TagKey<Block> iron_deepslate_ore = forge("ores/deepslate/iron");
    public static final TagKey<Block> iron_block_raw = forge("storage_blocks/raw_iron");
    public static final TagKey<Block> iron_block = forge("storage_blocks/iron");
    public static final TagKey<Block> iron_nether_ore = forge("ores/nether/iron");
    public static final TagKey<Block> lead_ore = forge("ores/lead");
    public static final TagKey<Block> lead_deepslate_ore = forge("ores/deepslate/lead");
    public static final TagKey<Block> lead_block_raw = forge("storage_blocks/raw_lead");
    public static final TagKey<Block> lead_block = forge("storage_blocks/lead");
    public static final TagKey<Block> lead_nether_ore = forge("ores/nether/lead");
    public static final TagKey<Block> nickel_ore = forge("ores/nickel");
    public static final TagKey<Block> nickel_deepslate_ore = forge("ores/deepslate/nickel");
    public static final TagKey<Block> nickel_block_raw = forge("storage_blocks/raw_nickel");
    public static final TagKey<Block> nickel_block = forge("storage_blocks/nickel");
    public static final TagKey<Block> nickel_nether_ore = forge("ores/nether/nickel");
    public static final TagKey<Block> osmium_ore = forge("ores/osmium");
    public static final TagKey<Block> osmium_deepslate_ore = forge("ores/deepslate/osmium");
    public static final TagKey<Block> osmium_block_raw = forge("storage_blocks/raw_osmium");
    public static final TagKey<Block> osmium_block = forge("storage_blocks/osmium");
    public static final TagKey<Block> osmium_nether_ore = forge("ores/nether/osmium");
    public static final TagKey<Block> platinum_ore = forge("ores/platinum");
    public static final TagKey<Block> platinum_deepslate_ore = forge("ores/deepslate/platinum");
    public static final TagKey<Block> platinum_block_raw = forge("storage_blocks/raw_platinum");
    public static final TagKey<Block> platinum_block = forge("storage_blocks/platinum");
    public static final TagKey<Block> platinum_nether_ore = forge("ores/nether/platinum");
    public static final TagKey<Block> silver_ore = forge("ores/silver");
    public static final TagKey<Block> silver_deepslate_ore = forge("ores/deepslate/silver");
    public static final TagKey<Block> silver_block_raw = forge("storage_blocks/raw_silver");
    public static final TagKey<Block> silver_block = forge("storage_blocks/silver");
    public static final TagKey<Block> silver_nether_ore = forge("ores/nether/silver");
    public static final TagKey<Block> tin_ore = forge("ores/tin");
    public static final TagKey<Block> tin_deepslate_ore = forge("ores/deepslate/tin");
    public static final TagKey<Block> tin_block_raw = forge("storage_blocks/raw_tin");
    public static final TagKey<Block> tin_block = forge("storage_blocks/tin");
    public static final TagKey<Block> tin_nether_ore = forge("ores/nether/tin");
    public static final TagKey<Block> uranium_ore = forge("ores/uranium");
    public static final TagKey<Block> uranium_deepslate_ore = forge("ores/deepslate/uranium");
    public static final TagKey<Block> uranium_block_raw = forge("storage_blocks/raw_uranium");
    public static final TagKey<Block> uranium_block = forge("storage_blocks/uranium");
    public static final TagKey<Block> uranium_nether_ore = forge("ores/nether/uranium");
    public static final TagKey<Block> zinc_ore = forge("ores/zinc");
    public static final TagKey<Block> zinc_deepslate_ore = forge("ores/deepslate/zinc");
    public static final TagKey<Block> zinc_block_raw = forge("storage_blocks/raw_zinc");
    public static final TagKey<Block> zinc_block = forge("storage_blocks/zinc");
    public static final TagKey<Block> zinc_nether_ore = forge("ores/nether/zinc");

    private static TagKey<Block> forge(String path) {
        return BlockTags.create(new ResourceLocation("forge", path));
    }


}
