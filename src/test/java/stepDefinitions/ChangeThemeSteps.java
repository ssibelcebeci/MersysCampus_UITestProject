package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProfileSettingsPage;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ChangeThemeSteps extends ReusableMethods {

    ProfileSettingsPage psp = new ProfileSettingsPage();

    @When("the student clicks on the Default Theme dropdown")
    public void the_student_clicks_on_the_default_theme_dropdown() {
        myClick(psp.themeDropdown);
    }

    @When("the student selects a theme from the list")
    public void the_student_selects_a_theme_from_the_list() {
        WebDriverWait wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(5));
        List<WebElement> themeOptions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("mat-option span.mdc-list-item__primary-text")
                )
        );

        Random random = new Random();
        themeOptions.get(random.nextInt(themeOptions.size())).click();
    }
}
