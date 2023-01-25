package net.internalerror.futuristicfactories.data.recipe;

import net.internalerror.futuristicfactories.block.entity.machine.crushing.CrushingMachineBlockEntity;
import net.internalerror.futuristicfactories.data.recipe.serializer.CrushingRecipeSerializer;
import net.internalerror.futuristicfactories.data.recipe.type.CrushingRecipeType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;


public class CrushingRecipe implements Recipe<SimpleContainer> {


    private final ResourceLocation aId;
    private final ItemStack aResult;
    private final Ingredient aIngredient;
    private final ItemStack aSecondaryResult;
    private final float aSecondaryResultChance;
    private final int aProcessingTime;

    public CrushingRecipe(ResourceLocation pId, ItemStack pResult, Ingredient pIngredient, ItemStack aSecondaryResult, float aSecondaryResultChance, int pProcessingTime) {
        this.aId = pId;
        this.aResult = pResult;
        this.aIngredient = pIngredient;
        this.aSecondaryResult = aSecondaryResult;
        this.aSecondaryResultChance = aSecondaryResultChance;
        this.aProcessingTime = pProcessingTime;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if (pLevel.isClientSide()) {
            return false;
        }

        return aIngredient.test(pContainer.getItem(CrushingMachineBlockEntity.Slot_Index_Ingredient));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return null;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return aResult.copy();
    }

    public int getResultCount() {
        return aResult.getCount();
    }

    @Override
    public ResourceLocation getId() {
        return aId;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return CrushingRecipeSerializer.instance;
    }

    @Override
    public RecipeType<?> getType() {
        return CrushingRecipeType.instance;
    }

    public ItemStack getSecondaryResult() {
        return aSecondaryResult;
    }

    public float getSecondaryResultChance() {
        return aSecondaryResultChance;
    }

    public ItemStack getResult() {
        return aResult;
    }

    public Ingredient getIngredient() {
        return aIngredient;
    }

    public int getProcessingTime() {
        return aProcessingTime;
    }
}
