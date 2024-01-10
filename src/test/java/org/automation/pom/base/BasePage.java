package org.automation.pom.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void load(String endPoint){
        driver.get("http://192.168.200.201:2113/Compliance/#login" + endPoint);
    }
}
