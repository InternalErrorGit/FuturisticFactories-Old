package net.internalerror.futuristicfactories.data.recipe.type;

import net.internalerror.futuristicfactories.data.recipe.PulverizingRecipe;
import net.minecraft.world.item.crafting.RecipeType;

public class PulverizingRecipeType implements RecipeType<PulverizingRecipe> {

    private PulverizingRecipeType() {

    }

    public static final PulverizingRecipeType instance = new PulverizingRecipeType();
    public static final String ID = "pulverizing";

}