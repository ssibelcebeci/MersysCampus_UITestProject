package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginFailureSteps extends ReusableMethods {

    Loginpage lp = new Loginpage();


    @Given("Navigate website")
    public void navigate_website() {
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("input into the invalid username input field in the login form")
    public void input_into_the_invalid_username_input_field_in_the_login_form() {
        mySendKeys(lp.usernameInput, ConfigReader.getProperty("invalidUsername"));
    }

    @When("enter the valid password input field in the login form")
    public void enterTheValidPasswordInputFieldInTheLoginForm() {
        mySendKeys(lp.passwordInput, ConfigReader.getProperty("password"));
    }

    @Then("click on Login button")
    public void click_on_login_button() {
        myClick(lp.loginBtn);
    }
}
