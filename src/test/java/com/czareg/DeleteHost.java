package com.czareg;

import com.production.code.Host;
import org.testng.annotations.Test;

public class DeleteHost extends TestBase {
    @Test(dataProvider = "BxAndCx", dataProviderClass = DataProviders.class)
    public void checkVcenter(Host host) {
        System.out.println("checkVcenter " + host.getName());
    }

    @Test(dataProvider = "BxAndCx", dataProviderClass = DataProviders.class)
    public void checkUuid(Host host) {
        System.out.println("checkUuid "+ host.getParent());
    }

    @Test(dataProvider = "BxAndCx", dataProviderClass = DataProviders.class)
    public void checkName(Host host) {
        System.out.println("checkName "+ host.getParent());
    }
}