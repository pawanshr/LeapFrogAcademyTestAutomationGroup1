package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Katun on 06/09/2016.
 */
public class FirstLoginPage {
    WebDriver dvr;

    FirstLoginPage(WebDriver driver){
        this.dvr = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_login")
    WebElement usernameinputtextbox;

    @FindBy(id = "user_pass")
    WebElement passwordinputtextbox;

    @FindBy(id = "wp-submit")
    WebElement loginbutton;

    @FindBy(xpath = ".//*[@id='nav']/a")
    WebElement lostyourpasswordlink;

    @FindBy(xpath = ".//*[@id='loginform']/p[1]/label")
    WebElement usernameoremailLabel;

    @FindBy(xpath = ".//*[@id='loginform']/p[2]/label")
    WebElement passwordLabel;

    public void setuernameinusernametextbox(String Username){
        usernameinputtextbox.sendKeys(Username);
    }

    public void setpasswordinpasswordtextbox(String Password){
        passwordinputtextbox.sendKeys(Password);
    }

    public void clickLoginbutton(){
        loginbutton.click();
    }
}
