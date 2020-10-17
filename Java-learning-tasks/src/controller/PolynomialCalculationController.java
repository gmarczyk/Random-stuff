package controller;

import model.Polynomial;
import model.PolynomialElement;

import java.util.Arrays;

public class PolynomialCalculationController {

    public double calculatePolynomial(int[] intValueNumbers) {
        int variableValue = intValueNumbers[intValueNumbers.length - 1];
        int[] polynomialValues = Arrays.copyOf(intValueNumbers, intValueNumbers.length - 1);

        Polynomial polynomial = convertValuesToPolynomial(polynomialValues);
        return polynomial.calculateForVariableValue(variableValue);
    }

    private Polynomial convertValuesToPolynomial(int[] polynomialValues) {
        int numberOfElements = polynomialValues.length;
        PolynomialElement[] polynomialElements = new PolynomialElement[polynomialValues.length];

        for (int i = 0; i < numberOfElements - 1; i++) {
            PolynomialElement polynomialElement = new PolynomialElement(
                    polynomialValues[i],
                    true,
                    polynomialValues.length - 1 - i
            );
            polynomialElements[i] = polynomialElement;
        }

        polynomialElements[numberOfElements - 1] = new PolynomialElement(polynomialValues[numberOfElements - 1]);
        return new Polynomial(polynomialElements);
    }


}
