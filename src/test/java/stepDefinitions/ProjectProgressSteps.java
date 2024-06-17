package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.ProjectProgressPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static stepDefinitions.Hooks.extent;

public class ProjectProgressSteps {

    WebDriver driver;

    ProjectProgressPage projectProgressPage;

    public ProjectProgressSteps(){
        this.driver = Hooks.getDriver();
        this.projectProgressPage = new ProjectProgressPage(driver);
    }

    @Then("Developer diarahkan ke halaman project progres")
    public void Developer_diarahkan_ke_halaman_project_progres() throws
            InterruptedException {
        String expectedUrl = "https://beta.propertio.id/project-progress";
        Assert.assertEquals(projectProgressPage.getActualUrlProjectProgress(), expectedUrl);
    }

    @When("Developer mengisi kolom pencarian project progress")
    public void Developer_mengisi_kolom_pencarian_project_progress() throws InterruptedException {
        projectProgressPage.enterProject("12345");
    }

    @Then("Hasil pencarian project progress ditemukan")
    public void Hasil_pencarian_project_progress_ditemukan() throws InterruptedException {
        projectProgressPage.isProjectDisplayed();
    }
}
