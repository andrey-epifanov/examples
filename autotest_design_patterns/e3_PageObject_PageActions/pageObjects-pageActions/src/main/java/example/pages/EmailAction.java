package example.pages;

import example.content.Email;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Андрей on 26.02.2017.
 */
public class EmailAction extends EmailPage {
    private static Logger logger = LoggerFactory.getLogger(EmailAction.class);

    public EmailAction(WebDriver driver) {
        super(driver);
    }

    public void saveWith(Email email) throws Exception {
        if( !((WebElement)emailTypeSelect).isDisplayed() )
            throw new Exception ("Field emailTypeSelect is not Displayed");
        emailTypeSelect.click();

        List<WebElement> types = emailTypeSelect.findElements(By.cssSelector("option"));
        for(WebElement type : types)
            if (type.getText().equals(email.getTypeEmail()))
                type.click();

        if( !((WebElement)emailTextBox).isDisplayed() )
            throw new Exception ("Field emailTextBox is not Displayed");
//        if( !((WebElement)emailTextBox).getAttribute("class").equals("myname") )
//            throw new Exception ("Field emailTextBox is not Displayed");
        emailTextBox.clear();
        emailTextBox.sendKeys(email.getEmail());
        // Reporting
        // Reporter.INSTANCE.addToReport(result);
        // if( ((WebElement)saveEmailButtont).isDisplayed() )
        // throw new Exception ("Field emailTypeSelect is not Displayed");
        saveEmailButton.click();
        // Reporting
        // Reporter.INSTANCE.addToReport(result);
    }

    public void save() throws Exception {
        if( !((WebElement)saveEmailButton).isDisplayed() )
            throw new Exception ("Field saveEmailButton is not Displayed");
        saveEmailButton.click();
        // Reporting
        // Reporter.INSTANCE.addToReport(result);
    }

    public void closeWith(Email email) throws Exception {
        if( !((WebElement)emailTypeSelect).isDisplayed() )
            throw new Exception ("Field emailTypeSelect is not Displayed");

        List<WebElement> types = emailTypeSelect.findElements(By.cssSelector("option"));
        for(WebElement type : types)
            if (type.getText().equals(email.getTypeEmail()))
                type.click();

        if( !((WebElement)emailTextBox).isDisplayed() )
            throw new Exception ("Field emailTextBos is not Displayed");
        emailTextBox.clear();
        emailTextBox.sendKeys(email.getEmail());
        // Reporting
        // Reporter.INSTANCE.addToReport(result);
        if( !((WebElement)closeEmailButton).isDisplayed() )
            throw new Exception ("Field emailTypeSelect is not Displayed");
        closeEmailButton.click();
        // Reporting
        // Reporter.INSTANCE.addToReport(result);
    }

    public void close() throws Exception {
        if( !((WebElement)closeEmailButton).isDisplayed() )
            throw new Exception ("Field emailTypeSelect is not Displayed");
        closeEmailButton.click();
        // Reporting
        // Reporter.INSTANCE.addToReport(result);
    }

}
