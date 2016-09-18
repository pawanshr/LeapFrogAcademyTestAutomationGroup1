package pageobjects;

import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Katun on 06/09/2016.
 */
public class Secondpageafterlogin {
    WebDriver dvr;


    public Secondpageafterlogin(WebDriver driver){
        this.dvr =driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =  ".//*[@id='menu-posts']/a/div[3]")
    WebElement forblogposts;

    @FindBy(xpath="//a[@class = 'wp-first-item current']")
    WebElement forgoinghome;

    @FindBy(xpath = ".//*[@id='menu-users']/a/div[3]")
    WebElement usersOption;

    @FindBy(id="wp-admin-bar-my-account")
    WebElement howdyadminbutton;

    @FindBy(xpath = ".//*[@id='wp-admin-bar-logout']/a")
    WebElement logoutoption;

    public void clickthePosts(){
        forblogposts.click();
    }

    public String checkforhome(){ return forgoinghome.getText();}

    public String checkforusersoption(){return usersOption.getText();}

    public void movetohowdyadminandlogout() throws InterruptedException {
        Actions actobj = new Actions(dvr);
        actobj.moveToElement(howdyadminbutton).build().perform();
        Thread.sleep(4000);
        actobj.moveToElement(logoutoption).click().build().perform();
    }

    public void  listAllelements(){

        String [] actualElements={"Appearance","Plugins","Users"};

        By mySelector = By.id("adminmenu");
        List<WebElement> myElements = new ArrayList<WebElement>();
        myElements=dvr.findElements(mySelector);

        System.out.println(myElements.get(2).getText());

        /*
        for(WebElement e : myElements) {
            System.out.println(e.getText());
        }
        */
    }

}
