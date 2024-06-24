package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManualCreateProjectObject {
    WebDriver driver;

    public ManualCreateProjectObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getTitlePage() {
        return By.xpath("//*[contains(text(), 'Tambah Proyek Pengembang Manual')]");
    }

    public By getInputProjectName(){
        return By.id("inputNamaProyek");
    }

    public By getInputProjectPrice(){
        return By.name("price");
    }

    public By getInputProjectBuyer(){
        return By.name("buyer_name");
    }

    public By getInputProjectBuyerPhone(){
        return By.name("buyer_phone");
    }

    public By getInputProjectAddress(){
        return By.name("address");
    }

    public By getProvinceDropdown(){
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[5]/div[1]/div/div/button");
    }

    public  By getSelectProvinceDropdown(){
        return By.id("bs-select-1-3");
    }

    public By getCityDropdown(){
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[5]/div[2]/div/div/button");
    }

    public  By getSelectCityDropdown(){
        return By.id("bs-select-2-18");
    }

    public By getDistrictDropdown(){
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[5]/div[3]/div/div/button");
    }

    public  By getSelectDistrictDropdown(){
        return By.id("bs-select-3-5");
    }

    public By getFieldProjectStartDate(){
        return By.id("inputTanggalMulai");
    }

    public By getFieldProjectEndDate(){
        return By.id("inputTanggalAkhir");
    }

    public By getSimpanButton(){
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[8]/button[2]");
    }

}
