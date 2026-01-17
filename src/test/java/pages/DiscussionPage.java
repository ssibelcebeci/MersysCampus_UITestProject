package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class DiscussionPage {

    public DiscussionPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//ms-standard-button[1]")
    public WebElement chatBtn;

    @FindBy(xpath = "//ms-standard-button[2]")
    public WebElement contactsBtn;

    @FindBy(xpath = "(//ms-icon-button[@icon='paperclip'])[2]")
    public WebElement attachFileBtn;

    @FindBy(xpath = "(//div[contains(@class,'comment')])[last()]")
    public WebElement sendMessageDate;

    @FindBy(xpath = "(//mat-selection-list)[2]/mat-list-option/span")
    public List<WebElement> contactList;

    @FindBy(xpath = "//textarea")
    public WebElement sendMessage;

    @FindBy(xpath = "(//button[@mat-ripple-loader-class-name='mat-mdc-button-ripple'])[71]")
    public WebElement sendBtn;

}
