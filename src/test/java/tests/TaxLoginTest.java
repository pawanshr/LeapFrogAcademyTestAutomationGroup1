package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.TaxLoginPage;

/**
 * Created by i80921 on 9/13/2016.
 */
public class TaxLoginTest {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://110.44.116.135:24888/munerp/Tax/Home/Login");

    }

    @Test
    public void verifyCorrectLoginWorks() {
        TaxLoginPage taxLoginPage = new TaxLoginPage(driver);

        taxLoginPage.setClientID("1");
        taxLoginPage.setUsername("admin");
        taxLoginPage.setPassword("admin");
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
