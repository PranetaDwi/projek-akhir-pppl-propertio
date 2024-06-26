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
        return By.xpath("//*[contains(text(), 'Rumah Makan Neta')]");
    }

    public By getCreateProjectProgressButton(){
        return By.id("btn-tambah-proyek");
    }

    public By getInputUser(){
        return  By.id("search");
    }

    public By isUserExist(){
        return By.xpath("//*[contains(text(), 'userProperti')]");
    }

    public By getPilihPembeliButton(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div/div/div[3]/form/button");
    }

    public By getDeleteProjectButton(){
        return By.xpath("//*[@id=\"projectProgressContainer28\"]/div/div[2]/div[4]/div/button");
    }

    public By getYesButtonValidastion(){
        return By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    }

    public By GetTextProjectabc(){
        return By.xpath("//*[contains(text(), 'Sangat baik')]");
    }

    public By getEditProyekButton(){
        return By.xpath("//*[@id=\"projectProgressContainer11\"]/div/div[2]/div[4]/div/form/button");
    }

    public By getProgressProyekButton(){
        return By.xpath("//*[@id=\"projectProgressContainer11\"]/div/div[2]/div[3]/div[2]/form/button");
    }

}
