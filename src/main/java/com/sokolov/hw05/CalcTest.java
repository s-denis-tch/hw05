package com.sokolov.hw05;

import com.sokolov.hw05.annotations.After;
import com.sokolov.hw05.annotations.Before;
import com.sokolov.hw05.annotations.Test;

public class CalcTest {

    private Calc calculator;

    @Before
    public void initTest() {
        calculator = new Calc();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testDivByZero() throws Exception {
        try {
            calculator.getDivide(100, 0);
            throw new Exception();
        } catch (ArithmeticException e) {
            assert (e.getClass().getName().equals("java.lang.ArithmeticException"));
            System.out.println("*** Success");
        }
    }
}