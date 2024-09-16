package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage extends BasePage {

    @FindBy(name = "firstName")
    private WebElement firstNameTxt;

    @FindBy(id = "last-name")
    private WebElement lastNameTxt;

    @FindBy(name = "postalCode")
    private WebElement postalCodeTxt;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public void setFirstName(String firstName) {
        this.firstNameTxt.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastNameTxt.sendKeys(lastName);
    }

    public void setPostalCode(String postalCode) {
        this.postalCodeTxt.sendKeys(postalCode);
    }

    public CheckoutOverviewPage continueToOverview() {
        super.isElementClickable(continueBtn);
        return new CheckoutOverviewPage(super.driver);
    }

    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }
}
