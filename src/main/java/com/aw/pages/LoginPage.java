package com.aw.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    // Locators
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Step("Open login page")
    public LoginPage open(String baseUrl) {
        driver.get(baseUrl);
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameField));
        return this;
    }

    @Step("Type username: {0}")
    public LoginPage typeUsername(String username) {
        WebElement usernameElement = wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        usernameElement.clear();
        usernameElement.sendKeys(username);
        return this;
    }

    @Step("Type password")
    public LoginPage typePassword(String password) {
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordElement.clear();
        passwordElement.sendKeys(password);
        return this;
    }

    @Step("Submit login form")
    public void submit() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }

    @Step("Get error message")
    public String getError() {
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(errorMessage));
            return errorElement.getText();
        } catch (Exception e) {
            return "";
        }
    }

    public WebElement getUsernameField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(usernameField));
    }

    public WebElement getPasswordField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
    }

    public WebElement getLoginButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }
}

