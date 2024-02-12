package Tests.Inspectiontests;

import Tests.LoginTest;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.CloseInspection;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CloseInspectionTest extends BaseClass {
    @Test (priority = 3)
    public void closeInspection() throws InterruptedException{
        driver.get(prop.getProperty("url"));

        CloseInspection closeInspection = new CloseInspection(driver);
        closeInspection.getInspectionManagement().click();
        closeInspection.getSelectInspection().click();
        closeInspection.getOperations().click();
        closeInspection.getCloseCampaign().click();
        closeInspection.getConfirmClose().click();
        Thread.sleep(2000);

    }
}
