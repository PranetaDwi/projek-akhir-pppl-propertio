package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManualUpdateProjectObject {
    WebDriver driver;

    public ManualUpdateProjectObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getInputProjectName(){
        return By.name("title");
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

    public By getUpdateButton(){
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[8]/button[2]");
    }

}
