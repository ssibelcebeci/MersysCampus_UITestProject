package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CalendarPage;
import utilities.ReusableMethods;

public class AccessContentOfCoursesSteps extends ReusableMethods {

    CalendarPage cp = new CalendarPage();

    @When("click on back button")
    public void click_on_back_button() {
        for (int i = 0; i < 10; i++) {
            myClick(cp.backwardsBtn);
        }
    }
    @Then("click on recording button")
    public void click_on_recording_button() {
        myClick(cp.recordingBtn);
    }

    @Then("click on play button")
    public void clickOnPlayButton() {
        WebElement iframe = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By
                        .xpath("//ms-dialog/div/iframe")));

        driver.switchTo().frame(iframe);

        myClick(cp.playBtn);
    }
}
