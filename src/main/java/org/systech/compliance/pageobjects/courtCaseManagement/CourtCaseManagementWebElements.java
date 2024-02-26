package org.systech.compliance.pageobjects.courtCaseManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CourtCaseManagementWebElements extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Court Cases Management')]")
    WebElement courtCaseManagement;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Operations')])")
    WebElement operations;
    @FindBy(xpath = "//b[contains(.,'Create New Case')]")
    WebElement createNewCase;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Find')])")
    WebElement findEmployer;
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[20]")
    WebElement selectEmployer;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
    WebElement getApplySelectedEmployer;
    @FindBy(xpath = "(//input[@name='employerCase.balance'])[2]")
    WebElement balance;
    @FindBy(xpath = "(//input[@name='employerCase.payment'])[2]")
    WebElement payment;
    @FindBy(xpath = "(//input[contains(@name,'employerCase.interest')])[2]")
    WebElement interest;
    @FindBy(xpath = "(//input[@name='employerCase.penalty'])[2]")
    WebElement penalty;
    @FindBy(xpath = "(//input[@name='employerCase.liability'])[2]")
    WebElement liability;
    @FindBy(xpath = "(//input[@name='employerCase.totalLiability'])[2]")
    WebElement totalLiabity;
    @FindBy(xpath = "//textarea[contains(@name,'employerCase.comments')]")
    WebElement comments;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Find')])[2]")
    WebElement findInspector;
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[20]")
    WebElement selectInspector;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
    WebElement applySelectedInspector;
    @FindBy(xpath = "//input[contains(@name,'employerCase.title')]")
    WebElement title;
    @FindBy(xpath = "//input[contains(@name,'employerCase.createdOn')]")
    WebElement dateCreated;
    @FindBy(xpath = "//input[contains(@name,'employerCase.fromDate')]")
    WebElement fromDate;
    @FindBy(xpath = "//input[contains(@name,'employerCase.toDate')]")
    WebElement toDate;
    @FindBy(xpath = "//input[contains(@name,'employerCase.caseStatus')]")
    WebElement caseStatus;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Find')])[3]")
    WebElement findCaseType;
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[15]")
    WebElement selectCaseType;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Apply Selected')]")
    WebElement applySelectedCasetype;
    @FindBy(xpath = "//textarea[contains(@name,'employerCase.courtOrder')]")
    WebElement courtOrder;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Save Case')]")
    WebElement saveCase;
    // Webelements for case approval
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[6]")
    WebElement selectCase;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Certification')]")
    WebElement casecertification;
    @FindBy(xpath = "//a[@data-ref='itemEl'][contains(.,'Certify')]")
    WebElement certifyCase;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmCertification;
    @FindBy(xpath = "//b[contains(.,'Approve')]")
    WebElement appoveCase;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Yes')]")
    WebElement confirmApproval;
//    Webelements for Case Removal
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[1]")
    WebElement caseToRemove;
    @FindBy(xpath = "//b[contains(.,'Remove Case')]")
    WebElement removeCase;
// Webelements for Case Deactivation
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[4]")
    WebElement selectCaseToDeactivate;
    @FindBy(xpath = "//b[contains(.,'Deactivate Case')]")
    WebElement deactivateCase;


    public CourtCaseManagementWebElements(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getCourtCaseManagement(){return ehandler.findClickable(courtCaseManagement);}
    public WebElement getOperations(){return ehandler.findClickable(operations);}
    public WebElement getFindEmployer(){return ehandler.findClickable(findEmployer);}
    public WebElement getSelectEmployer(){return ehandler.findClickable(selectEmployer);}
    public WebElement getGetApplySelectedEmployer(){return ehandler.findClickable(getApplySelectedEmployer);}
    public WebElement getCreateNewCase(){return ehandler.findClickable(createNewCase);}
    public WebElement getBalance(){return ehandler.findClickable(balance);}
    public WebElement getInterest(){return ehandler.findClickable(interest);}
    public WebElement getPenalty(){return ehandler.findClickable(penalty);}
    public WebElement getPayment(){return ehandler.findClickable(payment);}
    public WebElement getComments(){return ehandler.findClickable(comments);}
    public WebElement getLiability(){return ehandler.findClickable(liability);}
    public WebElement getFindInspector(){return ehandler.findClickable(findInspector);}
    public WebElement getSelectInspector(){return ehandler.findClickable(selectInspector);}
    public WebElement getApplySelectedInspector(){return ehandler.findClickable(applySelectedInspector);}
    public WebElement getTotalLiabity(){return ehandler.findClickable(totalLiabity);}
    public WebElement getTitle(){return ehandler.findClickable(title);}
    public WebElement getDateCreated(){return ehandler.findClickable(dateCreated);}
    public WebElement getFromDate(){return ehandler.findClickable(fromDate);}
    public WebElement getCaseStatus(){return ehandler.findClickable(caseStatus);}
    public WebElement getFindCaseType(){return ehandler.findClickable(findCaseType);}
    public WebElement getSelectCaseType(){return ehandler.findClickable(selectCaseType);}
    public WebElement getCourtOrder(){return ehandler.findClickable(courtOrder);}
    public WebElement getApplySelectedCasetype(){return ehandler.findClickable(applySelectedCasetype);}
    public WebElement getToDate(){return ehandler.findClickable(toDate);}
    public WebElement getSaveCase(){return ehandler.findClickable(saveCase);}

    public WebElement getCasecertification(){return ehandler.findClickable(casecertification);}
    public WebElement getSelectCase(){return ehandler.findClickable(selectCase);}
    public WebElement getConfirmCertification(){return ehandler.findClickable(confirmCertification);}
    public WebElement getCertifyCase(){return ehandler.findClickable(certifyCase);}
    public WebElement getAppoveCase(){return ehandler.findClickable(appoveCase);}
    public WebElement getConfirmApproval(){return ehandler.findClickable(confirmApproval);}
    public WebElement getCaseToRemove(){return ehandler.findClickable(caseToRemove);}
    public WebElement getRemoveCase(){return ehandler.findClickable(removeCase);}
    public WebElement getSelectCaseToDeactivate(){return ehandler.findClickable(selectCaseToDeactivate);}
    public WebElement getDeactivateCase(){return ehandler.findClickable(deactivateCase);}










}
