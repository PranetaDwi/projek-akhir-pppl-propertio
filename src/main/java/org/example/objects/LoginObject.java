package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {

    WebDriver driver;

    public LoginObject(WebDriver driver){
        this.driver = driver;
    }

    public By getInputEmail(){
        return By.id("email");
    }

    public By getInputPassword(){
        return By.id("password");
    }

    public By getLoginButton() {
        return By.xpath("//*[@id=\"login-form\"]/div[3]/button");
    }
    public By getAlert(){
        return new By.ByXPath("/html/body/div[6]/div");
    }

}
