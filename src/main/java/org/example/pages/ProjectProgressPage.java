package org.example.pages;

import io.cucumber.java.sl.In;
import org.example.objects.LoginObject;
import org.example.objects.ProjectProgressObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectProgressPage {

    WebDriver driver;

    ProjectProgressObject projectProgressObject;

    WebDriverWait wait;

    public ProjectProgressPage(WebDriver driver){
        this.driver = driver;
        projectProgressObject = new ProjectProgressObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public String getActualUrlProjectProgress(){
        return driver.getCurrentUrl();
    }

    public void enterProject(String project) throws InterruptedException{
        driver.findElement(projectProgressObject.getInputSearchProject()).sendKeys(project);
    }

    public  void isProjectDisplayed() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(projectProgressObject.GetTextProject12345()));
        element.isDisplayed();
    }

    public void getCreateProjectProgressButton() throws InterruptedException{
        driver.findElement(projectProgressObject.getCreateProjectProgressButton()).click();
    }

    public void enterUser(String user) throws InterruptedException{
        driver.findElement(projectProgressObject.getInputUser()).sendKeys(user);
    }

    public void isUserExist() throws InterruptedException {
        driver.findElement(projectProgressObject.isUserExist()).isDisplayed();
    }

    public void getPilihPembeliButton() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(projectProgressObject.getPilihPembeliButton()));
        element.click();
    }

    public void deleteProject() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(projectProgressObject.getDeleteProjectButton()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void YesValidationToDeleteProject() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(projectProgressObject.getYesButtonValidastion()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public  boolean isDeletedProjectDisplayed() throws InterruptedException{
        return driver.findElement(projectProgressObject.GetTextProjectabc()).isDisplayed();
    }

    public void enterHargaProyek(String hargaProyek) {
        // Implementasi untuk memasukkan harga proyek
    }

    public void enterNamaPembeli(String namaPembeli) {
        // Implementasi untuk memasukkan nama pembeli
    }

    public void enterNomorPembeli(String nomorPembeli) {
        // Implementasi untuk memasukkan nomor pembeli
    }

    public void enterAlamatLengkap(String alamatLengkap) {
        // Implementasi untuk memasukkan alamat lengkap
    }

    public void selectProvinsi(String provinsi) {
        // Implementasi untuk memilih provinsi dari dropdown
    }

    public void selectKota(String kota) {
        // Implementasi untuk memilih kota dari dropdown
    }

    public void selectKecamatan(String kecamatan) {
        // Implementasi untuk memilih kecamatan dari dropdown
    }

    public void selectStatusProyek(String statusProyek) {
        // Implementasi untuk memilih status proyek dari dropdown
    }

    public void enterTanggalMulai(String tanggalMulai) {
        // Implementasi untuk memasukkan tanggal mulai
    }

    public void enterTanggalAkhir(String tanggalAkhir) {
        // Implementasi untuk memasukkan tanggal akhir
    }

    public void editNamaProyek(String namaProyekEdit) {
        // Implementasi untuk mengedit nama proyek
    }

    public void editProyekTanpaNamaDanHarga() {
        // Implementasi untuk mengedit proyek tanpa nama dan harga
    }
}
