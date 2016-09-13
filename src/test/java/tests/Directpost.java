package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoggedinPage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Saman Kapali on 28/08/2016.
 */
public class Directpost {
    WebDriver dvr;

    @Test
    public void Direcpost(){

        this.dvr = new FirefoxDriver();
        this.dvr.get("https://wordpress.com/wp-login.php");
        LoginPage loginPage = new LoginPage(dvr);
        LoggedinPage blogpostLogin = new LoggedinPage(dvr);

        loginPage.setUsername("chandru713");
        loginPage.setPassword("Chandr@713");
        loginPage.login();


        dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        blogpostLogin.MySite();

        blogpostLogin.directAddPost();



    }



}
