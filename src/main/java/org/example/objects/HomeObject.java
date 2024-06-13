package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeObject {

    WebDriver driver;

    public HomeObject(WebDriver driver){
        this.driver = driver;
    }

    public By getProjectProgressButton(){
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[1]/div/div[4]/a[2]");
    }

}
