package org.systech.compliance.pages;

import org.systech.compliance.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By username = By.name("user.username");
    private final By password = By.name("user.password");
    private final By loginBtn = By.tagName("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void userLogin(String txt){
        driver.findElement(username).sendKeys(txt);
        driver.findElement(password).sendKeys(txt);
        driver.findElement(loginBtn).click();
    }
}
