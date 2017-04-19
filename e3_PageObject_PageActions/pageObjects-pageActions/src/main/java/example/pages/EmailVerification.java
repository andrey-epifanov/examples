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
public class EmailVerification extends EmailPage {
    Logger logger = LoggerFactory.getLogger(EmailVerification.class);

    public EmailVerification(WebDriver driver) {
        super(driver);
    }

    public void verify(Email expectedEmail) {
        if (expectedEmail.getTypeEmail() != null)
            Assert.assertEquals(
                    // this is need for extract text from select
                    emailTypeSelect.findElement(By.cssSelector("select option")).getText(), //.split("\n")[0]
                    expectedEmail.getTypeEmail(),
                    "Type of email is incorrect.");
        if (expectedEmail.getEmail() != null)
            Assert.assertEquals(
                    //emailTextBox.getText(), // standard
                    emailTextBox.getAttribute("value"),
                    expectedEmail.getEmail(),
                    "Email is incorrect.");
    }

}
