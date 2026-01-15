package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.AssignmentsPage;
import pages.CoursePage;
import pages.Homepage;
import utilities.ReusableMethods;

public class AssignmentSubmissionSteps extends ReusableMethods {

    Homepage hp = new Homepage();
    AssignmentsPage ap = new AssignmentsPage();
    CoursePage cp = new CoursePage();

    Faker faker = new Faker();
    String randomName = faker.name().fullName();
    WebElement iframe;

    @When("verify home page loaded")
    public void verifyHomePageLoaded() {
        wait.until(ExpectedConditions.visibilityOfAllElements(hp.courseGrid));
    }

    @When("click on ASSIGNMENTS button")
    public void click_on_assignments_button() {
        myClick(hp.assignmentsBtn);
    }

    @Then("verify ASSIGNMENTS page")
    public void verify_assignments_page() {
        verifyContainsText(ap.assignmentText, "Assignments");
    }

    @When("click on SUBMIT button")
    public void click_on_submit_button() {
        myClick(ap.submitBtn);
    }

    @Then("input text on text editor")
    public void input_text_on_text_editor() {

        iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//editor/div/div[1]/div[2]/div[1]/iframe")));

        driver.switchTo().frame(iframe);
        myClick(ap.textEditor);
        mySendKeys(ap.textEditor, randomName);
    }

    @When("click SAVE AS DRAFT button")
    public void click_save_as_draft_button() {
        driver.switchTo().defaultContent();
        myClick(ap.saveAsDraftBtn);
    }

    @Then("again click on SUBMIT button")
    public void again_click_on_submit2_button() {
        myClick(ap.submitBtnIframe);
    }

    @When("click on YES button")
    public void click_on_yes_button() {
        driver.switchTo().defaultContent();
        myClick(ap.submitYesBtn);
    }

    @When("click on course name")
    public void click_on_course_name() {
        myClick(ap.courseNameBtn);
    }

    @Then("verify directed to course details")
    public void verify_directed_to_course_details() {
        verifyContainsText(cp.courseText, "Course:");
    }

    @When("click on ATTEMPTS button")
    public void click_on_attempts_button() {
        myClick(cp.attemptsBtn);
    }

    @Then("verify submitted work")
    public void verify_submitted_work() {
        verifyContainsText(cp.submissionTxt, randomName);
    }

    @When("click on NEW SUBMISSION button")
    public void click_on_new_submission_button() {
        myClick(cp.newSubmissionBtn);
    }

    @Then("verify text editor")
    public void verify_text_editor() {
        WebElement iframe2 = wait.until(ExpectedConditions
                .visibilityOfElementLocated(
                        By.xpath("//editor/div/div[1]/div[2]/div[1]/iframe")));

        driver.switchTo().frame(iframe2);
        myClick(ap.textEditor);
        mySendKeys(ap.textEditor, "Test passed, You rock");

        wait.until(ExpectedConditions.visibilityOf(cp.textEditor));
        Assert.assertTrue(cp.textEditor.isDisplayed());

    }
}
