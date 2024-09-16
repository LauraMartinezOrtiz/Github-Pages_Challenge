package com.globant.tests;

import com.globant.pages.CartPage;
import com.globant.pages.ProductListPage;
import com.globant.utils.baseTest.BaseTest;
import com.globant.utils.dataProvider.ProductData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProductTest extends BaseTest {
    Logger log = LoggerFactory.getLogger(RemoveProductTest.class);

    @Test(dataProvider = "productIndexes", dataProviderClass = ProductData.class)
    public void checkProductsSuccessfullyRemoved(int[] productIndexes) {
        ProductListPage productListPage = super.loadProductListPage();
        productListPage.addProducts(productIndexes);

        CartPage cartPage = productListPage.selectCartBtn();
        cartPage.removeItems(productIndexes);

        Assert.assertTrue(cartPage.isCartEmpty());
    }
}
