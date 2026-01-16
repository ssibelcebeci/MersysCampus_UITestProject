package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class AssignmentsPage extends ReusableMethods {

    public AssignmentsPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//button[@mat-icon-button]/following-sibling::span")
    public WebElement assignmentsTitle;
    @FindBy(xpath = "(//div[1]/div[2]/span)[1]")
    public WebElement assignmentText;

    @FindBy(xpath = "(//ms-assignment-panel-student//ms-icon-button//button/span[2])[4]")
    public WebElement submitBtn;

    @FindBy(xpath = "//html/body[@id='tinymce']")
    public WebElement textEditor;

    @FindBy(xpath = "//ms-confirm-button/button")
    public WebElement submitBtnIframe;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitYesBtn;

    @FindBy(xpath = "//mat-dialog-actions/ms-button/button")
    public WebElement saveAsDraftBtn;

    @FindBy(xpath = "//div[2]/div[2]/div[1]/div/div[3]/div/div/div[1]")
    public WebElement courseNameBtn;

    @FindBy(xpath = "//mat-form-field[1]/div[1]/div/div[2]/mat-select/div/div[1]/span/span")
    public WebElement courseFilterBtn;

    @FindBy(xpath = "//div/mat-option[1]/span ")
    public WebElement showAllBtn;

    @FindBy(xpath = "//div[2]/div/div/mat-option/span/div/span[1]")
    public List<WebElement> courseFilters;

    @FindBy(xpath = "//button/span[2]/div/span")
    public WebElement defaultViewBtn;

    @FindBy(xpath = "//div[2]/div/div/div/button/span")
    public List<WebElement> defaultViewOpts;

    public void checkSelectedOpt(WebElement selected, List<WebElement> toBeSelected) {

        wait.until(ExpectedConditions.elementToBeClickable(selected));
        jsClick(selected);
        wait.until(ExpectedConditions.visibilityOfAllElements(toBeSelected));
        jsClick(selected);

        for (WebElement option : toBeSelected) {
            jsClick(selected);
            jsClick(option);
            String selectedTxt = selected.getText().split(" - ")[0].trim();

            Assert.assertEquals(selectedTxt, option.getText(),
                    "Filter options didn't match");
        }
    }
}
