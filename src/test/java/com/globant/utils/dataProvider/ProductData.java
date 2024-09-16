package com.globant.utils.dataProvider;

import org.testng.annotations.DataProvider;

public class ProductData {
    @DataProvider(name = "productIndexes")
    public Object[][] productIndexesProvider() {
        return new Object[][]{
                {new int[]{0, 1, 2}}
        };
    }

}
