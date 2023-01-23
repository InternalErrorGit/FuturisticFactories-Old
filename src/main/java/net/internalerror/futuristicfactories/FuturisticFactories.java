package net.internalerror.futuristicfactories;

import com.mojang.logging.LogUtils;
import net.internalerror.futuristicfactories.registry.*;
import net.internalerror.futuristicfactories.util.FFResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FuturisticFactories.MOD_ID)
public class FuturisticFactories {

    public static final String MOD_ID = "futuristicfactories";
    public static final Logger LOGGER = LogUtils.getLogger();


    public FuturisticFactories() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        LOGGER.info("Initialization >> Starting");
        LOGGER.info("Initialization >> Registering Blocks");
        FFBlocks.register(modEventBus);
        LOGGER.info("Initialization >> Registering Items");
        FFItems.register(modEventBus);
        LOGGER.info("Initialization >> Registering Block Items");
        FFBlockItems.register(modEventBus);
        LOGGER.info("Initialization >> Registering Block Entity Types");
        FFBlockEntityTypes.register(modEventBus);
        LOGGER.info("Initialization >> Registering Menus Types");
        FFMenuTypes.register(modEventBus);
        LOGGER.info("Initialization >> Registering Recipe Serializers");
        FFRecipeSerializers.register(modEventBus);
        LOGGER.info("Initialization >> Ended");


        MinecraftForge.EVENT_BUS.register(this);
    }

    public static FFResourceLocation getId(String path){
        if (path.contains(":")){
            throw new IllegalArgumentException("Path contains namespace");
        }
        return new FFResourceLocation(path);
    }

}
