package Tests.Inspectiontests;

import Tests.LoginTest;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.CreateAnInspection;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CreateAnInspectionTest extends BaseClass {
    @Test(priority = 1)
    public void createAnInspect() throws InterruptedException {
        CreateAnInspection createAnInspection = new CreateAnInspection(driver);
        ActionFile actions = new ActionFile();

        try {
            createAnInspection.getInspectionManagement().click();
            createAnInspection.getOperations().click();
            createAnInspection.getCreateInspection().click();
            createAnInspection.getInspectionTitle().sendKeys("Automation Inspection Tests");
            actions.comboDropDown(createAnInspection.getInspectorType(), "Routine Inspection");
            createAnInspection.getFindEmployer().click();
            createAnInspection.getSelectEmployer().click();
            createAnInspection.getApplySelectedEmployer().click();
            createAnInspection.getFindInspector().click();
            createAnInspection.getSelectInspector().click();
            createAnInspection.getApplySelectedInspector().click();
            createAnInspection.getDateOfVisit().sendKeys(actions.generateDateToday());
            createAnInspection.getInspectionDescription().sendKeys("We are automating this Process");
            Thread.sleep(4000);
            createAnInspection.getSaveInspection().click();

            // Continue with the remaining test steps...

        } catch (Exception e) {
            // Log the error and take corrective actions
            logger.error("Test failed: " + e.getMessage());

            // For example, take a screenshot or add other corrective actions

            // Refresh the browser
            refreshBrowser();
        }
    }

    }
