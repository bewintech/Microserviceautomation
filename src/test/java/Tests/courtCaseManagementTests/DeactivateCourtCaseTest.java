package Tests.courtCaseManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.courtCaseManagement.CourtCaseManagementWebElements;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class DeactivateCourtCaseTest extends BaseClass {
    @Test(priority = 22, description = "Process of Deactivating a Court Case")
    @Severity(SeverityLevel.CRITICAL)
    public void deactivateCourtCase() throws InterruptedException{
        CourtCaseManagementWebElements deactivateCase = new CourtCaseManagementWebElements(driver);
        deactivateCase.getCourtCaseManagement().click();
        deactivateCase.getSelectCaseToDeactivate().click();
        deactivateCase.getOperations().click();
        deactivateCase.getDeactivateCase().click();
        String expectedMessage = "Deactivation Success!";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);
        refreshBrowser();
    }

}
