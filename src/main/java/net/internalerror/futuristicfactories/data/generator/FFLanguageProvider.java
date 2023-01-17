package net.internalerror.futuristicfactories.data.generator;

import net.internalerror.futuristicfactories.registry.FFBlock;
import net.internalerror.futuristicfactories.registry.FFItem;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFLanguageProvider extends LanguageProvider {


    public FFLanguageProvider(DataGenerator dataGenerator) {
        super(dataGenerator, MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        FFBlock.getAll().forEach(block -> add(block.getRegistryObject().get(), block.getName()));
        FFItem.getAll().forEach(item -> add(item.getRegistryObject().get(), item.getName()));
    }
}
