package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class ScreenshotUtil {
    public static String takeScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String screenshotDir = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator;
        String destination = screenshotDir + screenshotName + "_" + UUID.randomUUID().toString() + ".png";

        try {
            Files.createDirectories(Paths.get(screenshotDir));
            Files.copy(source.toPath(), Paths.get(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

}
