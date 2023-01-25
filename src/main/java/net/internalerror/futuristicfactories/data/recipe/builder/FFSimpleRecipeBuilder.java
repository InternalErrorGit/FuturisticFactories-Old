package net.internalerror.futuristicfactories.data.recipe.builder;

import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipe;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeContainer;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeResult;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeSerializer;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public abstract class FFSimpleRecipeBuilder<R extends FFSimpleRecipe, C extends FFSimpleRecipeContainer<R>, S extends FFSimpleRecipeSerializer<R, C>> implements RecipeBuilder {

    protected final Ingredient ingredient;
    protected final ItemLike result;
    protected final int resultCount;
    protected final float resultChance;
    protected final int aProcessingTime;

    protected final Advancement.Builder advancementBuilder = Advancement.Builder.advancement();
    protected String group;
    protected final S serializer;

    public FFSimpleRecipeBuilder(Ingredient ingredient, ItemLike result, int resultCount, float resultChance, int aProcessingTime, S serializer) {
        this.ingredient = ingredient;
        this.result = result;
        this.resultCount = resultCount;
        this.resultChance = resultChance;
        this.aProcessingTime = aProcessingTime;
        this.serializer = serializer;
    }

    @Override
    public @NotNull FFSimpleRecipeBuilder<R,C,S> unlockedBy(@NotNull String criterionName, @NotNull CriterionTriggerInstance criterionTrigger) {
        advancementBuilder.addCriterion(criterionName, criterionTrigger);
        return this;
    }

    public abstract FFSimpleRecipeResult<S> build(@NotNull ResourceLocation recipeId);

    @Override
    public @NotNull RecipeBuilder group(@Nullable String groupName) {
        group = groupName;
        return this;
    }

    @Override
    public @NotNull Item getResult() {
        return result.asItem();
    }

    @Override
    public void save(@NotNull Consumer<FinishedRecipe> finishedRecipeConsumer, @NotNull ResourceLocation recipeId) {
        this.ensureValid(recipeId);
        this.advancementBuilder.parent(ROOT_RECIPE_ADVANCEMENT)
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(recipeId))
                .rewards(AdvancementRewards.Builder.recipe(recipeId))
                .requirements(RequirementsStrategy.OR);

        finishedRecipeConsumer.accept(
                build(recipeId)
        );
    }

    private void ensureValid(ResourceLocation pId) {
        if (advancementBuilder.getCriteria().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + pId);
        }
    }
}
