package Tests.Inspectiontests;

import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.InspectionApproval;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class InspectionApprovalTest extends BaseClass {
    @Test (priority = 2)
    public void inspectionApprovalTest() throws InterruptedException {
        driver.get(prop.getProperty("url"));

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

        driver.navigate().refresh();
        refreshBrowser();

    }
        private void refreshBrowser() {
            // Implement browser refresh logic here
            driver.navigate().refresh();
        }


}
