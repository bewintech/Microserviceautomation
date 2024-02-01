package org.systech.compliance.pageobjects.inspections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.systech.compliance.base.BaseClass;

/**
 * @author Winfred
 */
public class HitTheStreetSurvey extends BaseClass {
    @FindBy(xpath = "//div[@class='x-treelist-item-text'][contains(.,'Surveys/Inspections Management')]")
    WebElement inspectionManagement;
    @FindBy(xpath = "(//span[@data-ref='btnInnerEl'][contains(.,'Operations')])[1]")
    WebElement operations;
    @FindBy(xpath = "//b[contains(.,'Street Campaign Survey')]")
    WebElement streetCampaignSurvey;
    @FindBy(xpath = "//input[contains(@name,'inspection.inspectionName')]")
    WebElement inspectionTitle;
    @FindBy(xpath = "//input[contains(@name,'inspection.regionId')]")
    WebElement region;
    @FindBy(xpath = "//input[contains(@name,'inspection.subregionId')]")
    WebElement subRegion;
    @FindBy(xpath = "//input[contains(@name,'inspection.zoneId')]")
    WebElement zone;
    @FindBy(xpath = "//input[contains(@name,'inspection.dateFrom')]")
    WebElement dateFrom;
    @FindBy(xpath = "//input[contains(@name,'inspection.dateTo')]")
    WebElement dateTo;
    @FindBy(xpath = "//textarea[contains(@name,'inspection.description')]")
    WebElement comments;
    @FindBy(xpath = "//span[@data-ref='btnInnerEl'][contains(.,'Save')]")
    WebElement saveSurvey;
    public HitTheStreetSurvey(WebDriver driver){ PageFactory.initElements(driver,this);}

    public WebElement getInspectionManagement(){
        return ehandler.findClickable(inspectionManagement);}
    public WebElement getOperations(){return ehandler.findClickable(operations);}
    public WebElement getInspectionTitle(){return ehandler.findClickable(inspectionTitle);}
    public WebElement getStreetCampaignSurvey(){return ehandler.findClickable(streetCampaignSurvey);}
    public WebElement getRegion(){return ehandler.findClickable(region);}
    public WebElement getSubRegion(){return ehandler.findClickable(subRegion);}
    public WebElement getZone(){return ehandler.findClickable(subRegion);}
    public WebElement getDateFrom(){return ehandler.findClickable(dateFrom);}
    public WebElement getDateTo(){return ehandler.findClickable(dateTo);}
    public WebElement getComments(){return ehandler.findClickable(comments);}
    public WebElement getSaveSurvey(){return ehandler.findClickable(saveSurvey);}





}
