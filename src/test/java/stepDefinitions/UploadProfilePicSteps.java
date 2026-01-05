package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Homepage;
import pages.ProfileSettingsPage;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class UploadProfilePicSteps extends ReusableMethods {

    Homepage hp = new Homepage();
    ProfileSettingsPage psp = new ProfileSettingsPage();

    @When("the student navigates to Profile > Settings")
    public void the_student_navigates_to_profile_settings() {
        myClick(hp.profileDropdown);
        myClick(hp.profileSettings);
    }

    @When("the student uploads a valid image file")
    public void the_student_uploads_a_valid_image_file() {
        myClick(psp.uploadPic);
        WebElement fileInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input[type='file']")
                )
        );

        String filePath = System.getProperty("user.dir")
                + "/src/test/resources/testData/car.jpg";

        fileInput.sendKeys(filePath);
        myClick(psp.uploadBtn);
    }

    @When("the student clicks on Save")
    public void the_student_clicks_on_save() {
        myClick(psp.saveBtn);
    }

    @Then("the success message should be displayed")
    public void the_success_message_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(7));

        boolean successToastAppeared = wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.tagName("body"),
                        "Profile successfully updated"
                )
        );

        Assert.assertTrue(successToastAppeared);
    }
}
