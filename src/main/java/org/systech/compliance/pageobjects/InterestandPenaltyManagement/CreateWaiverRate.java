package org.systech.compliance.pageobjects.InterestandPenaltyManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CreateWaiverRate extends BaseClass {
        @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Interest/Penalties Management')]")
        WebElement interestManagement;
        @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Waivers')]")
        WebElement waivers;
        @FindBy (xpath = "//div[@class='x-treelist-item-text'][contains(.,'Waiver Rates')]")
        WebElement waiverRates;
        @FindBy(xpath = "(//b[contains(.,'Create New')])[1]")
        WebElement createNewRate;
        @FindBy(xpath = "//input[contains(@name,'waiverRate.pctOfInterestToWaive')]")
        WebElement interestToWave;
        @FindBy(xpath = "//input[contains(@name,'waiverRate.pctOfPenaltyToWaive')]")
        WebElement penaltyToWave;
        @FindBy(xpath = "//input[contains(@name,'waiverRate.effectiveDate')]")
        WebElement effectiveDate;
        @FindBy(xpath = "//input[contains(@name,'waiverRate.expiryDate')]")
        WebElement expiryDate;
        @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Save')]")
        WebElement saveRate;

        public CreateWaiverRate(WebDriver driver){
        PageFactory.initElements(driver,this);}
        public WebElement getInterestManagement(){return ehandler.findClickable(interestManagement);}
        public WebElement getWaivers(){return ehandler.findClickable(waivers);}
        public WebElement getWaiverRates(){return ehandler.findClickable(waiverRates);}
        public WebElement getCreateNewRate(){return ehandler.findClickable(createNewRate);}
        public WebElement getInterestToWave(){return ehandler.findClickable(interestToWave);}
        public WebElement getPenaltyToWave(){return ehandler.findClickable(penaltyToWave);}
        public WebElement getEffectiveDate(){return ehandler.findClickable(effectiveDate);}
        public WebElement getExpiryDate(){return ehandler.findClickable(expiryDate);}
        public WebElement getSaveRate(){return ehandler.findClickable(saveRate);}



}
