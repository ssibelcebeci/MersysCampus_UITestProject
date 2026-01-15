package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class CalendarPage extends ReusableMethods {

    public CalendarPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div/table/thead/tr/th[5]")
    public WebElement UIDate;

    @FindBy(xpath = "//div[2]/div[1]/div/span[1]")
    public List<WebElement> courseStatus;

    @FindBy(xpath = "//div[2]/div/div/div/span[2]")
    public List<WebElement> calendarFilters;

    @FindBy(xpath = "//div/div[2]/div[2]/button[1]")
    public WebElement backwardsBtn;

    @FindBy(xpath = "//div/div[2]/div[2]/button[2]")
    public WebElement todayBtn;

    @FindBy(xpath = "//div/div[2]/div[2]/button[3]")
    public WebElement forwardsBtn;

    @FindBy(xpath = "//div/table/tbody/tr/td/div/div/div/div/span")
    public List<WebElement> allCourses;

    @FindBy(xpath = "//div/table/tbody/tr[2]/td[5]/div/div/div/div/span")
    public WebElement courseNameCalendar;

    @FindBy(xpath = "//div/table/tbody/tr[2]/td[5]/div")
    public WebElement courseOnCalendar;

    @FindBy(xpath = "//div/div/div/hot-toast/div/div/div[1]/button")
    public WebElement errorMsg;

    @FindBy(xpath = "//mat-panel-description/div")
    public WebElement notStartedMsg;

    @FindBy(xpath = "//mat-dialog-actions/ms-button/button")
    public WebElement recordingBtn;

    @FindBy(xpath = "//div[2]/div/div/div[4]/button[1]")
    public WebElement playBtn;

    public void verifyStatusVisibility(List<WebElement> element) {
        String[] expectedStatuses = {"P", "S", "E", "C"};

        wait.until(ExpectedConditions
                .visibilityOfAllElements(element));

        Assert.assertEquals(
                element.size(),
                expectedStatuses.length,
                "Status count didn't match");

        for (int i = 0; i < expectedStatuses.length; i++) {
            Assert.assertEquals(
                    element.get(i).getText().trim(),
                    expectedStatuses[i],
                    "Status didn't match at index: " + i);
        }
    }

    public void ignoreErrorIfDisplayed(WebElement element) {
        try {
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));

            if (shortWait.until(ExpectedConditions.elementToBeClickable(element))
                    .isDisplayed()) {
                myClick(element);
            }
        } catch (TimeoutException | NoSuchElementException e) {
        }
    }
}
