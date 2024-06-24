package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @When("Developer mengisi kolom pencarian project progress")
    public void Developer_mengisi_kolom_pencarian_project_progress() throws InterruptedException {
        projectProgressPage.enterProject("12345");
    }

    @Then("Hasil pencarian project progress ditemukan")
    public void Hasil_pencarian_project_progress_ditemukan() throws InterruptedException {
        projectProgressPage.isProjectDisplayed();
    }

    @When("Developer mengeklik button tambah projek progres")
    public void Developer_mengeklik_button_tambah_projek_progress() throws InterruptedException {
        projectProgressPage.getCreateProjectProgressButton();
    }

    @And("Developer mengisi kolom pencarian user")
    public void Developer_mengisi_kolom_pencarian_user() throws InterruptedException {
        projectProgressPage.enterUser("userProperti");
    }

    @Then("Hasil pencarian user ditemukan")
    public void Then_Hasil_pencarian_user_ditemukan() throws InterruptedException {
        projectProgressPage.isUserExist();
    }

    @When("User klik button Pilih Pembeli")
    public void User_klik_button_Pilih_Pembeli() throws InterruptedException {
        projectProgressPage.getPilihPembeliButton();
    }

    // DELETE PROJECT

    @When("Developer klik button hapus proyek")
    public void Developer_klik_button_hapus_proyek() throws InterruptedException {
        projectProgressPage.deleteProject();
    }

    @And("Developer mengeklik ya hapus pada modal")
    public void Developer_mengeklik_ya_hapus_pada_modal() throws InterruptedException {
        projectProgressPage.YesValidationToDeleteProject();
    }

    @Then("Sistem menghapus proyek yang dipilih")
    public void Sistem_menghapus_proyek_yang_dipilih() throws InterruptedException {
        Assert.assertFalse(projectProgressPage.isDeletedProjectDisplayed());
    }

}
