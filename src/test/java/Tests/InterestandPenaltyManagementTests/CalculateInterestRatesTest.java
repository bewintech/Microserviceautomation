package Tests.InterestandPenaltyManagementTests;

import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.model.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.CalculateInterestRates;
import org.systech.compliance.pageobjects.inspections.CloseInspection;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Winfred
 */
public class CalculateInterestRatesTest extends BaseClass {

    @Test(priority = 6, description = "Process of Calculating Interest Rates")
    @Severity(SeverityLevel.CRITICAL)

    public void interestCalculation() throws InterruptedException{
        driver.get(prop.getProperty("url"));
        CloseInspection closeInspection = new CloseInspection(driver);
        CalculateInterestRates interestCalculation = new CalculateInterestRates(driver);
        ActionFile actions = new ActionFile();
        interestCalculation.getInterestManagement().click();
        interestCalculation.getInterest().click();
        actions.comboDropDown(interestCalculation.getMonth(), "November");
        actions.comboDropDown(interestCalculation.getYear(), "2023");
        interestCalculation.getFilter().click();
        Thread.sleep(2000);
        interestCalculation.getSelectBatch().click();
        interestCalculation.getCalculateInterest().click();
        interestCalculation.getInterestcalcution().click();
        Thread.sleep(2000);


        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);







    }
}
