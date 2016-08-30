package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;
import pageobjects.UserPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by NISCHIT ARYAL on 8/28/2016.
 */
public class UserTest extends BaseTest{

    @Test
    public void testThatUsernamesAreListed(){


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

    @Test
    public void testThatUsernameCanBeAdded() {

    }


    @Test
    public void testThatUsernameCanBeDeleted() {

    }

    @After
    public void teardown() {
        driver.quit();
    }
}
