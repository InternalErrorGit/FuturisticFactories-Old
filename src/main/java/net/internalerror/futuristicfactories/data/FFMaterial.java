package net.internalerror.futuristicfactories.data;

import net.internalerror.futuristicfactories.registry.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public enum FFMaterial {
    aluminum(FFItem.aluminum_clump, FFItem.aluminum_crystal, FFItem.aluminum_dust, FFItem.aluminum_dust_dirty, FFItem.aluminum_ingot, FFItem.aluminum_nugget, FFItem.aluminum_raw, FFItem.aluminum_shard, FFBlockItem.aluminum_ore, FFBlockItem.aluminum_deepslate_ore, FFBlockItem.aluminum_block_raw, FFBlockItem.aluminum_block, FFBlockItem.aluminum_nether_ore, FFBlock.aluminum_ore, FFBlock.aluminum_deepslate_ore, FFBlock.aluminum_block_raw, FFBlock.aluminum_block, FFBlock.aluminum_nether_ore, FFItemTags.aluminum_clump, FFItemTags.aluminum_crystal, FFItemTags.aluminum_dust, FFItemTags.aluminum_dust_dirty, FFItemTags.aluminum_ingot, FFItemTags.aluminum_nugget, FFItemTags.aluminum_raw, FFItemTags.aluminum_shard, FFItemTags.aluminum_ore, FFItemTags.aluminum_deepslate_ore, FFItemTags.aluminum_block_raw, FFItemTags.aluminum_block, FFItemTags.aluminum_nether_ore, FFBlockTags.aluminum_ore, FFBlockTags.aluminum_deepslate_ore, FFBlockTags.aluminum_block_raw, FFBlockTags.aluminum_block, FFBlockTags.aluminum_nether_ore),
    bismuth(FFItem.bismuth_clump, FFItem.bismuth_crystal, FFItem.bismuth_dust, FFItem.bismuth_dust_dirty, FFItem.bismuth_ingot, FFItem.bismuth_nugget, FFItem.bismuth_raw, FFItem.bismuth_shard, FFBlockItem.bismuth_ore, FFBlockItem.bismuth_deepslate_ore, FFBlockItem.bismuth_block_raw, FFBlockItem.bismuth_block, FFBlockItem.bismuth_nether_ore, FFBlock.bismuth_ore, FFBlock.bismuth_deepslate_ore, FFBlock.bismuth_block_raw, FFBlock.bismuth_block, FFBlock.bismuth_nether_ore, FFItemTags.bismuth_clump, FFItemTags.bismuth_crystal, FFItemTags.bismuth_dust, FFItemTags.bismuth_dust_dirty, FFItemTags.bismuth_ingot, FFItemTags.bismuth_nugget, FFItemTags.bismuth_raw, FFItemTags.bismuth_shard, FFItemTags.bismuth_ore, FFItemTags.bismuth_deepslate_ore, FFItemTags.bismuth_block_raw, FFItemTags.bismuth_block, FFItemTags.bismuth_nether_ore, FFBlockTags.bismuth_ore, FFBlockTags.bismuth_deepslate_ore, FFBlockTags.bismuth_block_raw, FFBlockTags.bismuth_block, FFBlockTags.bismuth_nether_ore),
    copper(FFItem.copper_clump, FFItem.copper_crystal, FFItem.copper_dust, FFItem.copper_dust_dirty, FFItem.copper_ingot, FFItem.copper_nugget, FFItem.copper_raw, FFItem.copper_shard, FFBlockItem.copper_ore, FFBlockItem.copper_deepslate_ore, FFBlockItem.copper_block_raw, FFBlockItem.copper_block, FFBlockItem.copper_nether_ore, FFBlock.copper_ore, FFBlock.copper_deepslate_ore, FFBlock.copper_block_raw, FFBlock.copper_block, FFBlock.copper_nether_ore, FFItemTags.copper_clump, FFItemTags.copper_crystal, FFItemTags.copper_dust, FFItemTags.copper_dust_dirty, FFItemTags.copper_ingot, FFItemTags.copper_nugget, FFItemTags.copper_raw, FFItemTags.copper_shard, FFItemTags.copper_ore, FFItemTags.copper_deepslate_ore, FFItemTags.copper_block_raw, FFItemTags.copper_block, FFItemTags.copper_nether_ore, FFBlockTags.copper_ore, FFBlockTags.copper_deepslate_ore, FFBlockTags.copper_block_raw, FFBlockTags.copper_block, FFBlockTags.copper_nether_ore),
    gallium(FFItem.gallium_clump, FFItem.gallium_crystal, FFItem.gallium_dust, FFItem.gallium_dust_dirty, FFItem.gallium_ingot, FFItem.gallium_nugget, FFItem.gallium_raw, FFItem.gallium_shard, FFBlockItem.gallium_ore, FFBlockItem.gallium_deepslate_ore, FFBlockItem.gallium_block_raw, FFBlockItem.gallium_block, FFBlockItem.gallium_nether_ore, FFBlock.gallium_ore, FFBlock.gallium_deepslate_ore, FFBlock.gallium_block_raw, FFBlock.gallium_block, FFBlock.gallium_nether_ore, FFItemTags.gallium_clump, FFItemTags.gallium_crystal, FFItemTags.gallium_dust, FFItemTags.gallium_dust_dirty, FFItemTags.gallium_ingot, FFItemTags.gallium_nugget, FFItemTags.gallium_raw, FFItemTags.gallium_shard, FFItemTags.gallium_ore, FFItemTags.gallium_deepslate_ore, FFItemTags.gallium_block_raw, FFItemTags.gallium_block, FFItemTags.gallium_nether_ore, FFBlockTags.gallium_ore, FFBlockTags.gallium_deepslate_ore, FFBlockTags.gallium_block_raw, FFBlockTags.gallium_block, FFBlockTags.gallium_nether_ore),
    gold(FFItem.gold_clump, FFItem.gold_crystal, FFItem.gold_dust, FFItem.gold_dust_dirty, FFItem.gold_ingot, FFItem.gold_nugget, FFItem.gold_raw, FFItem.gold_shard, FFBlockItem.gold_ore, FFBlockItem.gold_deepslate_ore, FFBlockItem.gold_block_raw, FFBlockItem.gold_block, FFBlockItem.gold_nether_ore, FFBlock.gold_ore, FFBlock.gold_deepslate_ore, FFBlock.gold_block_raw, FFBlock.gold_block, FFBlock.gold_nether_ore, FFItemTags.gold_clump, FFItemTags.gold_crystal, FFItemTags.gold_dust, FFItemTags.gold_dust_dirty, FFItemTags.gold_ingot, FFItemTags.gold_nugget, FFItemTags.gold_raw, FFItemTags.gold_shard, FFItemTags.gold_ore, FFItemTags.gold_deepslate_ore, FFItemTags.gold_block_raw, FFItemTags.gold_block, FFItemTags.gold_nether_ore, FFBlockTags.gold_ore, FFBlockTags.gold_deepslate_ore, FFBlockTags.gold_block_raw, FFBlockTags.gold_block, FFBlockTags.gold_nether_ore),
    iridium(FFItem.iridium_clump, FFItem.iridium_crystal, FFItem.iridium_dust, FFItem.iridium_dust_dirty, FFItem.iridium_ingot, FFItem.iridium_nugget, FFItem.iridium_raw, FFItem.iridium_shard, FFBlockItem.iridium_ore, FFBlockItem.iridium_deepslate_ore, FFBlockItem.iridium_block_raw, FFBlockItem.iridium_block, FFBlockItem.iridium_nether_ore, FFBlock.iridium_ore, FFBlock.iridium_deepslate_ore, FFBlock.iridium_block_raw, FFBlock.iridium_block, FFBlock.iridium_nether_ore, FFItemTags.iridium_clump, FFItemTags.iridium_crystal, FFItemTags.iridium_dust, FFItemTags.iridium_dust_dirty, FFItemTags.iridium_ingot, FFItemTags.iridium_nugget, FFItemTags.iridium_raw, FFItemTags.iridium_shard, FFItemTags.iridium_ore, FFItemTags.iridium_deepslate_ore, FFItemTags.iridium_block_raw, FFItemTags.iridium_block, FFItemTags.iridium_nether_ore, FFBlockTags.iridium_ore, FFBlockTags.iridium_deepslate_ore, FFBlockTags.iridium_block_raw, FFBlockTags.iridium_block, FFBlockTags.iridium_nether_ore),
    iron(FFItem.iron_clump, FFItem.iron_crystal, FFItem.iron_dust, FFItem.iron_dust_dirty, FFItem.iron_ingot, FFItem.iron_nugget, FFItem.iron_raw, FFItem.iron_shard, FFBlockItem.iron_ore, FFBlockItem.iron_deepslate_ore, FFBlockItem.iron_block_raw, FFBlockItem.iron_block, FFBlockItem.iron_nether_ore, FFBlock.iron_ore, FFBlock.iron_deepslate_ore, FFBlock.iron_block_raw, FFBlock.iron_block, FFBlock.iron_nether_ore, FFItemTags.iron_clump, FFItemTags.iron_crystal, FFItemTags.iron_dust, FFItemTags.iron_dust_dirty, FFItemTags.iron_ingot, FFItemTags.iron_nugget, FFItemTags.iron_raw, FFItemTags.iron_shard, FFItemTags.iron_ore, FFItemTags.iron_deepslate_ore, FFItemTags.iron_block_raw, FFItemTags.iron_block, FFItemTags.iron_nether_ore, FFBlockTags.iron_ore, FFBlockTags.iron_deepslate_ore, FFBlockTags.iron_block_raw, FFBlockTags.iron_block, FFBlockTags.iron_nether_ore),
    lead(FFItem.lead_clump, FFItem.lead_crystal, FFItem.lead_dust, FFItem.lead_dust_dirty, FFItem.lead_ingot, FFItem.lead_nugget, FFItem.lead_raw, FFItem.lead_shard, FFBlockItem.lead_ore, FFBlockItem.lead_deepslate_ore, FFBlockItem.lead_block_raw, FFBlockItem.lead_block, FFBlockItem.lead_nether_ore, FFBlock.lead_ore, FFBlock.lead_deepslate_ore, FFBlock.lead_block_raw, FFBlock.lead_block, FFBlock.lead_nether_ore, FFItemTags.lead_clump, FFItemTags.lead_crystal, FFItemTags.lead_dust, FFItemTags.lead_dust_dirty, FFItemTags.lead_ingot, FFItemTags.lead_nugget, FFItemTags.lead_raw, FFItemTags.lead_shard, FFItemTags.lead_ore, FFItemTags.lead_deepslate_ore, FFItemTags.lead_block_raw, FFItemTags.lead_block, FFItemTags.lead_nether_ore, FFBlockTags.lead_ore, FFBlockTags.lead_deepslate_ore, FFBlockTags.lead_block_raw, FFBlockTags.lead_block, FFBlockTags.lead_nether_ore),
    nickel(FFItem.nickel_clump, FFItem.nickel_crystal, FFItem.nickel_dust, FFItem.nickel_dust_dirty, FFItem.nickel_ingot, FFItem.nickel_nugget, FFItem.nickel_raw, FFItem.nickel_shard, FFBlockItem.nickel_ore, FFBlockItem.nickel_deepslate_ore, FFBlockItem.nickel_block_raw, FFBlockItem.nickel_block, FFBlockItem.nickel_nether_ore, FFBlock.nickel_ore, FFBlock.nickel_deepslate_ore, FFBlock.nickel_block_raw, FFBlock.nickel_block, FFBlock.nickel_nether_ore, FFItemTags.nickel_clump, FFItemTags.nickel_crystal, FFItemTags.nickel_dust, FFItemTags.nickel_dust_dirty, FFItemTags.nickel_ingot, FFItemTags.nickel_nugget, FFItemTags.nickel_raw, FFItemTags.nickel_shard, FFItemTags.nickel_ore, FFItemTags.nickel_deepslate_ore, FFItemTags.nickel_block_raw, FFItemTags.nickel_block, FFItemTags.nickel_nether_ore, FFBlockTags.nickel_ore, FFBlockTags.nickel_deepslate_ore, FFBlockTags.nickel_block_raw, FFBlockTags.nickel_block, FFBlockTags.nickel_nether_ore),
    osmium(FFItem.osmium_clump, FFItem.osmium_crystal, FFItem.osmium_dust, FFItem.osmium_dust_dirty, FFItem.osmium_ingot, FFItem.osmium_nugget, FFItem.osmium_raw, FFItem.osmium_shard, FFBlockItem.osmium_ore, FFBlockItem.osmium_deepslate_ore, FFBlockItem.osmium_block_raw, FFBlockItem.osmium_block, FFBlockItem.osmium_nether_ore, FFBlock.osmium_ore, FFBlock.osmium_deepslate_ore, FFBlock.osmium_block_raw, FFBlock.osmium_block, FFBlock.osmium_nether_ore, FFItemTags.osmium_clump, FFItemTags.osmium_crystal, FFItemTags.osmium_dust, FFItemTags.osmium_dust_dirty, FFItemTags.osmium_ingot, FFItemTags.osmium_nugget, FFItemTags.osmium_raw, FFItemTags.osmium_shard, FFItemTags.osmium_ore, FFItemTags.osmium_deepslate_ore, FFItemTags.osmium_block_raw, FFItemTags.osmium_block, FFItemTags.osmium_nether_ore, FFBlockTags.osmium_ore, FFBlockTags.osmium_deepslate_ore, FFBlockTags.osmium_block_raw, FFBlockTags.osmium_block, FFBlockTags.osmium_nether_ore),
    platinum(FFItem.platinum_clump, FFItem.platinum_crystal, FFItem.platinum_dust, FFItem.platinum_dust_dirty, FFItem.platinum_ingot, FFItem.platinum_nugget, FFItem.platinum_raw, FFItem.platinum_shard, FFBlockItem.platinum_ore, FFBlockItem.platinum_deepslate_ore, FFBlockItem.platinum_block_raw, FFBlockItem.platinum_block, FFBlockItem.platinum_nether_ore, FFBlock.platinum_ore, FFBlock.platinum_deepslate_ore, FFBlock.platinum_block_raw, FFBlock.platinum_block, FFBlock.platinum_nether_ore, FFItemTags.platinum_clump, FFItemTags.platinum_crystal, FFItemTags.platinum_dust, FFItemTags.platinum_dust_dirty, FFItemTags.platinum_ingot, FFItemTags.platinum_nugget, FFItemTags.platinum_raw, FFItemTags.platinum_shard, FFItemTags.platinum_ore, FFItemTags.platinum_deepslate_ore, FFItemTags.platinum_block_raw, FFItemTags.platinum_block, FFItemTags.platinum_nether_ore, FFBlockTags.platinum_ore, FFBlockTags.platinum_deepslate_ore, FFBlockTags.platinum_block_raw, FFBlockTags.platinum_block, FFBlockTags.platinum_nether_ore),
    silver(FFItem.silver_clump, FFItem.silver_crystal, FFItem.silver_dust, FFItem.silver_dust_dirty, FFItem.silver_ingot, FFItem.silver_nugget, FFItem.silver_raw, FFItem.silver_shard, FFBlockItem.silver_ore, FFBlockItem.silver_deepslate_ore, FFBlockItem.silver_block_raw, FFBlockItem.silver_block, FFBlockItem.silver_nether_ore, FFBlock.silver_ore, FFBlock.silver_deepslate_ore, FFBlock.silver_block_raw, FFBlock.silver_block, FFBlock.silver_nether_ore, FFItemTags.silver_clump, FFItemTags.silver_crystal, FFItemTags.silver_dust, FFItemTags.silver_dust_dirty, FFItemTags.silver_ingot, FFItemTags.silver_nugget, FFItemTags.silver_raw, FFItemTags.silver_shard, FFItemTags.silver_ore, FFItemTags.silver_deepslate_ore, FFItemTags.silver_block_raw, FFItemTags.silver_block, FFItemTags.silver_nether_ore, FFBlockTags.silver_ore, FFBlockTags.silver_deepslate_ore, FFBlockTags.silver_block_raw, FFBlockTags.silver_block, FFBlockTags.silver_nether_ore),
    tin(FFItem.tin_clump, FFItem.tin_crystal, FFItem.tin_dust, FFItem.tin_dust_dirty, FFItem.tin_ingot, FFItem.tin_nugget, FFItem.tin_raw, FFItem.tin_shard, FFBlockItem.tin_ore, FFBlockItem.tin_deepslate_ore, FFBlockItem.tin_block_raw, FFBlockItem.tin_block, FFBlockItem.tin_nether_ore, FFBlock.tin_ore, FFBlock.tin_deepslate_ore, FFBlock.tin_block_raw, FFBlock.tin_block, FFBlock.tin_nether_ore, FFItemTags.tin_clump, FFItemTags.tin_crystal, FFItemTags.tin_dust, FFItemTags.tin_dust_dirty, FFItemTags.tin_ingot, FFItemTags.tin_nugget, FFItemTags.tin_raw, FFItemTags.tin_shard, FFItemTags.tin_ore, FFItemTags.tin_deepslate_ore, FFItemTags.tin_block_raw, FFItemTags.tin_block, FFItemTags.tin_nether_ore, FFBlockTags.tin_ore, FFBlockTags.tin_deepslate_ore, FFBlockTags.tin_block_raw, FFBlockTags.tin_block, FFBlockTags.tin_nether_ore),
    uranium(FFItem.uranium_clump, FFItem.uranium_crystal, FFItem.uranium_dust, FFItem.uranium_dust_dirty, FFItem.uranium_ingot, FFItem.uranium_nugget, FFItem.uranium_raw, FFItem.uranium_shard, FFBlockItem.uranium_ore, FFBlockItem.uranium_deepslate_ore, FFBlockItem.uranium_block_raw, FFBlockItem.uranium_block, FFBlockItem.uranium_nether_ore, FFBlock.uranium_ore, FFBlock.uranium_deepslate_ore, FFBlock.uranium_block_raw, FFBlock.uranium_block, FFBlock.uranium_nether_ore, FFItemTags.uranium_clump, FFItemTags.uranium_crystal, FFItemTags.uranium_dust, FFItemTags.uranium_dust_dirty, FFItemTags.uranium_ingot, FFItemTags.uranium_nugget, FFItemTags.uranium_raw, FFItemTags.uranium_shard, FFItemTags.uranium_ore, FFItemTags.uranium_deepslate_ore, FFItemTags.uranium_block_raw, FFItemTags.uranium_block, FFItemTags.uranium_nether_ore, FFBlockTags.uranium_ore, FFBlockTags.uranium_deepslate_ore, FFBlockTags.uranium_block_raw, FFBlockTags.uranium_block, FFBlockTags.uranium_nether_ore),
    zinc(FFItem.zinc_clump, FFItem.zinc_crystal, FFItem.zinc_dust, FFItem.zinc_dust_dirty, FFItem.zinc_ingot, FFItem.zinc_nugget, FFItem.zinc_raw, FFItem.zinc_shard, FFBlockItem.zinc_ore, FFBlockItem.zinc_deepslate_ore, FFBlockItem.zinc_block_raw, FFBlockItem.zinc_block, FFBlockItem.zinc_nether_ore, FFBlock.zinc_ore, FFBlock.zinc_deepslate_ore, FFBlock.zinc_block_raw, FFBlock.zinc_block, FFBlock.zinc_nether_ore, FFItemTags.zinc_clump, FFItemTags.zinc_crystal, FFItemTags.zinc_dust, FFItemTags.zinc_dust_dirty, FFItemTags.zinc_ingot, FFItemTags.zinc_nugget, FFItemTags.zinc_raw, FFItemTags.zinc_shard, FFItemTags.zinc_ore, FFItemTags.zinc_deepslate_ore, FFItemTags.zinc_block_raw, FFItemTags.zinc_block, FFItemTags.zinc_nether_ore, FFBlockTags.zinc_ore, FFBlockTags.zinc_deepslate_ore, FFBlockTags.zinc_block_raw, FFBlockTags.zinc_block, FFBlockTags.zinc_nether_ore);

    private final FFRegistryItem clump;
    private final FFRegistryObject<Item> crystal;
    private final FFRegistryItem dust;
    private final FFRegistryItem dustDirty;
    private final FFRegistryItem ingot;
    private final FFRegistryItem nugget;
    private final FFRegistryItem raw;
    private final FFRegistryItem shard;
    private final FFRegistryBlockItem ore;
    private final FFRegistryBlockItem deepslateOre;
    private final FFRegistryBlockItem blockRaw;
    private final FFRegistryBlockItem block;
    private final FFRegistryBlockItem netherOre;
    private final FFRegistryBlock oreBlock;
    private final FFRegistryBlock deepslateOreBlock;
    private final FFRegistryBlock blockRawBlock;
    private final FFRegistryBlock blockBlock;
    private final FFRegistryBlock netherOreBlock;
    private final TagKey<Item> clumpTag;
    private final TagKey<Item> crystalTag;
    private final TagKey<Item> dustTag;
    private final TagKey<Item> dustDirtyTag;
    private final TagKey<Item> ingotTag;
    private final TagKey<Item> nuggetTag;
    private final TagKey<Item> rawTag;
    private final TagKey<Item> shardTag;
    private final TagKey<Item> oreTag;
    private final TagKey<Item> deepslateOreTag;
    private final TagKey<Item> blockRawTag;
    private final TagKey<Item> blockTag;
    private final TagKey<Item> netherOreTag;
    private final TagKey<Block> oreBlockTag;
    private final TagKey<Block> deepslateOreBlockTag;
    private final TagKey<Block> blockRawBlockTag;
    private final TagKey<Block> blockBlockTag;
    private final TagKey<Block> netherOreBlockTag;

    FFMaterial(FFRegistryItem clump, FFRegistryObject<Item> crystal, FFRegistryItem dust, FFRegistryItem dustDirty, FFRegistryItem ingot, FFRegistryItem nugget, FFRegistryItem raw, FFRegistryItem shard, FFRegistryBlockItem ore, FFRegistryBlockItem deepslateOre, FFRegistryBlockItem blockRaw, FFRegistryBlockItem block, FFRegistryBlockItem netherOre, FFRegistryBlock oreBlock, FFRegistryBlock deepslateOreBlock, FFRegistryBlock blockRawBlock, FFRegistryBlock blockBlock, FFRegistryBlock netherOreBlock, TagKey<Item> clumpTag, TagKey<Item> crystalTag, TagKey<Item> dustTag, TagKey<Item> dustDirtyTag, TagKey<Item> ingotTag, TagKey<Item> nuggetTag, TagKey<Item> rawTag, TagKey<Item> shardTag, TagKey<Item> oreTag, TagKey<Item> deepslateOreTag, TagKey<Item> blockRawTag, TagKey<Item> blockTag, TagKey<Item> netherOreTag, TagKey<Block> oreBlockTag, TagKey<Block> deepslateOreBlockTag, TagKey<Block> blockRawBlockTag, TagKey<Block> blockBlockTag, TagKey<Block> netherOreBlockTag) {
        this.clump = clump;
        this.crystal = crystal;
        this.dust = dust;
        this.dustDirty = dustDirty;
        this.ingot = ingot;
        this.nugget = nugget;
        this.raw = raw;
        this.shard = shard;
        this.ore = ore;
        this.deepslateOre = deepslateOre;
        this.blockRaw = blockRaw;
        this.block = block;
        this.netherOre = netherOre;
        this.oreBlock = oreBlock;
        this.deepslateOreBlock = deepslateOreBlock;
        this.blockRawBlock = blockRawBlock;
        this.blockBlock = blockBlock;
        this.netherOreBlock = netherOreBlock;
        this.clumpTag = clumpTag;
        this.crystalTag = crystalTag;
        this.dustTag = dustTag;
        this.dustDirtyTag = dustDirtyTag;
        this.ingotTag = ingotTag;
        this.nuggetTag = nuggetTag;
        this.rawTag = rawTag;
        this.shardTag = shardTag;
        this.oreTag = oreTag;
        this.deepslateOreTag = deepslateOreTag;
        this.blockRawTag = blockRawTag;
        this.blockTag = blockTag;
        this.netherOreTag = netherOreTag;
        this.oreBlockTag = oreBlockTag;
        this.deepslateOreBlockTag = deepslateOreBlockTag;
        this.blockRawBlockTag = blockRawBlockTag;
        this.blockBlockTag = blockBlockTag;
        this.netherOreBlockTag = netherOreBlockTag;
    }

    public FFRegistryBlock getOreBlock() {
        return oreBlock;
    }

    public FFRegistryBlock getDeepslateOreBlock() {
        return deepslateOreBlock;
    }

    public FFRegistryBlock getBlockRawBlock() {
        return blockRawBlock;
    }

    public FFRegistryBlock getBlockBlock() {
        return blockBlock;
    }

    public FFRegistryBlock getNetherOreBlock() {
        return netherOreBlock;
    }

    public TagKey<Block> getOreBlockTag() {
        return oreBlockTag;
    }

    public TagKey<Block> getDeepslateOreBlockTag() {
        return deepslateOreBlockTag;
    }

    public TagKey<Block> getBlockRawBlockTag() {
        return blockRawBlockTag;
    }

    public TagKey<Block> getBlockBlockTag() {
        return blockBlockTag;
    }

    public TagKey<Block> getNetherOreBlockTag() {
        return netherOreBlockTag;
    }

    public FFRegistryItem getClump() {
        return clump;
    }

    public FFRegistryObject<Item> getCrystal() {
        return crystal;
    }

    public FFRegistryItem getDust() {
        return dust;
    }

    public FFRegistryItem getDustDirty() {
        return dustDirty;
    }

    public FFRegistryItem getIngot() {
        return ingot;
    }

    public FFRegistryItem getNugget() {
        return nugget;
    }

    public FFRegistryItem getRaw() {
        return raw;
    }

    public FFRegistryItem getShard() {
        return shard;
    }

    public FFRegistryBlockItem getOre() {
        return ore;
    }

    public FFRegistryBlockItem getDeepslateOre() {
        return deepslateOre;
    }

    public FFRegistryBlockItem getBlockRaw() {
        return blockRaw;
    }

    public FFRegistryBlockItem getBlock() {
        return block;
    }

    public FFRegistryBlockItem getNetherOre() {
        return netherOre;
    }

    public TagKey<Item> getClumpTag() {
        return clumpTag;
    }

    public TagKey<Item> getCrystalTag() {
        return crystalTag;
    }

    public TagKey<Item> getDustTag() {
        return dustTag;
    }

    public TagKey<Item> getDustDirtyTag() {
        return dustDirtyTag;
    }

    public TagKey<Item> getIngotTag() {
        return ingotTag;
    }

    public TagKey<Item> getNuggetTag() {
        return nuggetTag;
    }

    public TagKey<Item> getRawTag() {
        return rawTag;
    }

    public TagKey<Item> getShardTag() {
        return shardTag;
    }

    public TagKey<Item> getOreTag() {
        return oreTag;
    }

    public TagKey<Item> getDeepslateOreTag() {
        return deepslateOreTag;
    }

    public TagKey<Item> getBlockRawTag() {
        return blockRawTag;
    }

    public TagKey<Item> getBlockTag() {
        return blockTag;
    }

    public TagKey<Item> getNetherOreTag() {
        return netherOreTag;
    }
}
