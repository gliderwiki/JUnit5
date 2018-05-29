package com.libqa.junit.assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertArrayEqualsTest {

    @Test
    void assertArraysTest() {
        int[] one = {1, 2, 3};
        int[] two = {1, 2, 3};

        assertArrayEquals(one, two, "ArrayEquals Test");
    }

    @Test
    void assertArraysWrongTest() {
        int[] one = {1, 2, 3};
        int[] two = {1, 2, 3, 4};

        assertArrayEquals(one, two, "ArrayEquals assertArraysWrongTest Test");
    }
}

