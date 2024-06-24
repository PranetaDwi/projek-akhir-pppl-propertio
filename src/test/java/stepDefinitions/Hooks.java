package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.example.ExtentReportManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    static WebDriver driver;

    static ExtentReports extent;

    static ExtentTest test;

    @Before
    public void setUp(){
        if (driver == null){
            extent = ExtentReportManager.getInstance();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    @After
    public void tearDown() {
        if (Hooks.driver != null) {
            Hooks.driver.quit();
            Hooks.driver = null;
        }
        if (extent != null) {
            extent.flush();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) new Hooks().setUp();
        return driver;
    }

    public static ExtentTest startTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }

    public static ExtentTest getTest() {
        return test;
    }
}
