package org.example.pages;

import io.cucumber.java.sl.In;
import org.example.objects.ManualCreateProjectObject;
import org.openqa.selenium.JavascriptExecutor;
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

    public void isTitleExist() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getTitlePage()));
        element.isDisplayed();
    }

    // ADD MANUAL PROJECT
    public void enterTitle(String title) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectName()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + title + "';", element);
    }

    public void enterPrice(String price) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectPrice()));
        element.sendKeys(price);
    }

    public void enterAddress(String address) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getInputProjectAddress()));
        element.sendKeys(address);
    }

    public void clickProvinceDropdown() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getProvinceDropdown()));
        element.click();
    }

    public void selectProvinceFromDropdown() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getSelectProvinceDropdown()));
        element.click();
    }

    public void clickCityropdown() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getCityDropdown()));
        element.click();
    }

    public void selectCityFromDropdown() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getSelectCityDropdown()));
        element.click();
    }

    public void clickDiscrictDropdown() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getDistrictDropdown()));
        element.click();
    }

    public void selectDistrictFromDropdown() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getSelectDistrictDropdown()));
        element.click();
    }

    public void enterProjectStartDate(String startDate) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getFieldProjectStartDate()));
        element.sendKeys(startDate);
    }

    public void enterProjectEndDate(String endDate) throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(manualCreateProjectObject.getFieldProjectEndDate()));
        element.sendKeys(endDate);
    }

    public void clickSimpanButton() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(manualCreateProjectObject.getSimpanButton()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

}
