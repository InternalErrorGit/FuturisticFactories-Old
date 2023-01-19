package net.internalerror.futuristicfactories.data.generator;

import net.internalerror.futuristicfactories.data.FFMaterial;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFItemModelProvider extends ItemModelProvider {


    public FFItemModelProvider(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        for (FFMaterial material : FFMaterial.values()) {
            material(material);
        }


    }


    private void material(FFMaterial material) {

        withExistingParent(material.getBlocks().getBlock().getName(), modLoc("block/" + material.getBlocks().getBlock().getName()));
        withExistingParent(material.getBlocks().getBlockRaw().getName(), modLoc("block/" + material.getBlocks().getBlockRaw().getName()));
        withExistingParent(material.getBlocks().getDeepslateOre().getName(), modLoc("block/" + material.getBlocks().getDeepslateOre().getName()));
        withExistingParent(material.getBlocks().getNetherOre().getName(), modLoc("block/" + material.getBlocks().getNetherOre().getName()));
        withExistingParent(material.getBlocks().getOre().getName(), modLoc("block/" + material.getBlocks().getOre().getName()));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, material.getItems().getClump().getName());
        builder(itemGenerated, material.getItems().getCrystal().getName());
        builder(itemGenerated, material.getItems().getDust().getName());
        builder(itemGenerated, material.getItems().getDustDirty().getName());
        builder(itemGenerated, material.getItems().getIngot().getName());
        builder(itemGenerated, material.getItems().getNugget().getName());
        builder(itemGenerated, material.getItems().getRaw().getName());
        builder(itemGenerated, material.getItems().getShard().getName());


    }

    private ItemModelBuilder builder(ModelFile modelFile, String name) {
        return getBuilder(name).parent(modelFile).texture("layer0", "item/" + name);
    }
}
