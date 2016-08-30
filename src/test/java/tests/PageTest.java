package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.AddPagePage;
import pageobjects.LoginPage;
import pageobjects.AddPagePage;

import java.sql.Driver;

/**
 * Created by NISCHIT ARYAL on 8/26/2016.
 */
public class PageTest extends BaseTest{



    @Test
    public void login(){


        /*Page_page page_page = new Page_page(driver);
        page_page.login();*/

        AddPagePage page_publish =new AddPagePage(driver);
        page_publish.setTitle("Title1");
       // page_publish.setEditor("This came from code");
        page_publish.setPublishButton();
    }

}
