package org.systech.compliance.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;


public class LoginPage extends BaseClass {

    @FindBy(name = "user.username")
    WebElement myUserName;
    @FindBy(name = "user.password")
    WebElement myPassword;
    @FindBy(xpath = "//span[text()=\"Login\"]")
    WebElement myloginButton;

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);


    }

    public WebElement myuserName() {

        return ehandler.findE(myUserName);
    }

    public WebElement myPasswordMethod()  {
        return ehandler.findE(myPassword);

    }

    public WebElement myLoginButton() {
        return ehandler.findE(myloginButton);
    }

}
