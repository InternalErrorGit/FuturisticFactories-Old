package net.internalerror.futuristicfactories.data;

import net.internalerror.futuristicfactories.data.generator.FFBlockStateProvider;
import net.internalerror.futuristicfactories.data.generator.FFLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFDataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new FFLanguageProvider(generator));
        generator.addProvider(true, new FFBlockStateProvider(generator, existingFileHelper));
    }
}
