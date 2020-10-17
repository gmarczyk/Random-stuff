package model;

public class PolynomialElement {

    public final double numericalFactor;
    public final boolean isVariable;
    public final int power;

    public PolynomialElement(double numericalFactor, boolean isVariable, int power) {
        this.numericalFactor = numericalFactor;
        this.isVariable = isVariable;
        this.power = power;
    }

    public PolynomialElement(double numericalFactor) {
        this.numericalFactor = numericalFactor;
        this.isVariable = false;
        this.power = 0;
    }
}
