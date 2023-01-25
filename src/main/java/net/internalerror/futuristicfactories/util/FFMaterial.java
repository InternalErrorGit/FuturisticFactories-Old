package net.internalerror.futuristicfactories.util;

import net.internalerror.futuristicfactories.data.tags.FFBlockItemTags;
import net.internalerror.futuristicfactories.data.tags.FFBlockTags;
import net.internalerror.futuristicfactories.data.tags.FFItemTags;
import net.internalerror.futuristicfactories.registry.FFBlockItems;
import net.internalerror.futuristicfactories.registry.FFBlocks;
import net.internalerror.futuristicfactories.registry.FFItems;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

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
    aluminum(FFBlocks.aluminum_ore, FFBlocks.aluminum_deepslate_ore, FFBlocks.aluminum_block_raw, FFBlocks.aluminum_block, FFBlocks.aluminum_nether_ore),
    bismuth(FFBlocks.bismuth_ore, FFBlocks.bismuth_deepslate_ore, FFBlocks.bismuth_block_raw, FFBlocks.bismuth_block, FFBlocks.bismuth_nether_ore),
    copper(FFBlocks.copper_ore, FFBlocks.copper_deepslate_ore, FFBlocks.copper_block_raw, FFBlocks.copper_block, FFBlocks.copper_nether_ore),
    gallium(FFBlocks.gallium_ore, FFBlocks.gallium_deepslate_ore, FFBlocks.gallium_block_raw, FFBlocks.gallium_block, FFBlocks.gallium_nether_ore),
    gold(FFBlocks.gold_ore, FFBlocks.gold_deepslate_ore, FFBlocks.gold_block_raw, FFBlocks.gold_block, FFBlocks.gold_nether_ore),
    iridium(FFBlocks.iridium_ore, FFBlocks.iridium_deepslate_ore, FFBlocks.iridium_block_raw, FFBlocks.iridium_block, FFBlocks.iridium_nether_ore),
    iron(FFBlocks.iron_ore, FFBlocks.iron_deepslate_ore, FFBlocks.iron_block_raw, FFBlocks.iron_block, FFBlocks.iron_nether_ore),
    lead(FFBlocks.lead_ore, FFBlocks.lead_deepslate_ore, FFBlocks.lead_block_raw, FFBlocks.lead_block, FFBlocks.lead_nether_ore),
    nickel(FFBlocks.nickel_ore, FFBlocks.nickel_deepslate_ore, FFBlocks.nickel_block_raw, FFBlocks.nickel_block, FFBlocks.nickel_nether_ore),
    osmium(FFBlocks.osmium_ore, FFBlocks.osmium_deepslate_ore, FFBlocks.osmium_block_raw, FFBlocks.osmium_block, FFBlocks.osmium_nether_ore),
    platinum(FFBlocks.platinum_ore, FFBlocks.platinum_deepslate_ore, FFBlocks.platinum_block_raw, FFBlocks.platinum_block, FFBlocks.platinum_nether_ore),
    silver(FFBlocks.silver_ore, FFBlocks.silver_deepslate_ore, FFBlocks.silver_block_raw, FFBlocks.silver_block, FFBlocks.silver_nether_ore),
    tin(FFBlocks.tin_ore, FFBlocks.tin_deepslate_ore, FFBlocks.tin_block_raw, FFBlocks.tin_block, FFBlocks.tin_nether_ore),
    uranium(FFBlocks.uranium_ore, FFBlocks.uranium_deepslate_ore, FFBlocks.uranium_block_raw, FFBlocks.uranium_block, FFBlocks.uranium_nether_ore),
    zinc(FFBlocks.zinc_ore, FFBlocks.zinc_deepslate_ore, FFBlocks.zinc_block_raw, FFBlocks.zinc_block, FFBlocks.zinc_nether_ore);

    private final RegistryObject<Block> ore;
    private final RegistryObject<Block> deepslateOre;
    private final RegistryObject<Block> blockRaw;
    private final RegistryObject<Block> block;
    private final RegistryObject<Block> netherOre;

    Blocks(RegistryObject<Block> ore, RegistryObject<Block> deepslateOre, RegistryObject<Block> blockRaw, RegistryObject<Block> block, RegistryObject<Block> netherOre) {

      this.ore = ore;
      this.deepslateOre = deepslateOre;
      this.blockRaw = blockRaw;
      this.block = block;
      this.netherOre = netherOre;
    }

    public RegistryObject<Block> getOre() {
      return ore;
    }

    public RegistryObject<Block> getDeepslateOre() {
      return deepslateOre;
    }

    public RegistryObject<Block> getBlockRaw() {
      return blockRaw;
    }

    public RegistryObject<Block> getBlock() {
      return block;
    }

    public RegistryObject<Block> getNetherOre() {
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
    aluminum(FFItems.aluminum_clump, FFItems.aluminum_crystal, FFItems.aluminum_dust, FFItems.aluminum_dust_dirty, FFItems.aluminum_ingot, FFItems.aluminum_nugget, FFItems.aluminum_raw, FFItems.aluminum_shard),
    bismuth(FFItems.bismuth_clump, FFItems.bismuth_crystal, FFItems.bismuth_dust, FFItems.bismuth_dust_dirty, FFItems.bismuth_ingot, FFItems.bismuth_nugget, FFItems.bismuth_raw, FFItems.bismuth_shard),
    copper(FFItems.copper_clump, FFItems.copper_crystal, FFItems.copper_dust, FFItems.copper_dust_dirty, FFItems.copper_ingot, FFItems.copper_nugget, FFItems.copper_raw, FFItems.copper_shard),
    gallium(FFItems.gallium_clump, FFItems.gallium_crystal, FFItems.gallium_dust, FFItems.gallium_dust_dirty, FFItems.gallium_ingot, FFItems.gallium_nugget, FFItems.gallium_raw, FFItems.gallium_shard),
    gold(FFItems.gold_clump, FFItems.gold_crystal, FFItems.gold_dust, FFItems.gold_dust_dirty, FFItems.gold_ingot, FFItems.gold_nugget, FFItems.gold_raw, FFItems.gold_shard),
    iridium(FFItems.iridium_clump, FFItems.iridium_crystal, FFItems.iridium_dust, FFItems.iridium_dust_dirty, FFItems.iridium_ingot, FFItems.iridium_nugget, FFItems.iridium_raw, FFItems.iridium_shard),
    iron(FFItems.iron_clump, FFItems.iron_crystal, FFItems.iron_dust, FFItems.iron_dust_dirty, FFItems.iron_ingot, FFItems.iron_nugget, FFItems.iron_raw, FFItems.iron_shard),
    lead(FFItems.lead_clump, FFItems.lead_crystal, FFItems.lead_dust, FFItems.lead_dust_dirty, FFItems.lead_ingot, FFItems.lead_nugget, FFItems.lead_raw, FFItems.lead_shard),
    nickel(FFItems.nickel_clump, FFItems.nickel_crystal, FFItems.nickel_dust, FFItems.nickel_dust_dirty, FFItems.nickel_ingot, FFItems.nickel_nugget, FFItems.nickel_raw, FFItems.nickel_shard),
    osmium(FFItems.osmium_clump, FFItems.osmium_crystal, FFItems.osmium_dust, FFItems.osmium_dust_dirty, FFItems.osmium_ingot, FFItems.osmium_nugget, FFItems.osmium_raw, FFItems.osmium_shard),
    platinum(FFItems.platinum_clump, FFItems.platinum_crystal, FFItems.platinum_dust, FFItems.platinum_dust_dirty, FFItems.platinum_ingot, FFItems.platinum_nugget, FFItems.platinum_raw, FFItems.platinum_shard),
    silver(FFItems.silver_clump, FFItems.silver_crystal, FFItems.silver_dust, FFItems.silver_dust_dirty, FFItems.silver_ingot, FFItems.silver_nugget, FFItems.silver_raw, FFItems.silver_shard),
    tin(FFItems.tin_clump, FFItems.tin_crystal, FFItems.tin_dust, FFItems.tin_dust_dirty, FFItems.tin_ingot, FFItems.tin_nugget, FFItems.tin_raw, FFItems.tin_shard),
    uranium(FFItems.uranium_clump, FFItems.uranium_crystal, FFItems.uranium_dust, FFItems.uranium_dust_dirty, FFItems.uranium_ingot, FFItems.uranium_nugget, FFItems.uranium_raw, FFItems.uranium_shard),
    zinc(FFItems.zinc_clump, FFItems.zinc_crystal, FFItems.zinc_dust, FFItems.zinc_dust_dirty, FFItems.zinc_ingot, FFItems.zinc_nugget, FFItems.zinc_raw, FFItems.zinc_shard);

    private final RegistryObject<Item> clump;
    private final RegistryObject<Item> crystal;
    private final RegistryObject<Item> dust;
    private final RegistryObject<Item> dustDirty;
    private final RegistryObject<Item> ingot;
    private final RegistryObject<Item> nugget;
    private final RegistryObject<Item> raw;
    private final RegistryObject<Item> shard;

    Items(RegistryObject<Item> clump, RegistryObject<Item> crystal, RegistryObject<Item> dust, RegistryObject<Item> dustDirty, RegistryObject<Item> ingot, RegistryObject<Item> nugget, RegistryObject<Item> raw, RegistryObject<Item> shard) {
      this.clump = clump;
      this.crystal = crystal;
      this.dust = dust;
      this.dustDirty = dustDirty;
      this.ingot = ingot;
      this.nugget = nugget;
      this.raw = raw;
      this.shard = shard;
    }

    public RegistryObject<Item> getClump() {
      return clump;
    }

    public RegistryObject<Item> getCrystal() {
      return crystal;
    }

    public RegistryObject<Item> getDust() {
      return dust;
    }

    public RegistryObject<Item> getDustDirty() {
      return dustDirty;
    }

    public RegistryObject<Item> getIngot() {
      return ingot;
    }

    public RegistryObject<Item> getNugget() {
      return nugget;
    }

    public RegistryObject<Item> getRaw() {
      return raw;
    }

    public RegistryObject<Item> getShard() {
      return shard;
    }

    public enum BlockItems {
      aluminum(FFBlockItems.aluminum_ore, FFBlockItems.aluminum_deepslate_ore, FFBlockItems.aluminum_block_raw, FFBlockItems.aluminum_block, FFBlockItems.aluminum_nether_ore),
      bismuth(FFBlockItems.bismuth_ore, FFBlockItems.bismuth_deepslate_ore, FFBlockItems.bismuth_block_raw, FFBlockItems.bismuth_block, FFBlockItems.bismuth_nether_ore),
      copper(FFBlockItems.copper_ore, FFBlockItems.copper_deepslate_ore, FFBlockItems.copper_block_raw, FFBlockItems.copper_block, FFBlockItems.copper_nether_ore),
      gallium(FFBlockItems.gallium_ore, FFBlockItems.gallium_deepslate_ore, FFBlockItems.gallium_block_raw, FFBlockItems.gallium_block, FFBlockItems.gallium_nether_ore),
      gold(FFBlockItems.gold_ore, FFBlockItems.gold_deepslate_ore, FFBlockItems.gold_block_raw, FFBlockItems.gold_block, FFBlockItems.gold_nether_ore),
      iridium(FFBlockItems.iridium_ore, FFBlockItems.iridium_deepslate_ore, FFBlockItems.iridium_block_raw, FFBlockItems.iridium_block, FFBlockItems.iridium_nether_ore),
      iron(FFBlockItems.iron_ore, FFBlockItems.iron_deepslate_ore, FFBlockItems.iron_block_raw, FFBlockItems.iron_block, FFBlockItems.iron_nether_ore),
      lead(FFBlockItems.lead_ore, FFBlockItems.lead_deepslate_ore, FFBlockItems.lead_block_raw, FFBlockItems.lead_block, FFBlockItems.lead_nether_ore),
      nickel(FFBlockItems.nickel_ore, FFBlockItems.nickel_deepslate_ore, FFBlockItems.nickel_block_raw, FFBlockItems.nickel_block, FFBlockItems.nickel_nether_ore),
      osmium(FFBlockItems.osmium_ore, FFBlockItems.osmium_deepslate_ore, FFBlockItems.osmium_block_raw, FFBlockItems.osmium_block, FFBlockItems.osmium_nether_ore),
      platinum(FFBlockItems.platinum_ore, FFBlockItems.platinum_deepslate_ore, FFBlockItems.platinum_block_raw, FFBlockItems.platinum_block, FFBlockItems.platinum_nether_ore),
      silver(FFBlockItems.silver_ore, FFBlockItems.silver_deepslate_ore, FFBlockItems.silver_block_raw, FFBlockItems.silver_block, FFBlockItems.silver_nether_ore),
      tin(FFBlockItems.tin_ore, FFBlockItems.tin_deepslate_ore, FFBlockItems.tin_block_raw, FFBlockItems.tin_block, FFBlockItems.tin_nether_ore),
      uranium(FFBlockItems.uranium_ore, FFBlockItems.uranium_deepslate_ore, FFBlockItems.uranium_block_raw, FFBlockItems.uranium_block, FFBlockItems.uranium_nether_ore),
      zinc(FFBlockItems.zinc_ore, FFBlockItems.zinc_deepslate_ore, FFBlockItems.zinc_block_raw, FFBlockItems.zinc_block, FFBlockItems.zinc_nether_ore);

      private final RegistryObject<Item> ore;
      private final RegistryObject<Item> deepslateOre;
      private final RegistryObject<Item> blockRaw;
      private final RegistryObject<Item> block;
      private final RegistryObject<Item> netherOre;

      BlockItems(RegistryObject<Item> ore, RegistryObject<Item> deepslateOre, RegistryObject<Item> blockRaw, RegistryObject<Item> block, RegistryObject<Item> netherOre) {

        this.ore = ore;
        this.deepslateOre = deepslateOre;
        this.blockRaw = blockRaw;
        this.block = block;
        this.netherOre = netherOre;
      }

      public RegistryObject<Item> getOre() {
        return ore;
      }

      public RegistryObject<Item> getDeepslateOre() {
        return deepslateOre;
      }

      public RegistryObject<Item> getBlockRaw() {
        return blockRaw;
      }

      public RegistryObject<Item> getBlock() {
        return block;
      }

      public RegistryObject<Item> getNetherOre() {
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
