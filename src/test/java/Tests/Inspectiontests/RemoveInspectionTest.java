package Tests.Inspectiontests;

import Tests.LoginTest;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.RemoveInspection;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class RemoveInspectionTest extends BaseClass {
    @Test (priority = 4)
    public void removeInspection() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        RemoveInspection removeInspection = new RemoveInspection(driver);
        removeInspection.getInspectionManagement().click();
        removeInspection.getSelectInspection().click();
        removeInspection.getOperations().click();
        removeInspection.getCloseCampaign().click();
        removeInspection.getConfirmClose().click();
        Thread.sleep(2000);

        driver.navigate().refresh();

    }
}
