package configuration.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class WebTestBase {

    public static WebDriver driver;
//    public static String browserName = "chrome";
//    public static String url = "https://www.jcpenney.com/";

    @BeforeTest
    public void setUpAutomation() {
        System.out.println("********** Automation Started **********");
    }
    //    @AfterTest(alwaysRun = true)
    @AfterMethod
    public void tearDownAutomation() {
        driver.close();
        System.out.println("********** Automation End **********");
    }

    @Parameters({"browserName","Url"})
    @BeforeMethod
    public static void setUpChromeBrowser(String browserName,String url) {
        String chromeDriverPath = "../TDD_WebAutomationFrameworkSingleModule_Husna/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //navigate to jcpenny.com
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
    }














}
