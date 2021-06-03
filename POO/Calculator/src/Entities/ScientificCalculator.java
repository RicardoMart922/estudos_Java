package Entities;

public class ScientificCalculator extends Calculator {
    // Builders
    public ScientificCalculator() {

    }

    public ScientificCalculator(double value1, double value2) {
        super(value1, value2);
    }

    // Custom methods
    public double squareRoot(double value) {
        if (value < 0) {
            return 1.0;
        }
        return Math.sqrt(value);
    }

    public double potency(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
