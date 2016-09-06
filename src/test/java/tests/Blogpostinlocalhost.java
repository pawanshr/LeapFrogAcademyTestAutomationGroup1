package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.FirstLoginPage;
import pageobjects.Secondpageafterlogin;

public class Blogpostinlocalhost extends BaseTest {
    @Test
    public void blogposttest(){
        this.driver = new FirefoxDriver();
        Secondpageafterlogin pageafterlogin = new Secondpageafterlogin(driver);

        Assert.assertEquals("Home", pageafterlogin.checkforhome());
        Assert.assertEquals("Updates", pageafterlogin.checkforupdates());

        pageafterlogin.clickthePosts();
    }

}
