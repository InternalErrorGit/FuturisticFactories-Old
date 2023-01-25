package net.internalerror.futuristicfactories.data.recipe.builder;

import net.internalerror.futuristicfactories.data.recipe.result.CrushingRecipeResult;
import net.internalerror.futuristicfactories.data.recipe.serializer.CrushingRecipeSerializer;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class CrushingRecipeBuilder implements RecipeBuilder {

    private final ItemStack aResult;
    private final Ingredient aIngredient;
    private final int aProcessingTime;
    private final Item aSecondaryResult;
    private final float aSecondaryResultChance;
    private final Advancement.Builder aAdvancement = Advancement.Builder.advancement();
    @Nullable
    private String aGroup;
    private final CrushingRecipeSerializer aSerializer;

    public CrushingRecipeBuilder(ItemLike pResult, Ingredient pIngredient, int pProcessingTime, CrushingRecipeSerializer pSerializer, int pResultCount, ItemLike pSecondaryResult, float pSecondaryResultChance) {
        this.aResult = new ItemStack(pResult, pResultCount);
        this.aIngredient = pIngredient;
        this.aProcessingTime = pProcessingTime;
        this.aSerializer = pSerializer;
        this.aSecondaryResult = pSecondaryResult.asItem();
        this.aSecondaryResultChance = pSecondaryResultChance;
    }

    public static CrushingRecipeBuilder crushing(Ingredient pIngredient, ItemLike pResult, int pProcessingTime, int pResultCount) {
        return new CrushingRecipeBuilder(pResult, pIngredient, pProcessingTime, CrushingRecipeSerializer.instance, pResultCount, null, 0);
    }

    public static CrushingRecipeBuilder crushing(Ingredient pIngredient, ItemLike pResult, int pProcessingTime, int pResultCount, ItemLike pSecondaryResult, float pSecondaryResultChance) {
        return new CrushingRecipeBuilder(pResult, pIngredient, pProcessingTime, CrushingRecipeSerializer.instance, pResultCount, pSecondaryResult, pSecondaryResultChance);
    }

    @Override
    public @NotNull CrushingRecipeBuilder unlockedBy(@NotNull String pCriterionName, @NotNull CriterionTriggerInstance pCriterionTrigger) {
        aAdvancement.addCriterion(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public @NotNull RecipeBuilder group(@Nullable String pGroupName) {
        aGroup = pGroupName;
        return this;
    }

    @Override
    public @NotNull Item getResult() {
        return this.aResult.getItem().asItem();
    }

    @Override
    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, @NotNull ResourceLocation pRecipeId) {
        this.ensureValid(pRecipeId);
        this.aAdvancement.parent(ROOT_RECIPE_ADVANCEMENT)
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId))
                .rewards(AdvancementRewards.Builder.recipe(pRecipeId))
                .requirements(RequirementsStrategy.OR);
        pFinishedRecipeConsumer.accept(
                new CrushingRecipeResult(
                        pRecipeId,
                        this.aGroup == null ? "" : this.aGroup,
                        this.aIngredient,
                        this.aResult.getItem(),
                        this.aResult.getCount(),
                        this.aProcessingTime,
                        this.aSecondaryResult,
                        this.aSecondaryResultChance,
                        this.aAdvancement,
                        new ResourceLocation(pRecipeId.getNamespace(), "recipes/" + this.aResult.getItem().getItemCategory().getRecipeFolderName() + "/" + pRecipeId.getPath()),
                        this.aSerializer));
    }

    private void ensureValid(ResourceLocation pId) {
        if (this.aAdvancement.getCriteria().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + pId);
        }
    }

}
