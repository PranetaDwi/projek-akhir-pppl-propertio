package org.example.pages;

import org.example.objects.ManualUpdateProjectObject;
import org.example.objects.ProgressObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressPage {
    WebDriver driver;

    ProgressObject progressObject;

    WebDriverWait wait;

    public ProgressPage(WebDriver driver) {
        this.driver = driver;
        this.progressObject = new ProgressObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }
}
