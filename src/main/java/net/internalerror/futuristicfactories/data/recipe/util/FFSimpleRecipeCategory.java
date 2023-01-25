package net.internalerror.futuristicfactories.data.recipe.util;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public abstract class FFSimpleRecipeCategory<T extends Recipe<SimpleContainer>> implements IRecipeCategory<T> {

    private final IDrawable background;
    private final IDrawable icon;

    protected FFSimpleRecipeCategory(IGuiHelper guiHelper, ResourceLocation texture, int width, int height, Block block) {
        this.background = guiHelper.createDrawable(texture, 0, 0, width, height);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(block));
    }

    @Override
    public @NotNull IDrawable getBackground() {
        return background;
    }

    @Override
    public @NotNull IDrawable getIcon() {
        return icon;
    }
}
