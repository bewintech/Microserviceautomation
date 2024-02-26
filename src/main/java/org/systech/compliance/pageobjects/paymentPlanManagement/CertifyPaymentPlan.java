package org.systech.compliance.pageobjects.paymentPlanManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CertifyPaymentPlan extends BaseClass {;
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[8]")
    WebElement selectPayment;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Certification')])[1]")
    WebElement cetification;
    @FindBy(xpath ="(//b[contains(.,'Certify')])")
    WebElement certify;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmCertification;
    @FindBy(xpath = "//a[contains(@data-qtip,'Approve')]")
    WebElement approve;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmApproval;

    public CertifyPaymentPlan(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getSelectPayment(){return ehandler.findClickable(selectPayment);}
    public  WebElement getCetification(){return ehandler.findClickable(cetification);}
    public WebElement getCertify(){return ehandler.findClickable(certify);}
    public WebElement getConfirmCertification(){return ehandler.findClickable(confirmCertification);}
    public WebElement getApprove(){return ehandler.findClickable(approve);}
    public WebElement getConfirmApproval(){return ehandler.findClickable(confirmApproval);}


}
