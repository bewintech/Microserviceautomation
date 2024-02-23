package Tests.paymentPlanManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.paymentPlanManagement.CancelPlan;
import org.systech.compliance.pageobjects.paymentPlanManagement.NewPaymentPlan;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CancelPlanTest extends BaseClass {
    @Test(priority = 16, description = "Process of Canceling a Payment Plan")
    @Severity(SeverityLevel.CRITICAL)
    public void cancelPlan() throws InterruptedException {
        NewPaymentPlan newPaymentPlan = new NewPaymentPlan(driver);
        CancelPlan cancelPlan = new CancelPlan(driver);
        newPaymentPlan.getPaymentPlansManagement().click();
        cancelPlan.getSelectPayment().click();
        newPaymentPlan.getOperations().click();
        cancelPlan.getCancelPlan().click();
        cancelPlan.getConfirmCancel().click();
        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);
    }

        @Test(priority = 17, description = "Process of removing a Payment Plan")
        @Severity(SeverityLevel.CRITICAL)
        public void removePlan() throws InterruptedException{
            NewPaymentPlan newPaymentPlan = new NewPaymentPlan(driver);
            CancelPlan cancelPlan = new CancelPlan(driver);
            newPaymentPlan.getPaymentPlansManagement().click();
            cancelPlan.getSelectPayment().click();
            newPaymentPlan.getOperations().click();
            cancelPlan.getRemovePlan().click();
            cancelPlan.getConfirmCancel().click();
            String expectedMessage = "Success";
            AssertionMethod assertionMethod = new AssertionMethod();
            assertionMethod.assertToastMessage(driver, expectedMessage);

        }


    }


