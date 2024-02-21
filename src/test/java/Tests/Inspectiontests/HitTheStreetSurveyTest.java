package Tests.Inspectiontests;

import Tests.LoginTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.model.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.CreateAnInspection;
import org.systech.compliance.pageobjects.inspections.HitTheStreetSurvey;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Winfred
 */
public class HitTheStreetSurveyTest extends BaseClass {

    @Test (priority = 5, description = "Testing the Process of creating Hit the Street Survey")
    @Severity(SeverityLevel.CRITICAL)

    public void hitTheSurvey() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        HitTheStreetSurvey hitTheSurvey = new HitTheStreetSurvey(driver);
        CreateAnInspection createAnInspection= new CreateAnInspection(driver);
        ActionFile actions  = new ActionFile();
        Thread.sleep(4000);
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

        String expectedMessage = "Success!";

//        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);




        driver.navigate().refresh();









}
}
