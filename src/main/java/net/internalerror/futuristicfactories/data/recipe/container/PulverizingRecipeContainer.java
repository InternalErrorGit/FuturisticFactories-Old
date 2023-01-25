package net.internalerror.futuristicfactories.data.recipe.container;

import net.internalerror.futuristicfactories.data.recipe.PulverizingRecipe;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeContainer;
import net.minecraft.world.item.Item;

public class PulverizingRecipeContainer extends FFSimpleRecipeContainer<PulverizingRecipe> {

    private Item secondaryResult;
    private int secondaryResultCount;
    private float secondaryResultChance;

    @Override
    public PulverizingRecipe build() {
        return new PulverizingRecipe(getResourceLocation(), getResult(), getResultCount(), getResultChance(), getIngredient(), getProcessingTime(), getSecondaryResult(), getSecondaryResultCount(), getSecondaryResultChance());
    }

    public Item getSecondaryResult() {
        return secondaryResult;
    }

    public void setSecondaryResult(Item secondaryResult) {
        this.secondaryResult = secondaryResult;
    }

    public int getSecondaryResultCount() {
        return secondaryResultCount;
    }

    public void setSecondaryResultCount(int secondaryResultCount) {
        this.secondaryResultCount = secondaryResultCount;
    }

    public float getSecondaryResultChance() {
        return secondaryResultChance;
    }

    public void setSecondaryResultChance(float secondaryResultChance) {
        this.secondaryResultChance = secondaryResultChance;
    }
}
