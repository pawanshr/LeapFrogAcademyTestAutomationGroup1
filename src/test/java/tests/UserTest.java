package tests;

import org.junit.After;
import org.junit.Test;
import pageobjects.UserPage;

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
