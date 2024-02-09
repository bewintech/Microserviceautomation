package Tests.Inspectiontests;

import Tests.LoginTest;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.RemoveInspection;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class RemoveInspectionTest extends LoginTest {
    @Test (priority = 1)
    public void removeInspection() throws InterruptedException{

        RemoveInspection removeInspection = new RemoveInspection(driver);
        removeInspection.getInspectionManagement().click();
        removeInspection.getSelectInspection().click();
        removeInspection.getOperations().click();
        removeInspection.getCloseCampaign().click();
        removeInspection.getConfirmClose().click();
        driver.navigate().refresh();

    }
}
