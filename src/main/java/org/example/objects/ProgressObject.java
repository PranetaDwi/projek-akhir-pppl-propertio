package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressObject {
    WebDriver driver;

    public ProgressObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getDetailProject(){
        return By.xpath("//*[contains(text(), 'Progres Pembangunan')]");
    }

    public By getAddProgressButton(){
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/form/div/button");
    }

}
