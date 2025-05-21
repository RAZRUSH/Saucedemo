package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test

    public void loginTest1() {
        loginPage.open();
        loginPage.login("standard_user", "123456789");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");


        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("123456789");
        driver.findElement(By.id("login-button")).click();
        String message = driver.findElement(By.cssSelector("[data-test=error]")).getText();
        Assert.assertEquals(message, "Epic sadface: Username and password do not match any user in this service");

    }

    @Test

    public void loginTest2() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("login-button")).click();
        String message = driver.findElement(By.cssSelector("[data-test=error]")).getText();
        Assert.assertEquals(message, "Epic sadface: Password is required");

    }
}