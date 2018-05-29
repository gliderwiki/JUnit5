package com.libqa.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class StandardTests {

    @BeforeAll
    static void initAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach");
    }

    @DisplayName("succeedingTest1 was passed")
    @Test
    void succeedingTest1() {
        System.out.println("Success Test first!!");
    }

    @Test
    void succeedingTest2() {
        System.out.println("Success Test second!!");
    }

    @Test
    void failingTest() {
        System.out.println("fail");
        fail("a failing test");
    }

    @Test
    @Disabled("skip this ")
    void skippedTest() {
        System.out.println("## Disabled for demonstration purposes");
    }


    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll");
    }

}
