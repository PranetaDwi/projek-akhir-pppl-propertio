package org.example.pages;

import org.example.objects.ManualCreateProjectObject;
import org.example.objects.ManualUpdateProjectObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManualUpdateProjectPage {
    WebDriver driver;

    ManualUpdateProjectObject manualUpdateProjectObject;

    WebDriverWait wait;

    public ManualUpdateProjectPage(WebDriver driver) {
        this.driver = driver;
        this.manualUpdateProjectObject = new ManualUpdateProjectObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    public void enterTitle(String title) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualUpdateProjectObject.getInputProjectName()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + title + "';", element);
    }

    public void enterAddress(String address) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualUpdateProjectObject.getInputProjectAddress()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + address + "';", element);
    }

    public void enterBuyer(String buyerName) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualUpdateProjectObject.getInputProjectBuyer()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + buyerName + "';", element);
    }

    public void enterBuyerPhone(String buyerPhone) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualUpdateProjectObject.getInputProjectBuyerPhone()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + buyerPhone + "';", element);
    }

    public void clickSimpanButton() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(manualUpdateProjectObject.getUpdateButton()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

}
