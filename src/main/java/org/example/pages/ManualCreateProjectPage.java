package org.example.pages;

import org.example.objects.ManualCreateProjectObject;
import org.openqa.selenium.WebDriver;

public class ManualCreateProjectPage {
    WebDriver driver;

    ManualCreateProjectObject manualCreateProjectObject;

    public ManualCreateProjectPage(WebDriver driver) {
        this.driver = driver;
        this.manualCreateProjectObject = new ManualCreateProjectObject(driver);
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }

    public void isOldBuyerNameAttached() throws InterruptedException {
        driver.findElement(manualCreateProjectObject.GetOldBuyerName()).isDisplayed();
    }
}
