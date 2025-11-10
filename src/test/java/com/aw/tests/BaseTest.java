package com.aw.tests;

import com.aw.core.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    protected String baseUrl;

    @BeforeMethod
    public void setUp() {
        String env = System.getProperty("env", "dev");
        Properties properties = loadProperties(env);
        
        baseUrl = properties.getProperty("baseUrl");
        String browser = properties.getProperty("browser", "chrome");
        String headlessProp = System.getProperty("headless", properties.getProperty("headless", "false"));
        boolean headless = Boolean.parseBoolean(headlessProp);

        driver = DriverFactory.initDriver(browser, headless);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    private Properties loadProperties(String env) {
        Properties properties = new Properties();
        String configFile = "src/test/resources/config/" + env + ".properties";
        
        try (FileInputStream fis = new FileInputStream(configFile)) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file: " + configFile, e);
        }
        
        return properties;
    }
}
