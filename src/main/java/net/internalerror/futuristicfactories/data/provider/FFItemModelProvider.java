package net.internalerror.futuristicfactories.data.provider;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

import net.internalerror.futuristicfactories.registry.FFBlocks;
import net.internalerror.futuristicfactories.util.FFMaterial;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FFItemModelProvider extends ItemModelProvider {


  public FFItemModelProvider(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
    super(dataGenerator, MOD_ID, existingFileHelper);
  }

  @Override
  protected void registerModels() {

    for (FFMaterial material : FFMaterial.values()) {
      material(material);
    }

    withExistingParent(FFBlocks.crushing_machine.getId().getPath(), modLoc("block/" + FFBlocks.crushing_machine.getId().getPath()));


  }


  private void material(FFMaterial material) {

    withExistingParent(material.getBlocks().getBlock().getId().getPath(), modLoc("block/" + material.getBlocks().getBlock().getId().getPath()));
    withExistingParent(material.getBlocks().getBlockRaw().getId().getPath(), modLoc("block/" + material.getBlocks().getBlockRaw().getId().getPath()));
    withExistingParent(material.getBlocks().getDeepslateOre().getId().getPath(), modLoc("block/" + material.getBlocks().getDeepslateOre().getId().getPath()));
    withExistingParent(material.getBlocks().getNetherOre().getId().getPath(), modLoc("block/" + material.getBlocks().getNetherOre().getId().getPath()));
    withExistingParent(material.getBlocks().getOre().getId().getPath(), modLoc("block/" + material.getBlocks().getOre().getId().getPath()));

    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

    builder(itemGenerated, material.getItems().getClump().getId().getPath());
    builder(itemGenerated, material.getItems().getCrystal().getId().getPath());
    builder(itemGenerated, material.getItems().getDust().getId().getPath());
    builder(itemGenerated, material.getItems().getDustDirty().getId().getPath());
    builder(itemGenerated, material.getItems().getIngot().getId().getPath());
    builder(itemGenerated, material.getItems().getNugget().getId().getPath());
    builder(itemGenerated, material.getItems().getRaw().getId().getPath());
    builder(itemGenerated, material.getItems().getShard().getId().getPath());


  }

  private ItemModelBuilder builder(ModelFile modelFile, String name) {
    return getBuilder(name).parent(modelFile).texture("layer0", "item/" + name);
  }
}
