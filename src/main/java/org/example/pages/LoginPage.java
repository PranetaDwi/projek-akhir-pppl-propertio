package org.example.pages;

import org.example.objects.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    LoginObject loginObject;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        loginObject = new LoginObject(driver);
    }

    public void enterEmail(String user) throws InterruptedException{
        driver.findElement(loginObject.getInputEmail()).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(loginObject.getInputPassword()).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginObject.getLoginButton()).click();
    }
    public boolean isAlertPresent() {
        try {
            WebElement alert = driver.findElement(loginObject.getAlert());
            return alert.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isLoginSuccessful() {
        try {
            // Ubah locator sesuai dengan elemen yang muncul saat login berhasil
            WebElement dashboard = driver.findElement(By.xpath("//*[@id=\"mm-8\"]/div[1]/div[2]/div/div[2]/div")); 
            return dashboard.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
