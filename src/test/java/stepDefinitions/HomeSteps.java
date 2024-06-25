package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.example.pages.HomePage;

public class HomeSteps {
    WebDriver driver;
    HomePage homePage;

    public HomeSteps(){
        this.driver = Hooks.getDriver();
        this.homePage = new HomePage(driver);
    }

    @Then("Developer diarahkan ke dashboard")
    public void developer_diarahkan_ke_dashboard() throws
            InterruptedException {
        Thread.sleep(2000);
        String expectedUrl = "https://beta.propertio.id/dashboard";
        Thread.sleep(2000);
        Assert.assertEquals(homePage.getActualUrl(), expectedUrl);
        Hooks.test.log(Status.PASS, "Developer diarahkan ke dashboard");
    }

    @When("Developer mengeklik button project progress")
    public void developer_mengeklik_button_project_progress() throws
            InterruptedException{
        homePage.clickProjectProgressButton();
        Hooks.test.log(Status.INFO, "Developer mengeklik button project progress");
    }

}
