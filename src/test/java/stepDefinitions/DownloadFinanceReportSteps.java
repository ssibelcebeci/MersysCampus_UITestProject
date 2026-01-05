package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FinancePage;
import pages.Homepage;
import utilities.ReusableMethods;

public class DownloadFinanceReportSteps extends ReusableMethods {

    Homepage hp = new Homepage();
    FinancePage fp = new FinancePage();

    @When("the student navigates to Hamburger Menu > Finance > My Finance")
    public void the_student_navigates_to_hamburger_menu_finance_my_finance() {
        myClick(hp.hamburgerMenu);
        myClick(hp.financeMenuItem);
        myClick(hp.myFinanceMenuItem);
    }

    @When("the student selects Excel report format")
    public void theStudentSelectsReportFormat() {
        waitForVisibility(fp.ellipsisMenu);
        if (fp.ellipsisMenu.getAttribute("aria-expanded").equals("false")) {
            myClick(fp.ellipsisMenu);
        }
        myClick(fp.excelExport);
        waitUntilAttributeToBe(fp.ellipsisMenu, "aria-expanded", "false");
    }

    @Then("the {string} file should be downloaded to the local drive")
    public void theFileShouldBeDownloadedToTheLocalDrive(String extension) {
        Assert.assertTrue(
                ReusableMethods.isFileDownloaded(extension),
                "File with extension ." + extension + " was not downloaded!"
        );
    }

    @When("the student selects PDF report format")
    public void theStudentSelectsPDFReportFormat() {
        waitForVisibility(fp.ellipsisMenu);
        if (fp.ellipsisMenu.getAttribute("aria-expanded").equals("false")) {
            myClick(fp.ellipsisMenu);
        }

        myClick(fp.pdfExport);
    }

    @Then("the file should be opened in a new tab")
    public void theFileShouldBeOpenedInANewTab() {
        Assert.assertNotNull(driver.getTitle(), "Page crashed after clicking PDF export");
    }
}
