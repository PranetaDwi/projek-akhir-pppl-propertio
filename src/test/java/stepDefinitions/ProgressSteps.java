package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ProgressPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProgressSteps {
    WebDriver driver;

    ProgressPage progressPage;
    public ProgressSteps(){
        this.driver = Hooks.getDriver();
        this.progressPage = new ProgressPage(driver);
    }

    @Then("Developer diarahkan ke halaman progres")
    public void Developer_diarahkan_ke_halaman_progres() throws InterruptedException {
            String expectedUrl = "https://beta.propertio.id/project-progress/progress/9";
            Thread.sleep(2000);
            Assert.assertEquals(progressPage.getActualUrl(), expectedUrl);
    }

    @Then("Developer diarahkan ke halaman progres dan alamat proyek")
    public void Developer_diarahkan_ke_halaman_progres_dan_alamat_proyek() throws InterruptedException {
        String expectedUrl = "https://beta.propertio.id/project-progress/progress/9?";
        Thread.sleep(2000);
        progressPage.isDetailProjectDisplayed();
        Assert.assertEquals(progressPage.getActualUrl(), expectedUrl);
    }

    @When("Developer mengeklik button tambah progress")
    public void Developer_mengeklik_button_tambah_progress() throws InterruptedException {
        progressPage.clickAddProgressButton();
    }

}
