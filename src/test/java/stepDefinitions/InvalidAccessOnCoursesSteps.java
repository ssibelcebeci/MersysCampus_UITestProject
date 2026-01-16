package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.CalendarPage;
import utilities.ReusableMethods;

public class InvalidAccessOnCoursesSteps extends ReusableMethods {

    CalendarPage cp = new CalendarPage();

    @Then("verify pop up and error message")
    public void verify_pop_up_and_error_message() {
        verifyContainsText(cp.notStartedMsg, "Only moderators can create course event");
    }
}
