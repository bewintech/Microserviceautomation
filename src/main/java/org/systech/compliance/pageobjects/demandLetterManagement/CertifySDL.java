package org.systech.compliance.pageobjects.demandLetterManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CertifySDL extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Demand Letters Management')]")
    WebElement demandLettersManagement;
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Soft Demand Letters')]")
    WebElement sDL;
    @FindBy(xpath ="(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[1]")
    WebElement selectSDL;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Certification')]")
    WebElement certification;
    @FindBy(xpath = "//span[@data-ref='textEl'][contains(.,'Certify')]")
    WebElement certify;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmCertification;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Certify Soft Demand Letter Batch')]")
    WebElement certifySDL;

    @FindBy(xpath = "//span[@data-ref='textEl'][contains(.,'Approve')]")
    WebElement approve;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmApproval;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement approveSDL;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Approve Soft Demand Letter Batch')]")
    WebElement approveSDLBatch;
    public CertifySDL(WebDriver driver){ PageFactory.initElements(driver,this);}
    public WebElement getDemandLettersManagement(){return ehandler.findClickable(demandLettersManagement);}
    public WebElement getsDL(){return ehandler.findClickable(sDL);}
    public WebElement getSelectSDL(){return ehandler.findClickable(selectSDL);}
    public WebElement getCertification(){return ehandler.findClickable(certification);}
    public WebElement getCertify(){return ehandler.findClickable(certify);}
    public WebElement getApprove(){return ehandler.findClickable(approve);}
    public WebElement getConfirmCertification(){return ehandler.findClickable(confirmCertification);}
    public WebElement getCertifySDL(){return ehandler.findClickable(certifySDL);}
    public WebElement getConfirmApproval(){return ehandler.findClickable(confirmApproval);}
    public WebElement getApproveSDL(){return ehandler.findClickable(approveSDL);}
    public WebElement getApproveSDLBatch(){return ehandler.findClickable(approveSDLBatch);}






}


