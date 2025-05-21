package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void loginTest1() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        boolean titleIsDisplayed = driver.findElement(By.xpath("//*[text() = 'Products']")).isDisplayed();
        Assert.assertTrue(titleIsDisplayed);

    }

    @Test
    public void loginTest2() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        boolean titleIsDisplayed = driver.findElement(By.xpath("//*[text() = 'Products']")).isDisplayed();
        Assert.assertTrue(titleIsDisplayed);

    }

}
