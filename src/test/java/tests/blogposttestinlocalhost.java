package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.FirstLoginPage;

public class blogposttestinlocalhost {
    WebDriver dvr;
    @Test
    public void blogposttest(){
        this.dvr=new FirefoxDriver();

        this.dvr.get("http://localhost/wordpress/wp-admin/index.php");

        FirstLoginPage loginPage = new FirstLoginPage(dvr);

        Assert.assertEquals("Lost your password?", loginPage.checkforlostyourpassword());
        Assert.assertEquals("Username or Email",loginPage.checkforUsernameofEmailLabel());
        Assert.assertEquals("Password",loginPage.checkforPasswordLabel());

        loginPage.setuernameinusernametextbox("admin");
        loginPage.setpasswordinpasswordtextbox("qwerty123");
        loginPage.clickLoginbutton();



    }

}
