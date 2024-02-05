package Tests.InterestandPenaltyManagementTests;

import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.CreateWaiverRate;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CreateWaiverTest extends BaseClass {
    @Test (priority = 7)
    public void createWaiverTest() throws InterruptedException{
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
        createWaiverRate.getSaveRate().click();

    }
}
