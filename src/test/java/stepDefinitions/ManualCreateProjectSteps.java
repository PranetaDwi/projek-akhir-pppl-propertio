package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.example.pages.ManualCreateProjectPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ManualCreateProjectSteps {
    WebDriver driver;

    ManualCreateProjectPage manualCreateProjectPage;

    public ManualCreateProjectSteps(WebDriver driver) {
        this.driver = driver;
        this.manualCreateProjectPage = new ManualCreateProjectPage(driver);
    }

    @Then("Developer di halaman formulir tambah projek manual")
    public void Developer_di_halaman_formulir_tambah_projek_manual() throws
            InterruptedException {
        manualCreateProjectPage.isOldBuyerNameAttached();
        String expectedUrl = "https://beta.propertio.id/project-progress/create/5?";
        Assert.assertEquals(manualCreateProjectPage.getActualUrl(), expectedUrl);
    }

    @And("Developer mengisi formulir tambah proyek")
    public void Developer_mengisi_formulir_tambah_proyek() throws InterruptedException{
        manualCreateProjectPage.enterTitle("abc");
        manualCreateProjectPage.enterPrice("50000000");
        manualCreateProjectPage.enterAddress("JALAN SENTOLO BROSOT");
        manualCreateProjectPage.enterProvince("D.I. YOGYAKARTA");
        manualCreateProjectPage.enterCity("KULON PROGO");
        manualCreateProjectPage.clickSimpanButton();
    }

}
