package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import org.example.pages.CreateProgressPage;
import org.openqa.selenium.WebDriver;

public class CreateProgressSteps {
    WebDriver driver;

    CreateProgressPage createProgressPage;

    public CreateProgressSteps() {
        this.driver = Hooks.getDriver();
        this.createProgressPage = new CreateProgressPage(driver);
    }

    @And("Developer mengisi data progres valid")
    public void Developer_mengisi_data_progres_valid() throws InterruptedException{
        createProgressPage.enterBriefDescription("Pasang pasak segitiga berumuda");
        createProgressPage.enterDetailDescription("Panas banget panas banget panas banget panas banget");
        createProgressPage.enterPercentage("10");
        Thread.sleep(1000);
        createProgressPage.enterImage("C:\\Users\\ASUS\\Downloads\\exampleImage.jpg");
        Hooks.test.log(Status.INFO, "Developer mengisi data progres valid");
    }
}
