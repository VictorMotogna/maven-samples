package com.calculator;

import com.calculator.operations.*;

public class Engine {
    public static void main(String args[]) {
        Operation add = new Add(1.0, 2.0);
        System.out.println(add.computeResult());

        Operation diff = new Difference(1.0, 2.0);
        System.out.println(diff.computeResult());

        Operation mul = new Multiply(1.0, 2.0);
        System.out.println(mul.computeResult());

        Operation div = new Division(0.0, 1.0);
        System.out.println(div.computeResult());
    }
}
