package stepDefinitions;

import com.aventstack.extentreports.Status;
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
        String expectedUrl = "https://beta.propertio.id/project-progress/progress/13";
        Thread.sleep(2000);
        Assert.assertEquals(progressPage.getActualUrl(), expectedUrl);
        Hooks.updateProjectTest.log(Status.PASS, "Developer diarahkan ke halaman progres");
        Hooks.updateProgressTest.log(Status.PASS, "Developer diarahkan ke halaman progres");
    }

    @Then("Developer diarahkan ke halaman progres dan alamat proyek")
    public void Developer_diarahkan_ke_halaman_progres_dan_alamat_proyek() throws InterruptedException {
        String expectedUrl = "https://beta.propertio.id/project-progress/progress/9?";
        Thread.sleep(2000);
        progressPage.isDetailProjectDisplayed();
        Assert.assertEquals(progressPage.getActualUrl(), expectedUrl);
        Hooks.openProgressPageTest.log(Status.INFO, "Developer diarahkan ke halaman progres dan alamat proyek");
    }

    @When("Developer mengeklik button tambah progress")
    public void Developer_mengeklik_button_tambah_progress() throws InterruptedException {
        progressPage.clickAddProgressButton();
        Hooks.addProgressTest.log(Status.INFO, "Developer mengeklik button tambah progress");
    }

    @When("Developer mengeklik button ubah detail")
    public void Developer_mengeklik_button_ubah_detail() throws InterruptedException {
        progressPage.clickUpdateProgressaButton();
        Hooks.updateProgressTest.log(Status.INFO, "Developer mengeklik button ubah detail");
    }

}
