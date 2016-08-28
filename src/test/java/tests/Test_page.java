package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginPage;
import pageobjects.Page_page;
import pageobjects.Page_publish;

import java.sql.Driver;

/**
 * Created by NISCHIT ARYAL on 8/26/2016.
 */
public class Test_page {
    WebDriver driver;


    @Test
    public void login(){

        this.driver = new FirefoxDriver();
        this.driver.get("https://wordpress.com/page/leapfrogacademytestautomationgroup1.wordpress.com");
        LoginPage loginpage = new LoginPage(driver);
        loginpage.setUsername("nirdoshbista");
        loginpage.setPassword("admin123!@#");
        loginpage.login();


        /*Page_page page_page = new Page_page(driver);
        page_page.login();*/

        Page_publish page_publish =new Page_publish(driver);
        page_publish.setTitle("Title1");
       // page_publish.setEditor("This came from code");
        page_publish.setPublishButton();
    }

}
