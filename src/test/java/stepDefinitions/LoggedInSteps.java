package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoggedInPage;
import utilities.ReusableMethods;
import java.util.Set;

public class LoggedInSteps extends ReusableMethods {
    LoggedInPage lnp = new LoggedInPage();

    @Given("the student is on the loggedIn page")
    public void theStudentIsOnTheLoggedInPage() {
        verifyContainsText(lnp.welcomeStudent,
                "Welcome, Student_10 11A !");
    }

    @When("the company logo should be displayed")
    public void theCompanyLogoShouldBeDisplayed() {
        Assert.assertTrue(lnp.logo.isDisplayed(), "Logo is not displayed!");
    }

    @Then("the student clicks the logo")
    public void theStudentClicksTheLogo() {
        myClick(lnp.logo);
    }

    @And("the student on the techno.study page")
    public void theStudentOnTheTechnoStudyPage() {
        String mainPage = driver.getWindowHandle();
        Set<String> allPages = driver.getWindowHandles();
        for (String page : allPages) {
            if (!page.equals(mainPage)) {
                driver.switchTo().window(page);
                break;
            }
        }
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("techno.study"), "URL hatalı!");
    }
}
