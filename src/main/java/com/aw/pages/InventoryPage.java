package com.aw.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By inventoryContainer = By.id("inventory_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Step("Verify inventory page is loaded")
    public boolean isLoaded() {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(inventoryContainer));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

