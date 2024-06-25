package org.example.pages;

import org.example.objects.UpdateProgressObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateProgressPage {
    WebDriver driver;

    UpdateProgressObject updateProgressObject;

    WebDriverWait wait;

    public UpdateProgressPage(WebDriver driver) {
        this.driver = driver;
        this.updateProgressObject= new UpdateProgressObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }

    public void enterBriefDescription(String briefDescription) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateProgressObject.getBriefDescriptionField()));
        element.sendKeys(briefDescription);
    }

    public void enterDetailDescription(String detailDescription) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateProgressObject.getDetailDescriptionField()));
        element.sendKeys(detailDescription);
    }

    public void enterPercentage(String percentage) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateProgressObject.getPercentageField()));
        element.sendKeys(percentage);
    }

    public void enterImage(String imagePath) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateProgressObject.getUploadImageField()));
        element.sendKeys(imagePath);
    }
}
