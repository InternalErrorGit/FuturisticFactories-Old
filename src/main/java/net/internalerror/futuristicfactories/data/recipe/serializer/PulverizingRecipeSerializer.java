package net.internalerror.futuristicfactories.data.recipe.serializer;

import com.google.gson.JsonObject;
import net.internalerror.futuristicfactories.data.recipe.PulverizingRecipe;
import net.internalerror.futuristicfactories.data.recipe.container.PulverizingRecipeContainer;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeSerializer;
import net.minecraft.core.Registry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PulverizingRecipeSerializer extends FFSimpleRecipeSerializer<PulverizingRecipe, PulverizingRecipeContainer> {

    public static final PulverizingRecipeSerializer instance = new PulverizingRecipeSerializer();

    @Override
    public PulverizingRecipeContainer createContainer() {
        return new PulverizingRecipeContainer();
    }

    @Override
    public PulverizingRecipe deserializeJson(@NotNull ResourceLocation recipeId, @NotNull JsonObject serializedRecipe) {

        container.setSecondaryResult(Registry.ITEM.getOptional(new ResourceLocation(GsonHelper.getAsString(serializedRecipe, PulverizingRecipe.Json_Key_Secondary_Result))).orElseThrow(() -> new IllegalStateException("Item does not exist!")));
        container.setSecondaryResultCount(GsonHelper.getAsInt(serializedRecipe, PulverizingRecipe.Json_Key_Secondary_Result_Count));
        container.setSecondaryResultChance(GsonHelper.getAsFloat(serializedRecipe, PulverizingRecipe.Json_Key_Secondary_Result_Chance));

        return container.build();
    }

    @Override
    public @Nullable PulverizingRecipe readNetwork(@NotNull ResourceLocation recipeId, @NotNull FriendlyByteBuf buffer) {

        ItemStack itemStack = buffer.readItem();
        container.setSecondaryResult(itemStack.getItem());
        container.setSecondaryResultCount(itemStack.getCount());
        container.setSecondaryResultChance(buffer.readFloat());

        return container.build();
    }

    @Override
    public void writeNetwork(@NotNull FriendlyByteBuf buffer, @NotNull PulverizingRecipe recipe) {
        buffer.writeItem(recipe.getSecondaryResultItem());
        buffer.writeInt(recipe.getSecondaryResultCount());
        buffer.writeFloat(recipe.getSecondaryResultChance());
    }
}
