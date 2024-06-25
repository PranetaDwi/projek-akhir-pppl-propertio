package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
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
        Hooks.loginTest.log(Status.PASS, "Developer diarahkan ke halaman project progres");
        Hooks.addManualProjectTest.log(Status.PASS, "Developer diarahkan ke halaman project progres");
    }

    @When("Developer mengisi kolom pencarian project progress")
    public void Developer_mengisi_kolom_pencarian_project_progress() throws InterruptedException {
        projectProgressPage.enterProject("projek 12345");
        Hooks.searchProjectTest.log(Status.INFO, "Developer mengisi kolom pencarian project progress");
    }

    @Then("Hasil pencarian project progress ditemukan")
    public void Hasil_pencarian_project_progress_ditemukan() throws InterruptedException {
        projectProgressPage.isProjectDisplayed();
        Hooks.searchProjectTest.log(Status.PASS, "Hasil pencarian project progress ditemukan");
    }

    @When("Developer mengeklik button tambah projek progres")
    public void Developer_mengeklik_button_tambah_projek_progress() throws InterruptedException {
        projectProgressPage.getCreateProjectProgressButton();
        Hooks.searchUserTest.log(Status.INFO, "Developer mengeklik button tambah projek progres");
    }

    @And("Developer mengisi kolom pencarian user")
    public void Developer_mengisi_kolom_pencarian_user() throws InterruptedException {
        projectProgressPage.enterUser("userProperti");
        Hooks.searchUserTest.log(Status.INFO, "Developer mengisi kolom pencarian user");
    }

    @Then("Hasil pencarian user ditemukan")
    public void Then_Hasil_pencarian_user_ditemukan() throws InterruptedException {
        projectProgressPage.isUserExist();
        Hooks.searchUserTest.log(Status.PASS, "Hasil pencarian user ditemukan");
    }

    @When("User klik button Pilih Pembeli")
    public void User_klik_button_Pilih_Pembeli() throws InterruptedException {
        projectProgressPage.getPilihPembeliButton();
        Hooks.addManualProjectTest.log(Status.INFO, "User klik button Pilih Pembeli");
        Hooks.negativeAddManualProjectTest.log(Status.INFO, "User klik button Pilih Pembeli");
    }

    @When("Developer klik button hapus proyek")
    public void Developer_klik_button_hapus_proyek() throws InterruptedException {
        projectProgressPage.deleteProject();
        Hooks.deleteProjectTest.log(Status.INFO, "Developer klik button hapus proyek\"");
    }

    @And("Developer mengeklik ya hapus pada modal")
    public void Developer_mengeklik_ya_hapus_pada_modal() throws InterruptedException {
        projectProgressPage.YesValidationToDeleteProject();
        Hooks.deleteProjectTest.log(Status.INFO, "Developer mengeklik ya hapus pada modal\"");
    }

    @Then("Sistem menghapus proyek yang dipilih")
    public void Sistem_menghapus_proyek_yang_dipilih() throws InterruptedException {
        Assert.assertFalse(projectProgressPage.isDeletedProjectDisplayed());
        Hooks.deleteProjectTest.log(Status.INFO, "Sistem menghapus proyek yang dipilih");
    }

    @When("User klik button edit proyek")
    public void User_klik_button_edit_proyek() throws InterruptedException {
        projectProgressPage.clickEditProyekButton();
        Hooks.updateProjectTest.log(Status.INFO, "User klik button edit proyek");
        Hooks.negativeUpdateProjectTest.log(Status.INFO, "User klik button edit proyek");
    }

    @Then("Developer mengeklik button lihat progress")
    public void Developer_mengeklik_button_lihat_progress() throws InterruptedException {
        projectProgressPage.clickProgressProyekButton();
        Hooks.openProgressPageTest.log(Status.INFO, "Developer mengeklik button lihat progress");
    }

}
