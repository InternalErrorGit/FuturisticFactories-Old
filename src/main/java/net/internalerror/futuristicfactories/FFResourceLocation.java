package net.internalerror.futuristicfactories;

import net.minecraft.resources.ResourceLocation;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFResourceLocation extends ResourceLocation {
    public FFResourceLocation(String path) {
        super(addFFNamespace(path));
    }

    private static String addFFNamespace(String resourceName){
        return MOD_ID + ":" + resourceName;
    }
}
