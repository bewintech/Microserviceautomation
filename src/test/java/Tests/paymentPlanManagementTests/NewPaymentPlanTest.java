package Tests.paymentPlanManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.paymentPlanManagement.NewPaymentPlan;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class NewPaymentPlanTest extends BaseClass {
    @Test(priority = 14, description = "Process of Creating a New Payment Plan")
    @Severity(SeverityLevel.CRITICAL)
    public void newPaymentPlan() throws InterruptedException{
        NewPaymentPlan newPaymentPlan = new NewPaymentPlan(driver);
        ActionFile actions = new ActionFile();
        newPaymentPlan.getPaymentPlansManagement().click();
        newPaymentPlan.getOperations().click();
        newPaymentPlan.getCreateNewPlan().click();
        newPaymentPlan.getFindEmployer().click();
        newPaymentPlan.getEmployer().click();
        newPaymentPlan.getApplySelected().click();
        newPaymentPlan.getTotalLiability().sendKeys("100000");
        newPaymentPlan.getStartDate().sendKeys(actions.generateDateToday());
        newPaymentPlan.getPeriodFrom().sendKeys("11/20/2023");
        newPaymentPlan.getPeriodTo().sendKeys("11/30/2023");
        actions.comboDropDown(newPaymentPlan.getFrequency(),"Monthly");
        newPaymentPlan.getInstallmentAmount().sendKeys("12500");
        actions.comboDropDown(newPaymentPlan.getPaymentType(),"Penalty");
        newPaymentPlan.getSearchReceipt().click();
        newPaymentPlan.getReceipt().click();
        newPaymentPlan.getApplyReceipt().click();
        newPaymentPlan.getSave().click();

        String expectedMessage = "Success!";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);


    }

}
