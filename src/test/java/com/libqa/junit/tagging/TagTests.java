package com.libqa.junit.tagging;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTests {

    @Test
    @Tag("development")
    @Tag("production")
    void allTestCase() {
        System.out.println("Development and Production Test !");
    }


    @Test
    @Tag("development")
    void developmentTest() {
        System.out.println("Only evelopment Test !");
    }

}
