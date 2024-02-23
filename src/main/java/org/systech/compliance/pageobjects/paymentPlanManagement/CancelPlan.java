package org.systech.compliance.pageobjects.paymentPlanManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CancelPlan extends BaseClass {
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[8]")
    WebElement selectPayment;
    @FindBy(xpath = "(//span[contains(.,'Cancel Plan')])" )
    WebElement cancelPlan;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmCancel;
    @FindBy(xpath = "(//span[contains(.,'Remove')])[6]")
    WebElement removePlan;
    public CancelPlan(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getCancelPlan(){return ehandler.findClickable(cancelPlan);}
    public WebElement getConfirmCancel(){return ehandler.findClickable(confirmCancel);}
    public WebElement getSelectPayment(){return ehandler.findClickable(selectPayment);}
    public WebElement getRemovePlan(){return ehandler.findClickable(removePlan);}



}
