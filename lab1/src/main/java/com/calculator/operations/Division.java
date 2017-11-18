package com.calculator.operations;

public class Division implements Operation {
    private double operator1;
    private double operator2;

    public Division(double operator1, double operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    @Override
    public double computeResult() {
        try {
            return operator1 / operator2;
        } catch(Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
