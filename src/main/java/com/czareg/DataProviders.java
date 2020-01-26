package com.czareg;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider
    public static Object[][] BxAndCx() {
        return new Object[][] {
                { Configuration.BX },
                { Configuration.CX }
        };
    }
    @DataProvider
    public static Object[][] Cx() {
        return new Object[][] {
                { Configuration.CX }
        };
    }
}
