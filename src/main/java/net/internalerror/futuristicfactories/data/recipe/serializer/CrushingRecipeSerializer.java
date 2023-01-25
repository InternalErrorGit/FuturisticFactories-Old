package net.internalerror.futuristicfactories.data.recipe.serializer;

import com.google.gson.JsonObject;
import net.internalerror.futuristicfactories.data.recipe.CrushingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class CrushingRecipeSerializer implements RecipeSerializer<CrushingRecipe> {

    public static final String Json_Index_Id = "id";
    public static final String Json_Index_Result = "result";
    public static final String Json_Index_Ingredient = "ingredient";
    public static final String Json_Index_Result_Count = "resultCount";
    public static final String Json_Index_SecondaryResult = "secondaryResult";
    public static final String Json_Index_SecondaryResultChance = "secondaryResultChance";
    public static final String Json_Index_ProcessingTime = "processingTime";


    public static final CrushingRecipeSerializer instance = new CrushingRecipeSerializer();
    public static final ResourceLocation id = new ResourceLocation(MOD_ID, "crushing");
    private final int defaultProcessingTime = 200;


    @Override
    public CrushingRecipe fromJson(@NotNull ResourceLocation pRecipeId, @NotNull JsonObject pSerializedRecipe) {

        Ingredient ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, Json_Index_Ingredient));
        String s1 = GsonHelper.getAsString(pSerializedRecipe, Json_Index_Result);
        ResourceLocation resultResourcelocation = new ResourceLocation(s1);
        ItemStack result = new ItemStack(Registry.ITEM.getOptional(resultResourcelocation).orElseThrow(() -> new IllegalStateException("Item: " + s1 + " does not exist")), GsonHelper.getAsInt(pSerializedRecipe, Json_Index_Result_Count));

        int i = GsonHelper.getAsInt(pSerializedRecipe, Json_Index_ProcessingTime, defaultProcessingTime);

        String s2 = GsonHelper.getAsString(pSerializedRecipe, Json_Index_SecondaryResult);
        ResourceLocation secondaryResultResourcelocation = new ResourceLocation(s2);
        ItemStack secondaryResult = new ItemStack(Registry.ITEM.getOptional(secondaryResultResourcelocation).orElseThrow(() -> new IllegalStateException("Item: " + s2 + " does not exist")));

        float secondaryResultChance = GsonHelper.getAsFloat(pSerializedRecipe, Json_Index_SecondaryResultChance);

        return new CrushingRecipe(pRecipeId, result, ingredient, secondaryResult, secondaryResultChance, i);
    }

    @Override
    public @Nullable CrushingRecipe fromNetwork(@NotNull ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {

        Ingredient ingredient = Ingredient.fromNetwork(pBuffer);
        ItemStack result = pBuffer.readItem();
        int processingTime = pBuffer.readInt();
        float secondaryResultChance = pBuffer.readFloat();
        ItemStack secondaryResult = pBuffer.readItem();


        return new CrushingRecipe(pRecipeId, result, ingredient, secondaryResult, secondaryResultChance, processingTime);
    }

    @Override
    public void toNetwork(FriendlyByteBuf pBuffer, CrushingRecipe pRecipe) {
        pBuffer.writeInt(pRecipe.getProcessingTime());
        pRecipe.getIngredient().toNetwork(pBuffer);
        pBuffer.writeItemStack(pRecipe.getResultItem(), false);
        pBuffer.writeFloat(pRecipe.getSecondaryResultChance());
        pBuffer.writeItemStack(pRecipe.getSecondaryResult(), false);
    }


}