package net.internalerror.futuristicfactories.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class FFBlockItemTags {

    public static final TagKey<Item> aluminum_ore = forge("ores/aluminum");
    public static final TagKey<Item> aluminum_deepslate_ore = forge("ores/deepslate/aluminum");
    public static final TagKey<Item> aluminum_block_raw = forge("storage_blocks/raw_aluminum");
    public static final TagKey<Item> aluminum_block = forge("storage_blocks/aluminum");
    public static final TagKey<Item> aluminum_nether_ore = forge("ores/nether/aluminum");
    public static final TagKey<Item> bismuth_ore = forge("ores/bismuth");
    public static final TagKey<Item> bismuth_deepslate_ore = forge("ores/deepslate/bismuth");
    public static final TagKey<Item> bismuth_block_raw = forge("storage_blocks/raw_bismuth");
    public static final TagKey<Item> bismuth_block = forge("storage_blocks/bismuth");
    public static final TagKey<Item> bismuth_nether_ore = forge("ores/nether/bismuth");
    public static final TagKey<Item> copper_ore = forge("ores/copper");
    public static final TagKey<Item> copper_deepslate_ore = forge("ores/deepslate/copper");
    public static final TagKey<Item> copper_block_raw = forge("storage_blocks/raw_copper");
    public static final TagKey<Item> copper_block = forge("storage_blocks/copper");
    public static final TagKey<Item> copper_nether_ore = forge("ores/nether/copper");
    public static final TagKey<Item> gallium_ore = forge("ores/gallium");
    public static final TagKey<Item> gallium_deepslate_ore = forge("ores/deepslate/gallium");
    public static final TagKey<Item> gallium_block_raw = forge("storage_blocks/raw_gallium");
    public static final TagKey<Item> gallium_block = forge("storage_blocks/gallium");
    public static final TagKey<Item> gallium_nether_ore = forge("ores/nether/gallium");
    public static final TagKey<Item> gold_ore = forge("ores/gold");
    public static final TagKey<Item> gold_deepslate_ore = forge("ores/deepslate/gold");
    public static final TagKey<Item> gold_block_raw = forge("storage_blocks/raw_gold");
    public static final TagKey<Item> gold_block = forge("storage_blocks/gold");
    public static final TagKey<Item> gold_nether_ore = forge("ores/nether/gold");
    public static final TagKey<Item> iridium_ore = forge("ores/iridium");
    public static final TagKey<Item> iridium_deepslate_ore = forge("ores/deepslate/iridium");
    public static final TagKey<Item> iridium_block_raw = forge("storage_blocks/raw_iridium");
    public static final TagKey<Item> iridium_block = forge("storage_blocks/iridium");
    public static final TagKey<Item> iridium_nether_ore = forge("ores/nether/iridium");
    public static final TagKey<Item> iron_ore = forge("ores/iron");
    public static final TagKey<Item> iron_deepslate_ore = forge("ores/deepslate/iron");
    public static final TagKey<Item> iron_block_raw = forge("storage_blocks/raw_iron");
    public static final TagKey<Item> iron_block = forge("storage_blocks/iron");
    public static final TagKey<Item> iron_nether_ore = forge("ores/nether/iron");
    public static final TagKey<Item> lead_ore = forge("ores/lead");
    public static final TagKey<Item> lead_deepslate_ore = forge("ores/deepslate/lead");
    public static final TagKey<Item> lead_block_raw = forge("storage_blocks/raw_lead");
    public static final TagKey<Item> lead_block = forge("storage_blocks/lead");
    public static final TagKey<Item> lead_nether_ore = forge("ores/nether/lead");
    public static final TagKey<Item> nickel_ore = forge("ores/nickel");
    public static final TagKey<Item> nickel_deepslate_ore = forge("ores/deepslate/nickel");
    public static final TagKey<Item> nickel_block_raw = forge("storage_blocks/raw_nickel");
    public static final TagKey<Item> nickel_block = forge("storage_blocks/nickel");
    public static final TagKey<Item> nickel_nether_ore = forge("ores/nether/nickel");
    public static final TagKey<Item> osmium_ore = forge("ores/osmium");
    public static final TagKey<Item> osmium_deepslate_ore = forge("ores/deepslate/osmium");
    public static final TagKey<Item> osmium_block_raw = forge("storage_blocks/raw_osmium");
    public static final TagKey<Item> osmium_block = forge("storage_blocks/osmium");
    public static final TagKey<Item> osmium_nether_ore = forge("ores/nether/osmium");
    public static final TagKey<Item> platinum_ore = forge("ores/platinum");
    public static final TagKey<Item> platinum_deepslate_ore = forge("ores/deepslate/platinum");
    public static final TagKey<Item> platinum_block_raw = forge("storage_blocks/raw_platinum");
    public static final TagKey<Item> platinum_block = forge("storage_blocks/platinum");
    public static final TagKey<Item> platinum_nether_ore = forge("ores/nether/platinum");
    public static final TagKey<Item> silver_ore = forge("ores/silver");
    public static final TagKey<Item> silver_deepslate_ore = forge("ores/deepslate/silver");
    public static final TagKey<Item> silver_block_raw = forge("storage_blocks/raw_silver");
    public static final TagKey<Item> silver_block = forge("storage_blocks/silver");
    public static final TagKey<Item> silver_nether_ore = forge("ores/nether/silver");
    public static final TagKey<Item> tin_ore = forge("ores/tin");
    public static final TagKey<Item> tin_deepslate_ore = forge("ores/deepslate/tin");
    public static final TagKey<Item> tin_block_raw = forge("storage_blocks/raw_tin");
    public static final TagKey<Item> tin_block = forge("storage_blocks/tin");
    public static final TagKey<Item> tin_nether_ore = forge("ores/nether/tin");
    public static final TagKey<Item> uranium_ore = forge("ores/uranium");
    public static final TagKey<Item> uranium_deepslate_ore = forge("ores/deepslate/uranium");
    public static final TagKey<Item> uranium_block_raw = forge("storage_blocks/raw_uranium");
    public static final TagKey<Item> uranium_block = forge("storage_blocks/uranium");
    public static final TagKey<Item> uranium_nether_ore = forge("ores/nether/uranium");
    public static final TagKey<Item> zinc_ore = forge("ores/zinc");
    public static final TagKey<Item> zinc_deepslate_ore = forge("ores/deepslate/zinc");
    public static final TagKey<Item> zinc_block_raw = forge("storage_blocks/raw_zinc");
    public static final TagKey<Item> zinc_block = forge("storage_blocks/zinc");
    public static final TagKey<Item> zinc_nether_ore = forge("ores/nether/zinc");

    private static TagKey<Item> forge(String path) {
        return ItemTags.create(new ResourceLocation("forge", path));
    }
}
