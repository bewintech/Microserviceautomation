package Tests.InterestandPenaltyManagementTests;

import Tests.LoginTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.model.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.ComputePenalty;
import org.systech.compliance.pageobjects.inspections.CloseInspection;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Winfred
 */
public class ComputePenaltyTests extends BaseClass {

    @Test(priority = 9, description = "Process of computing penalty")
    @Severity(SeverityLevel.CRITICAL)

    public void computePenalty() throws InterruptedException {
//        driver.get(prop.getProperty("url"));
        CloseInspection closeInspection = new CloseInspection(driver);
        ComputePenalty computePenalty = new ComputePenalty(driver);
        computePenalty.getInterestManagement().click();
        computePenalty.getPenalty().click();
        computePenalty.getSelectBatch().click();
        computePenalty.getPenaltyOperations().click();
        Thread.sleep(3000);
        computePenalty.getComputePenalty().click();
        Thread.sleep(2000);

        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);
        refreshBrowser();




    }
}
