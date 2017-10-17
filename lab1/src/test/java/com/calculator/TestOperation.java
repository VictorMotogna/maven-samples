package com.calculator;

import com.calculator.operations.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestOperation {
    private Operation operationAdd;
    private Operation operationDiff;
    private Operation operationMul;
    private Operation operationDiv;

    @Before
    public void setup() {
        operationAdd = new Add(1, 1);
        operationDiff = new Difference(1, 1);
        operationMul = new Multiply(1, 1);
        operationDiv = new Division(1, 1);
    }

    @Test
    public void getResultAdd() {
        assertThat(operationAdd.computeResult(), is(2.0));
    }

    @Test
    public void getResultDiff() {
        assertThat(operationDiff.computeResult(), is(0.0));
    }

    @Test
    public void getResultMul() {
        assertThat(operationMul.computeResult(), is(1.0));
    }

    @Test
    public void getResultDiv() {
        assertThat(operationDiv.computeResult(), is(1.0));
    }
}
