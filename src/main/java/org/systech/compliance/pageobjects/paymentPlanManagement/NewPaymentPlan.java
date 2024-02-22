package org.systech.compliance.pageobjects.paymentPlanManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class NewPaymentPlan extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Payment Plans Management')]")
    WebElement paymentPlansManagement;
    @FindBy(xpath = "//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small'][contains(.,'Operations')]")
    WebElement operations;
    @FindBy(xpath = "//a[@data-ref='itemEl'][contains(.,'Create New')]")
    WebElement createNewPlan;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Find')]")
    WebElement findEmployer;
    @FindBy(xpath = "(//div[contains(.,'Active')])[40]")
    WebElement employer;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
    WebElement applySelected;
    @FindBy(xpath = "//input[contains(@name,'paymentPlan.totalLiability')]")
    WebElement totalLiability;
    @FindBy(xpath = "//input[contains(@name,'paymentPlan.startDate')]")
    WebElement startDate;
    @FindBy(xpath = "//input[contains(@name,'paymentPlan.liabilityPeriodFrom')]")
    WebElement periodFrom;
    @FindBy(xpath = "//input[contains(@name,'paymentPlan.liabilityPeriodTo')]")
    WebElement periodTo;
    @FindBy(xpath = "//input[contains(@name,'paymentPlan.frequency')]")
    WebElement frequency;
    @FindBy(xpath = "//input[contains(@name,'paymentPlan.installmentAmount')]")
    WebElement installmentAmount;
    @FindBy(xpath = "//input[contains(@name,'paymentPlanDetail.paymentType')]")
    WebElement paymentType;
    @FindBy(xpath = "(//span[contains(@data-ref,'btnIconEl')])[28]")
    WebElement searchReceipt;
    @FindBy(xpath = "//div[@class='x-grid-cell-inner '][contains(.,'CB001000000008')]")
    WebElement receipt;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
    WebElement applyReceipt;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Save')]")
    WebElement  save;
    public NewPaymentPlan(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getPaymentPlansManagement(){return ehandler.findClickable(paymentPlansManagement);}
    public WebElement getOperations(){return ehandler.findClickable(operations);}
    public WebElement getCreateNewPlan(){return ehandler.findClickable(createNewPlan);}
    public WebElement getFindEmployer(){return ehandler.findClickable(findEmployer);}
    public WebElement getEmployer(){return ehandler.findClickable(employer);}
    public WebElement getApplySelected(){return ehandler.findClickable(applySelected);}
    public WebElement getTotalLiability(){return ehandler.findClickable(totalLiability);}
    public WebElement getStartDate(){return ehandler.findClickable(startDate);}
    public WebElement getPeriodFrom(){return ehandler.findClickable(periodFrom);}
    public  WebElement getPeriodTo(){return ehandler.findClickable(periodTo);}
    public WebElement getFrequency(){return ehandler.findClickable(frequency);}
    public WebElement getInstallmentAmount(){return ehandler.findClickable(installmentAmount);}
    public WebElement getPaymentType(){return ehandler.findClickable(paymentType);}
    public WebElement getSearchReceipt(){return ehandler.findClickable(searchReceipt);}
    public WebElement getReceipt(){return ehandler.findClickable(receipt);}
    public WebElement getSave(){return ehandler.findClickable(save);}
    public WebElement getApplyReceipt(){return ehandler.findClickable(applyReceipt);}


}
