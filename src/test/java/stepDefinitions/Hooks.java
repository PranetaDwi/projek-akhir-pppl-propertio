package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class Hooks {
    static WebDriver driver;

    static ExtentReports extent;

    static ExtentTest loginTest;

    static ExtentTest searchUserTest;

    static ExtentTest searchProjectTest;

    static ExtentTest addManualProjectTest;

    static ExtentTest negativeAddManualProjectTest;

    static ExtentTest updateProjectTest;

    static ExtentTest deleteProjectTest;

    static ExtentTest negativeUpdateProjectTest;

    static ExtentTest addProgressTest;

    static ExtentTest negativeAddProgressTest;

    static ExtentTest updateProgressTest;

    static ExtentTest openFormulirCreateManualProjectTest;

    static ExtentTest openProgressPageTest;

    @BeforeAll
    static void setupDriver() {
        extent = ExtentReportManager.getInstance();
        if (driver != null) {
            return;
        }
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        loginTest = extent.createTest("Tes Login");
        searchUserTest = extent.createTest("Tes Pencarian User");
        searchProjectTest = extent.createTest("Tes Pencarian Projek ");
        openFormulirCreateManualProjectTest = extent.createTest("Tes Sampe halaman depan");
        addManualProjectTest = extent.createTest("Tes Menambahkan Proyek Manual");
        updateProjectTest = extent.createTest("Tes Update Proyek Manual");
        deleteProjectTest = extent.createTest("Tes Menghapus Proyek");
        negativeAddManualProjectTest = extent.createTest("Tes Menambah Proyek Negatif");
        negativeUpdateProjectTest = extent.createTest("Tes Update Proyek Manual Negatif");
        addProgressTest = extent.createTest("Tes Menambah Progress");
        updateProgressTest = extent.createTest("Tes Mengupdate Progress");
        openProgressPageTest = extent.createTest("Tes Membuka halaman yang bener.");
        negativeAddProgressTest = extent.createTest("Test Manambah Progres Negatif");
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setupDriver();
        }
        return driver;
    }

    @AfterAll
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }

        loginTest.log(Status.INFO, "Close browser");
        searchUserTest.log(Status.INFO, "Close browser");
        searchProjectTest.log(Status.INFO, "Close browser");
        addManualProjectTest.log(Status.INFO, "Close browser");
        updateProjectTest.log(Status.INFO, "Close browser");
        deleteProjectTest.log(Status.INFO, "Close browser");
        negativeAddManualProjectTest.log(Status.INFO, "Close browser");
        negativeUpdateProjectTest.log(Status.INFO, "Close browser");
        extent.flush();
    }


}
