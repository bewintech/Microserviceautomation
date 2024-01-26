package tests;

import org.systech.compliance.base.BaseClass;
import org.systech.compliance.pages.LoginPage;
import org.systech.compliance.utils.DataProviders.ReadXlsxData;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseClass {

    @Test(dataProvider = "login", dataProviderClass = ReadXlsxData.class)

    public void login(String uname, String password) throws InterruptedException {
        driver.get(prop.getProperty("url"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.myuserName().sendKeys(uname);
        loginPage.myPasswordMethod().sendKeys(password);

        loginPage.myLoginButton().click();

    }


}
