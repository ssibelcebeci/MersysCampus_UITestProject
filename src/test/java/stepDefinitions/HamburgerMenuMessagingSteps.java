package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;
import pages.LoggedInPage;
import utilities.ReusableMethods;

public class HamburgerMenuMessagingSteps extends ReusableMethods {
    LoggedInPage lnp = new LoggedInPage();

    @When("the student clicks on hamburgerMenu")
    public void theStudentClicksOnHamburgerMenu() {
        try {
            waitForVisibility(lnp.hamburgerMenu);
            myClick(lnp.hamburgerMenu);
            System.out.println("Hamburger menu found and clicked");
        } catch (Exception e) {
            System.out.println("Hamburger menu is not displayed...");
        }
    }

    @Test(dependsOnMethods = "theStudentClicksOnHamburgerMenu")
    @And("the student hovers over messaging button")
    public void theStudentHoversOverMessagingButton() {
        hoverOver(lnp.messaging);
    }

    @Test(dependsOnMethods = "theStudentClicksOnHamburgerMenu")
    @Then("the student can hover over and click send message button")
    public void theStudentCanHoverOverAndClickSendMessageButton() {
        hoverOver(lnp.sendMessage);
        myClick(lnp.sendMessage);
    }

    @Test(dependsOnMethods = "theStudentClicksOnHamburgerMenu")
    @And("the student clicks on hamburgerMenu,hovers over messaging button and hovers over inbox button and clicks")
    public void theStudentClicksOnHamburgerMenuHoversOverMessagingButtonAndHoversOverInboxButtonAndClicks() {
        myClick(lnp.hamburgerMenu);
        hoverOver(lnp.messaging);
        hoverOver(lnp.inbox);
        myClick(lnp.inbox);
    }

    @Test(dependsOnMethods = "theStudentClicksOnHamburgerMenu")
    @Then("the student clicks on hamburgerMenu,hovers over messaging button and hovers over outbox button and clicks")
    public void theStudentClicksOnHamburgerMenuHoversOverMessagingButtonAndHoversOverOutboxButtonAndClicks() {
        myClick(lnp.hamburgerMenu);
        hoverOver(lnp.messaging);
        hoverOver(lnp.outbox);
        myClick(lnp.outbox);
    }

    @Test(dependsOnMethods = "theStudentClicksOnHamburgerMenu")
    @And("the student clicks on hamburgerMenu,hovers over messaging button and hovers over trash button and clicks")
    public void theStudentClicksOnHamburgerMenuHoversOverMessagingButtonAndHoversOverTrashButtonAndClicks() {
        myClick(lnp.hamburgerMenu);
        hoverOver(lnp.messaging);
        hoverOver(lnp.trash);
        myClick(lnp.trash);
    }

}

