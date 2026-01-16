package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class CoursePage {

    public CoursePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div/div/div/div[1]/div[1]/div[1]/div[1]/strong")
    public WebElement courseText;

    @FindBy(xpath = "//div/mat-expansion-panel/mat-expansion-panel-header/span[1]")
    public WebElement attemptsBtn;

    @FindBy(xpath = "//div/div/div/div[1]/div/div[2]/p")
    public WebElement submissionTxt;

    @FindBy(xpath = "//button-bar/div/div[1]/ms-button/button")
    public WebElement newSubmissionBtn;

    @FindBy(xpath = "//html/body[@id='tinymce']")
    public WebElement textEditor;
}
