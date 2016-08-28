package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 8/28/2016.
 */
public class Page_publish {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='primary']/div/div[2]/div[1]/div[2]/div[3]/div/textarea")
    WebElement title;

    @FindBy (xpath = ".//*[@id='tinymce']/p")
    WebElement editor;

    @FindBy (xpath =".//*[@id='primary']/div/div[2]/div[2]/div[2]/div[1]/div[3]/div/button[1]" )
        WebElement publishbutton;

    public Page_publish(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTitle(String heading) {
        title.sendKeys(heading);
    }

    public void setEditor(String text) {
        editor.sendKeys(text);
    }

    public void setPublishButton() {
        publishbutton.click();
    }


}

