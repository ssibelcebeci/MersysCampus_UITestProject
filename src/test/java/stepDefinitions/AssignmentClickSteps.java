package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AssignmentPage;
import pages.Homepage;
import utilities.ReusableMethods;

public class AssignmentClickSteps extends ReusableMethods {

    Homepage hp = new Homepage();
    AssignmentPage ap = new AssignmentPage();

    @When("Mouse hover over assignment button")
    public void mouse_hover_over_assignment_button() {
        threadWait(2);
        hoverOver(hp.assignmentBtn);
    }

    @Then("Click on Assignments Button")
    public void click_on_assignments_button() {
        myClick(hp.assignmentBtn);
    }

    @Then("Click Due date")
    public void clickDueDate() {
        myClick(ap.clickDueDate);
    }

    @Then("Select last year")
    public void selectLastYear() {
        threadWait(2);
        myClick(ap.dueDate);
    }

    @Then("click on search button")
    public void click_on_search_button() {
        threadWait(2);
        myClick(ap.searchBtn);
    }

    @Then("In progress text appears")
    public void ın_progress_text_appears() {
        verifyContainsText(ap.verifyInProgressText, "In Progress");
    }

}
