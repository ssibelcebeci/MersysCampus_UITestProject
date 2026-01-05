package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class FinancePage {

    public FinancePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "td.mat-column-paginator button[aria-haspopup='menu']")
    public WebElement ellipsisMenu;

    @FindBy(xpath = "//span[contains(normalize-space(),'Excel Export')]")
    public WebElement excelExport;

    @FindBy(xpath = "//span[contains(normalize-space(),'Pdf Export')]")
    public WebElement pdfExport;
}
