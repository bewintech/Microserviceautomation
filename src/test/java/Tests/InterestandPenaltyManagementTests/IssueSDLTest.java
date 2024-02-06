package Tests.InterestandPenaltyManagementTests;

import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.CalculateInterestRates;
import org.systech.compliance.pageobjects.InterestandPenaltyManagement.IssueSDL;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class IssueSDLTest extends BaseClass {
    @Test
    public void issueSDL() throws InterruptedException{
        IssueSDL issueSDL = new IssueSDL(driver);
        CalculateInterestRates rates = new CalculateInterestRates(driver);
        ActionFile actions = new ActionFile();
        rates.getInterestManagement().click();
        rates.getInterest().click();
        actions.comboDropDown(rates.getMonth(), "August");
        Thread.sleep(4000);
       issueSDL.getSelectBatch().click();
        issueSDL.getReducer().click();

        issueSDL.getGenerateSDL().click();

    }
}
