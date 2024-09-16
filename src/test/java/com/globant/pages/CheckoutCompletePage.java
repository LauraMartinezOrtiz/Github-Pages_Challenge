package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(css = ".complete-header")
    private WebElement completeMsg;

    public String getCompleteMsg() {
        return completeMsg.getText();
    }

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
}
