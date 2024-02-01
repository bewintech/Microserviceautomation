package org.systech.compliance.utils;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.systech.compliance.base.BaseClass;

import java.util.List;

import static java.sql.DriverManager.getDriver;

public class ExceptionHandlerFile extends BaseClass {

    public WebElement findE(WebElement element) {
        try {
            return webs.waitVisible(element);
        } catch (Exception e) {
            logger.error(e.getMessage());
            handleException(e);
            throw e;
        }
    }

    public WebElement findList(List<WebElement> elements) {
        try {
            // Assuming you want to wait for visibility of the first element in the list
            webs.waitVisible(elements.get(0)); // You may need to adjust this based on your requirements
            return (WebElement) elements;
        } catch (Exception e) {
            logger.error(e.getMessage());
            handleException(e);
            throw e;
        }
    }

    public WebElement findClickable(WebElement element) {
        try {
            return webs.waitClickable(element);
        } catch (Exception e) {
            logger.error(e.getMessage());
            handleException(e);
            throw e;
        }
    }

    private void handleException(Exception e) {
        // Add logic here to handle the exception
        if (e instanceof StaleElementReferenceException) {
            // You may want to refresh the browser in case of StaleElementReferenceException
            logger.warn("StaleElementReferenceException occurred. Refreshing the browser.");
            refreshBrowser();
        }
        // Add more specific exception handling logic as needed
    }

    private void refreshBrowser() {
        // Implement browser refresh logic here
        WebDriver driver = new ChromeDriver();  // Assuming getDriver() is a method in BaseClass that returns the WebDriver instance
        if (driver != null) {
            driver.navigate().refresh();
        }
    }
}
