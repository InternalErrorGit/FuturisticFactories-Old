package net.internalerror.futuristicfactories.data.provider;

import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.data.recipe.builder.CrushingRecipeBuilder;
import net.internalerror.futuristicfactories.data.recipe.builder.PulverizingRecipeBuilder;
import net.internalerror.futuristicfactories.util.FFMaterial;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.RegistryObject;

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

        private static ResourceLocation recipeLocation(String process, RegistryObject<Item> ingredient, RegistryObject<Item> result) {
            return FuturisticFactories.getId(String.format("%s/%s_from_%s", process, result.getId().getPath(), ingredient.getId().getPath()));
        }

        public static void material(Consumer<FinishedRecipe> consumer, FFMaterial material) {
            if (material.getBlockItems().getBlock() != null && material.getItems().getIngot() != null) {
                Util.splitting(consumer, material.getBlockItemTags().getBlock(), material.getBlockItems().getBlock(), material.getItems().getIngot());
            }
            if (material.getItems().getIngot() != null && material.getItems().getNugget() != null) {
                Util.splitting(consumer, material.getItemTags().getIngot(), material.getItems().getIngot(), material.getItems().getNugget());
            }
            if (material.getBlockItems().getBlockRaw() != null && material.getItems().getRaw() != null) {
                Util.splitting(consumer, material.getBlockItemTags().getBlockRaw(), material.getBlockItems().getBlockRaw(), material.getItems().getRaw());
            }
            if (material.getItems().getIngot() != null && material.getBlockItems().getBlock() != null) {
                Util.combining(consumer, material.getItemTags().getIngot(), material.getItems().getIngot(), material.getBlockItems().getBlock());
            }
            if (material.getItems().getNugget() != null && material.getItems().getIngot() != null) {
                Util.combining(consumer, material.getItemTags().getNugget(), material.getItems().getNugget(), material.getItems().getIngot());
            }
            if (material.getItems().getRaw() != null && material.getBlockItems().getBlockRaw() != null) {
                Util.combining(consumer, material.getItemTags().getRaw(), material.getItems().getRaw(), material.getBlockItems().getBlockRaw());
            }
            if (material.getBlockItems().getBlockRaw() != null && material.getBlockItems().getBlock() != null) {
                Util.smelting(consumer, material.getBlockItemTags().getBlockRaw(), material.getBlockItems().getBlockRaw(), material.getBlockItems().getBlock());
            }
            if (material.getBlockItems().getOre() != null && material.getItems().getIngot() != null) {
                Util.smelting(consumer, material.getBlockItemTags().getOre(), material.getBlockItems().getOre(), material.getItems().getIngot());
            }
            if (material.getBlockItems().getDeepslateOre() != null && material.getItems().getIngot() != null) {
                Util.smelting(consumer, material.getBlockItemTags().getDeepslateOre(), material.getBlockItems().getDeepslateOre(), material.getItems().getIngot());
            }
            if (material.getBlockItems().getNetherOre() != null && material.getItems().getIngot() != null) {
                Util.smelting(consumer, material.getBlockItemTags().getNetherOre(), material.getBlockItems().getNetherOre(), material.getItems().getIngot());
            }
            if (material.getItems().getRaw() != null && material.getItems().getIngot() != null) {
                Util.smelting(consumer, material.getItemTags().getRaw(), material.getItems().getRaw(), material.getItems().getIngot());
            }
            if (material.getBlockItems().getBlockRaw() != null && material.getBlockItems().getBlock() != null) {
                Util.blasting(consumer, material.getBlockItemTags().getBlockRaw(), material.getBlockItems().getBlockRaw(), material.getBlockItems().getBlock());
            }
            if (material.getBlockItems().getOre() != null && material.getItems().getIngot() != null) {
                Util.blasting(consumer, material.getBlockItemTags().getOre(), material.getBlockItems().getOre(), material.getItems().getIngot());
            }
            if (material.getBlockItems().getDeepslateOre() != null && material.getItems().getIngot() != null) {
                Util.blasting(consumer, material.getBlockItemTags().getDeepslateOre(), material.getBlockItems().getDeepslateOre(), material.getItems().getIngot());
            }
            if (material.getBlockItems().getNetherOre() != null && material.getItems().getIngot() != null) {
                Util.blasting(consumer, material.getBlockItemTags().getNetherOre(), material.getBlockItems().getNetherOre(), material.getItems().getIngot());
            }
            if (material.getItems().getRaw() != null && material.getItems().getIngot() != null) {
                Util.blasting(consumer, material.getItemTags().getRaw(), material.getItems().getRaw(), material.getItems().getIngot());
            }
            if (material.getItems().getRaw() != null && material.getItems().getClump() != null && material.getItems().getDustDirty() != null) {
                Util.crushing(consumer, material.getItemTags().getRaw(), material.getItems().getRaw(), material.getItems().getClump(), 2, material.getItems().getDustDirty(), 0.75f);
            }
            if (material.getItems().getCrystal() != null && material.getItems().getShard() != null && material.getItems().getDust() != null) {
                Util.crushing(consumer, material.getItemTags().getCrystal(), material.getItems().getCrystal(), material.getItems().getShard(), 3, material.getItems().getDust(), 0.75f);
            }
            if (material.getItems().getShard() != null && material.getItems().getDust() != null && material.getItems().getDustDirty() != null) {
                Util.pulverizing(consumer, material.getItemTags().getShard(), material.getItems().getShard(), material.getItems().getDust(), 2, 1.0f, material.getItems().getDustDirty(), 1, 0.2f);
            }
        }

        public static void splitting(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, RegistryObject<Item> ingredient, RegistryObject<Item> result) {
            ShapelessRecipeBuilder
                    .shapeless(result.get(), 9)
                    .requires(ingredientTag)
                    .unlockedBy("has_item", hasItem(ingredient.get()))
                    .save(consumer, recipeLocation("splitting", ingredient, result));
        }

        public static void crushing(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, RegistryObject<Item> ingredient, RegistryObject<Item> result, int resultCount, RegistryObject<Item> pSecondaryResult, float pSecondaryResultChance) {
            CrushingRecipeBuilder.crushing(Ingredient.of(ingredientTag), result.get(), 200, resultCount, pSecondaryResult.get(), pSecondaryResultChance)
                    .unlockedBy("has_item", hasItem(ingredient.get()))
                    .save(consumer, recipeLocation("crushing", ingredient, result));
        }

        public static void pulverizing(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, RegistryObject<Item> ingredient, RegistryObject<Item> result, int resultCount, float resultChance, RegistryObject<Item> secondaryResult, int secondaryResultCount, float secondaryResultChance) {
            PulverizingRecipeBuilder.pulverizing(Ingredient.of(ingredientTag), result.get(), resultCount, resultChance, 200, secondaryResult.get(), secondaryResultCount, secondaryResultChance)
                    .unlockedBy("has_item", hasItem(ingredient.get()))
                    .save(consumer, recipeLocation("pulverizing", ingredient, result));
        }


        public static void combining(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, RegistryObject<Item> ingredient, RegistryObject<Item> result) {
            ShapedRecipeBuilder
                    .shaped(result.get())
                    .pattern("iii")
                    .pattern("iii")
                    .pattern("iii")
                    .define('i', ingredientTag)
                    .unlockedBy("has_item", hasItem(ingredient.get()))
                    .save(consumer, recipeLocation("combining", ingredient, result));

        }

        public static void smelting(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, RegistryObject<Item> ingredient, RegistryObject<Item> result) {
            SimpleCookingRecipeBuilder
                    .smelting(Ingredient.of(ingredientTag), result.get(), 0.7f, 200)
                    .unlockedBy("has_item", hasItem(ingredient.get()))
                    .save(consumer, recipeLocation("smelting", ingredient, result));

        }

        public static void blasting(Consumer<FinishedRecipe> consumer, TagKey<Item> ingredientTag, RegistryObject<Item> ingredient, RegistryObject<Item> result) {
            SimpleCookingRecipeBuilder
                    .blasting(Ingredient.of(ingredientTag), result.get(), 0.7f, 200)
                    .unlockedBy("has_item", hasItem(ingredient.get()))
                    .save(consumer, recipeLocation("blasting", ingredient, result));

        }
    }


}
