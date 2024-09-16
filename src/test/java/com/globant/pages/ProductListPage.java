package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    private List<WebElement> addProductsBtn;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartBtn;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;

    @FindBy(xpath = "//div[contains(@class, 'bm-menu')]//nav[contains(@class, 'bm-item-list')]//a[contains(@id, 'logout_sidebar_link')]")
    private WebElement logoutBtn;

    public void addProduct(int index) {
        addProductsBtn.get(index).click();
    }

    public void addProducts(int[] itemsIndexes) {
        for (int index : itemsIndexes) {
            super.areElementsDisplayed(addProductsBtn);
            if (index >= 0 && index < this.addProductsBtn.size()) {
                this.addProductsBtn.get(index).click();
            }
        }
    }

    public CartPage selectCartBtn() {
        super.isElementClickable(cartBtn);
        return new CartPage(super.driver);
    }

    public LoginPage goBackToLogin() {
        super.isElementClickable(menu);
        super.isElementClickable(logoutBtn);
        return new LoginPage(super.driver);
    }

    public ProductListPage(WebDriver driver) {
        super(driver);
    }
}
