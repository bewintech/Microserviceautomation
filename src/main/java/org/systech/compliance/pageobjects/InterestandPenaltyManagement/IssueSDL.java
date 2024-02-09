package org.systech.compliance.pageobjects.InterestandPenaltyManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class IssueSDL extends BaseClass {
    @FindBy(xpath = "//span[contains(@class,'x-btn-icon-el x-btn-icon-el-default-small x-fa fa-bars ')]")
    WebElement reducer;
    @FindBy(xpath = "//b[contains(.,'Generate Soft Demand Letter')]")
    WebElement generateSDL;
    @
    FindBy(xpath = "(//span[contains(.,'Active')])[2]")
    WebElement selectBatch;
    public IssueSDL(WebDriver driver){
        PageFactory.initElements(driver,this);}
    public WebElement getReducer(){return ehandler.findClickable(reducer);}
    public WebElement getGenerateSDL(){return ehandler.findClickable(generateSDL);}
    public WebElement getSelectBatch(){return ehandler.findClickable(selectBatch);}

}
