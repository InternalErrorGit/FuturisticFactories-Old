package net.internalerror.futuristicfactories.data.recipe.result;

import com.google.gson.JsonObject;
import net.internalerror.futuristicfactories.data.recipe.serializer.PulverizingRecipeSerializer;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeResult;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class PulverizingRecipeResult extends FFSimpleRecipeResult<PulverizingRecipeSerializer> {

    public static final String Json_Key_Secondary_Result = "secondaryResult";
    private final Item secondaryResult;
    public static final String Json_Key_Secondary_Result_Count = "secondaryResultCount";
    private final int secondaryResultCount;
    public static final String Json_Key_Secondary_Result_Chance = "secondaryResultChance";
    private final float secondaryResultChance;


    public PulverizingRecipeResult(ResourceLocation resourceLocation, String group, Ingredient ingredient, Item result, int resultCount, float resultChance, int processingTime, Advancement.Builder advancementBuilder, ResourceLocation advancementResourceLocation, PulverizingRecipeSerializer serializer, Item secondaryResult, int secondaryResultCount, float secondaryResultChance) {
        super(resourceLocation, group, ingredient, resultCount, resultChance, processingTime, result, advancementBuilder, advancementResourceLocation, serializer);
        this.secondaryResult = secondaryResult;
        this.secondaryResultCount = secondaryResultCount;
        this.secondaryResultChance = secondaryResultChance;
    }

    @Override
    public void serializeRecipeData(@NotNull JsonObject json) {
        super.serializeRecipeData(json);
        json.addProperty(PulverizingRecipeResult.Json_Key_Secondary_Result, Registry.ITEM.getKey(secondaryResult).toString());
        json.addProperty(PulverizingRecipeResult.Json_Key_Secondary_Result_Count, secondaryResultCount);
        json.addProperty(PulverizingRecipeResult.Json_Key_Secondary_Result_Chance, secondaryResultChance);
    }

}
