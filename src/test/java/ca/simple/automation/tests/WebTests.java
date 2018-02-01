package ca.simple.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;

/**
 * Created by Roman_Iovlev on 1/21/2018.
 */
public class WebTests{

    @Test
    public void simpleWebTest() {
        setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://epam.github.io/JDI/index.html");
        Assert.assertEquals(driver.getTitle(), "Home Page");
        driver.close();
    }
    @Test
    public void loginTest() {
        setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://epam.github.io/JDI/index.html");

        driver.findElement(By.className("fa-user")).click();
        driver.findElement(By.id("Login")).sendKeys("epam");
        driver.findElement(By.id("Password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[text()='Enter']")).click();

        boolean isLoggedIn = driver.findElement(By.className("logout")).isDisplayed();
        Assert.assertTrue(isLoggedIn);
        driver.close();
    }

}
