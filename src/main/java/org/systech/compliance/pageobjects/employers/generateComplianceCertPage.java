package org.systech.compliance.pageobjects.employers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

public class generateComplianceCertPage extends BaseClass {
    @FindBy(xpath = "//span[@class='m-title'][contains(.,'Employers')]")
    WebElement employerCard;

//    @FindBy(xpath = "//label[contains(@for,'employerSearchTxt-inputEl')]")
//    WebElement searchName;

    @FindBy(xpath = "//div[@class='x-grid-cell-inner '][contains(.,'Kamotho and sons')]")
    WebElement selectEmployer;

    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Show Compliance BreakDown')]")
    WebElement showComplianceBreakdownBtn;

    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Compliance Certification')]")
    WebElement complianceCertificationTab;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]" +
            "/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]" +
            "/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]" +
            "/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement selectCertificate;

    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Generate Certificate')]")
    WebElement generateCertBtn;

    @FindBy(xpath = "//div[contains(@class,'x-form-trigger x-form-trigger-default x-form-date-trigger x-form-date-trigger-default ')]")
    WebElement calendarBtn;

    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Today')]")
    WebElement selectTodayBtn;

    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Save')]")
    WebElement saveBtn;

    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Director Certify')]")
    WebElement directorCertify;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmDirectorCertifyBtn;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Certify Compliance Certificate')]")
    WebElement certifyDirectorCertify;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Compliance Officer Approval')]")
    WebElement officerApprovalBtn;
    @FindBy(xpath = "//span[@data-ref='btnEl'][contains(.,'Yes')]")
    WebElement confirmApproval;


    public generateComplianceCertPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getEmployerCard() {
        return employerCard;
    }
//    public WebElement getSearchName() {
//        return searchName;
//    }

    public WebElement getSelectEmployer() {
        return selectEmployer;
    }
    public WebElement getShowComplianceBreakdownBtn(){return showComplianceBreakdownBtn;}
    public WebElement getComplianceCertificationTab(){return complianceCertificationTab;}
    public WebElement getSelectCertificate(){return selectCertificate;}
    public WebElement getGenerateCertBtn(){return generateCertBtn;}
    public WebElement getCalendarBtn(){return calendarBtn;}
    public WebElement getSelectTodayBtn(){return selectTodayBtn;}
    public WebElement getSaveBtn(){return saveBtn;}
    public WebElement getDirectorCertify(){return directorCertify;}
    public WebElement getConfirmDirectorCertifyBtn(){return confirmDirectorCertifyBtn;}
    public WebElement getCertifyDirectorCertify(){return certifyDirectorCertify;}
    public WebElement getOfficerApprovalBtn(){return officerApprovalBtn;}
    public WebElement getConfirmApproval(){return confirmApproval;}

//    public void createComplianceCert(){
//        getEmployerCard().click();
//        getSearchName().sendKeys();
//        getSelectEmployer().click();
//        getShowComplianceBreakdownBtn().click();
//        getComplianceCertificationTab().click();
//        getSelectCertificate().click();
//        getGenerateCertBtn().click();
//        getCalendarBtn().click();
//        getSelectTodayBtn().click();
//        getSaveBtn().click();
//
//    }

}


