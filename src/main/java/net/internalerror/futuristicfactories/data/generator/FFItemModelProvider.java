package net.internalerror.futuristicfactories.data.generator;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

import net.internalerror.futuristicfactories.data.FFMaterial;
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


  }


  private void material(FFMaterial material) {

    withExistingParent(material.getBlockBlock().getName(), modLoc("block/" + material.getBlockBlock().getName()));
    withExistingParent(material.getBlockRawBlock().getName(), modLoc("block/" + material.getBlockRawBlock().getName()));
    withExistingParent(material.getDeepslateOreBlock().getName(), modLoc("block/" + material.getDeepslateOreBlock().getName()));
    withExistingParent(material.getNetherOreBlock().getName(), modLoc("block/" + material.getNetherOreBlock().getName()));
    withExistingParent(material.getOreBlock().getName(), modLoc("block/" + material.getOreBlock().getName()));

    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

    builder(itemGenerated, material.getClump().getName());
    builder(itemGenerated, material.getCrystal().getName());
    builder(itemGenerated, material.getDust().getName());
    builder(itemGenerated, material.getDustDirty().getName());
    builder(itemGenerated, material.getIngot().getName());
    builder(itemGenerated, material.getNugget().getName());
    builder(itemGenerated, material.getRaw().getName());
    builder(itemGenerated, material.getShard().getName());


  }

  private ItemModelBuilder builder(ModelFile modelFile, String name) {
    return getBuilder(name).parent(modelFile).texture("layer0", "item/" + name);
  }
}
