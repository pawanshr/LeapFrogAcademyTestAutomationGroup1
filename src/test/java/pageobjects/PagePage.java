package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 8/28/2016.
 */
public class PagePage {

        WebDriver driver;

        @FindBy(xpath=".//*[@id='secondary']/div/ul/div[1]/li[2]/ul/li[2]/a[2]")
        WebElement page_button;


        public PagePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void login() {
            page_button.click();
        }
    }
