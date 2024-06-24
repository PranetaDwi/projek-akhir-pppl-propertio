package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
            sparkReporter = new ExtentSparkReporter(reportPath);
            String configFilePath = System.getProperty("user.dir") + "/src/test/resources/configs/extent-config.xml";

            try {
                sparkReporter.loadXMLConfig(new File(configFilePath));
            } catch (Exception e) {
                System.out.println("Configuration file not found: " + e.getMessage());
                e.printStackTrace();
            }

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("Browser", "Chrome");
        }
        return extent;
    }
}

