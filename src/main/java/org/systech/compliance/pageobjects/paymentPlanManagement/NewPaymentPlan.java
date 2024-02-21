//package org.systech.compliance.pageobjects.paymentPlanManagement;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.systech.compliance.base.BaseClass;
//
///**
// * @author Winfred
// */
//public class NewPaymentPlan extends BaseClass {
//    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Payment Plans Management')]")
//    WebElement paymentPlansManagement;
//    @FindBy(xpath = "//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small'][contains(.,'Operations')]")
//    WebElement operations;
//    @FindBy(xpath = "//a[@data-ref='itemEl'][contains(.,'Create New')]")
//    WebElement createNewPlan;
//    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Find')]")
//    WebElement findEmployer;
//    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[6]")
//    WebElement employer;
//    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
//    WebElement applySelected;
//    @FindBy(xpath = "//input[contains(@name,'paymentPlan.totalLiability')]")
//    WebElement totalLiability;
//    @FindBy(xpath = "//input[contains(@name,'paymentPlan.startDate')]")
//    WebElement startDate;
//    @FindBy(xpath = "//input[contains(@name,'paymentPlan.liabilityPeriodFrom')]")
//    WebElement periodFrom;
//    @FindBy(xpath = "//input[contains(@name,'paymentPlan.liabilityPeriodTo')]")
//    WebElement periodTo;
//    @FindBy(xpath = "//input[contains(@name,'paymentPlan.frequency')]")
//    WebElement frequency;
//    @FindBy(xpath = "//input[contains(@name,'paymentPlan.installmentAmount')]")
//    WebElement installmentAmount;
//    @FindBy(xpath = "//input[contains(@name,'paymentPlanDetail.paymentType')]")
//    WebElement paymentType;
//    @FindBy(xpath = "(//span[contains(@data-ref,'btnIconEl')])[28]")
//    WebElement searchReceipt;
//    @FindBy(xpath = "//div[@class='x-grid-cell-inner '][contains(.,'CB001000000008')]")
//    WebElement receipt;
//    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
//    WebElement applyReceipt;
//    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Save')]")
//    WebElement  save;
//    public NewPaymentPlan(WebDriver driver){
//        PageFactory.initElements(driver,this);}
//    public WebElement getPaymentPlansManagement(){return ehandler.}
//}
