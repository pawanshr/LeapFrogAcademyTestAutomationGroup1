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
        loginPage.setUsername("nirdoshbista");
        loginPage.setPassword("admin123!@#");
        loginPage.login();
        driver.quit();
    }

    @Test
    public void testThatIncorrectUserAndPassCanLogin(){

        this.driver=new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("nirdoshbista1");
        loginPage.setPassword("admin123!@#");
        loginPage.login();
        driver.quit();
    }

    @Test
    public void testThatCorrectUserAndIncorrectPassCanLogin(){
            this.driver=new FirefoxDriver();
            this.driver.get("https://wordpress.com/wp-login.php");
            LoginPage loginPage=new LoginPage(driver);
            loginPage.setUsername("nirdoshbista");
            loginPage.setPassword("admin123!@#1");
            loginPage.login();
            driver.quit();
        }
    @Test
    public void testThatIncorrectUserAndIncorrectPassCanLogin(){
        this.driver=new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setUsername("nirdoshbista1");
        loginPage.setPassword("admin123!@#1");
        loginPage.login();
        driver.quit();
    }
    @Test
    public void testThatIncorrectUserAndIncorrectPassCanLogin1(){
        this.driver=new FirefoxDriver();
        this.driver.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.setUsername("anupam");
        loginPage.setPassword("anupam987");
        loginPage.login();
        driver.quit();
    }

}
