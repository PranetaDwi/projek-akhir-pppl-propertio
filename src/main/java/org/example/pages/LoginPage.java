package org.example.pages;

import org.example.objects.LoginObject;
import org.openqa.selenium.WebDriver;

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
}
