package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.example.pages.UpdateProgressPage;
import org.openqa.selenium.WebDriver;

public class UpdateProgressSteps {
    WebDriver driver;

    UpdateProgressPage updateProgressPage;

    public UpdateProgressSteps() {
        this.driver = Hooks.getDriver();
        this.updateProgressPage = new UpdateProgressPage(driver);
    }

    @And("Developer mengisi data update valid")
    public void Developer_mengisi_data_persentase_tidak_valid() throws InterruptedException{
        updateProgressPage.enterBriefDescription("Pasang pasak Barudak");
        updateProgressPage.enterDetailDescription("Panas banget panas bingit oanas bingit");
        updateProgressPage.clickSimpanButton();
        Thread.sleep(2000);
        Hooks.updateProgressTest.log(Status.INFO, "Developer mengisi data update valid");
    }



}
