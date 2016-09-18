package tests;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.Secondpageafterlogin;

public class Testcases extends BaseTest{

    @Test
    public void forTestcase_6(){
        Secondpageafterlogin afterlogin = new Secondpageafterlogin(driver);
        afterlogin.listAllelements();
       // Assert.assertEquals("Appearance",afterlogin.checkforhome());
    }

}
