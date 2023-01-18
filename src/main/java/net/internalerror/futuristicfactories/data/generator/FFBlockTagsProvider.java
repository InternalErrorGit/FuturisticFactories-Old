package net.internalerror.futuristicfactories.data.generator;

import net.internalerror.futuristicfactories.data.FFMaterial;
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

        tag(material.getOreBlockTag()).add(material.getOreBlock().getRegistryObject().get());
        tag(material.getDeepslateOreBlockTag()).add(material.getDeepslateOreBlock().getRegistryObject().get());
        tag(material.getBlockRawBlockTag()).add(material.getBlockRawBlock().getRegistryObject().get());
        tag(material.getBlockBlockTag()).add(material.getBlockBlock().getRegistryObject().get());
        tag(material.getNetherOreBlockTag()).add(material.getNetherOreBlock().getRegistryObject().get());


        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(material.getOreBlock().getRegistryObject().get(), material.getDeepslateOreBlock().getRegistryObject().get(), material.getBlockBlock().getRegistryObject().get(), material.getBlockRawBlock().getRegistryObject().get(), material.getNetherOreBlock().getRegistryObject().get());
        tag(BlockTags.NEEDS_STONE_TOOL).add(material.getOreBlock().getRegistryObject().get(), material.getDeepslateOreBlock().getRegistryObject().get(), material.getBlockBlock().getRegistryObject().get(), material.getBlockRawBlock().getRegistryObject().get(), material.getNetherOreBlock().getRegistryObject().get());
        tag(BlockTags.BEACON_BASE_BLOCKS).add(material.getBlockBlock().getRegistryObject().get());


    }
}
