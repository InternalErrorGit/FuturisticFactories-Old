package net.internalerror.futuristicfactories.data.recipe.category;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeType;
import net.internalerror.futuristicfactories.data.recipe.PulverizingRecipe;
import net.internalerror.futuristicfactories.data.recipe.integration.JEIFFPlugin;
import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipeCategory;
import net.internalerror.futuristicfactories.registry.FFBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class PulverizingRecipeCategory extends FFSimpleRecipeCategory<PulverizingRecipe> {

    public static final ResourceLocation UID = new ResourceLocation(MOD_ID, "pulverizing");
    private static final ResourceLocation texture = new ResourceLocation(MOD_ID, "textures/gui/pulverizing_machine_gui.png");

    protected PulverizingRecipeCategory(IGuiHelper guiHelper) {
        super(guiHelper, texture, 176, 190, FFBlocks.pulverizing_machine.get());
    }

    @Override
    public @NotNull RecipeType<PulverizingRecipe> getRecipeType() {
        return JEIFFPlugin.pulverizing_type;
    }

    @Override
    public @NotNull Component getTitle() {
        return Component.literal("Pulverizing Machine");
    }

    @Override
    public void setRecipe(@NotNull IRecipeLayoutBuilder builder, @NotNull PulverizingRecipe recipe, @NotNull IFocusGroup focuses) {

    }
}
