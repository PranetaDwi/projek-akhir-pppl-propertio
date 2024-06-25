package stepDefinitions;

import org.example.pages.UpdateProgressPage;
import org.openqa.selenium.WebDriver;

public class UpdateProgressSteps {
    WebDriver driver;

    UpdateProgressPage updateProgressPage;

    public UpdateProgressSteps() {
        this.driver = Hooks.getDriver();
        this.updateProgressPage = new UpdateProgressPage(driver);
    }
}
