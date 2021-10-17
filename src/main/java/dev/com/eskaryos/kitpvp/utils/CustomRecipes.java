package dev.com.eskaryos.kitpvp.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class CustomRecipes {

    public static void SopaCraft(){

        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.MUSHROOM_SOUP));
        recipe.addIngredient(Material.BOWL);
        recipe.addIngredient(Material.INK_SACK,(short)3);

        ShapelessRecipe recipe2 = new ShapelessRecipe(new ItemStack(Material.MUSHROOM_SOUP));
        recipe2.addIngredient(Material.BOWL);
        recipe2.addIngredient(Material.CACTUS);

        Bukkit.addRecipe(recipe);
        Bukkit.addRecipe(recipe2);

    }

}
