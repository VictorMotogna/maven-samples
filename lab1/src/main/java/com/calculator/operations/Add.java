package com.calculator.operations;

public class Add implements Operation {
    private double operator1;
    private double operator2;

    public Add(double operator1, double operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    @Override
    public double computeResult() {
        return operator1 + operator2;
    }
}
