package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;
import pageobjects.User;

/**
 * Created by NISCHIT ARYAL on 8/28/2016.
 */
public class User1 {
    WebDriver driver;

    @Test
    public void testusernamelist(){
        this.driver = new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("shilpisam");
        loginPage.setPassword("Autom@te1");
        loginPage.login();

        User user =new User(driver);
        user.Mysite();

        user.People();

        user.Add();

        user.setUsername("nirdoshbista");

        user.DM();

        user.setCustomMessage("Hello Nirdosh");

        user.invitation();
    }

}
