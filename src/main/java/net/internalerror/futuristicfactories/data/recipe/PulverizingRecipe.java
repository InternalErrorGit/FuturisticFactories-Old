package net.internalerror.futuristicfactories.data.recipe;

import net.internalerror.futuristicfactories.block.entity.machine.pulverizing.PulverizingMachineBlockEntity;
import net.internalerror.futuristicfactories.data.recipe.serializer.PulverizingRecipeSerializer;
import net.internalerror.futuristicfactories.data.recipe.type.PulverizingRecipeType;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PulverizingRecipe extends FFSimpleRecipe {

    public static final String Json_Key_Secondary_Result = "secondaryResult";
    public static final String Json_Key_Secondary_Result_Count = "secondaryResultCount";
    public static final String Json_Key_Secondary_Result_Chance = "secondaryResultChance";

    protected final Item secondaryResult;
    protected final int secondaryResultCount;
    protected final float secondaryResultChance;

    public PulverizingRecipe(ResourceLocation resourceLocation, Item result, int resultCount, float resultChance, Ingredient ingredient, int processingTime, Item secondaryResult, int secondaryResultCount, float secondaryResultChance) {
        super(resourceLocation, result, resultCount, resultChance, ingredient, processingTime);
        this.secondaryResult = secondaryResult;
        this.secondaryResultCount = secondaryResultCount;
        this.secondaryResultChance = secondaryResultChance;
    }

    @Override
    public boolean matches(@NotNull SimpleContainer container, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return ingredient.test(container.getItem(PulverizingMachineBlockEntity.Slot_Index_Ingredient));
    }

    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return PulverizingRecipeSerializer.instance;
    }

    @Override
    public @NotNull RecipeType<?> getType() {
        return PulverizingRecipeType.instance;
    }

    public Item getSecondaryResult() {
        return secondaryResult;
    }

    public int getSecondaryResultCount() {
        return secondaryResultCount;
    }

    public float getSecondaryResultChance() {
        return secondaryResultChance;
    }

    public ItemStack getSecondaryResultItem() {
        return new ItemStack(getSecondaryResult(), getSecondaryResultCount());
    }
}
