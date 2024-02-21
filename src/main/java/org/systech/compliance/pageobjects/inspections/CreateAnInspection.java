package org.systech.compliance.pageobjects.inspections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CreateAnInspection extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Surveys/Inspections Management')]")
    WebElement inspectionManagement;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Operations')])[1]")
    WebElement operations;
    @FindBy(xpath = "//b[contains(.,'Create an Inspection')]")
    WebElement createInspection;
    @FindBy(xpath = "//input[contains(@name,'inspection.inspectionName')]")
    WebElement inspectionTitle;
    @FindBy(xpath = "//input[contains(@name,'inspection.inspectionType')]")
    WebElement inspectorType;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Find')])[1]")
    WebElement findEmployer;
    @FindBy(xpath = "(//div[contains(.,'Active')])[40]")
    WebElement selectEmployer;
//            "//div[contains(text(), 'Duka')]")
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
    WebElement applySelectedEmployer;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Find')])[2]")
    WebElement findInspector;
    @FindBy(xpath = "//div[@class='x-grid-cell-inner '][contains(.,'Winfred Winnie')]")
    WebElement selectInspector;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
    WebElement applySelectedInspector;
    @FindBy(xpath = "//input[contains(@name,'inspection.dateOfVisit')]")
    WebElement dateOfVisit;
    @FindBy(xpath = "//textarea[contains(@name,'inspection.description')]")
    WebElement inspectionDescription;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Save')]")
    WebElement saveInspection;
    @FindBy(xpath = "//div[contains(@id,'header-title-textEl')][@data-ref='textEl'][contains(.,'Success!')]")
    WebElement toastMessage;
    public CreateAnInspection(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getInspectionManagement(){return ehandler.findE(inspectionManagement);}
    public WebElement getOperations(){return ehandler.findClickable(operations);}
    public WebElement getCreateInspection(){return ehandler.findClickable(createInspection);}
    public WebElement getInspectionTitle(){return ehandler.findClickable(inspectionTitle);}
    public WebElement getInspectorType(){return ehandler.findE(inspectorType);}
    public WebElement getFindEmployer(){return ehandler.findClickable(findEmployer);}
    public WebElement getSelectEmployer(){return ehandler.findE(selectEmployer);}
    public WebElement getApplySelectedEmployer(){return ehandler.findE(applySelectedEmployer);}
    public WebElement getFindInspector(){return ehandler.findClickable(findInspector);}
    public WebElement getSelectInspector(){return ehandler.findClickable(selectInspector);}
    public WebElement getApplySelectedInspector(){return ehandler.findClickable(applySelectedInspector);}
    public WebElement getDateOfVisit(){return ehandler.findClickable(dateOfVisit);}
    public WebElement getInspectionDescription(){return ehandler.findClickable(inspectionDescription);}
    public WebElement getSaveInspection(){return ehandler.findClickable(saveInspection);}
    public WebElement getToastMessage(){return ehandler.findE(toastMessage);}


}
