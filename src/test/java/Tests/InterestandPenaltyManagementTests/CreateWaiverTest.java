package Tests.InterestandPenaltyManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.CreateWaiverRate;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CreateWaiverTest extends BaseClass {
    @Test (priority = 10, description = "Process of creating waiver rates")
    @Severity(SeverityLevel.CRITICAL)

    public void createWaiverTest() throws InterruptedException{
//        driver.get(prop.getProperty("url"));

        CreateWaiverRate  createWaiverRate = new CreateWaiverRate(driver);
        ActionFile actions = new ActionFile();
        createWaiverRate.getInterestManagement().click();
        createWaiverRate.getWaivers().click();
        createWaiverRate.getWaiverRates().click();
        createWaiverRate.getCreateNewRate().click();
        createWaiverRate.getInterestToWave().sendKeys("30");
        createWaiverRate.getPenaltyToWave().sendKeys("25");
        createWaiverRate.getEffectiveDate().sendKeys(actions.generateDateToday());
        createWaiverRate.getExpiryDate().sendKeys("06/06/2024");
        Thread.sleep(4000);
        createWaiverRate.getSaveRate().click();
        Thread.sleep(2000);
        String expectedMessage = "Success!";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);
        refreshBrowser();



    }
}
