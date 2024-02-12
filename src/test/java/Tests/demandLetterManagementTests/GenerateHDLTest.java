package Tests.demandLetterManagementTests;

import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.demandLetterManagement.CertifySDL;
import org.systech.compliance.pageobjects.demandLetterManagement.GenerateHDL;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class GenerateHDLTest extends BaseClass {
    @Test(priority = 11)
    public void generateHDL() throws InterruptedException{
        CertifySDL certifySDL = new CertifySDL(driver);
        GenerateHDL generateHDL = new GenerateHDL(driver);
        certifySDL.getDemandLettersManagement().click();
        certifySDL.getsDL().click();
        certifySDL.getSelectSDL().click();
        generateHDL.getEscalateHDL().click();
        generateHDL.getConfirmEscalate().click();
        generateHDL.getEscalateSDLBatch().click();


    }
}
