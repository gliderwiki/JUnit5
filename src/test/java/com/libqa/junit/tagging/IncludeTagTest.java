package com.libqa.junit.tagging;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.libqa.junit.tagging")
@IncludeTags("production")
public class IncludeTagTest {

    @Test
    void includeProductionTest() {
        System.out.println(" 프로젝션 코드가 호출되어야 함");
    }
}
