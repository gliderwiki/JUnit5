package com.libqa.junit.assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueTest {

    private static String getMessage () {
        return "Test result is False";
    }

    private static boolean getResult () {
        return true;
    }

    @Test
    void assertTrueTest() {
        assertTrue(AssertTrueTest::getResult, AssertTrueTest::getMessage);
    }

    @Test
    void assertFalseTest() {
        assertFalse(AssertTrueTest::getResult, AssertTrueTest::getMessage);
    }

}
