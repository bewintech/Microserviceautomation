package org.systech.compliance.utils;

import io.qameta.allure.model.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.base.BaseClass;
import io.qameta.allure.Allure;
import org.systech.compliance.pageobjects.inspections.CloseInspection;


import java.time.Duration;

/**
 * @author Winfred
 */
public class AssertionMethod extends BaseClass {
    private static final Duration TIMEOUT = Duration.ofSeconds(60);


    public void assertToastMessage(WebDriver driver, String expectedMessage) {
        try {
            // Perform assertion
            CloseInspection closeInspection = new CloseInspection(driver);
            WebElement toastMessage = closeInspection.getToastMessage();
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            wait.until(ExpectedConditions.visibilityOf(toastMessage));
            String actualMessage = toastMessage.getText();
            // Check if actual message matches expected message
            if (!actualMessage.equals(expectedMessage)) {
                throw new AssertionError("Toast message assertion failed. Expected: " + expectedMessage + ", Actual: " + actualMessage);
            }
        } catch (AssertionError e) {
            // If assertion fails, report the failure to Allure
            Allure.getLifecycle().updateTestCase(testResult -> testResult.setStatus(Status.FAILED));
            // Rethrow the AssertionError to ensure it's still reported in the test output
            throw e;
        }
    }

}
