package ca.simple.automation.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static ca.simple.automation.DriverManager.getDriver;
import static ca.simple.automation.enums.BrowserTypes.FIREFOX;


/**
 * Created by Roman_Iovlev on 1/22/2018.
 */
public class TestsInit {

    protected static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        driver = getDriver(FIREFOX);
        driver.navigate().to("https://epam.github.io/JDI/index.html");
    }

    @AfterSuite(alwaysRun = true)
    public static void tearDown() {
        driver.quit();
    }
}
