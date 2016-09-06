package tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoggedinPage;
import pageobjects.LoginPage;

/**
 * Created by i80921 on 8/23/2016.
 */
public class LoginTest extends BaseTest{
    WebDriver driver;


    @Test
    public void testThatCorrectUserAndPassCanLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("me_aroonasing@yahoo.com");
        loginPage.setPassword("2merahero");
        loginPage.login();

        LoggedinPage loggedinPage = new LoggedinPage(driver);
        String mySiteText = loggedinPage.getMySiteText();
        Assert.assertEquals("My Site", mySiteText);

    }

    @Test
    public void testnousernameLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setPassword("qwerty123");
        loginPage.login();
    }

    @Test
    public void testnopasswordLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("samankapali.kop");
        loginPage.login();
    }

    @Test
    public void testThatIncorrectUserAndPassCanLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("nirdoshbista1");
        loginPage.setPassword("admin123!@#");
        loginPage.login();

    }

    @Test
    public void testThatCorrectUserAndIncorrectPassCanLogin(){

            LoginPage loginPage=new LoginPage(driver);
            loginPage.setUsername("nirdoshbista");
            loginPage.setPassword("admin123!@#1");
            loginPage.login();

        }

    @Test
    public void testThatIncorrectUserAndIncorrectPassCanLogin(){
        this.driver=new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setUsername("nirdoshbista1");
        loginPage.setPassword("admin123!@#1");
        loginPage.login();

    }

    @Test
    public void testThatIncorrectUserAndIncorrectPassCanLogin1(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.setUsername("anupam");
        loginPage.setPassword("anupam987");
        loginPage.login();

    }

}
