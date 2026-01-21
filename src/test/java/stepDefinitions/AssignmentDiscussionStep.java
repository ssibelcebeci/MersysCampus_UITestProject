package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AssignmentPage;
import pages.DiscussionPage;
import utilities.ReusableMethods;

import java.util.Random;

public class AssignmentDiscussionStep extends ReusableMethods {

    AssignmentPage ap = new AssignmentPage();
    DiscussionPage dp = new DiscussionPage();
    Random random = new Random();

    @Then("the student clicks the discussion icon")
    public void the_student_clicks_the_discussion_icon() {
        myClick(ap.discussionBtn);
    }

    @Then("the student should see the chats section")
    public void theStudentShouldSeeTheChatsSection() {
        threadWait(5);
        Assert.assertTrue(dp.chatBtn.isDisplayed());
    }

    @Then("the student should be able to click the chats icon")
    public void the_student_should_be_able_to_click_the_chats_icon() {
        myClick(dp.chatBtn);

    }

    @Then("the student should see the contacts section")
    public void the_student_should_see_the_contacts_section() {
        Assert.assertTrue(dp.contactsBtn.isDisplayed());
    }

    @Then("the student should be able to select a contact")
    public void the_student_should_be_able_to_select_a_contact() {
        myClick(dp.contactsBtn);
    }

    @Then("the student should be able to select random list")
    public void theStudentShouldBeAbleToSelectRandomList() {
        int randomIndex = random.nextInt(dp.contactList.size());
        dp.contactList.get(randomIndex).click();
    }

    @Then("the student attaches a file")
    public void the_student_attaches_a_file() {
        Assert.assertTrue(dp.attachFileBtn.isDisplayed());
    }

    @Then("the student writes and sends a message")
    public void the_student_writes_and_sends_a_message() {
        mySendKeys(dp.sendMessage, "asd");
    }

    @Then("the student should able to send button")
    public void theStudentShouldAbleToSendButton() {
        myClick(dp.sendBtn);
    }

    @Then("the message date and time should be displayed")
    public void the_message_date_and_time_should_be_displayed() {
        Assert.assertTrue(dp.sendMessageDate.isDisplayed());
    }

}
