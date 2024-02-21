package Tests.demandLetterManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.demandLetterManagement.CertifyHDL;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CertifyHDLTest extends BaseClass {
    @Test(priority = 13, description = "Process of Certifyng and Approving HDL")
    @Severity(SeverityLevel.CRITICAL)

    public void certifyHDL() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        CertifyHDL certifyHDL = new CertifyHDL(driver);
        certifyHDL.getDemandLetterManagement().click();
        certifyHDL.gethDL().click();
        certifyHDL.getSelectHDL().click();
        certifyHDL.getCertification().click();
        certifyHDL.getCertify().click();
        certifyHDL.getConfirmCertification().click();
        certifyHDL.getCertifyHDL().click();
        Thread.sleep(4000);
        certifyHDL.getCertification().click();
        certifyHDL.getApprove().click();
        certifyHDL.getConfirmApproval().click();
        certifyHDL.getApproveHDL().click();
        String expectedMessage = "Success!";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);


    }
}
