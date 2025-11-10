package com.aw.tests;

import com.aw.pages.InventoryPage;
import com.aw.pages.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(description = "LGN_001: Valid Login")
    @Step("LGN_001: Verify successful login with valid credentials")
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(baseUrl)
                .typeUsername("standard_user")
                .typePassword("secret_sauce")
                .submit();

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.isLoaded(), "Inventory page should be loaded after successful login");
    }

    @Test(description = "LGN_002: Empty Fields")
    @Step("LGN_002: Verify error message when both username and password fields are empty")
    public void testEmptyFields() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(baseUrl)
                .submit();

        String errorMessage = loginPage.getError();
        Assert.assertFalse(errorMessage.isEmpty(), "Error message should be displayed");
        Assert.assertTrue(errorMessage.contains("Username is required") || 
                        errorMessage.contains("required"),
                "Error message should indicate username is required");
    }

    @Test(description = "LGN_004: Wrong Password")
    @Step("LGN_004: Verify error message when incorrect password is entered")
    public void testWrongPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(baseUrl)
                .typeUsername("standard_user")
                .typePassword("wrongpass")
                .submit();

        String errorMessage = loginPage.getError();
        Assert.assertFalse(errorMessage.isEmpty(), "Error message should be displayed");
        Assert.assertTrue(errorMessage.contains("do not match") || 
                        errorMessage.contains("Username and password"),
                "Error message should indicate credentials do not match");
    }
}
