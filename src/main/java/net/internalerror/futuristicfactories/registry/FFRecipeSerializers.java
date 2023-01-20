package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.data.recipe.CrushingRecipe;
import net.internalerror.futuristicfactories.data.recipe.serializer.CrushingRecipeSerializer;
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
            register.register("crushing", () -> CrushingRecipeSerializer.instance);


    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }
}
