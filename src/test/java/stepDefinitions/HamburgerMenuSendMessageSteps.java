package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.LoggedInPage;
import pages.UserMessagesNewPage;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;


public class HamburgerMenuSendMessageSteps extends ReusableMethods {

    UserMessagesNewPage umnp = new UserMessagesNewPage();
    LoggedInPage lnp = new LoggedInPage();

    @Given("the student see the text editor")
    public void theStudentSeeTheTextEditor() {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[id^='tiny-']")));
        driver.switchTo().frame(0);
        waitForVisibility(umnp.textEditor);
        Assert.assertTrue(umnp.textEditor.isDisplayed());
        driver.switchTo().defaultContent();
    }

    @When("the student can see receivers text box and click on it")
    public void theStudentCanSeeReceiversTextBoxAndClickOnIt() {
        waitUntilClickable(umnp.receivers);
        myClick(umnp.receivers);
    }

    @And("the student clicks on add receivers icon and add name in the text box")
    public void theStudentClicksOnAddReceiversIconAndAddNameInTheTextBox() {
        waitUntilClickable(umnp.addReceivers);
        myClick(umnp.addReceivers);
        waitUntilClickable(umnp.nameStudent_1);
        myClick(umnp.nameStudent_1);
        waitUntilClickable(umnp.addCloseBtn);
        myClick(umnp.addCloseBtn);
    }

    @Then("the student types subject in the subject box")
    public void theStudentTypesSubjectInTheSubjectBox() {
        mySendKeys(umnp.subject, "User Story");
    }

    @And("the student types text in the text editor")
    public void theStudentTypesTextInTheTextEditor() {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe[id^='tiny-angular']")));
        driver.switchTo().frame(0);
        mySendKeys(umnp.textEditor, "Unclear user story");
    }

    @And("the student can attach files from local")
    public void theStudentCanAttachFilesFromLocal() throws AWTException {
        driver.switchTo().defaultContent();
        myClick(umnp.attachFilesBtn);
        hoverOver(umnp.fromLocal);
        myClick(umnp.fromLocal);
        Robot robot = new Robot();
        threadWait(2);
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        for (int i = 0; i < 6; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        for (int i = 0; i < 30; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'.node_repl_history')]")));

        verifyContainsText(umnp.attachedFile, ".node_repl_history");

    }

    @And("the student can attach files from my files")
    public void theStudentCanAttachFilesFromMyFiles() {
        myClick(umnp.attachFilesBtn);
        hoverOver(umnp.fromMyFiles);
        myClick(umnp.fromMyFiles);
        waitUntilClickable(umnp.inputCheckBox);
        myClick(umnp.inputCheckBox);
        myClick(umnp.selectBtn);
    }

    @And("the student can attach files from Google Drive")
    public void theStudentCanAttachFilesFromGoogleDrive() throws AWTException {
        myClick(umnp.attachFilesBtn);
        hoverOver(umnp.fromGoogleDrive);
        myClick(umnp.fromGoogleDrive);
        waitForVisibility(umnp.errorMessage);
        verifyContainsText(umnp.errorMessage, "Cannot read properties of undefined (reading 'url')");
        myClick(umnp.errorMessageClose);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    @And("the student sends the message and receives success message")
    public void theStudentSendsTheMessageAndReceivesSuccessMessage() {
        myClick(umnp.sendBtn);
    }

    @When("the student clicks on hamburgerMenu,hovers over messaging button and hovers over outbox link and clicks")
    public void theStudentClicksOnHamburgerMenuHoversOverMessagingButtonAndHoversOverOutboxLinkAndClicks() {
        myClick(lnp.hamburgerMenu);
        hoverOver(lnp.messaging);
        hoverOver(lnp.outbox);
        myClick(lnp.outbox);
    }

    @Then("The student can see the sent messages as a list")
    public void theStudentCanSeeTheSentMessagesAsAList() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr")));
        List<WebElement> messageList = driver.findElements(By.xpath("//tbody/tr"));
    }
}




