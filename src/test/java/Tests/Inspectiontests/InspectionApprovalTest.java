package Tests.Inspectiontests;

import Tests.LoginTest;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.InspectionApproval;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class InspectionApprovalTest extends LoginTest {
    @Test
    public void inspectionApprovalTest() throws InterruptedException {

        InspectionApproval inspectionApproval = new InspectionApproval(driver);
        inspectionApproval.getInspectionManagement().click();
        inspectionApproval.getSelectInspection().click();
        inspectionApproval.getCertification().click();
        inspectionApproval.getCertifyInspection().click();
        inspectionApproval.getCertify().click();
        Thread.sleep(6000);
        inspectionApproval.getCertification().click();
        inspectionApproval.getApproveInspection().click();
        inspectionApproval.getCertify().click();
        Thread.sleep(6000);

        refreshBrowser();

    }


}
