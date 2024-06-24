package stepDefinitions;

import io.cucumber.java.en.And;
import org.example.pages.ManualUpdateProjectPage;
import org.openqa.selenium.WebDriver;

public class ManualUpdateProjectSteps {
    WebDriver driver;

    ManualUpdateProjectPage manualUpdateProjectPage;

    public ManualUpdateProjectSteps() {
        this.driver = Hooks.getDriver();
        this.manualUpdateProjectPage = new ManualUpdateProjectPage(driver);
    }

    @And("Developer mengisi formulir dengan data lengkap")
    public void Developer_mengisi_formulir_dengan_data_lengkap() throws InterruptedException{
        manualUpdateProjectPage.enterTitle("Rumah Makan Neta");
        manualUpdateProjectPage.enterBuyer("Arelia Neta");
        manualUpdateProjectPage.enterAddress("Jalan Magenang, Surakarta, Indonesia");
        manualUpdateProjectPage.enterBuyerPhone("6298746756123");
        Thread.sleep(3000);
        manualUpdateProjectPage.clickSimpanButton();
    }
}
