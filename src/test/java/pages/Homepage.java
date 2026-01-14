package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.List;

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

    @FindBy(xpath = "(//span[text()='Assignments'])[1]")
    public WebElement assignmentsBtn;

    @FindBy(xpath = "//div/mat-grid-tile")
    public List<WebElement> courseGrid;
}
