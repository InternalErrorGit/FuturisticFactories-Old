package net.internalerror.futuristicfactories.data.recipe.category;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.internalerror.futuristicfactories.data.recipe.integration.JEIFFPlugin;
import net.internalerror.futuristicfactories.data.recipe.CrushingRecipe;
import net.internalerror.futuristicfactories.registry.FFBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class CrushingRecipeCategory implements IRecipeCategory<CrushingRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(MOD_ID, "crushing");
    private static final ResourceLocation texture = new ResourceLocation(MOD_ID, "textures/gui/crushing_machine_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public CrushingRecipeCategory(IGuiHelper pGuiHelper) {
        this.background = pGuiHelper.createDrawable(texture, 0, 0, 176, 190);
        this.icon = pGuiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(FFBlocks.crushing_machine.get()));
    }

    @Override
    public RecipeType<CrushingRecipe> getRecipeType() {
        return JEIFFPlugin.crushing_type;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Crushing Machine");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CrushingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredient());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResult());
    }
}
