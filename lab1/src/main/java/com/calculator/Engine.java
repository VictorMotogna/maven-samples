package com.calculator;

public class Engine {
    public static void main(String args[]) {
        System.out.println(new Operation(2, 4, "+").getResult());
        System.out.println(new Operation(2, 4, "-").getResult());
        System.out.println(new Operation(2, 4, "*").getResult());
        System.out.println(new Operation(2, 4, "/").getResult());
    }
}
