package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginSteps extends ReusableMethods {

    Loginpage lp=new Loginpage();

    @Given("Navigate to website")
    public void navigate_to_website() {
        driver.get(ConfigReader.getProperty("url"));
    }
    @When("input into the valid username input field in the login form")
    public void input_into_the_valid_username_input_field_in_the_login_form() {
        mySendKeys(lp.usernameInput, ConfigReader.getProperty("username"));
    }
    @When("input into the valid password input field in the login form")
    public void input_into_the_valid_password_input_field_in_the_login_form() {
        mySendKeys(lp.passwordInput, ConfigReader.getProperty("password"));
    }
    @Then("click on LOGIN button")
    public void click_on_login_button() {
        myClick(lp.loginBtn);
    }
}
