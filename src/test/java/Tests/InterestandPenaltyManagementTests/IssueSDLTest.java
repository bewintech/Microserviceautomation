package Tests.InterestandPenaltyManagementTests;

import Tests.LoginTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.CalculateInterestRates;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.IssueSDL;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class IssueSDLTest extends BaseClass {
    @Test(priority = 8, description = "Process of Issuing SDL")
    @Severity(SeverityLevel.CRITICAL)
    public void issueSDL() throws InterruptedException{
//        driver.get(prop.getProperty("url"));

        IssueSDL issueSDL = new IssueSDL(driver);
        CalculateInterestRates rates = new CalculateInterestRates(driver);
        ActionFile actions = new ActionFile();
        rates.getInterestManagement().click();
        rates.getInterest().click();
        actions.comboDropDown(rates.getMonth(), "November");
        actions.comboDropDown(rates.getYear(),"2023");
        rates.getFilter().click();
        Thread.sleep(4000);
       issueSDL.getSelectBatch().click();
        issueSDL.getReducer().click();

        issueSDL.getGenerateSDL().click();
        Thread.sleep(2000);
        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);
        refreshBrowser();



    }
}
