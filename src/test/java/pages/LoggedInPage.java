package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LoggedInPage {
    public LoggedInPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Welcome,')]")
    public WebElement welcomeStudent;

    @FindBy(xpath = "//mat-toolbar[contains(@class,'mat-primary')]//img")
    public WebElement logo;

    @FindBy(xpath = "//ms-layout-menu-button[@page='COURSES']")
    public WebElement courses;

    @FindBy(css = "svg[data-icon='calendar-week']")
    public WebElement calendar;

    @FindBy(css = "svg[data-icon='screen-users']")
    public WebElement attendance;

    @FindBy(css = "svg[data-icon='list-check']")
    public WebElement assignments;

    @FindBy(css = "svg[data-icon='chart-mixed']")
    public WebElement grading;

    @FindBy(css = "svg[data-icon='bars']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[contains(@class, 'username')]")
    public WebElement profileSettings;

    @FindBy(css = "svg[data-icon='folder']")
    public WebElement messaging;

    @FindBy(xpath = "//button[@role='menuitem']//span[text()='Send Message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//button[@role='menuitem']//span[text()='Inbox']")
    public WebElement inbox;

    @FindBy(xpath = "//button[@role='menuitem']//span[text()='Outbox']")
    public WebElement outbox;

    @FindBy(xpath = "//button[@role='menuitem']//span[text()='Trash']")
    public WebElement trash;

    @FindBy(xpath = "//span[text()='My Certificates']")
    public WebElement myCertificates;

    @FindBy(xpath = "//span[text()='My Files']")
    public WebElement myFiles;

    @FindBy(xpath = "//span[text()='Settings]")
    public WebElement settings;


}
