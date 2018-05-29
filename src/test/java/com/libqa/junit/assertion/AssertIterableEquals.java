package com.libqa.junit.assertion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AssertIterableEquals {

    @Test
    void assertIterableEqualsTest() {
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1,2,3));

        assertIterableEquals(listOne, listTwo);
        //assertIterableEquals(listOne, listThree, "Iterable List not matched");
    }

}
