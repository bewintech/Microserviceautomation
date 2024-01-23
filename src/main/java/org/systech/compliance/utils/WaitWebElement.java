package org.systech.compliance.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.base.BaseClass;

import java.time.Duration;

public class WaitWebElement extends BaseClass {

    public WaitWebElement(WebDriver driver){
        PageFactory.initElements(driver,this);


    }
    public WebElement waitVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement e= wait.until(ExpectedConditions.visibilityOf(element));
        return e;
    }

    public WebElement waitClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement e= wait.until(ExpectedConditions.elementToBeClickable(element));
        return e;
    }


    public boolean isAlertPresent() {
        boolean isAlertPresent = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();
            if (alertText.contains("Login Details NOT Correct!")) {
                System.out.println("Wrong details");
                logger.error("Wrong details");
                isAlertPresent = true;
            }
        } catch (TimeoutException e) {
            // Alert is not present within 30 seconds
            isAlertPresent = false;
        } catch (Exception e) {
            // Any other exception
            isAlertPresent = false;
            e.printStackTrace();
        }
        return isAlertPresent;
    }

}
