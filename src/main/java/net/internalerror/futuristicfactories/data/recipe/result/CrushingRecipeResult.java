package net.internalerror.futuristicfactories.data.recipe.result;

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

public class CrushingRecipeResult implements FinishedRecipe {

    private final ResourceLocation id;
    private final String group;
    private final Ingredient ingredient;
    private final Item result;
    private final int resultCount;
    private final int processingTime;
    private final Item aSecondaryResult;
    private final float aSecondaryResultChance;
    private final Advancement.Builder advancement;
    private final ResourceLocation advancementId;
    private final CrushingRecipeSerializer serializer;

    public CrushingRecipeResult(ResourceLocation id, String group, Ingredient ingredient, Item result, int resultCount, int processingTime, Item pSecondaryResult, float pSecondaryResultChance, Advancement.Builder advancement, ResourceLocation advancementId, CrushingRecipeSerializer serializer) {
        this.id = id;
        this.group = group;
        this.ingredient = ingredient;
        this.result = result;
        this.resultCount = resultCount;
        this.processingTime = processingTime;
        this.aSecondaryResult = pSecondaryResult;
        this.aSecondaryResultChance = pSecondaryResultChance;
        this.advancement = advancement;
        this.advancementId = advancementId;
        this.serializer = serializer;
    }

    @Override
    public void serializeRecipeData(@NotNull JsonObject pJson) {
        if (!this.group.isEmpty()) {
            pJson.addProperty("group", this.group);
        }


        pJson.add(CrushingRecipeSerializer.Json_Index_Ingredient, this.ingredient.toJson());
        pJson.addProperty(CrushingRecipeSerializer.Json_Index_Result, Registry.ITEM.getKey(this.result).toString());
        pJson.addProperty(CrushingRecipeSerializer.Json_Index_ProcessingTime, this.processingTime);
        pJson.addProperty(CrushingRecipeSerializer.Json_Index_Result_Count, resultCount);
        pJson.addProperty(CrushingRecipeSerializer.Json_Index_SecondaryResult, Registry.ITEM.getKey(this.aSecondaryResult).toString());
        pJson.addProperty(CrushingRecipeSerializer.Json_Index_SecondaryResultChance, aSecondaryResultChance);
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getType() {
        return serializer;
    }

    @Nullable
    @Override
    public JsonObject serializeAdvancement() {
        return advancement.serializeToJson();
    }

    @Nullable
    @Override
    public ResourceLocation getAdvancementId() {
        return advancementId;
    }
}