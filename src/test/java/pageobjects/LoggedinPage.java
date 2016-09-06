package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Katun on 28/08/2016.
 */
public class LoggedinPage {

    WebDriver dvr;
    //----------Before publishing blog post-----
    @FindBy(xpath=".//*[@id='header']/a[1]/span")
    WebElement clickMySite;

    @FindBy (xpath =".//*[@id='secondary']/div/ul/div[1]/li[2]/ul/li[1]/a[2]")
    WebElement directpost;

    @FindBy(xpath = ".//*[@id='secondary']/div/ul/div[1]/li[2]/ul/li[1]/a[1]")
    WebElement clickBlogPost;

    @FindBy(xpath=".//*[@id='primary']/main/div[1]/div[2]/div/div/a")
    WebElement clickonAdd;

    @FindBy(xpath =".//*[@id='primary']/div/div[2]/div[1]/div[2]/div[3]/div/textarea")
    WebElement titleText;

    @FindBy(id = "tinymce-1_ifr")
    WebElement frameName;

    @FindBy(id="tinymce")
    public WebElement bodyText;

    //SWITCH TO DEFAULT FRAME
    @FindBy(className = "web-preview__frame")
    public WebElement defaultFrame;
    @FindBy(xpath = ".//*[@id='primary']/div/div[2]/div[2]/div[2]/div[1]/div[3]/button")
    WebElement previewButton;

    //@FindBy(xpath = "html/body/div[7]/div/div[2]/div[1]/button")
    @FindBy (className = "web-preview__close")
    WebElement closeButton;

    @FindBy(xpath = ".//*[@id='primary']/div/div[2]/div[2]/div[2]/div[1]/div[3]/div/button[1]")
    WebElement publishButton;

    public LoggedinPage(WebDriver driver) {
        this.dvr = driver;
        PageFactory.initElements(driver, this);
    }
    //Click on "My Site"
    public void MySite(){ clickMySite.click();}

    //Click on "Blog Posts"
    public void blogPost(){ clickBlogPost.click();}

    //Click on "Add post"
    public void addPost(){clickonAdd.click();}

    public void directAddPost(){
        directpost.click();
    }

    public void addTitle(String postTitle){
        titleText.sendKeys(postTitle);
    }

    public void addBody(String bodyContent){
        bodyText.sendKeys(bodyContent);
    }

    public void addBody(String bodyContent, WebDriver driver){
        this.dvr = driver;
        driver.switchTo().frame(frameName);
        bodyText.sendKeys(bodyContent);
    }

    public void preview(){
        dvr.switchTo().defaultContent();
        previewButton.click();
        //dvr.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        closeButton.click();
        //dvr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public void publish() {
        publishButton.click();
    }




    public String getMySiteText() { return clickMySite.getText(); }


    //------------------------------------------------------
    //-----------------After publishing---------------------

    @FindBy(className = "card dialog")
    WebElement dialogBox;

    @FindBy(xpath = ".//*[@id='primary']/div/div[2]/div[1]/div[2]/div[1]/div[2]/button[3]")
    WebElement trashButton;

    @FindBy(xpath = "//button[@class='button is-primary']")
    WebElement dialogTrashButton;

    public void deletePost(){
        trashButton.click();
    }

    public void trashPostinpreview(){
        dialogTrashButton.click();
    }


}
