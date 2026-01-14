package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseDriver;

import java.util.List;

import static utilities.BaseDriver.wait;

public class AssignmentsPage {

    public AssignmentsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//div[1]/div[2]/span)[1]")
    public WebElement assignmentText;

    @FindBy(xpath = "//div/div/div/div[1]/mat-form-field[3]/div[1]")
    public WebElement semesterBtn;

    @FindBy(xpath = "//div[2]/div[2]/div/div/mat-option[1]")
    public WebElement allBtn;

    @FindBy(xpath = "(//ms-assignment-panel-student//ms-icon-button//button/span[2])[4]")
    public WebElement submitBtn;

    @FindBy(xpath = "//editor/div/div[1]/div[2]/div[1]/iframe")
    public WebElement iframe1;

    @FindBy(xpath = "//html/body[@id='tinymce']")
    public WebElement textEditor;

    @FindBy(xpath = "//ms-confirm-button/button")
    public WebElement submitBtnIframe;

    @FindBy(xpath = "//div[1]/div/ms-button/button")
    public WebElement attachFilesBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitYesBtn;

    @FindBy(xpath = "//mat-dialog-actions/ms-button/button")
    public WebElement saveAsDraftBtn;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-32']/span/mat-panel-description/div")
    public WebElement successMsg;

    @FindBy(xpath = "//div[2]/div[2]/div[1]/div/div[3]/div/div/div[1]")
    public WebElement courseBtn;

    public boolean elementClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            return true;
        } catch (Exception e) {
            System.out.println("Element was not clickable: " + e.getMessage());
            return false;
        }
    }
}
