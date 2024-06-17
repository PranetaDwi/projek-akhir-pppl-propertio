package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectProgressObject {
    WebDriver driver;

    public ProjectProgressObject(WebDriver driver){
        this.driver = driver;
    }

    public By getInputSearchProject(){
        return By.id("projectSearcher");
    }

    public By GetTextProject12345(){
        return By.xpath("//*[contains(text(), 'Project 12345')]");
    }

    public By getCreateProjectProgressButton(){
        return By.id("btn-tambah-proyek");
    }

    public By getInputUser(){
        return  By.id("search");
    }
}
