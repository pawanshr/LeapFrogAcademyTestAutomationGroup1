package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;

/**
 * Created by i80921 on 8/23/2016.
 */
public class LoginTest {
    WebDriver driver;


    @Test
    public void testThatCorrectUserAndPassCanLogin(){

        this.driver = new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("suman108215");
        loginPage.setPassword("sulen108215");
        loginPage.login();
    }


}
