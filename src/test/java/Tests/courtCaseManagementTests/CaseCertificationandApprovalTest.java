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
public class CaseCertificationandApprovalTest extends BaseClass {
    @Test(priority = 19, description = "Process of Certifying a Court Case")
    @Severity(SeverityLevel.CRITICAL)
    public void certifyCourtCase() throws InterruptedException{
        CourtCaseManagementWebElements certifyCourtCase = new CourtCaseManagementWebElements(driver);
        certifyCourtCase.getCourtCaseManagement().click();
        certifyCourtCase. getSelectCase().click();
        certifyCourtCase.getCasecertification().click();
        certifyCourtCase.getCertifyCase().click();
        certifyCourtCase.getConfirmCertification().click();
        // Assertion
        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);
        refreshBrowser();

    }

    @Test(priority = 20, description = "Process of Approving a Court Case")
    @Severity(SeverityLevel.CRITICAL)
    public void approveCourtCase() throws InterruptedException{
        CourtCaseManagementWebElements approveCourtCase = new CourtCaseManagementWebElements(driver);
        approveCourtCase.getCourtCaseManagement().click();
        approveCourtCase.getSelectCase().click();
        approveCourtCase.getCasecertification().click();
        approveCourtCase.getAppoveCase().click();
        approveCourtCase.getConfirmApproval().click();
        // Assertion
        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);
        refreshBrowser();


    }

}
