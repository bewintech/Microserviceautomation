package org.systech.compliance.base;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.systech.compliance.pageobjects.LoginPage;
import org.systech.compliance.utils.DataProviders.ReadFile;
import org.systech.compliance.utils.DataProviders.ReadXlsxData;
import org.systech.compliance.utils.ExceptionHandlerFile;
import org.systech.compliance.utils.Methods;
import org.systech.compliance.utils.WaitWebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class BaseClass {

    public static WebDriver driver;
    public static ReadFile file1 = new ReadFile();
    public static Properties prop=new Properties();
    public static WaitWebElement webs=new WaitWebElement(driver);
    public static ExceptionHandlerFile ehandler=new ExceptionHandlerFile();

    public static List<WebElement> clickableElements=new ArrayList<>();


    public static Logger logger= LogManager.getLogger(BaseClass.class.getName());

    public static Faker faker = new Faker();
    public static Methods methods=new Methods();
    public static String result;

    @BeforeSuite
    public void setUp() throws IOException, InterruptedException {

        if (driver == null) {
            FileInputStream fr=file1.reads("src/main/resources/configs.properties");
            Thread.sleep(50);
            prop.load(fr);
        }
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");



        WebDriverManager.chromedriver().cachePath("Drivers").setup(); // DRIVER ALREADY SET GLOBALLY USING WEBDRIVER MANAGER
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if (browserName.equals("Chrome")) {
//          `1  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); // NO NEED OF THIS
            driver = new ChromeDriver(options);
            System.out.println("Chrome driver");
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.contains("edge")) {
            driver = new EdgeDriver();
            System.out.println("Edge driver");
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }
//        login("Wamuyu","Admin@123");
        System.out.println("before test");
        logger.info("before test");
    }
    public void refreshBrowser() {
        // Implement browser refresh logic here
        driver.navigate().refresh();
    }



//   @BeforeClass
//    @Test(dataProvider = "login", dataProviderClass = ReadXlsxData .class, priority = 0)

//    public void login(String uname, String password) throws InterruptedException {
//        driver.get(prop.getProperty("url"));
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.myuserName().sendKeys(uname);
//        loginPage.myPasswordMethod().sendKeys(password);
//
//        loginPage.myLoginButton().click();
//
//    }
//    public void loadUrl(){
//        try{
////            driver.get("http://localhost:8080/Xe/");
//            driver.get(prop.getProperty("url"));
//            System.out.println(prop.getProperty("url"));
//
//        }catch(Exception e){
//            logger.error(e.getMessage());
//        }
//    }


//    @AfterSuite
//    public void tearDown() {
//      driver.quit();
//    }
}