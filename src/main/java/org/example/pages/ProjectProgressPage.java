package org.example.pages;

import org.example.objects.LoginObject;
import org.openqa.selenium.WebDriver;

public class ProjectProgressPage {

    WebDriver driver;

    public ProjectProgressPage(WebDriver driver){
        this.driver = driver;
    }

    public String getActualUrlProjectProgress(){
        return driver.getCurrentUrl();
    }

}
