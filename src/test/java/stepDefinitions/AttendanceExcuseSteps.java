package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.AttendancePage;
import pages.Homepage;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class AttendanceExcuseSteps extends ReusableMethods {

    Homepage hp = new Homepage();
    AttendancePage ap = new AttendancePage();

    @Given("the student is on the attendance excuse page")
    public void the_student_is_on_the_attendance_excuse_page() {
        threadWait(2);
        myClick(hp.attendanceMenuItem);
        threadWait(2);
        myClick(ap.attendanceExcuseBtn);
        myClick(ap.addNewExcuse);
    }

    @When("the student enters a valid excuse message and adds a file")
    public void the_student_enters_a_valid_excuse_message_and_adds_a_file() {
        mySendKeys(ap.excuseMessageInput, "im sorry, i was sick");

        myClick(ap.attachFilesBtn);
        WebDriverWait wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(5));

        WebElement fileInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input[type='file']")
                )
        );

        String filePath = System.getProperty("user.dir")
                + "/src/test/resources/testData/excuse.pdf";

        fileInput.sendKeys(filePath);
    }

    @When("the student clicks Send")
    public void the_student_clicks_send() {
        jsClick(ap.sendBtn);
    }

    @Then("an informational message should be displayed")
    public void an_informational_message_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(5));

        boolean messageAppeared = wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.tagName("body"),
                        "successfully sent"
                )
        );

        Assert.assertTrue(messageAppeared);
    }
}
