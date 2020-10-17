package polynomial.model;

public class Polynomial {

    private PolynomialElement[] polynomialElements;

    public Polynomial(PolynomialElement[] polynomialElements) {
        this.polynomialElements = polynomialElements;
    }

    public double calculateForVariableValue(double variableValue) {
        double sum = 0;
        for (PolynomialElement element : polynomialElements) {
            if (element.isVariable) {
                sum += element.numericalFactor * Math.pow(variableValue, element.power);
            } else {
                sum += element.numericalFactor;
            }
        }

        return sum;
    }
}
