package Entities;

public abstract class Calculator implements InterfaceCalculator {
    private double value1;
    private double value2;

    // Builders
    public Calculator() {

    }

    public Calculator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // Getters
    private double getValue1() {
        return value1;
    }

    private double getValue2() {
        return value2;
    }

    // Setters
    private void setValue1(double value1) {
        this.value1 = value1;
    }

    private void setValue2(double value2) {
        this.value2 = value2;
    }

    // Custom methods
    public double addition(double value1, double value2) {
        return value1 + value2;
    }

    public double subtraction(double value1, double value2) {
        return value1 - value2;
    }

    public double multiplication(double value1, double value2) {
        return value1 * value2;
    }

    public double division(double value1, double value2) {
        if (value2 != 0) {
            return value1 / value2;
        }
        return 1.0;
    }
}
