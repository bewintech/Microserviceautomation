package Tests.courtCaseManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.courtCaseManagement.CourtCaseManagementWebElements;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class NewCaseTest extends BaseClass {
    @Test(priority = 18, description = "Process of Creating a New Court Case")
    @Severity(SeverityLevel.CRITICAL)
    public void newCourtCase() throws InterruptedException{
        CourtCaseManagementWebElements newCourtCase = new CourtCaseManagementWebElements(driver);
        ActionFile actions = new ActionFile();
        newCourtCase.getCourtCaseManagement().click();
        newCourtCase.getOperations().click();
        newCourtCase.getCreateNewCase().click();
        newCourtCase.getFindEmployer().click();
        newCourtCase.getSelectEmployer().click();
        newCourtCase.getGetApplySelectedEmployer().click();
        newCourtCase.getBalance().sendKeys("2443242");
        newCourtCase.getPayment().sendKeys("2424243");
        newCourtCase.getInterest().sendKeys("44443");
        newCourtCase.getPenalty().sendKeys("27847842");
        newCourtCase.getLiability().sendKeys("248329");
        newCourtCase.getTotalLiabity().sendKeys("83,267,244");
        newCourtCase.getComments().sendKeys("Did not honor inspection");
        newCourtCase.getFindInspector().click();
        newCourtCase.getSelectInspector().click();
        newCourtCase.getApplySelectedInspector().click();
        newCourtCase.getTitle().sendKeys("Employer vs Nassit");
        newCourtCase.getDateCreated().sendKeys(actions.generateDateToday());
        newCourtCase.getFromDate().sendKeys("03/03/2020");
        newCourtCase.getToDate().sendKeys("01/01/2022");
        actions.comboDropDown(newCourtCase.getCaseStatus(),"Active");
        newCourtCase.getFindCaseType().click();
        newCourtCase.getSelectCaseType().click();
        newCourtCase.getApplySelectedCasetype().click();
        newCourtCase.getCourtOrder().sendKeys("Case moved to a later date to be announced");
        newCourtCase.getSaveCase().click();
        // Assertion
        String expectedMessage = "Success!";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);





    }

}
