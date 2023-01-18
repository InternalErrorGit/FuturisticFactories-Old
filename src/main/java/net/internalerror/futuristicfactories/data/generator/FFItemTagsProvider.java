package net.internalerror.futuristicfactories.data.generator;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

import net.internalerror.futuristicfactories.data.FFMaterial;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class FFItemTagsProvider extends ItemTagsProvider {

  public FFItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider,@Nullable ExistingFileHelper existingFileHelper) {
    super(dataGenerator, blockTagsProvider, MOD_ID, existingFileHelper);
  }

  @Override
  protected void addTags() {

    tag(FFMaterial.aluminum.getBlockTag()).add(FFMaterial.aluminum.getBlock().getRegistryObject().get());

  }
}
