package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(name = "finish")
    private WebElement finishBtn;

    public CheckoutCompletePage continueToComplete() {
        super.isElementClickable(finishBtn);
        return new CheckoutCompletePage(super.driver);
    }

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }
}
