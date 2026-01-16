package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AssignmentsPage;
import utilities.ReusableMethods;

public class FilterAssignmentsSteps extends ReusableMethods {

    AssignmentsPage ap = new AssignmentsPage();

    @Then("filter through course options")
    public void filter_through_course_options() {
        ap.checkSelectedOpt(ap.courseFilterBtn, ap.courseFilters);
        myClick(ap.courseFilterBtn);
        myClick(ap.showAllBtn);
    }

    @Then("filter through view options")
    public void filter_through_view_options() {
        ap.checkSelectedOpt(ap.defaultViewBtn, ap.defaultViewOpts);
    }
}
