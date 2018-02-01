package ca.simple.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static ca.simple.automation.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;

/**
 * Created by Roman_Iovlev on 1/21/2018.
 */
public class GoodWebTests extends TestsInit {
    @Test
    public void simpleWebTest() {
        assertEquals(driver.getTitle(), "Home Page");
    }

    @Test
    public void loginTest() {
        driver.findElement(By.className("fa-user")).click();
        driver.findElement(By.id("Login")).sendKeys("epam");
        driver.findElement(By.id("Password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[text()='Enter']")).click();

        boolean isLoggedIn = driver.findElement(By.className("logout")).isDisplayed();
        Assert.assertTrue(isLoggedIn);
    }

}
