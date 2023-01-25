package net.internalerror.futuristicfactories.data.provider;

import net.internalerror.futuristicfactories.util.FFMaterial;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlockTagsProvider extends BlockTagsProvider {
    public FFBlockTagsProvider(DataGenerator dataGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags() {

        for (FFMaterial material : FFMaterial.values()) {
            material(material);
        }


    }

    private void material(FFMaterial material) {

        tag(material.getBlockTags().getOre()).add(material.getBlocks().getOre().get());
        tag(material.getBlockTags().getDeepslateOre()).add(material.getBlocks().getDeepslateOre().get());
        tag(material.getBlockTags().getBlockRaw()).add(material.getBlocks().getBlockRaw().get());
        tag(material.getBlockTags().getBlock()).add(material.getBlocks().getBlock().get());
        tag(material.getBlockTags().getNetherOre()).add(material.getBlocks().getNetherOre().get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(material.getBlocks().getOre().get())
                .add(material.getBlocks().getDeepslateOre().get())
                .add(material.getBlocks().getBlock().get())
                .add(material.getBlocks().getBlockRaw().get())
                .add(material.getBlocks().getNetherOre().get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(material.getBlocks().getOre().get())
                .add(material.getBlocks().getDeepslateOre().get())
                .add(material.getBlocks().getBlock().get())
                .add(material.getBlocks().getBlockRaw().get())
                .add(material.getBlocks().getNetherOre().get());


        tag(BlockTags.BEACON_BASE_BLOCKS).add(material.getBlocks().getBlock().get());


    }
}
