package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;
import pageobjects.LoggedinPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Katun on 28/08/2016.
 */
public class blogPostTest {

    WebDriver dvr;

    @Test
    public void startABlogPost(){
        this.dvr = new FirefoxDriver();
        this.dvr.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage = new LoginPage(dvr);
        LoggedinPage blogpostLogin = new LoggedinPage(dvr);

        loginPage.setUsername("chandru713");
        loginPage.setPassword("Chandr@713");
        loginPage.login();


        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.MySite();

        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.blogPost();

        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.addPost();

        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.addTitle("Bla Bla Bla");

        dvr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        dvr.quit();
    }


}

