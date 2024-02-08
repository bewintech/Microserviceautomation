package org.systech.compliance.pageobjects.InterestandPenaltyManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class ComputePenalty extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Interest/Penalties Management')]")
    WebElement interestManagement;
    @FindBy(xpath = "(//div[@class='x-treelist-item-text'][contains(.,'Penalties')])[2]")
    WebElement penalty;
    @FindBy(xpath = "(//div[contains(@class,'x-grid-cell-inner x-grid-checkcolumn-cell-inner')])[1]")
    WebElement selectBatch;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Penalty Operations')]")
    WebElement penaltyOperations;
    @FindBy(xpath ="//b[contains(.,'Compute Penalty')]" )
    WebElement computePenalty;
    public ComputePenalty(WebDriver driver){ PageFactory.initElements(driver,this);}
    public WebElement getInterestManagement(){return ehandler.findClickable(interestManagement);}
    public WebElement getPenalty(){return ehandler.findClickable(penalty);}
    public WebElement getSelectBatch(){return ehandler.findClickable(selectBatch);}
    public WebElement getPenaltyOperations(){return ehandler.findClickable(penaltyOperations);}
    public WebElement getComputePenalty(){return ehandler.findClickable(computePenalty);}



}
