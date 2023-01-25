package net.internalerror.futuristicfactories.data.recipe.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import org.jetbrains.annotations.NotNull;

public abstract class FFSimpleRecipe implements Recipe<SimpleContainer> {

    public static final String Json_Key_Resource_Location = "resourceLocation";
    public static final String Json_Key_Result = "result";
    public static final String Json_Key_Result_Count = "resultCount";
    public static final String Json_Key_Result_Chance = "resultChance";
    public static final String Json_Key_Ingredient = "ingredient";
    public static final String Json_Key_Processing_Time = "processingTime";

    protected final ResourceLocation resourceLocation;
    protected final Item result;
    protected final int resultCount;
    protected final float resultChance;
    protected final Ingredient ingredient;
    protected final int processingTime;

    public FFSimpleRecipe(ResourceLocation resourceLocation, Item result, int resultCount, float resultChance, Ingredient ingredient, int processingTime) {
        this.resourceLocation = resourceLocation;
        this.result = result;
        this.resultCount = resultCount;
        this.resultChance = resultChance;
        this.ingredient = ingredient;
        this.processingTime = processingTime;
    }

    @Override
    public ItemStack assemble(@NotNull SimpleContainer container) {
        return null;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public @NotNull ItemStack getResultItem() {
        return new ItemStack(result, resultCount);
    }

    public int getResultCount() {
        return resultCount;
    }

    @Override
    public @NotNull ResourceLocation getId() {
        return resourceLocation;
    }

    public ResourceLocation getResourceLocation() {
        return resourceLocation;
    }

    public Item getResult() {
        return result;
    }

    public float getResultChance() {
        return resultChance;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public int getProcessingTime() {
        return processingTime;
    }
}
