package domain;

import domain.recipe.Recipe;
import persistence.RecipeRepository;

public class Main {

    public static void main(String[] args) {
        RecipeRepository recipeRepository = new RecipeRepository();

        recipeRepository.getAll().forEach(Recipe::printDescription);
    }
}
