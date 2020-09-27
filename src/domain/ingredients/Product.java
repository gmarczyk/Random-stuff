package domain.ingredients;

public class Product {

    public enum Type {
        MEAT, DAIRY, VEGETABLE;
    }

    public final String name;
    public final Type type;
    public final int calories;
    public final int pieceWeight;

    public final Macronutrients macronutrients;


    public Product(String name, Type type, int calories, int pieceWeight, Macronutrients macronutrients) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.macronutrients = macronutrients;
        this.pieceWeight = pieceWeight;
    }

}
