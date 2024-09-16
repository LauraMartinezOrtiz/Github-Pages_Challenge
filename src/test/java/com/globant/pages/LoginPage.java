package com.globant.pages;

import com.globant.utils.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "user-name")
    private WebElement usernameTxt;

    @FindBy(id = "password")
    private WebElement passwordTxt;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @FindBy(css = ".login_credentials_wrap-inner")
    private WebElement loginCredentials;

    public void setUsername(String username) {
        this.usernameTxt.sendKeys(username);
    }

    public void setPassword(String password) {
        this.passwordTxt.sendKeys(password);
    }

    public boolean checkLoginPage() {
        return super.isElementDisplayed(loginCredentials);
    }

    public ProductListPage clickLogin() {
        super.isElementClickable(loginBtn);
        return new ProductListPage(super.driver);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
