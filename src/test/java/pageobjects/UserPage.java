package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public  class UserPage {
    WebDriver driver;

    @FindBy(className = "masterbar__item-content")
    WebElement Mysite;

    @FindBy(xpath = ".//*[@id='secondary']/div/ul/div[1]/li[4]/ul/li[2]/a[1]/span")
    WebElement People;

    @FindBy(xpath = ".//*[@id='secondary']/div/ul/div[1]/li[4]/ul/li[2]/a[2]")
    WebElement Add;

    @FindBy(className = "token-field__input-container")
    WebElement Username;

   @FindBy(id="role")
   WebElement Dropdown;


    @FindBy(id = "message")
    WebElement CustomMessage;

    @FindBy(xpath = ".//*[@id='primary']/main/div[2]/div/form/button")
    WebElement invitation;


    public UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Mysite(){
        Mysite.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void People(){
        People.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void Add(){
        Add.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void setUsername(String username){Username.sendKeys(username);}

    public void DM() {
        Select dropdown = new Select(Dropdown);
        dropdown.selectByVisibleText("Administrator");}

    public void setCustomMessage(String customMessage){CustomMessage.sendKeys(customMessage);}

    public void invitation() {
        invitation.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
