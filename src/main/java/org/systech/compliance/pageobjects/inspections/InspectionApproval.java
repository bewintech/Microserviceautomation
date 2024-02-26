package org.systech.compliance.pageobjects.inspections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class InspectionApproval extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Surveys/Inspections Management')]")
    WebElement inspectionManagement;
    @FindBy(xpath = "(//div[@class='x-grid-cell-inner '][contains(.,'Automation Inspection Tests')])[4]")
    WebElement selectInspection;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Certification')]")
    WebElement certification;
    @FindBy(xpath = "//b[contains(.,'Certify')]")
    WebElement certifyInspection;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement certify;
    @FindBy(xpath = "//b[contains(.,'Approve')]")
    WebElement approveInspection;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmApproval;
    public InspectionApproval(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getInspectionManagement(){return ehandler.findClickable(inspectionManagement);}
    public WebElement getSelectInspection(){return ehandler.findClickable(selectInspection);}
    public WebElement getCertification(){return ehandler.findClickable(certification);}
    public WebElement getCertifyInspection(){return ehandler.findClickable(certifyInspection);}
    public WebElement getApproveInspection(){return ehandler.findClickable(approveInspection);}
    public WebElement getCertify(){return ehandler.findClickable(certify);}
    public WebElement getConfirmApproval(){return ehandler.findClickable(confirmApproval);}


}
