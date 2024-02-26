package org.systech.compliance.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.base.BaseClass;

import java.time.Duration;

public class WaitWebElement extends BaseClass {

    private static final Duration TIMEOUT = Duration.ofSeconds(30);

    public WaitWebElement(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement waitVisible(WebElement element) {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitClickable(WebElement element) {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(element));
    }

    public boolean isAlertPresent() {
        boolean isAlertPresent = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();
            if (alertText.contains("Login Details NOT Correct!")) {
                System.out.println("Wrong details");
                logger.error("Wrong details");
                isAlertPresent = true;
            }
        } catch (NoAlertPresentException e) {
            // Alert is not present
            isAlertPresent = false;
        } catch (TimeoutException e) {
            // Alert is not present within the specified timeout
            isAlertPresent = false;
        } catch (Exception e) {
            // Any other exception
            logger.error("An unexpected exception occurred", e);
            isAlertPresent = false;
        }
        return isAlertPresent;
    }
}
