package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;

/**
 * Created by NISCHIT ARYAL on 8/26/2016.
 */
public class LoginTest3 {
    WebDriver driver;


    @Test
    public void testnopasswordLogin(){

        this.driver = new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("samankapali.kop");
        loginPage.login();
    }


}

