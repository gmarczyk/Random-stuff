package persistence;

import domain.ingredients.Product;
import domain.recipe.Recipe;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RecipeRepository {

    public List<Recipe> getAll() {
        ProductRepository productRepository = new ProductRepository();

        Recipe[] recipes = new Recipe[]{
                new Recipe("Scrambled eggs",
                        new HashMap<Product, Float>() {{
                            put(productRepository.getByName("Egg"), 2.0f);
                            put(productRepository.getByName("Butter"), 0.05f);
                            put(productRepository.getByName("Chive"), 1.0f);
                            put(productRepository.getByName("Smoked bacon"), 3.0f);
                        }})
        };

        return Arrays.asList(recipes);
    }

    public Recipe findByName(String recipeName) {
        return getAll().stream().filter(suchRecipeThat -> suchRecipeThat.recipeName().equals(recipeName)).findFirst().get();
    }

}


