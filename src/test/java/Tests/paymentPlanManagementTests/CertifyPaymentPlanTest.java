package Tests.paymentPlanManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.paymentPlanManagement.CertifyPaymentPlan;
import org.systech.compliance.pageobjects.paymentPlanManagement.NewPaymentPlan;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CertifyPaymentPlanTest extends BaseClass {
    @Test(priority = 15, description = "Process of Certifying and Approving a Payment Plan")
    @Severity(SeverityLevel.CRITICAL)

    public void certifyPaymentPlan() throws InterruptedException{
        CertifyPaymentPlan certifyPaymentPlan = new CertifyPaymentPlan(driver);
        NewPaymentPlan newPaymentPlan = new NewPaymentPlan(driver);
        newPaymentPlan.getPaymentPlansManagement().click();
        certifyPaymentPlan.getSelectPayment().click();
        certifyPaymentPlan.getCetification().click();
        certifyPaymentPlan.getCertify().click();
        certifyPaymentPlan.getConfirmCertification().click();
        Thread.sleep(4000);
        certifyPaymentPlan.getCetification().click();

        certifyPaymentPlan.getApprove().click();
        certifyPaymentPlan.getConfirmApproval().click();
        // assertion
        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);

    }



}
