package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateProgressObject {
    WebDriver driver;

    public CreateProgressObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getBriefDescriptionField() throws InterruptedException {
        return By.name("brief_description");
    }

    public By getDetailDescriptionField() throws InterruptedException {
        return By.name("detail_description");
    }

    public By getPercentageField() throws InterruptedException {
        return By.name("percentage");
    }

    public By getUploadImageField() throws InterruptedException {
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[3]/input");
    }

    public By getTelusuriFileButtonField() throws InterruptedException {
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[3]/label");
    }


    public By getSimpanButtonField() throws InterruptedException {
        return By.xpath("/html/body/div/div[1]/div[2]/div/div[2]/div/div[2]/form/div[4]/button[2]");
    }
    

    public By getPercentageError() throws InterruptedException{
        return By.xpath("//*[contains(text(), 'Percentage harus bernilai antara 10 sampai 100.')]");
    }

}
