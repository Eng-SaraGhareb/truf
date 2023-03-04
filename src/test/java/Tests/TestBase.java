package Tests;

import Utilities.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;




public class TestBase {

    public static WebDriver driver ;
    public static String downloadPath = System.getProperty("user.dir") + "\\Downloads";


    @BeforeSuite
    public void startDriver()
    {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            WebDriverManager.chromedriver().setup();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));


    }

    @AfterSuite
    public void stopDriver()
    {
        driver.quit();
    }

    // take screenshot when test case fail and add it in the Screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result)
    {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(driver, result.getName());
        }
    }
}
