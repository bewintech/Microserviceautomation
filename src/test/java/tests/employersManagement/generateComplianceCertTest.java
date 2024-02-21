package tests.employersManagement;

import Tests.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.employers.generateComplianceCertPage;
import org.testng.annotations.Test;

public class generateComplianceCertTest extends LoginTest {
    @Test(priority = 1)
    public void generateComplianceCert() throws InterruptedException{
        generateComplianceCertPage generateComplianceCert = new generateComplianceCertPage(driver);
        ActionFile actionFile = new ActionFile();

        Thread.sleep(3000);
        generateComplianceCert.getEmployerCard().click();
       // generateComplianceCert.getSearchName().sendKeys("City Bank");
        Thread.sleep(3000);
        generateComplianceCert.getSelectEmployer().click();
        Thread.sleep(3000);
        generateComplianceCert.getShowComplianceBreakdownBtn().click();
        generateComplianceCert.getComplianceCertificationTab().click();
        generateComplianceCert.getSelectCertificate().click();
        generateComplianceCert.getGenerateCertBtn().click();
        generateComplianceCert.getCalendarBtn().click();
        generateComplianceCert.getSelectTodayBtn().click();
        generateComplianceCert.getSaveBtn().click();
        //Thread.sleep(5000);
//        webs.waitClickable(generateComplianceCert.getConfirmDirectorCertifyBtn()).click();
//        generateComplianceCert.getConfirmDirectorCertifyBtn().click();
//        generateComplianceCert.getCertifyDirectorCertify().click();
//        generateComplianceCert.getOfficerApprovalBtn().click();
//        generateComplianceCert.getConfirmApproval().click();

    }

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
