package net.internalerror.futuristicfactories.data.recipe.util;

import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public abstract class FFSimpleRecipeSerializer<T extends FFSimpleRecipe, P extends FFSimpleRecipeContainer<T>> implements RecipeSerializer<T> {


    protected P container;

    public abstract P createContainer();

    @Override
    public @NotNull T fromJson(@NotNull ResourceLocation recipeId, @NotNull JsonObject serializedRecipe) {

        container = createContainer();

        container.setResourceLocation(recipeId);
        container.setIngredient(Ingredient.fromJson(GsonHelper.getAsJsonObject(serializedRecipe, FFSimpleRecipe.Json_Key_Ingredient)));
        container.setResult(Registry.ITEM.getOptional(new ResourceLocation(GsonHelper.getAsString(serializedRecipe, FFSimpleRecipe.Json_Key_Result))).orElseThrow(() -> new IllegalStateException("Item does not exist!")));
        container.setResultCount(GsonHelper.getAsInt(serializedRecipe, FFSimpleRecipe.Json_Key_Result_Count));
        container.setResultChance(GsonHelper.getAsFloat(serializedRecipe, FFSimpleRecipe.Json_Key_Result_Chance));
        container.setProcessingTime(GsonHelper.getAsInt(serializedRecipe, FFSimpleRecipe.Json_Key_Processing_Time));

        return deserializeJson(recipeId, serializedRecipe);
    }

    public abstract T deserializeJson(@NotNull ResourceLocation recipeId, @NotNull JsonObject serializedRecipe);

    @Override
    public @Nullable T fromNetwork(@NotNull ResourceLocation recipeId, @NotNull FriendlyByteBuf buffer) {

        container = createContainer();
        container.setIngredient(Ingredient.fromNetwork(buffer));
        ItemStack itemStack = buffer.readItem();
        container.setResult(itemStack.getItem());
        container.setResultCount(itemStack.getCount());
        container.setResultChance(buffer.readFloat());
        container.setProcessingTime(buffer.readInt());

        return readNetwork(recipeId, buffer);
    }

    public abstract @Nullable T readNetwork(@NotNull ResourceLocation recipeId, @NotNull FriendlyByteBuf buffer);

    @Override
    public void toNetwork(@NotNull FriendlyByteBuf buffer, @NotNull T recipe) {

        recipe.getIngredient().toNetwork(buffer);
        buffer.writeItem(recipe.getResultItem());
        buffer.writeFloat(recipe.getResultChance());
        buffer.writeInt(recipe.getProcessingTime());

        writeNetwork(buffer, recipe);
    }

    public abstract void writeNetwork(@NotNull FriendlyByteBuf buffer, @NotNull T recipe);
}
