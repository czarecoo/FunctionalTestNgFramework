package com.czareg;

import com.production.code.Host;
import org.testng.annotations.Test;

public class AddHost extends TestBase {
    @Test(dataProvider = "BxAndCx", dataProviderClass = DataProviders.class)
    public void checkSerial(Host host) {
        System.out.println("checkSerial " + host.getName());
    }

    @Test(dataProvider = "Cx", dataProviderClass = DataProviders.class)
    public void checkParent(Host host) {
        System.out.println("checkParent " + host.getParent());
    }
}