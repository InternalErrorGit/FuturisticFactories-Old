package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.data.recipe.CrushingRecipe;
import net.internalerror.futuristicfactories.data.recipe.PulverizingRecipe;
import net.internalerror.futuristicfactories.data.recipe.serializer.CrushingRecipeSerializer;
import net.internalerror.futuristicfactories.data.recipe.serializer.PulverizingRecipeSerializer;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> register =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MOD_ID);

    public static final RegistryObject<RecipeSerializer<CrushingRecipe>> crushing_recipe =
            register("crushing", CrushingRecipeSerializer.instance);

    public static final RegistryObject<RecipeSerializer<PulverizingRecipe>> pulverizing_recipe =
            register("pulverizing", PulverizingRecipeSerializer.instance);

    private static <T extends RecipeSerializer<?>> RegistryObject<T> register(String pName, T pInstance) {
        return register.register(pName, () -> pInstance);
    }


    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }
}
