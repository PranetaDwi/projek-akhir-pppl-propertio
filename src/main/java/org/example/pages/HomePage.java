package org.example.pages;

import org.example.objects.HomeObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    HomeObject homeObject;

    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.homeObject = new HomeObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String getActualUrl(){
        return driver.getCurrentUrl();
    }

    public void clickProjectProgressButton() {
        WebElement projectProgressButton = wait.until(ExpectedConditions.elementToBeClickable(homeObject.getProjectProgressButton()));
        projectProgressButton.click();
    }
}
