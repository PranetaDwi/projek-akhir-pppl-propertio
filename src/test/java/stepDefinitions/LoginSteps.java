package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.example.pages.LoginPage;

import static stepDefinitions.Hooks.extent;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    ExtentTest test;

    public LoginSteps(){
        this.driver = Hooks.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    @Given("Developer di halaman login")
    public void developer_di_halaman_login() {
        test = extent.createTest("My First Test", "Sample description");
        driver.get("https://beta.propertio.id/login");
    }

    @When("Developer mengisi kredensial valid")
    public void developer_mengisi_kredensial_valid() throws InterruptedException {
        loginPage.enterEmail("developer@mail.com");
        loginPage.enterPassword("11111111");
        loginPage.clickLogin();
    }
}
