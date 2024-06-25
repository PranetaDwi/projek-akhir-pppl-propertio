package org.example.pages;

import org.example.objects.CreateProgressObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateProgressPage {
    WebDriver driver;

    CreateProgressObject createProgressObject;

    WebDriverWait wait;

    public CreateProgressPage(WebDriver driver) {
        this.driver = driver;
        this.createProgressObject = new CreateProgressObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }

    public void enterBriefDescription(String briefDescription) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(createProgressObject.getBriefDescriptionField()));
        element.sendKeys(briefDescription);
    }

    public void enterDetailDescription(String detailDescription) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(createProgressObject.getDetailDescriptionField()));
        element.sendKeys(detailDescription);
    }

    public void enterPercentage(String percentage) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(createProgressObject.getPercentageField()));
        element.sendKeys(percentage);
    }

    public void clickButtonTelusuriFIle() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(createProgressObject.getTelusuriFileButtonField()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void enterImage(String imagePath) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(createProgressObject.getUploadImageField()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", element);
        element.sendKeys(imagePath);
    }

    public void clickSimpanButton() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(createProgressObject.getSimpanButtonField()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

}
