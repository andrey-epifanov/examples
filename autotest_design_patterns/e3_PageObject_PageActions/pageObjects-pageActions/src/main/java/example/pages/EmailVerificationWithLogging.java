package example.pages;

import example.content.Email;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * Created by Андрей on 27.02.2017.
 */
public class EmailVerificationWithLogging extends EmailPage {
    Logger logger = LoggerFactory.getLogger(EmailVerificationWithLogging.class);

    public EmailVerificationWithLogging(WebDriver driver) {
        super(driver);
    }

    public void verify(Email expectedEmail) {
        logger.info("AssertEquals." +
                " Expected = " + expectedEmail.getTypeEmail() +
                ", Actual = " + emailTypeSelect.findElement(By.cssSelector("select option")).getText());
        Assert.assertEquals(
                emailTypeSelect.findElement(By.cssSelector("select option")).getText(),
                expectedEmail.getTypeEmail(),
                "Type of email is incorrect.");
        logger.info("AssertEquals." +
                " Expected = " + expectedEmail.getEmail() +
                ", Actual = " + emailTextBox.getAttribute("value"));
        Assert.assertEquals(
                //emailTextBox.getText(), // standard
                emailTextBox.getAttribute("value"),
                expectedEmail.getEmail(),
                "Email is incorrect.");
    }
}
