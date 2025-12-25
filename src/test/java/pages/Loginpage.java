package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Loginpage {
    public Loginpage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/input)[1]")
    public WebElement usernameInput;

    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/input)[2]")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    public WebElement loginBtn;
}


