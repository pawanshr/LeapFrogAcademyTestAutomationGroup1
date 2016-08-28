package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class User {
    WebDriver driver;

    @FindBy(className = "masterbar__item-content")
    WebElement Mysite;

    @FindBy(xpath = ".//*[@id='secondary']/div/ul/div[1]/li[4]/ul/li[2]/a[1]/span")
    WebElement People;

    @FindBy(xpath = ".//*[@id='secondary']/div/ul/div[1]/li[4]/ul/li[2]/a[1]/span")
    WebElement People;


    public User(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Mysite(){
        Mysite.click();
    }

    public void People(){
            People.click();
        }


    }
