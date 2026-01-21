package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

public class AssignmentPage {

    public AssignmentPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//mat-datepicker-toggle/button/span[2]")
    public WebElement clickDueDate;

    @FindBy(xpath = "//mat-card/button[8]/span[2]")
    public WebElement dueDate;

    @FindBy(css = "ms-search-button")
    public WebElement searchBtn;

    @FindBy(xpath = "//strong[contains(text(),' In Progress ')]")
    public WebElement verifyInProgressText;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[8]/following-sibling::span[1]")
    public WebElement discussionBtn;

    @FindBy(css = "div[class='assignment']")
    public List<WebElement> assignments;

    @FindBy(xpath = "//ms-icon-button[@icon='info']")
    public List<WebElement> assignmentIcon;

    @FindBy(css = "button[mat-icon-button]")
    public WebElement previousPage;

    @FindBy(xpath = "//ms-icon-button[@icon='file-import']")
    public List<WebElement> submitIconBtn;

    @FindBy(xpath = "//ms-icon-button[@icon='star']")
    public List<WebElement> markIconBtn;

    @FindBy(xpath = "//span[contains(text(),'Description')]")
    public WebElement verifyDescriptionText;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement closeSubmit;
}
