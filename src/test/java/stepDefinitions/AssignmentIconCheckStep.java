package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AssignmentPage;
import utilities.ReusableMethods;

import java.util.Random;

public class AssignmentIconCheckStep extends ReusableMethods {

    AssignmentPage ap = new AssignmentPage();
    Random random = new Random();

    int index;

    @When("the student selects a random assignment information icon")
    public void the_student_selects_a_random_assignment_information_icon() {

        index = random.nextInt(ap.assignmentIcon.size());
        myClick(ap.assignmentIcon.get(index));

        verifyContainsText(ap.verifyDescriptionText, "Description");

        myClick(ap.previousPage);
    }

    @Then("the student selects a random assignment submit icon")
    public void the_student_selects_a_random_assignment_submit_icon() {

        threadWait(2);
        index = random.nextInt(ap.submitIconBtn.size());
        myClick(ap.submitIconBtn.get(index));

        threadWait(3);
        myClick(ap.closeSubmit);
    }

    @Then("the student selects a random assigment mark icon")
    public void the_student_selects_a_random_assigment_mark_icon() {
        index = random.nextInt(ap.markIconBtn.size());
        myClick(ap.markIconBtn.get(index));
    }

    @Then("the student selects a random assignment")
    public void the_student_selects_a_random_assignment() {
        index = random.nextInt(ap.assignments.size());
        myClick(ap.assignments.get(index));
    }

    @Then("the student should be redirected to the assignment details page")
    public void the_student_should_be_redirected_to_the_assignment_details_page() {
        verifyContainsText(ap.verifyDescriptionText, "Description");
    }
}
