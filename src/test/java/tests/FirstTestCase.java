package tests;

import org.systech.compliance.base.BaseTest;
import org.systech.compliance.pages.LoginPage;
import org.testng.annotations.Test;

public class FirstTestCase extends BaseTest {
    @Test
    public void userLogin() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userLogin("admin");
        loginPage.userLogin("Admin@123");


    }
}
