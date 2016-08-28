package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;
import pageobjects.UserPage;

/**
 * Created by NISCHIT ARYAL on 8/28/2016.
 */
public class UserTest {
    WebDriver driver;

    @Test
    public void testusernamelist(){
        this.driver = new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("shilpisam");
        loginPage.setPassword("Autom@te1");
        loginPage.login();

        UserPage userPage =new UserPage(driver);
        userPage.Mysite();


        userPage.People();

        userPage.Add();

        userPage.setUsername("nirdoshbista");

        userPage.DM();

        userPage.setCustomMessage("Hello Nirdosh");

        userPage.invitation();

        userPage.People();

    }

}