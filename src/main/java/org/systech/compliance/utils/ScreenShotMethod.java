package org.systech.compliance.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.systech.compliance.base.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

/**
 * @author Winfred
 */
public class ScreenShotMethod extends BaseClass {
    public static class TestListener implements ITestListener {

//        WebDriver driver;

        @Override
        public void onTestFailure(ITestResult result) {
            System.out.println("Test Failed!");
            // Taking screenshot
            takeScreenshot(result.getMethod().getMethodName());
        }

        public void takeScreenshot(String methodName) {
            try {
                // Convert WebDriver object to TakesScreenshot
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                // Capture the screenshot and save it to a file
                File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
                // Define the destination path

                String destPath = "screenshots/" + methodName + ".png";
                // Copy the screenshot to the desired location
                FileUtils.copyFile(sourceFile, new File(destPath));
                System.out.println("Screenshot captured: " + destPath);
            } catch (Exception e) {
                System.out.println("Failed to capture screenshot: " + e.getMessage());
            }
        }
    }
}
