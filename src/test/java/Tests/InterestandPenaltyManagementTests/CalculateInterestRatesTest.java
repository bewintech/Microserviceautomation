package Tests.InterestandPenaltyManagementTests;

import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.CalculateInterestRates;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CalculateInterestRatesTest extends BaseClass {
    @Test
    public void interestCalculation() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        CalculateInterestRates interestCalculation = new CalculateInterestRates(driver);
        ActionFile actions = new ActionFile();
        interestCalculation.getInterestManagement().click();
        interestCalculation.getInterest().click();
        actions.comboDropDown(interestCalculation.getMonth(), "August");
//        actions.comboDropDown(interestCalculation.getYear(), "2023");
        interestCalculation.getSelectBatch().click();
        interestCalculation.getCalculateInterest().click();
        interestCalculation.getInterestcalcution().click();


    }
}
