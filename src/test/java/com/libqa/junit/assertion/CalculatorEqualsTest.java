package com.libqa.junit.assertion;


import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void addTest() {
        long addResult = new Calculator().add(2, 2);
        //Test will pass
        assertEquals(4L, addResult);

    }

    @Test
    void addFailValueTest() {
        long addResult = new Calculator().add(2, 2);
        //Test will fail
        assertEquals(4, addResult, "Calculator.add(2, 2) Is False!!!");
    }

    @Test
    void addFailSupplierTest() {
        long addResult = new Calculator().add(2, 2);
        //Test will fail
        Supplier<String> messageSupplier  = () -> "Calculator.add(2, 2) test failed";
        assertEquals(3, addResult , messageSupplier);
    }


}
