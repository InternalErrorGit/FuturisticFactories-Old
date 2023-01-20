package net.internalerror.futuristicfactories.data;

import net.internalerror.futuristicfactories.data.tags.FFBlockItemTags;
import net.internalerror.futuristicfactories.data.tags.FFBlockTags;
import net.internalerror.futuristicfactories.data.tags.FFItemTags;
import net.internalerror.futuristicfactories.registry.*;
import net.internalerror.futuristicfactories.registry.util.FFRegistryBlock;
import net.internalerror.futuristicfactories.registry.util.FFRegistryBlockItem;
import net.internalerror.futuristicfactories.registry.util.FFRegistryItem;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public enum FFMaterial {
    aluminum(Items.aluminum, Items.Tags.aluminum, Items.BlockItems.aluminum, Items.BlockItems.Tags.aluminum, Blocks.aluminum, Blocks.Tags.aluminum),
    bismuth(Items.bismuth, Items.Tags.bismuth, Items.BlockItems.bismuth, Items.BlockItems.Tags.bismuth, Blocks.bismuth, Blocks.Tags.bismuth),
    copper(Items.copper, Items.Tags.copper, Items.BlockItems.copper, Items.BlockItems.Tags.copper, Blocks.copper, Blocks.Tags.copper),
    gallium(Items.gallium, Items.Tags.gallium, Items.BlockItems.gallium, Items.BlockItems.Tags.gallium, Blocks.gallium, Blocks.Tags.gallium),
    gold(Items.gold, Items.Tags.gold, Items.BlockItems.gold, Items.BlockItems.Tags.gold, Blocks.gold, Blocks.Tags.gold),
    iridium(Items.iridium, Items.Tags.iridium, Items.BlockItems.iridium, Items.BlockItems.Tags.iridium, Blocks.iridium, Blocks.Tags.iridium),
    iron(Items.iron, Items.Tags.iron, Items.BlockItems.iron, Items.BlockItems.Tags.iron, Blocks.iron, Blocks.Tags.iron),
    lead(Items.lead, Items.Tags.lead, Items.BlockItems.lead, Items.BlockItems.Tags.lead, Blocks.lead, Blocks.Tags.lead),
    nickel(Items.nickel, Items.Tags.nickel, Items.BlockItems.nickel, Items.BlockItems.Tags.nickel, Blocks.nickel, Blocks.Tags.nickel),
    osmium(Items.osmium, Items.Tags.osmium, Items.BlockItems.osmium, Items.BlockItems.Tags.osmium, Blocks.osmium, Blocks.Tags.osmium),
    platinum(Items.platinum, Items.Tags.platinum, Items.BlockItems.platinum, Items.BlockItems.Tags.platinum, Blocks.platinum, Blocks.Tags.platinum),
    silver(Items.silver, Items.Tags.silver, Items.BlockItems.silver, Items.BlockItems.Tags.silver, Blocks.silver, Blocks.Tags.silver),
    tin(Items.tin, Items.Tags.tin, Items.BlockItems.tin, Items.BlockItems.Tags.tin, Blocks.tin, Blocks.Tags.tin),
    uranium(Items.uranium, Items.Tags.uranium, Items.BlockItems.uranium, Items.BlockItems.Tags.uranium, Blocks.uranium, Blocks.Tags.uranium),
    zinc(Items.zinc, Items.Tags.zinc, Items.BlockItems.zinc, Items.BlockItems.Tags.zinc, Blocks.zinc, Blocks.Tags.zinc);

    private final Items items;
    private final Items.Tags itemTags;
    private final Items.BlockItems blockItems;
    private final Items.BlockItems.Tags blockItemTags;
    private final Blocks blocks;
    private final Blocks.Tags blockTags;

    FFMaterial(Items items, Items.Tags itemTags, Items.BlockItems blockItems, Items.BlockItems.Tags blockItemTags, Blocks blocks, Blocks.Tags blockTags) {

        this.items = items;
        this.itemTags = itemTags;
        this.blockItems = blockItems;
        this.blockItemTags = blockItemTags;
        this.blocks = blocks;
        this.blockTags = blockTags;
    }

    public Items.BlockItems getBlockItems() {
        return blockItems;
    }

    public Items.BlockItems.Tags getBlockItemTags() {
        return blockItemTags;
    }

    public Items getItems() {
        return items;
    }

    public Items.Tags getItemTags() {
        return itemTags;
    }

    public Blocks getBlocks() {
        return blocks;
    }

    public Blocks.Tags getBlockTags() {
        return blockTags;
    }

    public enum Blocks {
        aluminum(FFBlock.aluminum_ore, FFBlock.aluminum_deepslate_ore, FFBlock.aluminum_block_raw, FFBlock.aluminum_block, FFBlock.aluminum_nether_ore),
        bismuth(FFBlock.bismuth_ore, FFBlock.bismuth_deepslate_ore, FFBlock.bismuth_block_raw, FFBlock.bismuth_block, FFBlock.bismuth_nether_ore),
        copper(FFBlock.copper_ore, FFBlock.copper_deepslate_ore, FFBlock.copper_block_raw, FFBlock.copper_block, FFBlock.copper_nether_ore),
        gallium(FFBlock.gallium_ore, FFBlock.gallium_deepslate_ore, FFBlock.gallium_block_raw, FFBlock.gallium_block, FFBlock.gallium_nether_ore),
        gold(FFBlock.gold_ore, FFBlock.gold_deepslate_ore, FFBlock.gold_block_raw, FFBlock.gold_block, FFBlock.gold_nether_ore),
        iridium(FFBlock.iridium_ore, FFBlock.iridium_deepslate_ore, FFBlock.iridium_block_raw, FFBlock.iridium_block, FFBlock.iridium_nether_ore),
        iron(FFBlock.iron_ore, FFBlock.iron_deepslate_ore, FFBlock.iron_block_raw, FFBlock.iron_block, FFBlock.iron_nether_ore),
        lead(FFBlock.lead_ore, FFBlock.lead_deepslate_ore, FFBlock.lead_block_raw, FFBlock.lead_block, FFBlock.lead_nether_ore),
        nickel(FFBlock.nickel_ore, FFBlock.nickel_deepslate_ore, FFBlock.nickel_block_raw, FFBlock.nickel_block, FFBlock.nickel_nether_ore),
        osmium(FFBlock.osmium_ore, FFBlock.osmium_deepslate_ore, FFBlock.osmium_block_raw, FFBlock.osmium_block, FFBlock.osmium_nether_ore),
        platinum(FFBlock.platinum_ore, FFBlock.platinum_deepslate_ore, FFBlock.platinum_block_raw, FFBlock.platinum_block, FFBlock.platinum_nether_ore),
        silver(FFBlock.silver_ore, FFBlock.silver_deepslate_ore, FFBlock.silver_block_raw, FFBlock.silver_block, FFBlock.silver_nether_ore),
        tin(FFBlock.tin_ore, FFBlock.tin_deepslate_ore, FFBlock.tin_block_raw, FFBlock.tin_block, FFBlock.tin_nether_ore),
        uranium(FFBlock.uranium_ore, FFBlock.uranium_deepslate_ore, FFBlock.uranium_block_raw, FFBlock.uranium_block, FFBlock.uranium_nether_ore),
        zinc(FFBlock.zinc_ore, FFBlock.zinc_deepslate_ore, FFBlock.zinc_block_raw, FFBlock.zinc_block, FFBlock.zinc_nether_ore);

        private final FFRegistryBlock ore;
        private final FFRegistryBlock deepslateOre;
        private final FFRegistryBlock blockRaw;
        private final FFRegistryBlock block;
        private final FFRegistryBlock netherOre;

        Blocks(FFRegistryBlock ore, FFRegistryBlock deepslateOre, FFRegistryBlock blockRaw, FFRegistryBlock block, FFRegistryBlock netherOre) {

            this.ore = ore;
            this.deepslateOre = deepslateOre;
            this.blockRaw = blockRaw;
            this.block = block;
            this.netherOre = netherOre;
        }

        public FFRegistryBlock getOre() {
            return ore;
        }

        public FFRegistryBlock getDeepslateOre() {
            return deepslateOre;
        }

        public FFRegistryBlock getBlockRaw() {
            return blockRaw;
        }

        public FFRegistryBlock getBlock() {
            return block;
        }

        public FFRegistryBlock getNetherOre() {
            return netherOre;
        }

        public enum Tags {
            aluminum(FFBlockTags.aluminum_ore, FFBlockTags.aluminum_deepslate_ore, FFBlockTags.aluminum_block_raw, FFBlockTags.aluminum_block, FFBlockTags.aluminum_nether_ore),
            bismuth(FFBlockTags.bismuth_ore, FFBlockTags.bismuth_deepslate_ore, FFBlockTags.bismuth_block_raw, FFBlockTags.bismuth_block, FFBlockTags.bismuth_nether_ore),
            copper(FFBlockTags.copper_ore, FFBlockTags.copper_deepslate_ore, FFBlockTags.copper_block_raw, FFBlockTags.copper_block, FFBlockTags.copper_nether_ore),
            gallium(FFBlockTags.gallium_ore, FFBlockTags.gallium_deepslate_ore, FFBlockTags.gallium_block_raw, FFBlockTags.gallium_block, FFBlockTags.gallium_nether_ore),
            gold(FFBlockTags.gold_ore, FFBlockTags.gold_deepslate_ore, FFBlockTags.gold_block_raw, FFBlockTags.gold_block, FFBlockTags.gold_nether_ore),
            iridium(FFBlockTags.iridium_ore, FFBlockTags.iridium_deepslate_ore, FFBlockTags.iridium_block_raw, FFBlockTags.iridium_block, FFBlockTags.iridium_nether_ore),
            iron(FFBlockTags.iron_ore, FFBlockTags.iron_deepslate_ore, FFBlockTags.iron_block_raw, FFBlockTags.iron_block, FFBlockTags.iron_nether_ore),
            lead(FFBlockTags.lead_ore, FFBlockTags.lead_deepslate_ore, FFBlockTags.lead_block_raw, FFBlockTags.lead_block, FFBlockTags.lead_nether_ore),
            nickel(FFBlockTags.nickel_ore, FFBlockTags.nickel_deepslate_ore, FFBlockTags.nickel_block_raw, FFBlockTags.nickel_block, FFBlockTags.nickel_nether_ore),
            osmium(FFBlockTags.osmium_ore, FFBlockTags.osmium_deepslate_ore, FFBlockTags.osmium_block_raw, FFBlockTags.osmium_block, FFBlockTags.osmium_nether_ore),
            platinum(FFBlockTags.platinum_ore, FFBlockTags.platinum_deepslate_ore, FFBlockTags.platinum_block_raw, FFBlockTags.platinum_block, FFBlockTags.platinum_nether_ore),
            silver(FFBlockTags.silver_ore, FFBlockTags.silver_deepslate_ore, FFBlockTags.silver_block_raw, FFBlockTags.silver_block, FFBlockTags.silver_nether_ore),
            tin(FFBlockTags.tin_ore, FFBlockTags.tin_deepslate_ore, FFBlockTags.tin_block_raw, FFBlockTags.tin_block, FFBlockTags.tin_nether_ore),
            uranium(FFBlockTags.uranium_ore, FFBlockTags.uranium_deepslate_ore, FFBlockTags.uranium_block_raw, FFBlockTags.uranium_block, FFBlockTags.uranium_nether_ore),
            zinc(FFBlockTags.zinc_ore, FFBlockTags.zinc_deepslate_ore, FFBlockTags.zinc_block_raw, FFBlockTags.zinc_block, FFBlockTags.zinc_nether_ore);

            private final TagKey<Block> ore;
            private final TagKey<Block> deepslateOre;
            private final TagKey<Block> blockRaw;
            private final TagKey<Block> block;
            private final TagKey<Block> netherOre;

            Tags(TagKey<Block> ore, TagKey<Block> deepslateOre, TagKey<Block> blockRaw, TagKey<Block> block, TagKey<Block> netherOre) {

                this.ore = ore;
                this.deepslateOre = deepslateOre;
                this.blockRaw = blockRaw;
                this.block = block;
                this.netherOre = netherOre;
            }

            public TagKey<Block> getOre() {
                return ore;
            }

            public TagKey<Block> getDeepslateOre() {
                return deepslateOre;
            }

            public TagKey<Block> getBlockRaw() {
                return blockRaw;
            }

            public TagKey<Block> getBlock() {
                return block;
            }

            public TagKey<Block> getNetherOre() {
                return netherOre;
            }
        }

    }

    public enum Items {
        aluminum(FFItem.aluminum_clump, FFItem.aluminum_crystal, FFItem.aluminum_dust, FFItem.aluminum_dust_dirty, FFItem.aluminum_ingot, FFItem.aluminum_nugget, FFItem.aluminum_raw, FFItem.aluminum_shard),
        bismuth(FFItem.bismuth_clump, FFItem.bismuth_crystal, FFItem.bismuth_dust, FFItem.bismuth_dust_dirty, FFItem.bismuth_ingot, FFItem.bismuth_nugget, FFItem.bismuth_raw, FFItem.bismuth_shard),
        copper(FFItem.copper_clump, FFItem.copper_crystal, FFItem.copper_dust, FFItem.copper_dust_dirty, FFItem.copper_ingot, FFItem.copper_nugget, FFItem.copper_raw, FFItem.copper_shard),
        gallium(FFItem.gallium_clump, FFItem.gallium_crystal, FFItem.gallium_dust, FFItem.gallium_dust_dirty, FFItem.gallium_ingot, FFItem.gallium_nugget, FFItem.gallium_raw, FFItem.gallium_shard),
        gold(FFItem.gold_clump, FFItem.gold_crystal, FFItem.gold_dust, FFItem.gold_dust_dirty, FFItem.gold_ingot, FFItem.gold_nugget, FFItem.gold_raw, FFItem.gold_shard),
        iridium(FFItem.iridium_clump, FFItem.iridium_crystal, FFItem.iridium_dust, FFItem.iridium_dust_dirty, FFItem.iridium_ingot, FFItem.iridium_nugget, FFItem.iridium_raw, FFItem.iridium_shard),
        iron(FFItem.iron_clump, FFItem.iron_crystal, FFItem.iron_dust, FFItem.iron_dust_dirty, FFItem.iron_ingot, FFItem.iron_nugget, FFItem.iron_raw, FFItem.iron_shard),
        lead(FFItem.lead_clump, FFItem.lead_crystal, FFItem.lead_dust, FFItem.lead_dust_dirty, FFItem.lead_ingot, FFItem.lead_nugget, FFItem.lead_raw, FFItem.lead_shard),
        nickel(FFItem.nickel_clump, FFItem.nickel_crystal, FFItem.nickel_dust, FFItem.nickel_dust_dirty, FFItem.nickel_ingot, FFItem.nickel_nugget, FFItem.nickel_raw, FFItem.nickel_shard),
        osmium(FFItem.osmium_clump, FFItem.osmium_crystal, FFItem.osmium_dust, FFItem.osmium_dust_dirty, FFItem.osmium_ingot, FFItem.osmium_nugget, FFItem.osmium_raw, FFItem.osmium_shard),
        platinum(FFItem.platinum_clump, FFItem.platinum_crystal, FFItem.platinum_dust, FFItem.platinum_dust_dirty, FFItem.platinum_ingot, FFItem.platinum_nugget, FFItem.platinum_raw, FFItem.platinum_shard),
        silver(FFItem.silver_clump, FFItem.silver_crystal, FFItem.silver_dust, FFItem.silver_dust_dirty, FFItem.silver_ingot, FFItem.silver_nugget, FFItem.silver_raw, FFItem.silver_shard),
        tin(FFItem.tin_clump, FFItem.tin_crystal, FFItem.tin_dust, FFItem.tin_dust_dirty, FFItem.tin_ingot, FFItem.tin_nugget, FFItem.tin_raw, FFItem.tin_shard),
        uranium(FFItem.uranium_clump, FFItem.uranium_crystal, FFItem.uranium_dust, FFItem.uranium_dust_dirty, FFItem.uranium_ingot, FFItem.uranium_nugget, FFItem.uranium_raw, FFItem.uranium_shard),
        zinc(FFItem.zinc_clump, FFItem.zinc_crystal, FFItem.zinc_dust, FFItem.zinc_dust_dirty, FFItem.zinc_ingot, FFItem.zinc_nugget, FFItem.zinc_raw, FFItem.zinc_shard);

        private final FFRegistryItem clump;
        private final FFRegistryItem crystal;
        private final FFRegistryItem dust;
        private final FFRegistryItem dustDirty;
        private final FFRegistryItem ingot;
        private final FFRegistryItem nugget;
        private final FFRegistryItem raw;
        private final FFRegistryItem shard;

        Items(FFRegistryItem clump, FFRegistryItem crystal, FFRegistryItem dust, FFRegistryItem dustDirty, FFRegistryItem ingot, FFRegistryItem nugget, FFRegistryItem raw, FFRegistryItem shard) {

            this.clump = clump;
            this.crystal = crystal;
            this.dust = dust;
            this.dustDirty = dustDirty;
            this.ingot = ingot;
            this.nugget = nugget;
            this.raw = raw;
            this.shard = shard;
        }

        public FFRegistryItem getClump() {
            return clump;
        }

        public FFRegistryItem getCrystal() {
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

        public enum BlockItems {
            aluminum(FFBlockItem.aluminum_ore, FFBlockItem.aluminum_deepslate_ore, FFBlockItem.aluminum_block_raw, FFBlockItem.aluminum_block, FFBlockItem.aluminum_nether_ore),
            bismuth(FFBlockItem.bismuth_ore, FFBlockItem.bismuth_deepslate_ore, FFBlockItem.bismuth_block_raw, FFBlockItem.bismuth_block, FFBlockItem.bismuth_nether_ore),
            copper(FFBlockItem.copper_ore, FFBlockItem.copper_deepslate_ore, FFBlockItem.copper_block_raw, FFBlockItem.copper_block, FFBlockItem.copper_nether_ore),
            gallium(FFBlockItem.gallium_ore, FFBlockItem.gallium_deepslate_ore, FFBlockItem.gallium_block_raw, FFBlockItem.gallium_block, FFBlockItem.gallium_nether_ore),
            gold(FFBlockItem.gold_ore, FFBlockItem.gold_deepslate_ore, FFBlockItem.gold_block_raw, FFBlockItem.gold_block, FFBlockItem.gold_nether_ore),
            iridium(FFBlockItem.iridium_ore, FFBlockItem.iridium_deepslate_ore, FFBlockItem.iridium_block_raw, FFBlockItem.iridium_block, FFBlockItem.iridium_nether_ore),
            iron(FFBlockItem.iron_ore, FFBlockItem.iron_deepslate_ore, FFBlockItem.iron_block_raw, FFBlockItem.iron_block, FFBlockItem.iron_nether_ore),
            lead(FFBlockItem.lead_ore, FFBlockItem.lead_deepslate_ore, FFBlockItem.lead_block_raw, FFBlockItem.lead_block, FFBlockItem.lead_nether_ore),
            nickel(FFBlockItem.nickel_ore, FFBlockItem.nickel_deepslate_ore, FFBlockItem.nickel_block_raw, FFBlockItem.nickel_block, FFBlockItem.nickel_nether_ore),
            osmium(FFBlockItem.osmium_ore, FFBlockItem.osmium_deepslate_ore, FFBlockItem.osmium_block_raw, FFBlockItem.osmium_block, FFBlockItem.osmium_nether_ore),
            platinum(FFBlockItem.platinum_ore, FFBlockItem.platinum_deepslate_ore, FFBlockItem.platinum_block_raw, FFBlockItem.platinum_block, FFBlockItem.platinum_nether_ore),
            silver(FFBlockItem.silver_ore, FFBlockItem.silver_deepslate_ore, FFBlockItem.silver_block_raw, FFBlockItem.silver_block, FFBlockItem.silver_nether_ore),
            tin(FFBlockItem.tin_ore, FFBlockItem.tin_deepslate_ore, FFBlockItem.tin_block_raw, FFBlockItem.tin_block, FFBlockItem.tin_nether_ore),
            uranium(FFBlockItem.uranium_ore, FFBlockItem.uranium_deepslate_ore, FFBlockItem.uranium_block_raw, FFBlockItem.uranium_block, FFBlockItem.uranium_nether_ore),
            zinc(FFBlockItem.zinc_ore, FFBlockItem.zinc_deepslate_ore, FFBlockItem.zinc_block_raw, FFBlockItem.zinc_block, FFBlockItem.zinc_nether_ore);

            private final FFRegistryBlockItem ore;
            private final FFRegistryBlockItem deepslateOre;
            private final FFRegistryBlockItem blockRaw;
            private final FFRegistryBlockItem block;
            private final FFRegistryBlockItem netherOre;

            BlockItems(FFRegistryBlockItem ore, FFRegistryBlockItem deepslateOre, FFRegistryBlockItem blockRaw, FFRegistryBlockItem block, FFRegistryBlockItem netherOre) {

                this.ore = ore;
                this.deepslateOre = deepslateOre;
                this.blockRaw = blockRaw;
                this.block = block;
                this.netherOre = netherOre;
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

            public enum Tags {
                aluminum(FFBlockItemTags.aluminum_ore, FFBlockItemTags.aluminum_deepslate_ore, FFBlockItemTags.aluminum_block_raw, FFBlockItemTags.aluminum_block, FFBlockItemTags.aluminum_nether_ore),
                bismuth(FFBlockItemTags.bismuth_ore, FFBlockItemTags.bismuth_deepslate_ore, FFBlockItemTags.bismuth_block_raw, FFBlockItemTags.bismuth_block, FFBlockItemTags.bismuth_nether_ore),
                copper(FFBlockItemTags.copper_ore, FFBlockItemTags.copper_deepslate_ore, FFBlockItemTags.copper_block_raw, FFBlockItemTags.copper_block, FFBlockItemTags.copper_nether_ore),
                gallium(FFBlockItemTags.gallium_ore, FFBlockItemTags.gallium_deepslate_ore, FFBlockItemTags.gallium_block_raw, FFBlockItemTags.gallium_block, FFBlockItemTags.gallium_nether_ore),
                gold(FFBlockItemTags.gold_ore, FFBlockItemTags.gold_deepslate_ore, FFBlockItemTags.gold_block_raw, FFBlockItemTags.gold_block, FFBlockItemTags.gold_nether_ore),
                iridium(FFBlockItemTags.iridium_ore, FFBlockItemTags.iridium_deepslate_ore, FFBlockItemTags.iridium_block_raw, FFBlockItemTags.iridium_block, FFBlockItemTags.iridium_nether_ore),
                iron(FFBlockItemTags.iron_ore, FFBlockItemTags.iron_deepslate_ore, FFBlockItemTags.iron_block_raw, FFBlockItemTags.iron_block, FFBlockItemTags.iron_nether_ore),
                lead(FFBlockItemTags.lead_ore, FFBlockItemTags.lead_deepslate_ore, FFBlockItemTags.lead_block_raw, FFBlockItemTags.lead_block, FFBlockItemTags.lead_nether_ore),
                nickel(FFBlockItemTags.nickel_ore, FFBlockItemTags.nickel_deepslate_ore, FFBlockItemTags.nickel_block_raw, FFBlockItemTags.nickel_block, FFBlockItemTags.nickel_nether_ore),
                osmium(FFBlockItemTags.osmium_ore, FFBlockItemTags.osmium_deepslate_ore, FFBlockItemTags.osmium_block_raw, FFBlockItemTags.osmium_block, FFBlockItemTags.osmium_nether_ore),
                platinum(FFBlockItemTags.platinum_ore, FFBlockItemTags.platinum_deepslate_ore, FFBlockItemTags.platinum_block_raw, FFBlockItemTags.platinum_block, FFBlockItemTags.platinum_nether_ore),
                silver(FFBlockItemTags.silver_ore, FFBlockItemTags.silver_deepslate_ore, FFBlockItemTags.silver_block_raw, FFBlockItemTags.silver_block, FFBlockItemTags.silver_nether_ore),
                tin(FFBlockItemTags.tin_ore, FFBlockItemTags.tin_deepslate_ore, FFBlockItemTags.tin_block_raw, FFBlockItemTags.tin_block, FFBlockItemTags.tin_nether_ore),
                uranium(FFBlockItemTags.uranium_ore, FFBlockItemTags.uranium_deepslate_ore, FFBlockItemTags.uranium_block_raw, FFBlockItemTags.uranium_block, FFBlockItemTags.uranium_nether_ore),
                zinc(FFBlockItemTags.zinc_ore, FFBlockItemTags.zinc_deepslate_ore, FFBlockItemTags.zinc_block_raw, FFBlockItemTags.zinc_block, FFBlockItemTags.zinc_nether_ore);

                private final TagKey<Item> ore;
                private final TagKey<Item> deepslateOre;
                private final TagKey<Item> blockRaw;
                private final TagKey<Item> block;
                private final TagKey<Item> netherOre;

                Tags(TagKey<Item> ore, TagKey<Item> deepslateOre, TagKey<Item> blockRaw, TagKey<Item> block, TagKey<Item> netherOre) {

                    this.ore = ore;
                    this.deepslateOre = deepslateOre;
                    this.blockRaw = blockRaw;
                    this.block = block;
                    this.netherOre = netherOre;
                }

                public TagKey<Item> getOre() {
                    return ore;
                }

                public TagKey<Item> getDeepslateOre() {
                    return deepslateOre;
                }

                public TagKey<Item> getBlockRaw() {
                    return blockRaw;
                }

                public TagKey<Item> getBlock() {
                    return block;
                }

                public TagKey<Item> getNetherOre() {
                    return netherOre;
                }
            }

        }

        public enum Tags {
            aluminum(FFItemTags.aluminum_clump, FFItemTags.aluminum_crystal, FFItemTags.aluminum_dust, FFItemTags.aluminum_dust_dirty, FFItemTags.aluminum_ingot, FFItemTags.aluminum_nugget, FFItemTags.aluminum_raw, FFItemTags.aluminum_shard),
            bismuth(FFItemTags.bismuth_clump, FFItemTags.bismuth_crystal, FFItemTags.bismuth_dust, FFItemTags.bismuth_dust_dirty, FFItemTags.bismuth_ingot, FFItemTags.bismuth_nugget, FFItemTags.bismuth_raw, FFItemTags.bismuth_shard),
            copper(FFItemTags.copper_clump, FFItemTags.copper_crystal, FFItemTags.copper_dust, FFItemTags.copper_dust_dirty, FFItemTags.copper_ingot, FFItemTags.copper_nugget, FFItemTags.copper_raw, FFItemTags.copper_shard),
            gallium(FFItemTags.gallium_clump, FFItemTags.gallium_crystal, FFItemTags.gallium_dust, FFItemTags.gallium_dust_dirty, FFItemTags.gallium_ingot, FFItemTags.gallium_nugget, FFItemTags.gallium_raw, FFItemTags.gallium_shard),
            gold(FFItemTags.gold_clump, FFItemTags.gold_crystal, FFItemTags.gold_dust, FFItemTags.gold_dust_dirty, FFItemTags.gold_ingot, FFItemTags.gold_nugget, FFItemTags.gold_raw, FFItemTags.gold_shard),
            iridium(FFItemTags.iridium_clump, FFItemTags.iridium_crystal, FFItemTags.iridium_dust, FFItemTags.iridium_dust_dirty, FFItemTags.iridium_ingot, FFItemTags.iridium_nugget, FFItemTags.iridium_raw, FFItemTags.iridium_shard),
            iron(FFItemTags.iron_clump, FFItemTags.iron_crystal, FFItemTags.iron_dust, FFItemTags.iron_dust_dirty, FFItemTags.iron_ingot, FFItemTags.iron_nugget, FFItemTags.iron_raw, FFItemTags.iron_shard),
            lead(FFItemTags.lead_clump, FFItemTags.lead_crystal, FFItemTags.lead_dust, FFItemTags.lead_dust_dirty, FFItemTags.lead_ingot, FFItemTags.lead_nugget, FFItemTags.lead_raw, FFItemTags.lead_shard),
            nickel(FFItemTags.nickel_clump, FFItemTags.nickel_crystal, FFItemTags.nickel_dust, FFItemTags.nickel_dust_dirty, FFItemTags.nickel_ingot, FFItemTags.nickel_nugget, FFItemTags.nickel_raw, FFItemTags.nickel_shard),
            osmium(FFItemTags.osmium_clump, FFItemTags.osmium_crystal, FFItemTags.osmium_dust, FFItemTags.osmium_dust_dirty, FFItemTags.osmium_ingot, FFItemTags.osmium_nugget, FFItemTags.osmium_raw, FFItemTags.osmium_shard),
            platinum(FFItemTags.platinum_clump, FFItemTags.platinum_crystal, FFItemTags.platinum_dust, FFItemTags.platinum_dust_dirty, FFItemTags.platinum_ingot, FFItemTags.platinum_nugget, FFItemTags.platinum_raw, FFItemTags.platinum_shard),
            silver(FFItemTags.silver_clump, FFItemTags.silver_crystal, FFItemTags.silver_dust, FFItemTags.silver_dust_dirty, FFItemTags.silver_ingot, FFItemTags.silver_nugget, FFItemTags.silver_raw, FFItemTags.silver_shard),
            tin(FFItemTags.tin_clump, FFItemTags.tin_crystal, FFItemTags.tin_dust, FFItemTags.tin_dust_dirty, FFItemTags.tin_ingot, FFItemTags.tin_nugget, FFItemTags.tin_raw, FFItemTags.tin_shard),
            uranium(FFItemTags.uranium_clump, FFItemTags.uranium_crystal, FFItemTags.uranium_dust, FFItemTags.uranium_dust_dirty, FFItemTags.uranium_ingot, FFItemTags.uranium_nugget, FFItemTags.uranium_raw, FFItemTags.uranium_shard),
            zinc(FFItemTags.zinc_clump, FFItemTags.zinc_crystal, FFItemTags.zinc_dust, FFItemTags.zinc_dust_dirty, FFItemTags.zinc_ingot, FFItemTags.zinc_nugget, FFItemTags.zinc_raw, FFItemTags.zinc_shard);

            private final TagKey<Item> clump;
            private final TagKey<Item> crystal;
            private final TagKey<Item> dust;
            private final TagKey<Item> dustDirty;
            private final TagKey<Item> ingot;
            private final TagKey<Item> nugget;
            private final TagKey<Item> raw;
            private final TagKey<Item> shard;

            Tags(TagKey<Item> clump, TagKey<Item> crystal, TagKey<Item> dust, TagKey<Item> dustDirty, TagKey<Item> ingot, TagKey<Item> nugget, TagKey<Item> raw, TagKey<Item> shard) {

                this.clump = clump;
                this.crystal = crystal;
                this.dust = dust;
                this.dustDirty = dustDirty;
                this.ingot = ingot;
                this.nugget = nugget;
                this.raw = raw;
                this.shard = shard;
            }

            public TagKey<Item> getClump() {
                return clump;
            }

            public TagKey<Item> getCrystal() {
                return crystal;
            }

            public TagKey<Item> getDust() {
                return dust;
            }

            public TagKey<Item> getDustDirty() {
                return dustDirty;
            }

            public TagKey<Item> getIngot() {
                return ingot;
            }

            public TagKey<Item> getNugget() {
                return nugget;
            }

            public TagKey<Item> getRaw() {
                return raw;
            }

            public TagKey<Item> getShard() {
                return shard;
            }
        }

    }

}
