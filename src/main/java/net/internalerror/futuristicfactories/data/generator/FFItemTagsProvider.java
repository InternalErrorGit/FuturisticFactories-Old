package net.internalerror.futuristicfactories.data.generator;

import net.internalerror.futuristicfactories.data.FFMaterial;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFItemTagsProvider extends ItemTagsProvider {

    public FFItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        for (FFMaterial material : FFMaterial.values()) {
            material(material);


        }

        //  tag(FFMaterial.aluminum.getBlockTag()).add(FFMaterial.aluminum.getBlock().getRegistryObject().get());

    }

    private void material(FFMaterial material) {


        tag(material.getItemTags().getClump()).add(material.getItems().getClump().get());
        tag(material.getItemTags().getCrystal()).add(material.getItems().getCrystal().get());
        tag(material.getItemTags().getDust()).add(material.getItems().getDust().get());
        tag(material.getItemTags().getDustDirty()).add(material.getItems().getDustDirty().get());
        tag(material.getItemTags().getIngot()).add(material.getItems().getIngot().get());
        tag(material.getItemTags().getNugget()).add(material.getItems().getNugget().get());
        tag(material.getItemTags().getRaw()).add(material.getItems().getRaw().get());
        tag(material.getItemTags().getShard()).add(material.getItems().getShard().get());


    }
}
