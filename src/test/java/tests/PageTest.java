package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.*;
import pageobjects.AddPagePage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/**
 * Created by NISCHIT ARYAL on 8/26/2016.
 */
public class PageTest extends BaseTest{


    @Test
    public void verifyPageAddition()
    {
        PagePage addingPage = new PagePage();
        PageFactory.initElements(driver,addingPage);
        addingPage.setPages();
        addingPage.setAddNewPage();
        addingPage.setTitleOfNewPage();
        addingPage.setAddMedia();
        addingPage.setSaveDrafts();
        addingPage.setPreviewPage();
        addingPage.setPublishPage();
        addingPage.setMoveToTrash();

        driver.quit();
    }

}
