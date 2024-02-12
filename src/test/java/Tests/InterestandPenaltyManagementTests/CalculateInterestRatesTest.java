package Tests.InterestandPenaltyManagementTests;

import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.CalculateInterestRates;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CalculateInterestRatesTest extends BaseClass {
    @Test(priority = 6)
    public void interestCalculation() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        CalculateInterestRates interestCalculation = new CalculateInterestRates(driver);
        ActionFile actions = new ActionFile();
        interestCalculation.getInterestManagement().click();
        interestCalculation.getInterest().click();
        actions.comboDropDown(interestCalculation.getMonth(), "November");
        actions.comboDropDown(interestCalculation.getYear(), "2023");
        interestCalculation.getFilter().click();
        interestCalculation.getSelectBatch().click();
        interestCalculation.getCalculateInterest().click();
        interestCalculation.getInterestcalcution().click();
        Thread.sleep(2000);



    }
}
