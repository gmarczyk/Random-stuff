package polynomial.view;

import polynomial.controller.PolynomialCalculationController;

public class PolynomialCalculationView {

    private final PolynomialCalculationController controller = new PolynomialCalculationController();

    private String[] numbers;

    public PolynomialCalculationView(String[] numbers) {
        this.numbers = numbers;
    }

    public void performCalculationForGivenNumbers() {
        if(!validateInput()) {
            return;
        }

        int[] intValueNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                intValueNumbers[i] = Integer.valueOf(numbers[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error during converting numbers");
                e.printStackTrace();
                return;
            }
        }

        double result = controller.calculatePolynomial(intValueNumbers);
        printResult(result);
    }

    private boolean validateInput() {
        if (numbers == null || numbers.length < 2) {
            System.out.println("Input values are invalid");
            return false;
        }

        return true;
    }

    private void printResult(double result) {
        System.out.println("Value of the polynomial is: " + result);
    }

}
