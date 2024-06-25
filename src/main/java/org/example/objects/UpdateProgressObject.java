package org.example.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateProgressObject {
    WebDriver driver;

    public UpdateProgressObject(WebDriver driver) {
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
        return By.id("fileInputMedia");
    }
}
