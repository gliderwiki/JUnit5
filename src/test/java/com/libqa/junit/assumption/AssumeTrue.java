package com.libqa.junit.assumption;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumeTrue {

    private static String message() {
        return "TEST Execution Failed  ";
    }


    @Test
    void systemIsProductionTest() {
        System.setProperty("ENV", "DEV");
        assumeTrue("DEV".equals(System.getProperty("ENV")));

        //remainder of test will proceed
        assertEquals(System.getProperty("ENV"), "PROD", "프로덕션 환경이 아닙니다.");
    }

    @Test
    void stemIsProductionTestsystemIsDevelopTest() {
        System.setProperty("ENV", "PROD");
        assumeTrue("DEV".equals(System.getProperty("ENV")), AssumeTrue::message);

        //remainder of test will be aborted
        assertEquals(System.getProperty("ENV"), "DEV", "개발 환경이 아닙니다.");
    }


}