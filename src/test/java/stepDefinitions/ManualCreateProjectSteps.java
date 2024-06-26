package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.example.pages.ManualCreateProjectPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ManualCreateProjectSteps {
    WebDriver driver;

    ManualCreateProjectPage manualCreateProjectPage;

    public ManualCreateProjectSteps() {
        this.driver = Hooks.getDriver();
        this.manualCreateProjectPage = new ManualCreateProjectPage(driver);
    }

    @Then("Developer di halaman formulir tambah projek manual")
    public void Developer_di_halaman_formulir_tambah_projek_manual() throws
            InterruptedException {
        manualCreateProjectPage.isTitleExist();
        String expectedUrl = "https://beta.propertio.id/project-progress/create/5?";
        Assert.assertEquals(manualCreateProjectPage.getActualUrl(), expectedUrl);
        Hooks.addManualProjectTest.log(Status.INFO, "Developer di halaman formulir tambah projek manual");
    }

    @And("Developer mengisi formulir tambah proyek")
    public void Developer_mengisi_formulir_tambah_proyek() throws InterruptedException{
        manualCreateProjectPage.enterTitle("Sangat baik");
        manualCreateProjectPage.enterPrice("500000");
        manualCreateProjectPage.enterAddress("Kulon Progo");
        manualCreateProjectPage.clickProvinceDropdown();
        manualCreateProjectPage.selectProvinceFromDropdown();
        manualCreateProjectPage.clickCityropdown();
        manualCreateProjectPage.selectCityFromDropdown();
        manualCreateProjectPage.clickDiscrictDropdown();
        manualCreateProjectPage.selectDistrictFromDropdown();
        manualCreateProjectPage.enterProjectStartDate("24/12/2024");
        manualCreateProjectPage.enterProjectEndDate("30/12/2025");
        Thread.sleep(500);
        manualCreateProjectPage.clickSimpanButton();
        Hooks.addManualProjectTest.log(Status.INFO, "Developer mengisi formulir tambah proyek");
    }

    @Then("Developer mengisi formulir tambah proyek tanpa mengisi nama projek progres")
    public void Developer_mengisi_formulir_tambah_proyek_tanpa_mengisi_nama_projek_progres() throws InterruptedException {
        manualCreateProjectPage.enterPrice("85060001");
        manualCreateProjectPage.enterAddress("Solo");
        manualCreateProjectPage.clickProvinceDropdown();
        manualCreateProjectPage.selectProvinceFromDropdown();
        manualCreateProjectPage.clickCityropdown();
        manualCreateProjectPage.selectCityFromDropdown();
        manualCreateProjectPage.clickDiscrictDropdown();
        manualCreateProjectPage.selectDistrictFromDropdown();
        manualCreateProjectPage.enterProjectStartDate("10/11/2024");
        manualCreateProjectPage.enterProjectEndDate("30/12/2025");
        Thread.sleep(500);
        manualCreateProjectPage.clickSimpanButton();
        Hooks.negativeAddManualProjectTest.log(Status.INFO, "Developer mengisi formulir tambah proyek tanpa mengisi nama projek progres");
    }

    @Then("Developer tetap di halaman projek progres")
    public void Developer_tetap_di_halaman_projek_progres() throws InterruptedException {
        String expectedUrl = "https://beta.propertio.id/project-progress/create/5?";
        Assert.assertEquals(manualCreateProjectPage.getActualUrl(), expectedUrl);
        Hooks.negativeAddManualProjectTest.log(Status.INFO, "Developer tetap di halaman projek progres");
    }

}
