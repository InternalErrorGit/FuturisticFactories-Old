package net.internalerror.futuristicfactories.data.recipe.type;

import net.internalerror.futuristicfactories.data.recipe.CrushingRecipe;
import net.minecraft.world.item.crafting.RecipeType;

public class CrushingRecipeType implements RecipeType<CrushingRecipe> {
    private CrushingRecipeType() {

    }


    public static final CrushingRecipeType instance = new CrushingRecipeType();
    public static final String ID = "crushing";
}