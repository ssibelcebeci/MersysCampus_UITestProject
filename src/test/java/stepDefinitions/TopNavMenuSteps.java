package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.*;
import utilities.ReusableMethods;

public class TopNavMenuSteps extends ReusableMethods {
    LoggedInPage lnp = new LoggedInPage();
    CalendarPage cp = new CalendarPage();
    AttendancePage ap = new AttendancePage();
    AssignmentsPage asp = new AssignmentsPage();
    GradingPage gp = new GradingPage();
    UserMessagesNewPage umnp = new UserMessagesNewPage();

    @Given("student can see top nav bar menu and clicks each of them and opens its related page")
    public void studentCanSeeTopNavBarMenuAndClicksEachOfThemAndOpensItsRelatedPage() {
        waitUntilClickable(lnp.courses);
        myClick(lnp.courses);
        waitUntilClickable(lnp.calendar);
        myClick(lnp.calendar);
        verifyContainsText(cp.calendarTitle, "Calendar");
        waitUntilClickable(lnp.attendance);
        myClick(lnp.attendance);
        waitForVisibility(ap.attendanceExcuseBtn);
        verifyContainsText(ap.attendanceExcuseBtn, "ATTENDANCE EXCUSES");
        threadWait(2);
        waitUntilClickable(lnp.assignments);
        myClick(lnp.assignments);
        verifyContainsText(asp.assignmentsTitle, "Assignments");
        waitUntilClickable(lnp.grading);
        myClick(lnp.grading);
        verifyContainsText(gp.gradingTitle, "Grading");
        waitUntilClickable(lnp.hamburgerMenu);
        myClick(lnp.hamburgerMenu);
        hoverOver(lnp.messaging);
        hoverOver(gp.sendMessageBtn);
        myClick(gp.sendMessageBtn);
        waitUntilClickable(umnp.newMessage);
        jsClick(umnp.newMessage);
        verifyContainsText(umnp.messagesTitle, "Messages");
        jsClick(umnp.messagesClose);
        jsClick(lnp.profileSettings);
        hoverOver(lnp.myCertificates);
    }


}

