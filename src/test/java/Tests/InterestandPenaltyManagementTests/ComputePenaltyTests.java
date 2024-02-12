package Tests.InterestandPenaltyManagementTests;

import Tests.LoginTest;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.ComputePenalty;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class ComputePenaltyTests extends BaseClass {
    @Test (priority = 7)
    public void computePenalty() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        ComputePenalty computePenalty = new ComputePenalty(driver);
        computePenalty.getInterestManagement().click();
        computePenalty.getPenalty().click();
        computePenalty.getSelectBatch().click();
        computePenalty.getPenaltyOperations().click();
        Thread.sleep(3000);
        computePenalty.getComputePenalty().click();
        Thread.sleep(2000);


    }
}
