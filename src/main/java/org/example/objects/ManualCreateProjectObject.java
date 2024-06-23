package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManualCreateProjectObject {
    WebDriver driver;

    public ManualCreateProjectObject(WebDriver driver) {
        this.driver = driver;
    }

    public By GetOldBuyerName(){
        return By.xpath("//*[contains(text(), 'userProperti')]");
    }

    public By getInputProjectName(){
        return By.name("title");
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

    public By getInputProjectProvince(){
        return By.id("province");
    }

    public By getInputProjectCity(){
        return By.id("city");
    }

    public By getInputProjectDistrict(){
        return By.id("district");
    }

    public By getInputProjectStatus(){
        return By.name("status");
    }

    public By getInputProjectStartDate(){
        return By.id("inputTanggalMulai");
    }

    public By getInputProjectEndDate(){
        return By.id("inputTanggalAkhir");
    }
}
