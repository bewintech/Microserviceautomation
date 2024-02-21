package Tests.demandLetterManagementTests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.demandLetterManagement.CertifySDL;
import org.systech.compliance.pageobjects.demandLetterManagement.GenerateHDL;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class GenerateHDLTest extends BaseClass {
    @Test(priority = 11, description = "Process of generating harsh demand letter")
    @Severity(SeverityLevel.CRITICAL)

    public void generateHDL() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        CertifySDL certifySDL = new CertifySDL(driver);
        GenerateHDL generateHDL = new GenerateHDL(driver);
        certifySDL.getDemandLettersManagement().click();
        certifySDL.getsDL().click();
        certifySDL.getSelectSDL().click();
        generateHDL.getEscalateHDL().click();
        generateHDL.getConfirmEscalate().click();
        generateHDL.getEscalateSDLBatch().click();
        String expectedMessage = "Success!";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);



    }
}
