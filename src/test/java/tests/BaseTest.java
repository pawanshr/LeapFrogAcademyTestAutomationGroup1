package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by i80921 on 8/30/2016.
 */
public class BaseTest {
    WebDriver driver;

    @Before
    public void setupTestMethod() {
        this.driver = new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("shilpisam");
        loginPage.setPassword("Autom@te1");
        loginPage.login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
