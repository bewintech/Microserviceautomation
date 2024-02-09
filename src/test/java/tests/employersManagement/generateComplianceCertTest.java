package tests.employersManagement;

import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.employers.generateComplianceCertPage;
import org.testng.annotations.Test;

public class generateComplianceCertTest extends BaseClass {
    @Test
    public void generateComplianceCert() throws InterruptedException{
        generateComplianceCertPage generateComplianceCert = new generateComplianceCertPage(driver);

        generateComplianceCert.getEmployerCard().click();
       // generateComplianceCert.getSearchName().sendKeys("City Bank");
        generateComplianceCert.getSelectEmployer().click();
        generateComplianceCert.getShowComplianceBreakdownBtn().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();
//        generateComplianceCert.getEmployerCard().click();



    }
}
