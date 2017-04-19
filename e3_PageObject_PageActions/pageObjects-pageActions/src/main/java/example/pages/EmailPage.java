package example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * @author Andrey Epifanov
 *         21/02/2017, 0:45 AM
 */
public class EmailPage {

    protected WebDriver driver;

    public EmailPage(final WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(driver), this);
        this.driver = driver;
    }

    @FindBy(css = "h2")
    protected WebElement head;

    @FindBy(id = "emailEditForm:f_typeCode:select")
    protected WebElement emailTypeSelect;

    @FindBy(id = "emailEditForm:f_address:emailInput:regexpInputText:input")
    protected WebElement emailTextBox;

    @FindBy(xpath = "//button[text()='Save']")
    protected WebElement saveEmailButton;

    @FindBy(xpath = "//button[text()='Cancel']")
    protected WebElement closeEmailButton;
}
