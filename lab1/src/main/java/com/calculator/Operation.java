package com.calculator;

public class Operation {
    private int operator1;
    private int operator2;
    private String operation;
    private double result;

    public Operation(int operator1, int operator2, String operation) {
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operation = operation;
    }

    public double getResult() {
        if(operation.equals("+")) {
            result = operator1 + operator2;
        } else if (operation.equals("-")) {
            result = operator1 - operator2;
        } else if(operation.equals("*")) {
            result = operator1 * operator2;
        } else if(operation.equals("/")) {
            result = ((double) operator1) / operator2;
        }

        return result;
    }
}
