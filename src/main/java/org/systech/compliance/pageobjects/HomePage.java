package org.systech.compliance.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class HomePage extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Surveys/Inspections Management')]")
    WebElement inspectionManagement;

    public HomePage(WebDriver driver) {
        super();
    }


    public WebElement getInspectionManagement(){return ehandler.findE(inspectionManagement);}

}
