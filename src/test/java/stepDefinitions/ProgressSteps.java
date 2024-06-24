package stepDefinitions;

import io.cucumber.java.en.Then;
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
}
