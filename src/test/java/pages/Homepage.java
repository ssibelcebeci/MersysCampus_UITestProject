package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Homepage {

    public Homepage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "button[aria-haspopup='menu']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[normalize-space()='Finance']")
    public WebElement financeMenuItem;

    @FindBy(xpath = "//span[normalize-space()='My Finance']")
    public WebElement myFinanceMenuItem;

    @FindBy(xpath = "//button[.//span[contains(text(),'Attendance')]]")
    public WebElement attendanceMenuItem;

    @FindBy(css = "span.username")
    public WebElement profileDropdown;

    @FindBy(xpath = "//button[@role='menuitem'][.//span[normalize-space()='Settings']]")
    public WebElement profileSettings;

    @FindBy(xpath = "(//span[@class='mdc-button__label']/fa-icon)[4]")
    public WebElement assignmentBtn;
}
