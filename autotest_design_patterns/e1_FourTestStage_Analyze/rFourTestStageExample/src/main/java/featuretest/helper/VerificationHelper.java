package featuretest.helper;

import example.content.Email;
import example.pages.EmailVerificationWithWrapperLogging;
import featuretest.authentification.TestCase;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Андрей on 02.03.2017.
 */
public class VerificationHelper {
    private static Logger logger = LoggerFactory.getLogger(VerificationHelper.class);

    public static void execute(TestCase testCase) {
        logger.info("============ Verification ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());
    }

    public static void execute(TestCase testCase, WebDriver driver) {
        logger.info("============ Verification ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());

        EmailVerificationWithWrapperLogging emailVerifiWrapperLogging =
                new EmailVerificationWithWrapperLogging(driver);
        emailVerifiWrapperLogging.verify(
                new Email("...", "mymail@mail.ru")
        );
    }
}
