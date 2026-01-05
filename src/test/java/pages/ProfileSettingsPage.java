package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class ProfileSettingsPage {
    public ProfileSettingsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "img.profile-image.avatar.huge")
    public WebElement uploadPic;

    @FindBy(xpath = "//button[.//span[normalize-space()='Upload']]")
    public WebElement uploadBtn;

    @FindBy(xpath = "//button[.//span[normalize-space()='Save']]")
    public WebElement saveBtn;

    @FindBy(css = "mat-select[formcontrolname='theme']")
    public WebElement themeDropdown;
}
