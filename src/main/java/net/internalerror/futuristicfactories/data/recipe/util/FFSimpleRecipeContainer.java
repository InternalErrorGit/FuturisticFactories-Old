package net.internalerror.futuristicfactories.data.recipe.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;

public abstract class FFSimpleRecipeContainer<T extends Recipe<SimpleContainer>> {
    private ResourceLocation resourceLocation;
    private Item result;
    private int resultCount;
    private float resultChance;
    private Ingredient ingredient;
    private int processingTime;

    public abstract T build();

    public ResourceLocation getResourceLocation() {
        return resourceLocation;
    }

    public void setResourceLocation(ResourceLocation resourceLocation) {
        this.resourceLocation = resourceLocation;
    }

    public Item getResult() {
        return result;
    }

    public void setResult(Item result) {
        this.result = result;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public float getResultChance() {
        return resultChance;
    }

    public void setResultChance(float resultChance) {
        this.resultChance = resultChance;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
    }
}