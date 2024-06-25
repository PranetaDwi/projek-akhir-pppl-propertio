package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {
    static WebDriver driver;

    static ExtentReports extent;

    static ExtentTest test;

    @BeforeAll
    public static void setupExtentReport() {
        extent = ExtentReportManager.getInstance();
    }

    @Before
    public void setup(Scenario scenario) {
        // Start a new test in ExtentReport for each scenario
        test = extent.createTest(scenario.getName());

        if (driver == null) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        test.log(Status.INFO, "Browser initialized.");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            test.log(Status.FAIL, "Scenario failed");
        } else {
            test.log(Status.PASS, "Scenario passed");
        }

        if (driver != null) {
            driver.quit();
            driver = null;
        }
        test.log(Status.INFO, "Browser closed.");
        extent.flush();
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
