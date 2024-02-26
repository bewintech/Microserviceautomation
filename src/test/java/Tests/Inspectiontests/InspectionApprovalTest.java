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
import org.systech.compliance.pageobjects.inspections.InspectionApproval;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Winfred
 */
public class InspectionApprovalTest extends BaseClass {

    @Test(priority = 2, description = "Process of certifying and approving an inspection")
    @Severity(SeverityLevel.CRITICAL)

    public void inspectionCertifyTest() throws InterruptedException {
//        driver.get(prop.getProperty("url"));
        CloseInspection closeInspection = new CloseInspection(driver);
        InspectionApproval inspectionApproval = new InspectionApproval(driver);
        inspectionApproval.getInspectionManagement().click();
        inspectionApproval.getSelectInspection().click();
        inspectionApproval.getCertification().click();
        inspectionApproval.getCertifyInspection().click();
        inspectionApproval.getCertify().click();
        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);

        refreshBrowser();
    }
     @Test(priority = 3, description = "Process of  approving an inspection")
     @Severity(SeverityLevel.CRITICAL)
             public void inspectionApproval() throws InterruptedException{
         InspectionApproval inspectionApproval = new InspectionApproval(driver);
         inspectionApproval.getInspectionManagement().click();
         inspectionApproval.getSelectInspection().click();
        inspectionApproval.getCertification().click();
        inspectionApproval.getApproveInspection().click();
        inspectionApproval.getConfirmApproval().click();



        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);



    }


}
