package tests;

import org.junit.Test;
import pageobjects.LoggedinPage;

/**
 * Created by dell on 9/11/2016.
 */
public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogout() {
        LoggedinPage loggedinPage = new LoggedinPage(driver);

        loggedinPage.logout();
    }
}
