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
public class RemoveCaseTest extends BaseClass {
    @Test(priority = 21, description = "Process of Removing a Court Case")
    @Severity(SeverityLevel.CRITICAL)
    public void removeCourtCase() throws InterruptedException{
        CourtCaseManagementWebElements removeCase = new CourtCaseManagementWebElements(driver);
        removeCase.getCourtCaseManagement().click();
        removeCase.getCaseToRemove().click();
        removeCase.getOperations().click();
        removeCase.getRemoveCase().click();
        // Assertion
        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);




    }

}
