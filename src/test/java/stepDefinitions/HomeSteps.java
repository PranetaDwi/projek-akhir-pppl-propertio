package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.example.pages.HomePage;

public class HomeSteps {
    WebDriver driver;
    HomePage homePage;

    ExtentTest test;
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
    }

    @When("Developer mengeklik button project progress")
    public void developer_mengeklik_button_project_progress() throws
            InterruptedException{
        homePage.clickProjectProgressButton();
    }

    @After
    public void tearUp() {
        new Hooks().tearDown();
    }
}
