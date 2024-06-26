package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
        createProgressPage.enterPercentage("15");
        createProgressPage.clickButtonTelusuriFIle();
        Thread.sleep(10000);
        createProgressPage.clickSimpanButton();
        Hooks.addProgressTest.log(Status.INFO, "Developer mengisi data progres valid");
    }

    @And("Developer mengisi data persentase tidak valid")
    public void Developer_mengisi_data_persentase_tidak_valid() throws InterruptedException{
        createProgressPage.enterBriefDescription("Pasang pasak segitiga berumuda");
        createProgressPage.enterDetailDescription("Panas banget panas banget panas banget panas banget");
        createProgressPage.enterPercentage("5");
        createProgressPage.clickSimpanButton();
        Thread.sleep(2000);
        Hooks.negativeAddProgressTest.log(Status.INFO, "Developer mengisi data progres valid");

    }

    @Then("Muncul pesan error")
    public void Muncul_pesan_error() throws InterruptedException {
        createProgressPage.isErrorDisplayed();
        Thread.sleep(1000);
        Hooks.negativeAddProgressTest.log(Status.PASS, "Muncul pesan error");
    }

}
