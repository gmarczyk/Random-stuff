package domain.recipe;

import domain.ingredients.Macronutrients;
import domain.ingredients.Product;
import java.util.Map;

public class Recipe {

    private final String recipeName;
    private final Map<Product, Float> productsPieces;

    private int calories;
    private int weight;
    private Macronutrients macronutrients;

    public Recipe(String recipeName, Map<Product, Float> productsPieces) {
        this.recipeName = recipeName;
        this.productsPieces = productsPieces;
        this.macronutrients = new Macronutrients(0,0,0);

        productsPieces.forEach((product, pieceProportion) -> {
            this.calories += product.calories * pieceProportion;
            this.weight += product.pieceWeight * pieceProportion;
            this.macronutrients = this.macronutrients.add(product.macronutrients, pieceProportion);
        });
    }

    public String recipeName() {
        return recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public Map<Product, Float> getProductsPieces() {
        return productsPieces;
    }

    public int getCalories() {
        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public Macronutrients getMacronutrients() {
        return macronutrients;
    }

    public float getCaloriesPer100() {
        return (float) calories / (float)(weight / 100.f);
    }

    public void printDescription() {
        System.out.println("Przepis: " + this.recipeName());
        System.out.println("Waga: " + this.getWeight() + "g");
        System.out.printf("Kalorie: %s, 100g = %.2f",  this.getCalories() , this.getCaloriesPer100());
        System.out.println();

        Macronutrients macros = this.getMacronutrients();
        System.out.printf("Makrosy: Weglowodany = %.2f, Bialka = %.2f, Tluszcze = %.2f", macros.carbohydrates, macros.protein, macros.fat);
        System.out.println();

        System.out.println("Skladniki:");
        this.getProductsPieces().forEach((product, pieces) -> {
            System.out.printf("   - %s %.2f szt (*%sg)", product.name, pieces.floatValue(), product.pieceWeight);
            System.out.println();
        });
    }


}
