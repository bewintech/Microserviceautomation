package org.systech.compliance.pageobjects.demandLetterManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class GenerateHDL extends BaseClass {
    @FindBy(xpath = "//b[contains(.,'Escalate To Harsh Demand Letters')]")
    WebElement escalateHDL;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Escalate Soft Demand Letter Batch')]")
    WebElement escalateSDLBatch;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmEscalate;

    public GenerateHDL(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getEscalateHDL(){return ehandler.findClickable(escalateHDL);}
    public WebElement getConfirmEscalate(){return ehandler.findClickable(confirmEscalate);}
    public WebElement getEscalateSDLBatch(){return ehandler.findClickable(escalateSDLBatch);}
}
