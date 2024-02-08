package Tests.Inspectiontests;

import Tests.LoginTest;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.HitTheStreetSurvey;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class HitTheStreetSurveyTest extends LoginTest {
    @Test (priority = 4)
    public void hitTheSurvey() throws InterruptedException{

        HitTheStreetSurvey hitTheSurvey = new HitTheStreetSurvey(driver);
        ActionFile actions  = new ActionFile();
        hitTheSurvey.getInspectionManagement().click();
        hitTheSurvey.getOperations().click();
        hitTheSurvey.getStreetCampaignSurvey().click();
        hitTheSurvey.getInspectionTitle().sendKeys("Automation Hit The Street Survey");
        actions.comboDropDown(hitTheSurvey.getRegion(), "West Region");
        actions.comboDropDown(hitTheSurvey.getSubRegion(), "West west sub region");
        actions.comboDropDown(hitTheSurvey.getZone(), "Western zone 1");
        hitTheSurvey.getDateFrom().sendKeys(actions.generateDateToday());
        hitTheSurvey.getDateTo().sendKeys(actions.generateDateToday());
        hitTheSurvey.getComments().sendKeys("We are testing");
        Thread.sleep(4000);

        hitTheSurvey.getSaveSurvey().click();
        driver.navigate().refresh();









}
}
