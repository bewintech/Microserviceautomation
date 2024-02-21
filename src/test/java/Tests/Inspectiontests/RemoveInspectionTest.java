package Tests.Inspectiontests;

import Tests.LoginTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.model.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.CloseInspection;
import org.systech.compliance.pageobjects.inspections.RemoveInspection;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Winfred
 */
public class RemoveInspectionTest extends BaseClass {

    @Test (priority = 4, description = "Process of removing an Inspection or Survey")
    @Severity(SeverityLevel.CRITICAL)

    public void removeInspection() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        RemoveInspection removeInspection = new RemoveInspection(driver);
        CloseInspection closeInspection = new CloseInspection(driver);
        removeInspection.getInspectionManagement().click();
        removeInspection.getSelectInspection().click();
        removeInspection.getOperations().click();
        removeInspection.getCloseCampaign().click();
        removeInspection.getConfirmClose().click();
        Thread.sleep(2000);

        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);

        driver.navigate().refresh();

    }
}
