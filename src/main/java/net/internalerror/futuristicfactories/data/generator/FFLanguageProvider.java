package net.internalerror.futuristicfactories.data.generator;

import net.internalerror.futuristicfactories.registry.FFBlocks;
import net.internalerror.futuristicfactories.registry.FFItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFLanguageProvider extends LanguageProvider {


    public FFLanguageProvider(DataGenerator dataGenerator) {
        super(dataGenerator, MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        FFBlocks.Util.getAll().forEach(block -> add(block.get(), block.getId().getPath()));
        FFItems.Util.getAll().forEach(item -> add(item.get(), item.getId().getPath()));
    }
}
