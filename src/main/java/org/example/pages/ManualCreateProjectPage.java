package org.example.pages;

import org.example.objects.ManualCreateProjectObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManualCreateProjectPage {
    WebDriver driver;

    ManualCreateProjectObject manualCreateProjectObject;

    WebDriverWait wait;

    public ManualCreateProjectPage(WebDriver driver) {
        this.driver = driver;
        this.manualCreateProjectObject = new ManualCreateProjectObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }

    public void isOldBuyerNameAttached() throws InterruptedException {
        driver.findElement(manualCreateProjectObject.GetOldBuyerName()).isDisplayed();
    }

    // ADD MANUAL PROJECT
    public void enterTitle(String title) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectName()));
        element.sendKeys(title);
    }

    public void enterPrice(String price) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectPrice()));
        element.sendKeys(price);
    }

    public void enterAddress(String address) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectAddress()));
        element.sendKeys(address);
    }

    public void enterProvince(String province) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectProvince()));
        element.sendKeys(province);
    }

    public void enterCity(String city) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectCity()));
        element.sendKeys(city);
    }

    public void enterDistrict(String district) throws InterruptedException{
        driver.findElement(manualCreateProjectObject.getInputProjectDistrict()).sendKeys(district);
    }

    public void enterStartDate(String startDate) throws InterruptedException{
        driver.findElement(manualCreateProjectObject.getInputProjectStartDate()).sendKeys(startDate);
    }

    public void enterEndDate(String endDate) throws InterruptedException{
        driver.findElement(manualCreateProjectObject.getInputProjectEndDate()).sendKeys(endDate);
    }

    public void clickSimpanButton() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getSimpanButton()));
        element.click();
    }

}
