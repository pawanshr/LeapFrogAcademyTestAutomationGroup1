package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Katun on 28/08/2016.
 */
public class LoggedinPage {

    WebDriver dvr;

    @FindBy(xpath=".//*[@id='header']/a[1]/span")
    WebElement clickMySite;

    @FindBy(xpath = ".//*[@id='secondary']/div/ul/div[1]/li[2]/ul/li[1]/a[1]")
    WebElement clickBlogPost;

    @FindBy(xpath=".//*[@id='primary']/main/div[1]/div[2]/div/div/a")
    WebElement clickonAdd;

    @FindBy(xpath =".//*[@id='primary']/div/div[2]/div[1]/div[2]/div[3]/div/textarea")
    WebElement titleText;

    @FindBy(xpath = ".//*[@id='tinymce']/p")
    WebElement bodyText;

    public LoggedinPage(WebDriver driver) {
        this.dvr = driver;
        PageFactory.initElements(driver, this);
    }

    public void MySite(){ clickMySite.click();}

    public void blogPost(){ clickBlogPost.click();}

    public void addPost(){clickonAdd.click();}

    public void addTitle(String postTitle){
        titleText.sendKeys(postTitle);
    }

}
