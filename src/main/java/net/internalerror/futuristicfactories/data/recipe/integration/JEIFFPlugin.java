package net.internalerror.futuristicfactories.data.recipe.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.internalerror.futuristicfactories.data.recipe.CrushingRecipe;
import net.internalerror.futuristicfactories.data.recipe.type.CrushingRecipeType;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

@JeiPlugin
public class JEIFFPlugin implements IModPlugin {
    public static RecipeType<CrushingRecipe> crushing_type = new RecipeType<>(CrushingRecipeCategory.UID, CrushingRecipe.class);


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new CrushingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));


        IModPlugin.super.registerCategories(registration);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<CrushingRecipe> crushingRecipes = rm.getAllRecipesFor(CrushingRecipeType.instance);
        registration.addRecipes(crushing_type, crushingRecipes);
    }
}
