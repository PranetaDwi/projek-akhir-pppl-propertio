package stepDefinitions;

import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.example.pages.ProjectProgressPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
}
