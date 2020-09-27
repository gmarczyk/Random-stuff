package domain.ingredients;

public class Macronutrients {

    // [in grams]
    public final float carbohydrates;
    public final float protein;
    public final float fat;

    public Macronutrients(float carbohydrates, float protein, float fat) {
        this.carbohydrates = carbohydrates;
        this.protein = protein;
        this.fat = fat;
    }

    public Macronutrients add(Macronutrients macro, float multiplyBy) {
        return new Macronutrients(
                this.carbohydrates + (macro.carbohydrates * multiplyBy),
                this.protein + (macro.protein * multiplyBy),
                this.fat + (macro.fat * multiplyBy)
        );
    }


}
