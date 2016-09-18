package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.FirstLoginPage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by i80921 on 8/30/2016.
 */
public class BaseTest {
    WebDriver driver;

    @Before
    public void setupTestMethod() {
        //System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        //driver=new ChromeDriver();

        this.driver = new FirefoxDriver();
        this.driver.get("http://localhost/wordpress/wp-login.php");

        driver.manage().window().maximize();

        FirstLoginPage localloginPage = new FirstLoginPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertEquals("Lost your password?", localloginPage.checkforlostyourpassword());
        Assert.assertEquals("Username or Email",localloginPage.checkforUsernameofEmailLabel());
        Assert.assertEquals("Password",localloginPage.checkforPasswordLabel());


        loginPage.setUsername("admin");
        loginPage.setPassword("admin");
        loginPage.login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @After
    public void tearDown() {
        System.out.println("All Done Boss!");
    }
}
