package Tests.demandLetterManagementTests;

import Tests.LoginTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.demandLetterManagement.CertifySDL;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CertifySDLTest extends BaseClass {
    @Test(priority = 9, description = "Process of certifying and Aprroving SDL")
    @Severity(SeverityLevel.CRITICAL)

    public void certifySDL() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        CertifySDL certifySDL = new CertifySDL(driver);
        certifySDL.getDemandLettersManagement().click();
        certifySDL.getsDL().click();
        certifySDL.getSelectSDL().click();
        certifySDL.getCertification().click();
        certifySDL.getCertify().click();
        certifySDL.getConfirmCertification().click();
        certifySDL.getCertifySDL().click();
        Thread.sleep(4000);
        certifySDL.getCertification().click();
        certifySDL.getApprove().click();
        certifySDL.getConfirmApproval().click();
        certifySDL.getApproveSDL().click();
        certifySDL.getApproveSDLBatch().click();
        Thread.sleep(2000);
        String expectedMessage = "Success!";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);



    }
}
