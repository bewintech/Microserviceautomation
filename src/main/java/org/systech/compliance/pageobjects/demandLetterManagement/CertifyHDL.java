package org.systech.compliance.pageobjects.demandLetterManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CertifyHDL extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Demand Letters Management')]")
    WebElement demandLetterManagement;
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Harsh Demand Letters')]")
    WebElement hDL;
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[1]")
    WebElement selectHDL;
    @FindBy(xpath = "//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small'][contains(.,'Certification')]")
    WebElement certification;
    @FindBy(xpath = "//span[@data-ref='textEl'][contains(.,'Certify')]")
    WebElement certify;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmCertification;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Certify Harsh Demand Letter Batch')]")
    WebElement certifyHDL;

    @FindBy(xpath = "//span[@data-ref='textEl'][contains(.,'Approve')]")
    WebElement approve;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmApproval;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Approve Harsh Demand Letter Batch')]")
    WebElement approveHDL;
    public CertifyHDL(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getDemandLetterManagement(){return ehandler.findClickable(demandLetterManagement);}
    public WebElement gethDL(){return ehandler.findClickable(hDL);}
    public WebElement getSelectHDL(){return ehandler.findClickable(selectHDL);}
    public WebElement getCertification(){return ehandler.findClickable(certification);}
    public WebElement getCertify(){return ehandler.findClickable(certify);}
    public WebElement getConfirmCertification(){return ehandler.findClickable(confirmCertification);}
    public WebElement getApprove(){return ehandler.findClickable(approve);}
    public WebElement getCertifyHDL(){return ehandler.findClickable(certifyHDL);}
    public WebElement getConfirmApproval(){return ehandler.findClickable(confirmApproval);}
    public WebElement getApproveHDL(){return ehandler.findClickable(approveHDL);}

}
