package org.systech.compliance.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.systech.compliance.base.BaseClass.driver;


public class ActionFile implements  ActionsMethods {
    /**
     *
     */
    @Override
    public void click(WebElement element) {
        element.click();
    }

    /**
     *
     */
    @Override
    public void selectDropDown() {
        ActionsMethods.super.selectDropDown();
    }

    /**
     *
     */
    @Override
    public void sendKeysMethod(WebElement element, String text) {
        element.sendKeys(text);
    }


    /**
     *
     */
    @Override
    public void comboDropDown(WebElement element, String text) {
        element.sendKeys(Keys.CONTROL + "a");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.sendKeys(Keys.DELETE);
        element.sendKeys(text);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.sendKeys(Keys.ARROW_DOWN);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.sendKeys(Keys.ENTER);


    }

    /**
     *
     */
    @Override
    public void detectSuccessPopUp() {
        ActionsMethods.super.detectSuccessPopUp();
    }


    @Override
    public void clearTextField(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value=''", element);

    }

    @Override
    public void clickEnter(WebElement element) {
        // Create an Actions object
        Actions actions = new Actions(driver);

        // Send the Enter key to the element
        actions.sendKeys(element, Keys.ENTER).perform();
    }

    @Override
    public void clear(WebElement element, String text) {
        element.sendKeys(Keys.CONTROL + "a");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(text);


    }


    public void radiochecked(WebElement radioB) {
        for (int j = 1; j <= 2; j++) {
            boolean check = radioB.isSelected();
            if (!check)
                System.out.println("Checkbox is not Checked.");
            else
                System.out.println("Checkbox is Checked.");
        }
    }

    public void performTaskOnElement(WebElement element, String text) {
        if (element.isEnabled()) {
            element.sendKeys(text);
            element.click();
        } else {
            System.out.println("Element not visible");

        }
    }

    @Override
    public WebElement confirmGridPresent() {
        ActionFile actions = new ActionFile();
        String dateToday = actions.generateDateToday();
        WebElement tb = driver.findElement(By.xpath("//div[@class='x-grid-cell-inner '][contains(.,'" + dateToday + "')][1]"));
        System.out.println(tb);
        System.out.println(actions.generateDateToday());
        return tb;
    }


    @Override
    public String generateDateToday() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
        return formattedDate;
    }

    @Override
    public boolean isPopUpPresent() {
        WebElement activeElement = driver.switchTo().activeElement();
        String accessibleName = activeElement.getText();
        System.out.println(accessibleName);

        String expectedAccessibleName = "Save";

        if (accessibleName != null && accessibleName.equals(expectedAccessibleName)) {
            System.out.println("Popup is present");
            return true;


        } else {
            System.out.println("Popup is not present");
            return false;
        }

    }

    @Override
    public boolean isToastDispayed() {
        WebElement toastElement = driver.findElement(By.xpath("//div[@class='x-title-text x-title-text-default x-title-item' and text()='Failure']"));
        boolean isToastDisplayed = toastElement.isDisplayed();
        String toastText = toastElement.getText();
        String expectedText = "Failure";
        boolean isTextCorrect = toastText.equals(expectedText);
        return true;
    }

    @Override
    public String currentDateToday(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = currentDate.format(formatter);
        js.executeScript("arguments[0].value = arguments[1];", element, formattedDate);
        return formattedDate;
    }
    @Override
    public void doubleClick(WebElement element){
        Actions action = new Actions(driver);
        action.doubleClick(element).build().perform();
    }
}








