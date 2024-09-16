package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    @FindBy(xpath = "//button[contains(@class, 'btn btn_secondary btn_small cart_button')]")
    private List<WebElement> itemsToRemove;

    @FindBy(xpath = "//div[contains(@class, 'cart_item')]")
    private WebElement cartEmpty;

    public CheckoutInfoPage clickCheckout() {
        super.isElementClickable(checkoutBtn);
        return new CheckoutInfoPage(super.driver);
    }

    public void removeItems(int[] itemsIndexes) {
        for (int i = itemsIndexes.length - 1; i >= 0; i--) {
            int index = itemsIndexes[i];
            if (index >= 0 && index < this.itemsToRemove.size()) {
                super.isElementClickable(itemsToRemove.get(index));
            }
        }
    }

    public boolean isCartEmpty() {
        return !cartEmpty.isDisplayed();
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
