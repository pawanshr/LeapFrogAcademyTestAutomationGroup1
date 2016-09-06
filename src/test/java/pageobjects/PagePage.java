package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by dell on 8/28/2016.
 */
public class PagePage {
    @FindBy(xpath = ".//*[@id='menu-pages']/a/div[3]")
    WebElement pages;

    @FindBy(xpath = ".//*[@id='wpbody-content']/div[3]/h1/a")
    WebElement addNewPage;

    @FindBy(id = "title")
    WebElement titleOfNewPage;

    @FindBy(id = "insert-media-button")
    WebElement addMedia;

    @FindBy(id = "save-post")
    WebElement saveDrafts;

    @FindBy(xpath = ".//*[@id='post-preview']")
    WebElement previewPage;

    @FindBy(xpath = ".//*[@id='delete-action']/a")
    WebElement moveToTrash;

    @FindBy(id = "publish")
    WebElement publishPage;



    public void setPages() {
        pages.click();
    }

    public void setAddNewPage() {
        addNewPage.click();
    }

    public void setTitleOfNewPage() {
        titleOfNewPage.sendKeys("First Page adding.");
    }

    public void setAddMedia() {
        addMedia.getLocation();
    }

    public void setSaveDrafts() {
        saveDrafts.click();
    }

    public void setPreviewPage() {
        previewPage.click();
    }

    public void setMoveToTrash() {
        moveToTrash.click();
    }

    public void setPublishPage() {
        publishPage.click();
    }

    }
