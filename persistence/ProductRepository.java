package persistence;

import domain.ingredients.Macronutrients;
import domain.ingredients.Product;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public List<Product> getAll() {
        Product[] products = new Product[]{
                new Product("Egg", Product.Type.DAIRY, 70, 50, new Macronutrients(1, 6, 5)),
                new Product("Butter", Product.Type.DAIRY, 700, 100, new Macronutrients(0, 1, 81)),
                new Product("Chive", Product.Type.VEGETABLE, 1, 5, new Macronutrients(0.3f, 0.05f, 0.02f)),
                new Product("Smoked bacon", Product.Type.MEAT, 96, 20, new Macronutrients(0, 3, 9)),

        };

        return Arrays.asList(products);
    }

    public Product getByName(String givenName) {
        return getAll().stream().filter(suchProductThat -> suchProductThat.name.equals(givenName)).findFirst().get();
    }
}
