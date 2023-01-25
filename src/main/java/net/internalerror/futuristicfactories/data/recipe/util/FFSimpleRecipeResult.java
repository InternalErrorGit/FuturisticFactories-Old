package net.internalerror.futuristicfactories.data.recipe.util;

import com.google.gson.JsonObject;
import net.internalerror.futuristicfactories.data.recipe.serializer.CrushingRecipeSerializer;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class FFSimpleRecipeResult<S extends RecipeSerializer<?>> implements FinishedRecipe {

    private final ResourceLocation resourceLocation;
    private final Ingredient ingredient;
    private final Item result;
    private final int resultCount;
    private final float resultChance;
    private final int processingTime;
    private final String group;

    private final Advancement.Builder advancementBuilder;
    private final ResourceLocation advancementResourceLocation;
    private final S serializer;

    public FFSimpleRecipeResult(ResourceLocation resourceLocation, String group, Ingredient ingredient, int resultCount, float resultChance, int processingTime, Item result, Advancement.Builder advancementBuilder, ResourceLocation advancementResourceLocation, S serializer) {
        this.resourceLocation = resourceLocation;
        this.group = group;
        this.ingredient = ingredient;
        this.result = result;
        this.resultCount = resultCount;
        this.resultChance = resultChance;
        this.processingTime = processingTime;
        this.advancementBuilder = advancementBuilder;
        this.advancementResourceLocation = advancementResourceLocation;
        this.serializer = serializer;
    }

    @Override
    public void serializeRecipeData(@NotNull JsonObject json) {
        if (group != null && !this.group.isEmpty()) {
            json.addProperty("group", this.group);
        }
        json.add(FFSimpleRecipe.Json_Key_Ingredient, ingredient.toJson());
        json.addProperty(FFSimpleRecipe.Json_Key_Result, Registry.ITEM.getKey(result).toString());
        json.addProperty(FFSimpleRecipe.Json_Key_Result_Count, resultCount);
        json.addProperty(FFSimpleRecipe.Json_Key_Result_Chance, resultChance);
        json.addProperty(FFSimpleRecipe.Json_Key_Processing_Time, processingTime);
    }

    @Override
    public @NotNull ResourceLocation getId() {
        return resourceLocation;
    }

    @Override
    public @NotNull RecipeSerializer<?> getType() {
        return serializer;
    }

    @Nullable
    @Override
    public JsonObject serializeAdvancement() {
        return advancementBuilder.serializeToJson();
    }

    @Nullable
    @Override
    public ResourceLocation getAdvancementId() {
        return advancementResourceLocation;
    }
}
