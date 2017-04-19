package exampleWithPageObject;

import example.content.Email;
import example.pages.EmailAction;
import example.pages.EmailVerification;
import example.pages.EmailVerificationWithLogging;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

/**
 * @author Andrey Epifanov
 */
public class ExampleMailTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
    }

    @Test
    public void testMailPageSave01() throws Exception {
        Email email = new Email("Private", "myownmail@mail.ru");

        EmailAction emailPageActions = new EmailAction(driver);
        EmailVerification emailVerification = new EmailVerification(driver);
        EmailVerificationWithLogging emailVerificationWithLogging =
                new EmailVerificationWithLogging(driver);

        driver.get(getPathToMailPage());

        emailVerification.verify(
                new Email("...", "mymail@mail.ru")
        );
        emailVerificationWithLogging.verify(
                new Email("...", "mymail@mail.ru")
        );

        emailPageActions.saveWith(email);
    }

    @Test
    public void testMailPageSave02() throws Exception {
        EmailAction emailPageActions = new EmailAction(driver);

        driver.get(getPathToMailPage());

        emailPageActions.save();
    }

    @Test
    public void testMailPageCancel01() throws Exception {
        Email email = new Email("Private", "myownmailCancel@mail.ru");
        EmailAction emailPageActions = new EmailAction(driver);

        driver.get(getPathToMailPage());

        emailPageActions.closeWith(email);
    }

    @Test
    public void testMailPageCancel02() throws Exception {
        EmailAction emailPageActions = new EmailAction(driver);

        driver.get(getPathToMailPage());

        emailPageActions.close();
    }

    private String getPathToMailPage() {
        File list = new File("./..");
        String path = list.getAbsolutePath();
        System.out.println(path);
        return path + "/email_v01.html";
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
