package tests.inspectiontests;

import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.CloseInspection;
import org.systech.compliance.pageobjects.inspections.RemoveInspection;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class RemoveInspectionTest extends BaseClass {
    @Test (priority = 5)
    public void removeInspection() throws InterruptedException{
        RemoveInspection removeInspection = new RemoveInspection(driver);
        removeInspection.getInspectionManagement().click();
        removeInspection.getSelectInspection().click();
        removeInspection.getOperations().click();
        removeInspection.getCloseCampaign().click();
        removeInspection.getConfirmClose().click();
    }
}
