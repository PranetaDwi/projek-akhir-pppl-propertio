package org.example.pages;

import org.example.objects.UpdateProgressObject;
import org.openqa.selenium.JavascriptExecutor;
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
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + briefDescription + "';", element);
    }

    public void enterDetailDescription(String detailDescription) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateProgressObject.getDetailDescriptionField()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + detailDescription + "';", element);
    }

    public void clickSimpanButton() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(updateProgressObject.getSimpanButtonField()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void isErrorDisplayed() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateProgressObject.getPercentageError()));
        element.isDisplayed();
    }
}
