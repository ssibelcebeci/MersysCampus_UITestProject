package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class AttendancePage {

    public AttendancePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@role='tab']//span[contains(text(),'ATTENDANCE EXCUSES')]")
    public WebElement attendanceExcuseBtn;

    @FindBy(xpath = "//button[.//fa-icon//*[contains(@data-icon,'plus')]]")
    public WebElement addNewExcuse;

    @FindBy(xpath = "//textarea[@placeholder='Message']")
    public WebElement excuseMessageInput;

    @FindBy(xpath = "//button[@mat-menu-item]//span[normalize-space()='Attach Files...']")
    public WebElement attachFilesBtn;

    @FindBy(xpath = "//button[.//span[normalize-space()='Send']]")
    public WebElement sendBtn;
}
