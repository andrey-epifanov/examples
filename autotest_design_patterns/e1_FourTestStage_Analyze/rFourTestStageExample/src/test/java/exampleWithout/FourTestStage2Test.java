package exampleWithout;

import example.content.Email;
import example.pages.EmailVerificationWithWrapperLogging;
import featuretest.authentification.TestCase;
import featuretest.dataprovider.DataProviderAuthentication;
import featuretest.helper.AnalyseHelper;
import featuretest.helper.ProcessingHelper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by aepifanov on 16.02.2017.
 */
public class FourTestStage2Test {
    private static Logger logger = LoggerFactory.getLogger(FourTestStage2Test.class);

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
    }

    @Test(dataProvider = "Passed", dataProviderClass = DataProviderAuthentication.class)
    public void standardUsageTest03(TestCase testCase) throws InterruptedException {
        testCase.log();

        logger.info("============ Precondition ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());

        logger.info("============ Processing ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());
        driver.get(ProcessingHelper.getPathToMailPage());

        logger.info("============ Verification ===========================");
        logger.info("Precondition - executed for user : \n" + testCase.getLogin().getName());
        EmailVerificationWithWrapperLogging emailVerifiWrapperLogging =
                new EmailVerificationWithWrapperLogging(driver);
        emailVerifiWrapperLogging.verify(
                new Email("...", "mymail@mail.ru"));
    }

    @AfterMethod
    public void afterMethod() {
        AnalyseHelper.execute(driver);

        driver.quit();
    }

}
