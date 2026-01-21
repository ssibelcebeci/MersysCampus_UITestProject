package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class GradingPage {
    public GradingPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//button[@mat-icon-button]/following-sibling::span")
    public WebElement gradingTitle;

    @FindBy(xpath = "//button[.//span[normalize-space()='Send Message']]")
    public WebElement sendMessageBtn;

}
