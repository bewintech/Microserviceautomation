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
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Winfred
 */
public class CloseInspectionTest extends BaseClass {

    @Test (priority = 3, description = "Closing Inspection Process")
    @Severity(SeverityLevel.CRITICAL)
    public void closeInspection() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        CloseInspection closeInspection = new CloseInspection(driver);
        closeInspection.getInspectionManagement().click();
        closeInspection.getSelectInspection().click();
        closeInspection.getOperations().click();
        closeInspection.getCloseCampaign().click();
        closeInspection.getConfirmClose().click();

        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);





    }
}
