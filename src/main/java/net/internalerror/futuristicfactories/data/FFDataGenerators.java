package net.internalerror.futuristicfactories.data;

import net.internalerror.futuristicfactories.data.generator.FFBlockStateProvider;
import net.internalerror.futuristicfactories.data.generator.FFBlockTagsProvider;
import net.internalerror.futuristicfactories.data.generator.FFItemModelProvider;
import net.internalerror.futuristicfactories.data.generator.FFItemTagsProvider;
import net.internalerror.futuristicfactories.data.generator.FFLanguageProvider;
import net.internalerror.futuristicfactories.data.generator.FFRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        dataGenerator.addProvider(true, new FFLanguageProvider(dataGenerator));
        dataGenerator.addProvider(true, new FFBlockStateProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(true, new FFRecipeProvider(dataGenerator));
        dataGenerator.addProvider(true, new FFBlockTagsProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(true, new FFItemModelProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(true, new FFItemTagsProvider(dataGenerator, new FFBlockTagsProvider(dataGenerator, existingFileHelper),existingFileHelper));
    }
}
