package tests;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.Secondpageafterlogin;

public class Blogpostinlocalhost extends BaseTest {
    @Test
    public void blogposttest(){
        Secondpageafterlogin afterlogin = new Secondpageafterlogin(driver);

        Assert.assertEquals("Home",afterlogin.checkforhome());
        System.out.println("Home button found.");
        Assert.assertEquals("Users", afterlogin.checkforusersoption());
        System.out.println("Users option found.");

        afterlogin.clickthePosts();
    }

}
