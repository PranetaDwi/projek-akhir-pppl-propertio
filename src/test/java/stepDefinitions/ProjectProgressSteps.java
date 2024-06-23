package stepDefinitions;

import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.ProjectProgressPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static stepDefinitions.Hooks.extent;

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

    // Mencari project
    @When("Developer mengisi kolom pencarian project progress")
    public void Developer_mengisi_kolom_pencarian_project_progress() throws InterruptedException {
        projectProgressPage.enterProject("12345");
    }

    @Then("Hasil pencarian project progress ditemukan")
    public void Hasil_pencarian_project_progress_ditemukan() throws InterruptedException {
        projectProgressPage.isProjectDisplayed();
    }

    // Mencari project negative
    @When("User klik Search bar dan mengetik nama proyek {string}")
    public void user_klik_search_bar_dan_mengetik_nama_proyek(String ProyekSarip) throws InterruptedException {
        projectProgressPage.enterProject("ProyekSarip");
    }
    @Then("Sistem tidak menampilkan list proyek")
    public void sistem_tidak_menampilkan_list_proyek() throws InterruptedException {
        projectProgressPage.isProjectDisplayed();
    }

    // tambahProggresProyek
    // note: kalo di geherkin di tambah ada (" ") itu nanti ngaruh
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

    // Mengisi form
// Mengisi form tambah proyek
    @When("Developer mengisi form tambah proyek")
    public void Developer_mengisi_form_tambah_proyek() throws InterruptedException {
        // Mengisi nama proyek
        String namaProyek = "Pembangunan Gedung Perkantoran ABC";
        projectProgressPage.enterProject(namaProyek);

        // Mengisi harga proyek
        String hargaProyek = "2500000000";
        projectProgressPage.enterHargaProyek(hargaProyek);

        // Mengisi nama pembeli
        String namaPembeli = "Budi Santoso";
        projectProgressPage.enterNamaPembeli(namaPembeli);

        // Mengisi nomor pembeli
        String nomorPembeli = "081234567890";
        projectProgressPage.enterNomorPembeli(nomorPembeli);

        // Mengisi alamat lengkap
        String alamatLengkap = "Jl. Merdeka No. 10, Kelurahan Melati, Kecamatan Sukajadi";
        projectProgressPage.enterAlamatLengkap(alamatLengkap);

        // Mengisi provinsi
        String provinsi = "Jawa Barat";
        projectProgressPage.selectProvinsi(provinsi);

        // Mengisi kota
        String kota = "Bandung";
        projectProgressPage.selectKota(kota);

        // Mengisi kecamatan
        String kecamatan = "Sukajadi";
        projectProgressPage.selectKecamatan(kecamatan);

        // Mengisi status proyek
        String statusProyek = "Sedang Berjalan";
        projectProgressPage.selectStatusProyek(statusProyek);

        // Mengisi tanggal mulai
        String tanggalMulai = "01/01/2024";
        projectProgressPage.enterTanggalMulai(tanggalMulai);

        // Mengisi tanggal akhir
        String tanggalAkhir = "31/12/2024";
        projectProgressPage.enterTanggalAkhir(tanggalAkhir);
    }


    // Click Simpan

    //Edit project (Mengedit proyek yang sudah di buat sebelumnya)

    // Edit project (Mengedit proyek yang sudah dibuat sebelumnya - Positif)
    @When("Developer mengedit proyek dengan menambahkan angka atau ABC pada nama proyek")
    public void Developer_mengedit_proyek_dengan_menambahkan_angka_atau_ABC_pada_nama_proyek() throws InterruptedException {
        // Contoh: Menambahkan angka atau ABC pada nama proyek yang ada
        String namaProyekEdit = "Pembangunan Gedung Perkantoran ABC 123";
        projectProgressPage.editNamaProyek(namaProyekEdit);
    }

    // Edit project (Mengedit proyek yang sudah dibuat sebelumnya - Negatif)
    @When("Developer mengedit proyek tanpa memasukkan beberapa form seperti nama dan harga")
    public void Developer_mengedit_proyek_tanpa_memasukkan_beberapa_form_seperti_nama_dan_harga() throws InterruptedException {
        // Contoh: Mengedit proyek tanpa mengisi nama proyek dan harga
        projectProgressPage.editProyekTanpaNamaDanHarga();
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
