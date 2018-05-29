package com.libqa.junit.assertion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorNotEqualsTest {

    @Test
    void addTestNotEqualsGiven3() {
        //Test will pass
        Long addResult = new Calculator().add(2, 2);
        assertNotEquals(3L, addResult);
    }


    @Test
    @DisplayName("4가 주어졌을 때 subtract 결과 값이 같지 않은지 검사한다. ")
    void addTestNotEqualsSubtractGiven4() {
        Long addResult = new Calculator().subtract(2, 2);
        //Test will fail
        assertNotEquals(0L, addResult, "addTestNotEqualsSubtractGiven4 test failed");

    }

    @Test
    @DisplayName("Supplier multiply gove x * y Fail ")
    void addTestNotEqualsSupplierGiven4() {
        int x = 3;
        int y = 5;
        Long expected = 15L;
        Long addResult = new Calculator().multiply(x, y);
        assertNotEquals(expected, addResult,
                () -> String.format("%s * %s != %s", x, y, expected));
    }
}
