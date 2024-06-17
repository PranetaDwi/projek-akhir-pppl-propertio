package org.example.pages;

import org.example.objects.LoginObject;
import org.example.objects.ProjectProgressObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectProgressPage {

    WebDriver driver;

    ProjectProgressObject projectProgressObject;

    WebDriverWait wait;

    public ProjectProgressPage(WebDriver driver){
        this.driver = driver;
        projectProgressObject = new ProjectProgressObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    public String getActualUrlProjectProgress(){
        return driver.getCurrentUrl();
    }

    public void enterProject(String project) throws InterruptedException{
        driver.findElement(projectProgressObject.getInputSearchProject()).sendKeys(project);
    }

    public  void isProjectDisplayed() throws InterruptedException{
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(projectProgressObject.GetTextProject12345()));
        element.isDisplayed();
    }

    public void getCreateProjectProgressButton() throws InterruptedException{
        driver.findElement(projectProgressObject.getCreateProjectProgressButton()).click();
    }

    public void enterUser(String user) throws InterruptedException{
        driver.findElement(projectProgressObject.getInputUser()).sendKeys(user);
    }

    public void isUserExist() throws InterruptedException {
        driver.findElement(projectProgressObject.isUserExist()).isDisplayed();
    }

}
