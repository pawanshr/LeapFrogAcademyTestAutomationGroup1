package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by i80921 on 9/13/2016.
 */
public class TaxLoginPage {


    @FindBy(id = "client_id")
    WebElement clientID;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    public TaxLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setClientID(String clientIDValue) {
        (new Select(clientID)).selectByValue(clientIDValue);
    }

    public void setUsername(String usernameText) {
        username.clear();
        username.sendKeys(usernameText);
    }

    public void setPassword(String passwordText) {
        password.clear();
        password.sendKeys(passwordText);
    }
}

