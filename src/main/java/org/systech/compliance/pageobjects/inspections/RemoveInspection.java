package org.systech.compliance.pageobjects.inspections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class RemoveInspection extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Surveys/Inspections Management')]")
    WebElement inspectionManagement;
    @FindBy(xpath = "(//div[@class='x-grid-cell-inner '][contains(.,'Automation Inspection')])[1]")
    WebElement selectInspection;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Operations')])[1]")
    WebElement operations;
    @FindBy(xpath = "//b[contains(.,'Remove')]")
    WebElement removeInspection;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmRemove;

    public RemoveInspection(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getInspectionManagement(){return ehandler.findClickable(inspectionManagement);}
    public WebElement getSelectInspection(){return ehandler.findClickable(selectInspection);}
    public WebElement getOperations(){return ehandler.findClickable(operations);}
    public WebElement getCloseCampaign(){return ehandler.findClickable(removeInspection);}
    public WebElement getConfirmClose(){return ehandler.findClickable(confirmRemove);}





}
