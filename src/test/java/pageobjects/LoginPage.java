package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by i80921 on 8/23/2016.
 */
public class LoginPage {
    WebDriver driver;

    @FindBy(id="user_login")
    WebElement uname;

    @FindBy(id="user_pass")
    WebElement passwd;

    @FindBy(id="wp-submit")
    WebElement loginbutton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        uname.sendKeys();
    }

    public void setPassword(String password) {
        passwd.sendKeys();
    }

    public void login() {
        loginbutton.click();
    }
}
