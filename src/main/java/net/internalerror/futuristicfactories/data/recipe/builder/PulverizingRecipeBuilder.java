package net.internalerror.futuristicfactories.data.recipe.builder;

import net.internalerror.futuristicfactories.data.recipe.PulverizingRecipe;
import net.internalerror.futuristicfactories.data.recipe.container.PulverizingRecipeContainer;
import net.internalerror.futuristicfactories.data.recipe.result.PulverizingRecipeResult;
import net.internalerror.futuristicfactories.data.recipe.serializer.PulverizingRecipeSerializer;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeResult;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class PulverizingRecipeBuilder extends FFSimpleRecipeBuilder<PulverizingRecipe, PulverizingRecipeContainer, PulverizingRecipeSerializer> {

    protected final ItemLike secondaryResult;
    protected final int secondaryResultCount;
    protected final float secondaryResultChance;

    public static PulverizingRecipeBuilder pulverizing(Ingredient ingredient, ItemLike result, int resultCount, float resultChance, int processingTime, ItemLike secondaryResult, int secondaryResultCount, float secondaryResultChance) {
        return new PulverizingRecipeBuilder(ingredient, result, resultCount, resultChance, processingTime, PulverizingRecipeSerializer.instance, secondaryResult, secondaryResultCount, secondaryResultChance);
    }

    public PulverizingRecipeBuilder(Ingredient aIngredient, ItemLike result, int resultCount, float resultChance, int aProcessingTime, PulverizingRecipeSerializer serializer, ItemLike secondaryResult, int secondaryResultCount, float secondaryResultChance) {
        super(aIngredient, result, resultCount, resultChance, aProcessingTime, serializer);
        this.secondaryResult = secondaryResult;
        this.secondaryResultCount = secondaryResultCount;
        this.secondaryResultChance = secondaryResultChance;
    }

    @Override
    public FFSimpleRecipeResult<PulverizingRecipeSerializer> build(@NotNull ResourceLocation resourceLocation) {
        return new PulverizingRecipeResult(
                resourceLocation,
                group,
                ingredient,
                result.asItem(),
                resultCount,
                resultChance,
                aProcessingTime,
                advancementBuilder,
                new ResourceLocation(resourceLocation.getNamespace(), "recipes/" + Objects.requireNonNull(result.asItem().getItemCategory()).getRecipeFolderName() + "/" + resourceLocation.getPath()),
                serializer,
                secondaryResult.asItem(),
                secondaryResultCount,
                secondaryResultChance);
    }


}
