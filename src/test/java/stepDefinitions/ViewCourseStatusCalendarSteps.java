package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.CalendarPage;
import pages.Homepage;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ViewCourseStatusCalendarSteps extends ReusableMethods {

    Homepage hp = new Homepage();
    CalendarPage calP = new CalendarPage();
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("EEEE, MMM d", Locale.ENGLISH);
    String expectedDate = today.format(formatter).toUpperCase();

    @When("click on CALENDAR button")
    public void click_on_calendar_button() {
        myClick(hp.calendarBtn);
    }

    @Then("verify today date")
    public void verifyTodayDate() {
        wait.until(ExpectedConditions.visibilityOf(calP.UIDate));
        Assert.assertEquals(expectedDate, calP.UIDate.getText(), "Dates didn't match");
    }

    @Then("verify course statuses")
    public void verify_course_statuses() {
        calP.verifyStatusVisibility(calP.courseStatus);
    }

    @Then("cycle through calendar filters")
    public void cycle_through_calendar_filters() {
        myClick(calP.calendarFilters.get(1));
        calP.ignoreErrorIfDisplayed(calP.errorMsg);

        myClick(calP.calendarFilters.get(0));
    }

    @Then("click forwards button")
    public void click_forwards_button() {
        jsClick(calP.forwardsBtn);
    }

    @Then("click backwards button")
    public void click_backwards_button() {
        threadWait(1);
        jsClick(calP.backwardsBtn);
    }

    @Then("click today button")
    public void click_today_button() {
        threadWait(1);
        jsClick(calP.todayBtn);
    }

    @Then("verify course displayed")
    public void verify_course_displayed() {
        wait.until(ExpectedConditions.visibilityOfAllElements(calP.allCourses));
        verifyContainsText(calP.courseNameCalendar, "TESTING B8");
    }

    @Then("click on course on calendar")
    public void click_on_course_on_calendar() {
        myClick(calP.courseOnCalendar);
    }
}
