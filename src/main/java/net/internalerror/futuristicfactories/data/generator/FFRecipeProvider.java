package net.internalerror.futuristicfactories.data.generator;

import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.data.FFMaterial;
import net.internalerror.futuristicfactories.registry.FFRegistryObject;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class FFRecipeProvider extends RecipeProvider {
    public FFRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        for (FFMaterial material : FFMaterial.values()) {
            Util.material(consumer, material);
        }

    }


    private static final class Util {

        private static InventoryChangeTrigger.TriggerInstance hasItem(ItemLike itemLike) {
            return InventoryChangeTrigger.TriggerInstance.hasItems(itemLike);
        }

        private static ResourceLocation recipeLocation(String process, FFRegistryObject<Item> ingredient, FFRegistryObject<Item> result) {
            return FuturisticFactories.getId(String.format("%s/%s_from_%s", process, result.getName(), ingredient.getName()));
        }

        public static void material(Consumer<FinishedRecipe> consumer, FFMaterial material) {
            if (material.getBlock() != null && material.getIngot() != null) {
                Util.splitting(consumer, material.getBlockTag(), material.getBlock(), material.getIngot());
            }
            if (material.getIngot() != null && material.getNugget() != null) {
                Util.splitting(consumer, material.getIngotTag(), material.getIngot(), material.getNugget());
            }
            if (material.getBlockRaw() != null && material.getRaw() != null) {
                Util.splitting(consumer, material.getBlockRawTag(), material.getBlockRaw(), material.getRaw());
            }
            if (material.getIngot() != null && material.getBlock() != null) {
                Util.combining(consumer, material.getIngotTag(), material.getIngot(), material.getBlock());
            }
            if (material.getNugget() != null && material.getIngot() != null) {
                Util.combining(consumer, material.getNuggetTag(), material.getNugget(), material.getIngot());
            }
            if (material.getRaw() != null && material.getBlockRaw() != null) {
                Util.combining(consumer, material.getRawTag(), material.getRaw(), material.getBlockRaw());
            }
            if (material.getBlockRaw() != null && material.getBlock() != null) {
                Util.smelting(consumer, material.getBlockRawTag(), material.getBlockRaw(), material.getBlock());
            }
            if (material.getOre() != null && material.getIngot() != null) {
                Util.smelting(consumer, material.getOreTag(), material.getOre(), material.getIngot());
            }
            if (material.getDeepslateOre() != null && material.getIngot() != null) {
                Util.smelting(consumer, material.getDeepslateOreTag(), material.getDeepslateOre(), material.getIngot());
            }
            if (material.getNetherOre() != null && material.getIngot() != null) {
                Util.smelting(consumer, material.getNetherOreTag(), material.getNetherOre(), material.getIngot());
            }
            if (material.getRaw() != null && material.getIngot() != null) {
                Util.smelting(consumer, material.getRawTag(), material.getRaw(), material.getIngot());
            }
            if (material.getBlockRaw() != null && material.getBlock() != null) {
                Util.blasting(consumer, material.getBlockRawTag(), material.getBlockRaw(), material.getBlock());
            }
            if (material.getOre() != null && material.getIngot() != null) {
                Util.blasting(consumer, material.getOreTag(), material.getOre(), material.getIngot());
            }
            if (material.getDeepslateOre() != null && material.getIngot() != null) {
                Util.blasting(consumer, material.getDeepslateOreTag(), material.getDeepslateOre(), material.getIngot());
            }
            if (material.getNetherOre() != null && material.getIngot() != null) {
                Util.blasting(consumer, material.getNetherOreTag(), material.getNetherOre(), material.getIngot());
            }
            if (material.getRaw() != null && material.getIngot() != null) {
                Util.blasting(consumer, material.getRawTag(), material.getRaw(), material.getIngot());
            }
        }

        public static void splitting(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, FFRegistryObject<Item> ingredient, FFRegistryObject<Item> result) {
            ShapelessRecipeBuilder
                    .shapeless(result.getRegistryObject().get(), 9)
                    .requires(ingredientTag)
                    .unlockedBy("has_item", hasItem(ingredient.getRegistryObject().get()))
                    .save(consumer, recipeLocation("splitting", ingredient, result));
        }


        public static void combining(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, FFRegistryObject<Item> ingredient, FFRegistryObject<Item> result) {

            ShapedRecipeBuilder
                    .shaped(result.getRegistryObject().get())
                    .pattern("iii")
                    .pattern("iii")
                    .pattern("iii")
                    .define('i', ingredientTag)
                    .unlockedBy("has_item", hasItem(ingredient.getRegistryObject().get()))
                    .save(consumer, recipeLocation("combining", ingredient, result));

        }

        public static void smelting(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, FFRegistryObject<Item> ingredient, FFRegistryObject<Item> result) {
            SimpleCookingRecipeBuilder
                    .smelting(Ingredient.of(ingredientTag), result.getRegistryObject().get(), 0.7f, 200)
                    .unlockedBy("has_item", hasItem(ingredient.getRegistryObject().get()))
                    .save(consumer, recipeLocation("smelting", ingredient, result));

        }

        public static void blasting(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, FFRegistryObject<Item> ingredient, FFRegistryObject<Item> result) {
            SimpleCookingRecipeBuilder
                    .blasting(Ingredient.of(ingredientTag), result.getRegistryObject().get(), 0.7f, 200)
                    .unlockedBy("has_item", hasItem(ingredient.getRegistryObject().get()))
                    .save(consumer, recipeLocation("blasting", ingredient, result));

        }
    }


}
