package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.ManualUpdateProjectPage;
import org.junit.Assert;
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
        manualUpdateProjectPage.enterBuyer("Arelia Neta");
        manualUpdateProjectPage.enterAddress("Jalan Magenang, Surakarta, Indonesia");
        manualUpdateProjectPage.enterBuyerPhone("6298746756123");
        Thread.sleep(3000);
        manualUpdateProjectPage.clickSimpanButton();
        Hooks.updateProjectTest.log(Status.PASS, "Developer mengisi formulir dengan data lengkap");
    }

    @And("Developer mengisi formulir dengan ada data kosong")
    public void Developer_mengisi_formulir_dengan_ada_data_kosong() throws InterruptedException{
        manualUpdateProjectPage.enterBuyer("");
        manualUpdateProjectPage.enterAddress("Jalan Magenang, Surakarta, Indonesia");
        manualUpdateProjectPage.enterBuyerPhone("6298746756123");
        Thread.sleep(3000);
        manualUpdateProjectPage.clickSimpanButton();
        Hooks.negativeUpdateProjectTest.log(Status.INFO, "Developer mengisi formulir dengan ada data kosong");
    }

    @Then("Developer diarahkan ke halaman update")
    public void Developer_diarahkan_ke_halaman_update() throws InterruptedException{
        String expectedUrl = "https://beta.propertio.id/project-progress/edit/11?";
        Thread.sleep(3000);
        Assert.assertEquals(manualUpdateProjectPage.getActualUrl(), expectedUrl);
        Hooks.negativeUpdateProjectTest.log(Status.PASS, "Developer diarahkan ke halaman update");
    }
}
