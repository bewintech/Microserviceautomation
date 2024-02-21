package Tests.Inspectiontests;

import Tests.LoginTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.model.Status;
import jdk.jfr.Description;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.systech.compliance.actions.ActionFile;
import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pageobjects.inspections.CreateAnInspection;
import org.systech.compliance.utils.AssertionMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class CreateAnInspectionTest extends BaseClass {

    @Test(priority = 1,  description = "Testing the Process of Creating an inspection")
    @Severity(SeverityLevel.CRITICAL)
    public void createAnInspect() {

        CreateAnInspection createAnInspection = new CreateAnInspection(driver);
        ActionFile actions = new ActionFile();

        // Click on inspection management
        createAnInspection.getInspectionManagement().click();

        // Click on operations
        createAnInspection.getOperations().click();

        // Click on create inspection
        createAnInspection.getCreateInspection().click();

        // Set inspection title
        createAnInspection.getInspectionTitle().sendKeys("Automation Inspection Tests");

        // Select inspector type
        actions.comboDropDown(createAnInspection.getInspectorType(), "Routine Inspection");

        // Find employer
        createAnInspection.getFindEmployer().click();
        createAnInspection.getSelectEmployer().click();
        createAnInspection.getApplySelectedEmployer().click();

        // Find inspector
        createAnInspection.getFindInspector().click();
        createAnInspection.getSelectInspector().click();
        createAnInspection.getApplySelectedInspector().click();

        // Set date of visit
        createAnInspection.getDateOfVisit().sendKeys(actions.generateDateToday());

        // Set inspection description
        createAnInspection.getInspectionDescription().sendKeys("We are automating this Process");

        // Click save inspection
        createAnInspection.getSaveInspection().click();

        String expectedMessage = "Success!";

//        String expectedMessage = "Success";
        AssertionMethod assertionMethod = new AssertionMethod();
        assertionMethod.assertToastMessage(driver, expectedMessage);





    }
}
