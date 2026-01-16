package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class UserMessagesNewPage {
    public UserMessagesNewPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@class='mat-mdc-form-field-infix']")
    public WebElement receivers;

    @FindBy(xpath = "//ms-button[@icon='users-medical']//button")
    public WebElement addReceivers;

    @FindBy(xpath = "//span[contains(text(), 'Student_1')]")
    public WebElement nameStudent_1;

    @FindBy(xpath = "//span[text()='Add & Close']")
    public WebElement addCloseBtn;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement subject;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement textEditor;

    @FindBy(xpath = "//span[contains(text(), 'Attach Files')]")
    public WebElement attachFilesBtn;

    @FindBy(xpath = "//button//span[text()=' From Local ']")
    public WebElement fromLocal;

    @FindBy(xpath = "//button//span[text()=' From My Files ']")
    public WebElement fromMyFiles;

    @FindBy(xpath = "//span[normalize-space()='From Google Drive™']")
    public WebElement fromGoogleDrive;

    @FindBy(xpath = "(//tbody//mat-checkbox)[2]")
    public WebElement inputCheckBox;

    @FindBy(xpath = "//button//span[contains(text(),'Send')]")
    public WebElement sendBtn;

    @FindBy(xpath = "//span[normalize-space()='Select']")
    public WebElement selectBtn;

    @FindBy(xpath = "//div[contains(text(), \"Cannot read properties\")]")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@aria-label='Close']")
    public WebElement errorMessageClose;

    @FindBy(xpath = "(//div[contains(@class, 'mat-badge-medium')])[2]")
    public WebElement newMessage;

    @FindBy(xpath = "//span[normalize-space()='Messages']")
    public WebElement messagesTitle;

    @FindBy(xpath = "//mat-toolbar//button[@mat-icon-button][2]")
    public WebElement messagesClose;

    @FindBy(xpath = "//*[contains(text(),'.node_repl_history')]")
    public WebElement attachedFile;
}
