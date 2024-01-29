package tests;

import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.CreateAnInspection;
import org.testng.annotations.Test;

/**
 * @author Winfred
 */
public class CreateAnInspectionTest extends BaseClass {
    @Test (priority = 1)
public  void createAnInspect() throws InterruptedException{
    CreateAnInspection createAnInspection = new CreateAnInspection(driver);
//        HomePage homePage = new HomePage(driver);
    ActionFile actions = new ActionFile();

   createAnInspection.getInspectionManagement().click();
    createAnInspection.getOperations().click();
    createAnInspection.getCreateInspection().click();
    createAnInspection.getInspectionTitle().sendKeys("Automation Inspection Test");
    actions.comboDropDown(createAnInspection.getInspectorType(), "Routine Inspection");
    createAnInspection.getFindEmployer().click();
    createAnInspection.getSelectEmployer().click();
    createAnInspection.getApplySelectedEmployer().click();
    createAnInspection.getFindInspector().click();
    createAnInspection.getSelectInspector().click();
    createAnInspection.getApplySelectedInspector().click();
    createAnInspection.getDateOfVisit().sendKeys(actions.generateDateToday());
    createAnInspection.getInspectionDescription().sendKeys("We are automating this Process");
    createAnInspection.getSaveInspection().click();


}
}
