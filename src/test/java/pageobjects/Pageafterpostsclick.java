package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Katun on 06/09/2016.
 */
public class Pageafterpostsclick {

    public WebDriver dvr;


    public Pageafterpostsclick(WebDriver driver){
        this.dvr = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id='menu-posts']/ul/li[2]/a")
    WebElement AllPostsOption;

    @FindBy(xpath = ".//*[@id='menu-posts']/ul/li[3]/a")
    WebElement AddNewOption;

    @FindBy(id = "title")
    WebElement titletextbox;

    @FindBy(id = "content_ifr")
    WebElement framecontainingthebody;

    @FindBy(id="content-tmce")
    WebElement visualselection;

    @FindBy(id = "tinymce")
    WebElement largetextbox;

    @FindBy(xpath = ".//*[@id='wpbody-content']/div[3]/h1")
    WebElement addnewpostlabel;

    @FindBy(id = "save-post")
    WebElement saveasdraftbutton;

    @FindBy(xpath = ".//*[@id='delete-action']/a")
    WebElement movetotrash;

    public String checkforAllpostoption(){
        return  AllPostsOption.getText();
    }

    public String checkforAddnewoption(){
        return AddNewOption.getText();
    }

    public void addnewpost() {AddNewOption.click();}


    public String checkforaddnewpostlabel(){return addnewpostlabel.getText();}

    public void setThetitle(String title){
        titletextbox.sendKeys(title);
    }

    public void selectvisualoption(){ visualselection.click();}

    public void setThebody(String bodyContent) {
        dvr.switchTo().frame(framecontainingthebody);
        largetextbox.sendKeys(bodyContent);

    }

    public void savethepost(){
        //this.dvr =driver;
        dvr.switchTo().parentFrame();
        //dvr.switchTo().defaultContent();
        saveasdraftbutton.submit();
    }

    public void trashthepost(WebDriver driver){
        this.dvr=driver;
        WebDriverWait wait = new WebDriverWait(dvr,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='delete-action']/a")));
        movetotrash.click();
    }



}
