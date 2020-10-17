import controller.PolynomialCalculationController;
import view.PolynomialCalculationView;

public class Main {

    public static void main(String[] args) {
        PolynomialCalculationView view = new PolynomialCalculationView(args);
        view.performCalculationForGivenNumbers();
    }


}
