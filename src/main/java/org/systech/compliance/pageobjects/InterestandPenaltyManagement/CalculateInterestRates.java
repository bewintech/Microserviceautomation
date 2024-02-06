package org.systech.compliance.pageobjects.InterestandPenaltyManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class CalculateInterestRates extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Interest/Penalties Management')]")
    WebElement interestManagement;
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Interests')]")
    WebElement interest;
    @FindBy(xpath = "//input[contains(@name,'month')]")
    WebElement month;
    @FindBy(xpath = "//input[contains(@name,'year')]")
    WebElement year;
    @FindBy(xpath = "(//span[contains(.,'Active')])[1]")
    WebElement selectBatch;
    @FindBy(xpath = "(//b[contains(.,'calculate interest')])[1]")
    WebElement calculateInterest;
    @FindBy(xpath = "//b[contains(.,'calculate interests')]")
    WebElement interestcalcution;

    public CalculateInterestRates(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getInterestManagement(){return ehandler.findClickable(interestManagement);}
    public WebElement getInterest(){return ehandler.findClickable(interest);}
    public WebElement getSelectBatch(){return ehandler.findClickable(selectBatch);}
    public WebElement getMonth(){return ehandler.findClickable(month);}
    public WebElement getYear(){return ehandler.findClickable(year);}
    public WebElement getCalculateInterest(){return ehandler.findClickable(calculateInterest);}
    public WebElement getInterestcalcution(){return ehandler.findClickable(interestcalcution);}


}
